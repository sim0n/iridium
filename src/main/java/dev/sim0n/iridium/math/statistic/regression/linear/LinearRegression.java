package dev.sim0n.iridium.math.statistic.regression.linear;

import dev.sim0n.iridium.math.statistic.regression.RegressionResult;

/**
 * @author sim0n
 */
public interface LinearRegression {

    RegressionResult evaluate(double[] x, double[] y);
}
