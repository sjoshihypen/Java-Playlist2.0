import java.util.*;
class Process {
    public int pid;
    public int arrivalTime;
    public int burstTime;
    public int priority;
    public int waitingTime;
    public int turnaroundTime;

    public Process(int pid, int arrivalTime, int burstTime, int priority)
 
{
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;

        
this.priority = priority;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }
}

public class SchedulingAlgorithms {

    public static void fcfsScheduling(Process[] processes) {
        // Sort processes by arrival time
        Arrays.sort(processes, (p1, p2) -> p1.arrivalTime - p2.arrivalTime);

        int currentTime = 0;
        for (Process process : processes) {
            process.waitingTime = Math.max(0, currentTime - process.arrivalTime);
            currentTime += process.burstTime;
            process.turnaroundTime = process.waitingTime + process.burstTime;
        }
    }

    public static void priorityScheduling(Process[] processes) {
        // Sort processes by priority (higher priority first)
        Arrays.sort(processes, (p1, p2) -> Integer.compare(p2.priority, p1.priority));

        int currentTime = 0;
        while (!isEmpty(processes)) {
            Process process = processes[0];
            processes = Arrays.copyOfRange(processes, 1, processes.length);

            process.waitingTime = Math.max(0, currentTime - process.arrivalTime);
            currentTime += process.burstTime;
            process.turnaroundTime = process.waitingTime + process.burstTime;
        }
    }

    private static boolean isEmpty(Process[] processes) {
        return processes.length == 0;
    }

    public static void main(String[] args) {
        // Example processes
        Process[] processes = {
            new Process(1, 0, 5, 2),
            new Process(2, 2, 3, 1),
            new Process(3, 4, 7, 3),
        };

        // FCFS scheduling
        fcfsScheduling(processes.clone());
        System.out.println("FCFS Scheduling:");
        printProcessDetails(processes);

        // Priority scheduling
        priorityScheduling(processes.clone());
        System.out.println("\nPriority Scheduling:");
        printProcessDetails(processes);
    }

    private static void printProcessDetails(Process[] processes) {
        for (Process process : processes) {
            System.out.println(
                String.format("Process %d: Waiting Time = %d, Turnaround Time = %d",
                    process.pid, process.waitingTime, process.turnaroundTime));
        }
    }
} 