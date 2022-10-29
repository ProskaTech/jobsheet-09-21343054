public class tugas_elevator {
    public static void main(String[] args) {
        elevator myElevator = new elevator();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.goDown();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.setFloor(myElevator.TOP_FLOOR);
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.setFloor(myElevator.BOTTOM_FLOOR);
        myElevator.openDoor();
        myElevator.closeDoor();
    }
}
