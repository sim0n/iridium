package dev.sim0n.iridium.math.statistic.function.impl;

import dev.sim0n.iridium.math.statistic.function.AbstractStatisticFunction;
import dev.sim0n.iridium.math.statistic.function.StatisticFunction;

import java.util.Arrays;

/**
 * Calculates the <a href="https://en.wikipedia.org/wiki/Skewness">Skewness</a> of the provided data.
 * The unbiased skewness formula used here is:
 * <p>
 *     <code>
 *         skewness = [n / (n-1) / (n-2)] sum[(x - mean)^3] / (var * sd)
 *     </code>
 *
 * <p>where:
 * <pre>
 *     x = data value,
 *     mean = {@link Mean} of data,
 *     var = {@link Variance} of data,
 *     sd = {@link StandardDeviation} of data,
 *     n = number of data values
 * </pre>
 * <p>
 *     Note that this evaluation will return <code>Double.NaN</code> if n {@literal <} 3
 * </p>
 *
 */
public class Skewness extends AbstractStatisticFunction {
    private final StatisticFunction m1 = new Mean();
    private final StatisticFunction m2 = new Variance();

    /**
     * See {@link Skewness} for details on the used formula.
     * @param data the data to evaluate the {@link Skewness} on
     * @return the skewness of the provided data
     */
    @Override
    public double evaluate(double[] data) {
        final double n = data.length;

        if (n < 3) {
            return Double.NaN;
        }

        final double mean = this.m1.evaluate(data);
        final double variance = this.m2.evaluate(data, mean);
        final double stdDev = Math.sqrt(variance);
        final double cubicDeltaSum = Arrays.stream(data)
                .map(value -> this.cube(value - mean))
                .sum();

        double skewness = n / (n - 1) / (n - 2);
        skewness *= cubicDeltaSum / (variance * stdDev);

        return skewness;
    }

}
