# Iridium

Iridium is a simple-to-use general utility library for Java. It contains classes and methods that can 
be used to make your life easier such as math utilities, extra collections, extra functions, and more.

## Features
* Math utilities
* Collection utilities

## Example Usage
Descriptive Statistics: 
```java
double kurtosis = Stats.kurtosis(data);

if (kurtosis < 0.0) {
    System.out.println("Data is platykurtic.");
}
```

Linear Regression:
```java
RegressionResult result = Regression.leastSquares(x, y);

double slope = result.slope();
double intercept = result.intercept();
double coefficientOfDetermination = result.determination();

System.out.printf("slope=%s, intercept=%s, rsquared=%s", slope, intercept, coefficientOfDetermination);
```

Collections:
```java
ClassToInstanceMapBuilder<Feature> features = new ClassToInstanceMapBuilder<Feature>()
            .put(new Feature1())
            .put(new Feature2())
            .put(new Feature3())
            .build();

Feature1 instance = features.getInstance(Feature1.class);
```