package dev.sim0n.iridium.math.statistic.function;

import dev.sim0n.iridium.math.helper.CommonMathFunctions;

/**
 * @author sim0n
 */
public interface BiStatisticFunction extends CommonMathFunctions {

    double evaluate(double[] x, double[] y);

}
