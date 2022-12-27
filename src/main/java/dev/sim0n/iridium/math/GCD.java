package dev.sim0n.iridium.math;

import lombok.experimental.UtilityClass;

/**
 * @author sim0n
 */
@UtilityClass
public class GCD {

    public double of(double a, double b, double base) {
        if (a < b) {
            return GCD.of(b, a, base);
        } else {
            return Math.abs(b) < base ? a : GCD.of(b, a - Math.floor(a / b) * b, base);
        }
    }

}
