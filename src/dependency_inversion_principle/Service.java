package dependency_inversion_principle;

import open_closed_principle.Video;
import open_closed_principle.with.IEarningsCalculator;

public class Service {

    // Applying Dependency Inversion Principle
    // Direct reference to the underlying interface
    private final IEarningsCalculator calculator;

    public Service(IEarningsCalculator calculator) {
        this.calculator = calculator;
    }

    public double calculateEarnings(Video video) {
        return calculator.calculateEarnings(video);
    }
}
