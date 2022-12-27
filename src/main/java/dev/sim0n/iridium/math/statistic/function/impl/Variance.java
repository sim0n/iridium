package dev.sim0n.iridium.math.statistic.function.impl;

import dev.sim0n.iridium.function.DoubleBiFunction;
import dev.sim0n.iridium.function.DoubleObjFunction;
import dev.sim0n.iridium.math.statistic.function.AbstractStatisticFunction;
import dev.sim0n.iridium.math.statistic.function.StatisticFunction;

import java.util.Arrays;
import java.util.Optional;

/**
 * Calculates the <a href="https://en.wikipedia.org/wiki/Variance">Variance</a> of the provided data
 * The biased variance formula used here is:
 * <p>
 *     <code>var = sum[(x - mean)^2] / (n-1)</code>
 *
 * <p>where:
 * <pre>
 *     x = data value
 *     mean = {@link Mean} of data
 *     n = number of data values
 * </pre>
 */
public class Variance extends AbstractStatisticFunction {
    private final StatisticFunction m1 = new Mean();
    private final DoubleObjFunction<double[]> meanEvaluatorFunc = this.m1::evaluate;

    private final DoubleBiFunction<double[], Optional<Double>> innerVarianceFunc = (data, meanOpt) -> {
        final int n = data.length;
        final double mean = meanOpt.orElse(this.meanEvaluatorFunc.apply(data));

        double variance = Arrays.stream(data)
                .map(value -> this.square(value - mean))
                .sum();
        variance /= this.biasCorrection ? n - 1 : n;

        return variance;
    };

    /**
     * See {@link Variance} for details on the used formula.
     * @param data the data to evaluate the {@link Variance} on
     * @return the variance of the provided data
     */
    @Override
    public double evaluate(double[] data) {
        return this.innerVarianceFunc.apply(data, Optional.empty());
    }

    /**
     * See {@link Variance} for details on the used formula.
     * @param data the data to evaluate the {@link Variance} on
     * @param mean the pre-calculated mean of the data
     * @return the variance of the provided data
     */
    @Override
    public double evaluate(double[] data, double mean) {
        return this.innerVarianceFunc.apply(data, Optional.of(mean));
    }
}
