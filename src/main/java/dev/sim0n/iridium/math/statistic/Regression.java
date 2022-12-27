package dev.sim0n.iridium.math.statistic;

import dev.sim0n.iridium.math.statistic.regression.linear.LinearRegression;
import dev.sim0n.iridium.math.statistic.regression.RegressionResult;
import dev.sim0n.iridium.math.statistic.regression.linear.impl.LeastSquares;
import lombok.experimental.UtilityClass;

/**
 * @author sim0n
 */
@UtilityClass
public class Regression {
    private final LinearRegression LEAST_SQUARES = new LeastSquares();

    /**
     * Performs a linear regression (LLS) on the provided data.
     * @param x the x values.
     * @param y the y values.
     * @return the result of the regression.
     */
    public RegressionResult leastSquares(double[] x, double[] y) {
        return LEAST_SQUARES.evaluate(x, y);
    }
}
