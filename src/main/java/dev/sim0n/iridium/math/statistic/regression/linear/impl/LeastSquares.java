package dev.sim0n.iridium.math.statistic.regression.linear.impl;

import dev.sim0n.iridium.function.DoubleBiFunction;
import dev.sim0n.iridium.math.statistic.function.StatisticFunction;
import dev.sim0n.iridium.math.statistic.function.impl.Mean;
import dev.sim0n.iridium.math.statistic.regression.linear.AbstractLinearRegression;
import dev.sim0n.iridium.math.statistic.regression.RegressionResult;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <p>
 *     Calculates the <a href="https://en.wikipedia.org/wiki/Least_squares">Least Squares</a> solution
 *     to <code>y = a + bx</code> of the provided data.
 * </p>
 *
 * <p>Note that if the length of both arrays are not equal a {@link IllegalArgumentException} will be thrown.
 *
 * <p>Note that if that if x or y is empty a {@link IllegalArgumentException} will be thrown.
 *
 */
public class LeastSquares extends AbstractLinearRegression {
    private final StatisticFunction m1 = new Mean();

    @SuppressWarnings("CodeBlock2Expr")
    private final DoubleBiFunction<double[], Double> squareSumFunc = (array, mean) -> {
        return Arrays.stream(array)
                .map(value -> this.square(value - mean))
                .sum();
    };

    /**
     * Evaluates the <a href="https://en.wikipedia.org/wiki/Least_squares">Least Squares</a> of the provided data.
     * @param x the x-axis values
     * @param y the y-axis values
     * @return the regression result
     */
    @Override
    public RegressionResult evaluate(double[] x, double[] y) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("x and y must be of the same length");
        }

        if (x.length < 2) {
            throw new IllegalArgumentException("x and y must have at least 2 elements");
        }

        final int n = x.length;

        final double meanX = this.m1.evaluate(x);
        final double meanY = this.m1.evaluate(y);

        final double squaredDeltaXSum = this.squareSumFunc.apply(x, meanX);
        final double squaredDeltaYSum = this.squareSumFunc.apply(y, meanY);

        final double squaredDeltaXYSum = IntStream.range(0, n)
                .mapToDouble(i -> (x[i] - meanX) * (y[i] - meanY))
                .sum();

        final double slope = squaredDeltaXYSum / squaredDeltaXSum;
        final double intercept = meanY - slope * meanX;

        final double regressionSum = IntStream.range(0, n)
                .mapToDouble(i -> slope * x[i] + intercept)
                .map(fitY -> this.square(fitY - meanY))
                .sum();

        final double r2 = regressionSum / squaredDeltaYSum;

        return new RegressionResult(slope, intercept, r2);
    }
}
