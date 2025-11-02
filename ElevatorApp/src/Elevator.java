import java.util.concurrent.BlockingQueue;

public class Elevator extends Thread {
    private final int id;
    private int currentFloor = 0;
    private final BlockingQueue<ElevatorRequest> requestQueue;

    public Elevator(int id, BlockingQueue<ElevatorRequest> requestQueue) {
        this.id = id;
        this.requestQueue = requestQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                ElevatorRequest request = requestQueue.take();
                System.out.println("\nElevator " + id + " processing " + request);
                moveToFloor(request.fromFloor);
                moveToFloor(request.toFloor);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Elevator " + id + " interrupted.");
        }
    }

    private void moveToFloor(int floor) throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Elevator " + id + " moving from floor " + currentFloor + " to floor " + floor);
        Thread.sleep(Math.abs(floor - currentFloor) * 1000L); // 1000ms per floor
        long timeTaken = System.currentTimeMillis() - currentTimeMillis;
        currentFloor = floor;
        System.out.println("Elevator " + id + " arrived at floor " + currentFloor + " (Time taken: " + timeTaken + " ms)");
    }

}
