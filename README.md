# SOLID Principles

[Youtube Tutorial](https://www.youtube.com/watch?v=HoA6aZPR5K0)

## Single Responsibility Principle

A class should have one and only one, responsibility and reason to change.

Example Scenario:
Persisting objects in Database.

## Open Closed Principle

A class should be:
- Open for Extension
- Closed for Modification
In other words, we should be able to extend a class's behavior without modifying it.

Example Scenario:
We want to add a new behavior in our application
that calculates the respective earning of each video
based on its category.

## Liskov Substitution Principle

Subtypes should be replaceable by their base types.

Think twice before using Inheritance in our classes.
As our classes shouldn't only be extended based on the fact that they shared something in common.

Example Scenario: Playing Ads in Videos but not in Premium Videos

```java
public class Main {
    public static void main(String[] args) throws Exception {
        List<Video> videos = new ArrayList<>();
        videos.add(new Video());
        videos.add(new PremiumVideo());
        // PROBLEM:-
        // If one of the video is a Premium Video
        // then it will through an exception causing
        // our application to crash.
        for(Video video : videos) {
            video.playRandomAd();
        }
    }
}
```

Goal is to replace Inheritance with Composition

## Interface Segregation Principle

Many specific interfaces are better than one general interface.

In other words, interfaces having many behaviors are difficult to maintain and evolve, hence should be avoided.

Example Scenario: Playing Ads in Videos but not in Premium Videos

```java
public interface IAdsActions {
    void playRandomAd();
}
```

```java
public interface IVideoActions {
    double getNumberOfHoursPlayed();
}
```

Segregating interfaces will allow `PremiumVideo` class to implement only the method that it needs.

## Dependency Inversion Principle

We must depend on abstractions and not concrete classes.

When we applied Open-Closed Principle into our Video earnings functionality,
we actually implicitly implemented Dependency Inversion Principle

It turns out that now we need only the reference to the interface (or abstract class) 
to call required methods, thereby applying abstraction.

```java
public interface IEarningsCalculator {
    double calculateEarnings(Video video);
}
```

```java
import open_closed_principle.Video;
import open_closed_principle.with.IEarningsCalculator;

public class Service {

    // Direct reference to the underlying interface
    private final IEarningsCalculator calculator;

    public Service(IEarningsCalculator calculator) {
        this.calculator = calculator;
    }

    public double calculateEarnings(Video video) {
        return calculator.calculateEarnings(video);
    }
}
```

Additionally, this principle can also be extended to the module (or package) level.

High-level modules should not depend on low-level modules. Both should depend on abstractions.


