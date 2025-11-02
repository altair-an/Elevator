public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ElevatorControl control = new ElevatorControl();
        control.spinUpElevators(2);

        control.addRequest(0, 5);
        control.addRequest(3, 7);
        control.addRequest(2, 8);
        control.addRequest(8, 0);


        // Let the elevators process requests for a while
        //Thread.sleep(30000);
        System.out.println("Main Done");
        //System.exit(0);
    }
}
