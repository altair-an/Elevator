import java.util.concurrent.*;

public class ElevatorControl {
    private final BlockingQueue<ElevatorRequest> requestQueue = new LinkedBlockingQueue<>();

    public void spinUpElevators(int num) {
        for (int i = 0; i < num; i++) {
            Elevator elevator = new Elevator(i, requestQueue);
            elevator.start();
        }
    }

    public void addRequest(int from, int to) {
        requestQueue.offer(new ElevatorRequest(from, to));
    }
}
