package dev.sim0n.iridium.function;

/**
 * @author sim0n
 */
@FunctionalInterface
public interface IntBiFunction<T, U> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @param u the second function argument
     * @return the function result
     */
    int apply(T t, U u);
}

