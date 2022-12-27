package dev.sim0n.iridium.math.statistic.function.impl;

import dev.sim0n.iridium.math.statistic.function.AbstractStatisticFunction;

/**
 * @author sim0n
 */
public class Midpoint extends AbstractStatisticFunction {

    /**
     * Calculates the midpoint of the provided data.
     * @param data The data to evaluate {@link Midpoint} on.
     * @return The midpoint of the provided data.
     */
    @Override
    public double evaluate(double[] data) {
        double max = new Max().evaluate(data);
        double min = new Min().evaluate(data);

        return (max + min) / 2;
    }
}
