package dev.sim0n.iridium.math.statistic.function.impl;

import dev.sim0n.iridium.math.statistic.function.AbstractStatisticFunction;
import dev.sim0n.iridium.math.statistic.function.StatisticFunction;

import java.util.Arrays;

/**
 * Calculates the <a href="https://en.wikipedia.org/wiki/Kurtosis">Kurtosis</a> of the provided data.
 * The unbiased kurtosis formula used here is:
 * <p>
 *     <code>
 *         kurtosis = [n(n+1) / (n-1)/(n-2)/(n-3)] sum[(x - mean)^4] / sd^4 - [3(n-1)^2 / (n(n-3)-2(n(-3))]
 *     </code>
 *
 * <p>where:
 * <pre>
 *     x = data value
 *     mean = {@link Mean} of data
 *     sd = {@link StandardDeviation} of data
 *     n = number of data values
 * </pre>
 *
 * <p>
 *     Note that this evaluation will return <code>Double.NaN</code> if n {@literal <} 4
 * </p>
 *
 */
public class Kurtosis extends AbstractStatisticFunction {
    private final StatisticFunction m1 = new Mean();
    private final StatisticFunction m2 = new Variance();

    /**
     * See {@link Kurtosis} for details on the used formula.
     * @param data the data to evaluate the {@link Kurtosis} on.
     * @return the kurtosis of the provided data.
     */
    @Override
    public double evaluate(double[] data) {
        final double n = data.length;

        if (n < 4) {
            return Double.NaN;
        }

        final double mean = this.m1.evaluate(data);
        final double stdDev = Math.sqrt(this.m2.evaluate(data, mean));
        final double quarticDeltaSum = Arrays.stream(data)
                .map(value -> this.quartic(value - mean))
                .sum();

        double kurtosis = (n * (n + 1)) / (n - 1) / (n - 2) / (n - 3);
        kurtosis *= quarticDeltaSum / this.quartic(stdDev);
        kurtosis -= 3 * this.square(n - 1) / (n * (n - 3) - 2 * (n - 3));

        return kurtosis;
    }
}
