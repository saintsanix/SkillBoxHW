public class Elevator {

    public int currentFloor = 1;
    public int minFloor;
    public int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveDown() {
        return currentFloor - 1;
    }

    public int moveUp() {
        return currentFloor + 1;
    }

    public boolean move(int floor) {
        int i;
        if (currentFloor > minFloor) {
            for (i = currentFloor; i >= minFloor; i--) {
                System.out.println("����: " + i);
            }
            i = currentFloor;
            return true;
        } else if (currentFloor < maxFloor) {
            for (i = currentFloor; i <= maxFloor; i++) {
                System.out.println("����: " + i);
            }
            i = currentFloor;
            return true;
        } else {
            System.out.println("������, ����� �� ����� ������");
        }
        return false;
    }
}