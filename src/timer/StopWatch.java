package timer;

public class StopWatch {
    private double startTime;
    private double endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public void printElapsedTime() {
        System.out.println("The total time for running was: " + (endTime - startTime) / 1000.0 + " seconds");
    }
}
