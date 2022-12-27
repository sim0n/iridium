package dev.sim0n.iridium.function;

/**
 * @author sim0n
 */
@FunctionalInterface
public interface DoubleBiFunction<T, U> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @param u the second function argument
     * @return the function result
     */
    double apply(T t, U u);
}
