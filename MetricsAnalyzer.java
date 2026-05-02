import java.util.List;

public class MetricsAnalyzer {

    // TODO (Yassin): Write logic to parse input from the Web UI's JSON payload into Java Process objects.
    public List<Process> parseInput(String jsonPayload) {
        return null; 
    }

    // TODO (Amir): Calculate System Averages
    public double calculateAverageWaitTime(List<Process> processes) { return 0.0; }
    public double calculateAverageTurnaround(List<Process> processes) { return 0.0; }

    // TODO (Amir): Generate Hardcoded Test Scenarios for analysis
    public List<Process> loadConflictScenario() {
        // Processes arriving at the exact same time
        return null;
    }

    public List<Process> loadStarvationScenario() {
        // High priority tasks flooding the system, starving a low priority one
        return null;
    }
}
