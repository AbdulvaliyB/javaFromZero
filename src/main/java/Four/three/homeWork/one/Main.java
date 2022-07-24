package Four.three.homeWork.one;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Queue<Integer> liftQueue = new LinkedList<>();

        int totalSeconds = 0;
        int previousFloor = -1;
        int currentFloor = 1;
        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;


        while (true) {
            System.out.println("Waiting for enter the number of floor: (for completion 0)");
            currentFloor = scanner.nextInt();

            if (currentFloor == previousFloor) {
                System.out.println("This floor already entered");
            } else if (currentFloor > 25 || currentFloor < 0) {
                System.out.println("There is no such floor in this house");
            } else if (currentFloor == 0) {
                System.out.println();
                for (int currentFloor1 : liftQueue) {
                    System.out.printf("floor %d -> ", currentFloor1);
                }
                System.out.println("floor 0");
                System.out.printf("Time spent by the lift on the route: %d seconds", totalSeconds);
                break;
            } else {

                totalSeconds += Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
                totalSeconds += waitDoorsInSeconds;

                liftQueue.add(currentFloor);
            }
            previousFloor = currentFloor;

        }
    }
}
