package dev.sim0n.iridium.math.statistic;

import dev.sim0n.iridium.math.statistic.function.StatisticFunction;
import dev.sim0n.iridium.math.statistic.function.impl.*;
import lombok.experimental.UtilityClass;

import java.util.Collection;

/**
 * @author sim0n
 */
@UtilityClass
public class Stats {
    private final StatisticFunction ENTROPY = new Entropy();
    private final StatisticFunction KURTOSIS = new Kurtosis();
    private final StatisticFunction MAX = new Max();
    private final StatisticFunction MEAN = new Mean();
    private final StatisticFunction MIDPOINT = new Midpoint();
    private final StatisticFunction MIN = new Min();
    private final StatisticFunction MODE = new Mode();
    private final StatisticFunction RANGE = new Range();
    private final StatisticFunction SKEWNESS = new Skewness();
    private final StatisticFunction STANDARD_DEVIATION = new StandardDeviation();
    private final StatisticFunction SUM = new Sum();
    private final StatisticFunction VARIANCE = new Variance();

    /**
     * Calculates the <a href="https://en.wikipedia.org/wiki/Entropy_(information_theory)">Entropy</a> of the provided data.
     * @see Entropy for the formula used to calculate the entropy.
     * @param data the data to evaluate the {@link Entropy} of
     * @return the entropy of the provided data
     */
    public double entropy(double[] data) {
        return ENTROPY.evaluate(data);
    }

    /**
     * Calculates the <a href="https://en.wikipedia.org/wiki/Kurtosis">Kurtosis</a> of the provided data.
     * @see Entropy for the formula used to calculate the kurtosis.
     * @param data the data to evaluate the {@link Kurtosis} of
     * @return the kurtosis of the provided data
     */
    public double entropy(Collection<? extends Number> data) {
        return ENTROPY.evaluate(data);
    }

    /**
     * Calculates the <a href="https://en.wikipedia.org/wiki/Kurtosis">Kurtosis</a> of the provided data.
     * @see Kurtosis for the formula used to calculate the kurtosis.
     * @param data the data to evaluate the {@link Kurtosis} of
     * @return the kurtosis of the provided data
     */
    public double kurtosis(double[] data) {
        return KURTOSIS.evaluate(data);
    }

    /**
     * Calculates the <a href="https://en.wikipedia.org/wiki/Kurtosis">Kurtosis</a> of the provided data.
     * @see Kurtosis for the formula used to calculate the kurtosis.
     * @param data the data to evaluate the {@link Kurtosis} of
     * @return the kurtosis of the provided data
     */
    public double kurtosis(Collection<? extends Number> data) {
        return KURTOSIS.evaluate(data);
    }

    /**
     * Calculates the <a href="https://en.wikipedia.org/wiki/Maximum">Maximum</a> of the provided data.
     * @see Max for the formula used to calculate the maximum.
     * @param data the data to evaluate the {@link Max} of
     * @return the maximum of the provided data
     */
    public double max(double[] data) {
        return MAX.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Maximum">Maximum</a> of the provided data.
     * @see Max for the formula used to calculate the maximum.
     * @param data the data to evaluate the {@link Max} of
     * @return the maximum of the provided data
     */
    public double max(Collection<? extends Number> data) {
        return MAX.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Mean">Mean</a> of the provided data.
     * @see Mean for the formula used to calculate the mean.
     * @param data the data to evaluate the {@link Mean} of
     * @return the mean of the provided data
     */
    public double mean(double[] data) {
        return MEAN.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Mean">Mean</a> of the provided data.
     * @see Mean for the formula used to calculate the mean.
     * @param data the data to evaluate the {@link Mean} of
     * @return the mean of the provided data
     */
    public double mean(Collection<? extends Number> data) {
        return MEAN.evaluate(data);
    }

    /**
     * Calculates the <a href="https://en.wikipedia.org/wiki/Midpoint">Midpoint</a> of the provided data.
     * @see Midpoint for the formula used to calculate the midpoint.
     * @param data the data to evaluate the {@link Midpoint} of
     * @return the midpoint of the provided data
     */
    public double midpoint(double[] data) {
        return MIDPOINT.evaluate(data);
    }

    /**
     * Calculates the <a href="https://en.wikipedia.org/wiki/Midpoint">Midpoint</a> of the provided data.
     * @see Midpoint for the formula used to calculate the midpoint.
     * @param data the data to evaluate the {@link Midpoint} of
     * @return the midpoint of the provided data
     */
    public double midpoint(Collection<? extends Number> data) {
        return MIDPOINT.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Minimum">Minimum</a> of the provided data.
     * @see Min for the formula used to calculate the minimum.
     * @param data the data to evaluate the {@link Min} of
     * @return the minimum of the provided data
     */
    public double min(double[] data) {
        return MIN.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Minimum">Minimum</a> of the provided data.
     * @see Min for the formula used to calculate the minimum.
     * @param data the data to evaluate the {@link Min} of
     * @return the minimum of the provided data
     */
    public double min(Collection<? extends Number> data) {
        return MIN.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Mode_(statistics)">Mode</a> of the provided data.
     * @see Mode for the formula used to calculate the mode.
     * @param data the data to evaluate the {@link Mode} of
     * @return the mode of the provided data
     */
    public double mode(double[] data) {
        return MODE.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Mode_(statistics)">Mode</a> of the provided data.
     * @see Mode for the formula used to calculate the mode.
     * @param data the data to evaluate the {@link Mode} of
     * @return the mode of the provided data
     */
    public double mode(Collection<? extends Number> data) {
        return MODE.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Range_(statistics)">Range</a> of the provided data.
     * @see Range for the formula used to calculate the range.
     * @param data the data to evaluate the {@link Range} of
     * @return the range of the provided data
     */
    public double range(double[] data) {
        return RANGE.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Range_(statistics)">Range</a> of the provided data.
     * @see Range for the formula used to calculate the range.
     * @param data the data to evaluate the {@link Range} of
     * @return the range of the provided data
     */
    public double range(Collection<? extends Number> data) {
        return RANGE.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Skewness">Skewness</a> of the provided data.
     * @see Skewness for the formula used to calculate the skewness.
     * @param data the data to evaluate the {@link Skewness} of
     * @return the skewness of the provided data
     */
    public double skewness(double[] data) {
        return SKEWNESS.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Skewness">Skewness</a> of the provided data.
     * @see Skewness for the formula used to calculate the skewness.
     * @param data the data to evaluate the {@link Skewness} of
     * @return the skewness of the provided data
     */
    public double skewness(Collection<? extends Number> data) {
        return SKEWNESS.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Standard_deviation">Standard Deviation</a> of the provided data.
     * @see StandardDeviation for the formula used to calculate the standard deviation.
     * @param data the data to evaluate the {@link StandardDeviation} of
     * @return the standard deviation of the provided data
     */
    public double stdDev(double[] data) {
        return STANDARD_DEVIATION.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Standard_deviation">Standard Deviation</a> of the provided data.
     * @see StandardDeviation for the formula used to calculate the standard deviation.
     * @param data the data to evaluate the {@link StandardDeviation} of
     * @return the standard deviation of the provided data
     */
    public double stdDev(Collection<? extends Number> data) {
        return STANDARD_DEVIATION.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Sum">Sum</a> of the provided data.
     * @see Sum for the formula used to calculate the sum.
     * @param data the data to evaluate the {@link Sum} of
     * @return the sum of the provided data
     */
    public double sum(double[] data) {
        return SUM.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Sum">Sum</a> of the provided data.
     * @see Sum for the formula used to calculate the sum.
     * @param data the data to evaluate the {@link Sum} of
     * @return the sum of the provided data
     */
    public double sum(Collection<? extends Number> data) {
        return SUM.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Variance">Variance</a> of the provided data.
     * @see Variance for the formula used to calculate the variance.
     * @param data the data to evaluate the {@link Variance} of
     * @return the variance of the provided data
     */
    public double variance(double[] data) {
        return VARIANCE.evaluate(data);
    }

    /** 
     * Calculates the <a href="https://en.wikipedia.org/wiki/Variance">Variance</a> of the provided data.
     * @see Variance for the formula used to calculate the variance.
     * @param data the data to evaluate the {@link Variance} of
     * @return the variance of the provided data
     */
    public double variance(Collection<? extends Number> data) {
        return VARIANCE.evaluate(data);
    }

}
