package dev.sim0n.iridium.math.statistic.function.impl;

import dev.sim0n.iridium.math.statistic.function.AbstractStatisticFunction;

import java.util.HashMap;
import java.util.Map;

/**
 * Calculates the <a href="https://en.wikipedia.org/wiki/Entropy_(information_theory)">Entropy</a> of the provided data.
 * The entropy formula used here is:
 * <p>
 *     <code>entropy = -sum[p log2(p)]</code>
 *
 * <p>where:
 * <pre>
 *     p = probability of data value
 *     sum = sum of data values
 * </pre>
 *
 * <p> Note that this evaluation will return <code>Double.NaN</code> if n {@literal <} 3
 *
 */
public class Entropy extends AbstractStatisticFunction {
    private static final double LN_2 = Math.log(2D);

    /**
     * See {@link Entropy} for details on the used formula.
     * @param data The data to evaluate the {@link Entropy} on.
     * @return The entropy of the provided data.
     */
    @Override
    public double evaluate(double[] data) {
        final double n = data.length;

        if (n < 3) {
            return Double.NaN;
        }

        final Map<Double, Integer> valueCounts = new HashMap<>();

        for (double value : data) {
            valueCounts.put(value, valueCounts.computeIfAbsent(value, k -> 0) + 1);
        }

        double entropy = valueCounts.values().stream()
                .mapToDouble(freq -> (double) freq / n)
                .map(probability -> probability * (Math.log(probability) / LN_2))
                .sum();

        entropy = -entropy;

        return entropy;
    }
}
