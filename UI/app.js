// --- YASSIN: Input Handling ---
let processList = [];

function addProcessFromForm() {
    // TODO (Yassin): Read values from HTML inputs, create a JS object, push to processList.
}

// --- SAMA: Integration / API Call ---
async function sendToBackend(algorithmType) {
    // TODO (Sama): Send a fetch() POST request to your Java backend API
    // Payload should be JSON.stringify(processList)
    // Wait for the JSON response containing the executed processes and metrics
    
    // Example:
    // const response = await fetch(`http://localhost:8080/api/schedule/${algorithmType}`, ...);
    // const results = await response.json();
    
    // Pass the results to George's UI functions
    // renderGanttChart(results);
    // renderMetricsTable(results);
}

// --- GEORGE: UI Rendering ---
function renderGanttChart(scheduledProcesses) {
    // TODO (George): Clear the #gantt-container
    // TODO (George): Loop through scheduledProcesses and create <div> elements.
    // TODO (George): Size the divs based on burst time or start/end times.
}

function renderMetricsTable(scheduledProcesses) {
    // TODO (George): Clear the #metrics-table tbody
    // TODO (George): Loop through scheduledProcesses and create <tr> and <td> elements for WT, TAT, etc.
}
