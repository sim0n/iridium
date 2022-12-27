package dev.sim0n.iridium.function;

/**
 * @author sim0n
 */
@FunctionalInterface
public interface FloatObjFunction<T> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     */
    float apply(T t);
}
