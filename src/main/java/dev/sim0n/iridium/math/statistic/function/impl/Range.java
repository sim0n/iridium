package dev.sim0n.iridium.math.statistic.function.impl;

import dev.sim0n.iridium.math.statistic.function.AbstractStatisticFunction;

/**
 * Calculates the <a href="https://en.wikipedia.org/wiki/Range_(statistics)">Range</a> of the provided data.
 * The range formula used here is:
 * <p>
 *     <code>range = max - min</code>
 *
 * <p>where:
 * <pre>
 *     max = {@link Max} of data
 *     min = {@link Min} of data
 * </pre>
 */
public class Range extends AbstractStatisticFunction {

    /**
     * See {@link Range} for details on the used formula.
     * @param data The data to evaluate the {@link Range} on.
     * @return The range of the provided data.
     */
    @Override
    public double evaluate(double[] data) {
        double max = new Max().evaluate(data);
        double min = new Min().evaluate(data);

        return max - min;
    }
}
