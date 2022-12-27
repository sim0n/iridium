package dev.sim0n.iridium.math.statistic.function.impl;

import dev.sim0n.iridium.math.statistic.function.AbstractStatisticFunction;

import java.util.Arrays;

/**
 * @author sim0n
 */
public class Max extends AbstractStatisticFunction {

    /**
     * @param data The data to evaluate the statistic function on.
     * @return The maximum value of the provided data.
     */
    @Override
    public double evaluate(double[] data) {
        return Arrays.stream(data)
                .max()
                .orElse(Double.NaN);
    }
}
