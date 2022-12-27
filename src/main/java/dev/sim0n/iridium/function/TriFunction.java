package dev.sim0n.iridium.function;

/**
 * @author sim0n
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
