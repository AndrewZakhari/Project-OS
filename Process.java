public class Process {
    // Basic Process Info
    public String id;
    public int arrivalTime;
    public int burstTime;
    public int priority; // Lower number usually means higher priority

    // Metrics (To be calculated by Sama and Yassin)
    public int completionTime;
    public int waitingTime;
    public int turnaroundTime;
    public int responseTime;
    public int startTime = -1; // -1 indicates it hasn't started yet

    public Process(String id, int arrivalTime, int burstTime, int priority) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}
