import java.util.List;

public class SJFScheduler {

    public List<Process> executeSJF(List<Process> processes) {
        // TODO (Andrew): Initialize time simulation variables (currentTime, completedProcesses count).
        // TODO (Andrew): Create a Ready Queue to hold processes that have arrived.
        
        // TODO (Andrew): Write the main time-progression loop.
        // Example: while(completedProcesses < totalProcesses) { ... }

        // Inside the time loop:
            // TODO (Andrew): Check if new processes arrived at 'currentTime' and add them to the queue.

            // TODO (Sama): Implement SJF selection logic. 
            // Scan the Ready Queue and find the process with the shortest remaining burst time.

            // TODO (Sama): Execute the selected process.
            // TODO (Sama): Calculate WT, TAT, and RT for the selected process once it finishes.

        // TODO (Sama): Return the final list of executed processes in chronological order for the UI.
        return null; // Placeholder
    }
}
