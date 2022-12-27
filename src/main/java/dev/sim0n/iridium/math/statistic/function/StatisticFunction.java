package dev.sim0n.iridium.math.statistic.function;

import java.util.Collection;
import java.util.List;

/**
 * @author sim0n
 */
public interface StatisticFunction {

    /**
     * Evaluate the statistic function on the provided data.
     * @param data the data to evaluate the statistic function on
     * @return the result of the statistic function
     */
    double evaluate(double[] data);

    /**
     * <p>
     *     This is a convenience function will convert the given data to a double array and call {@link #evaluate(double[])}.
     *     Which will evaluate the statistic function on the given data.
     * </p>
     * @param data the data to evaluate the statistic function on
     * @return the result of the statistic function
     */
    default double evaluate(Collection<? extends Number> data) {
        return this.evaluate(data.stream().mapToDouble(Number::doubleValue).toArray());
    }

    /**
     * <p>
     *     This is a function that is used for passing a pre-computed mean to the statistic function.
     *     The reason for this is to avoid multiple mean calculations
     * </p>
     * Evaluate the statistic function on {@param data}
     * @param data the data to evaluate the statistic function on
     * @param mean the pre-calculated mean of the data
     * @return the result of the statistic function
     */
    default double evaluate(double[] data, double mean) {
        throw new UnsupportedOperationException("Found no implementation for this method!");
    }

    /**
     * Test if the given data is above the {@param threshold} for the statistic function.
     * @param data the data to test
     * @param threshold the value to test
     * @return true if the data is above the {@param threshold}, false otherwise
     */
    default boolean test(double[] data, double threshold) {
        return evaluate(data) > threshold;
    }

    default boolean test(List<? extends Number> data, double threshold) {
        return this.test(data.stream().mapToDouble(Number::doubleValue).toArray(), threshold);
    }
}
