package dev.sim0n.iridium.function;

/**
 * @author sim0n
 */
@FunctionalInterface
public interface IntObjFunction<T> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     */
    int apply(T t);
}
