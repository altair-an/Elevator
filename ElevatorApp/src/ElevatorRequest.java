public class ElevatorRequest {
    final int fromFloor;
    final int toFloor;
    
    public ElevatorRequest(int fromFloor, int toFloor) {
        this.fromFloor = fromFloor;
        this.toFloor = toFloor;
    }

    @Override
    public String toString() {
        return "ElevatorRequest{" +
                "fromFloor=" + fromFloor +
                ", toFloor=" + toFloor +
                '}';
    }
}
