Simple simulation modeling elevator system from the elevator control perspective. Each elevator runs as a separate thread and takes in ride request from shared queue. Demonstrating:
- Multi-threaded behavior
- Safe coordination using implicit wait/notifyAll from BlockingQueue
- Using sleep() to simulate elevator movement across floors

Possible extensions (not implemented for simplicity):
- Detailed statistics and logging
- Better assignment logic in ElevatorControl to avoid multiple elevators respoinding to the same floor
- Passenger logic