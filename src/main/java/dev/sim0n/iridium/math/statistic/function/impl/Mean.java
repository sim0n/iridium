package dev.sim0n.iridium.math.statistic.function.impl;

import dev.sim0n.iridium.math.statistic.function.AbstractStatisticFunction;

/**
 * Calculates the <a href="https://en.wikipedia.org/wiki/Arithmetic_mean">Arithmetic Mean</a> of the provided data.
 * The arithmetic mean formula used here is:
 * <p>
 *     <code>mean = sum / n</code>
 *
 * <p>where:
 * <pre>
 *     sum = {@link Sum} of data values
 *     n = number of data values
 * </pre>
 */
public class Mean extends AbstractStatisticFunction {

    /**
     * See {@link Mean} for details on the used formula.
     * @param data the data to evaluate the {@link Mean} on
     * @return the arithmetic mean of the provided data
     */
    @Override
    public double evaluate(double[] data) {
        final int n = data.length;

        double mean = new Sum().evaluate(data);
        mean /= n;

        return mean;
    }
}
