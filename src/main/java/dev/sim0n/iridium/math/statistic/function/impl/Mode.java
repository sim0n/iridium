package dev.sim0n.iridium.math.statistic.function.impl;

import dev.sim0n.iridium.math.statistic.function.AbstractStatisticFunction;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Calculates the <a href="https://en.wikipedia.org/wiki/Mode_(statistics)">Mode</a> of the provided data.
 * The mode formula used here is:
 * <p>
 *     <code>
 *         mode = argmax(count)
 *     </code>
 *
 * <p>where:
 * <pre>
 *     x = data value
 *     count = number of times x occurs in data
 *     argmax = index of x with the highest count
 * </pre>
 *
 * TODO: optimize this
 */
public class Mode extends AbstractStatisticFunction {

    /**
     * See {@link Mode} for details on the used formula.
     * @param data The data to evaluate the statistic function on.
     * @return The mode of the provided data.
     */
    @Override
    public double evaluate(double[] data) {
        final int n = data.length;
        final double[] sortedData = data.clone();

        Arrays.sort(sortedData);

        final double[] counts = IntStream.range(0, n)
                .mapToDouble(i ->
                        IntStream.range(0, n)
                                .filter(j -> sortedData[j] == sortedData[i])
                                .count()
                )
                .toArray();

        final double mode = Arrays.stream(counts)
                .max()
                .orElse(Double.NaN);

        return mode;
    }
}
