package dev.sim0n.iridium.util;

import lombok.experimental.UtilityClass;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * @author sim0n
 */
@UtilityClass
public class Optionals {

    /**
     * Performs the given action for the given optional, if present, otherwise performs the given empty-based action.
     * @param optional the optional to be present
     * @param consumer the action to be performed, if present
     * @param runnable the empty-based action to be performed, otherwise
     * @param <T> the type of the value
     */
    public <T> void ifPresentOrElse(Optional<T> optional, Consumer<T> consumer, Runnable runnable) {
        if (optional.isPresent()) {
            consumer.accept(optional.get());
        } else {
            runnable.run();
        }
    }
}
