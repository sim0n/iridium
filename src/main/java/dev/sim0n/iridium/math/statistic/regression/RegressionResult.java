package dev.sim0n.iridium.math.statistic.regression;

import lombok.RequiredArgsConstructor;

/**
 * @author sim0n
 */
@RequiredArgsConstructor
public class RegressionResult {
    private final double slope;
    private final double intercept;
    private final double r2;

    /**
     * @return The slope of the regression line.
     */
    public double slope() {
        return this.slope;
    }

    /**
     *
     * @return The intercept of the regression line.
     */
    public double intercept() {
        return this.intercept;
    }

    /**
     * @return The coefficient of determination (R2).
     */
    public double determination() {
        return this.r2;
    }
}
