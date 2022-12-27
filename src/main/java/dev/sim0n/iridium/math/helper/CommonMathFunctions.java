package dev.sim0n.iridium.math.helper;

/**
 * @author sim0n
 */
public interface CommonMathFunctions {

    /**
     * @param value the value to sqrt
     * @return the square root of the provided value.
     */
    default double sqrt(double value) {
        return Math.sqrt(value);
    }

    /**
     * Squares the given value
     * @param value the value to square
     * @return the squared value
     */
    default double square(double value) {
        return Math.pow(value, 2D);
    }

    /**
     * Cubes the given value
     * @param value the value to cube
     * @return the cubed value
     */
    default double cube(double value) {
        return Math.pow(value, 3D);
    }

    /**
     * @param value the value
     * @return the value to the power of 4
     */
    default double quartic(double value) {
        return Math.pow(value, 4D);
    }
}
