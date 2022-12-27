package dev.sim0n.iridium.math.statistic.function.impl;

import dev.sim0n.iridium.math.statistic.function.AbstractStatisticFunction;
import dev.sim0n.iridium.math.statistic.function.StatisticFunction;

/**
 * Calculates the <a href="https://en.wikipedia.org/wiki/Standard_deviation">Standard Deviation</a> of the provided data.
 * The standard deviation formula used here is:
 * <p>
 *     <code>sd = sqrt(var)</code>
 *
 * <p>where:
 * <pre>
 *     var = {@link Variance} of data
 * </pre>
 */
public class StandardDeviation extends AbstractStatisticFunction {
    private final StatisticFunction m2 = new Variance();

    @Override
    public double evaluate(double[] data) {
        return this.sqrt(this.m2.evaluate(data));
    }
}
