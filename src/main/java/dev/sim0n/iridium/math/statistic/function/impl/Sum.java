package dev.sim0n.iridium.math.statistic.function.impl;

import dev.sim0n.iridium.math.statistic.function.AbstractStatisticFunction;

import java.util.Arrays;

/**
 * @author sim0n
 */
public class Sum extends AbstractStatisticFunction {

    /**
     * Calculates the sum of the provided data.
     * @param data The data to evaluate {@link Sum} on.
     * @return The sum of the provided data.
     */
    @Override
    public double evaluate(double[] data) {
        return Arrays.stream(data).sum();
    }
}
