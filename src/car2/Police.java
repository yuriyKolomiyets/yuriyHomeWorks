package car2;

import java.util.Arrays;

public class Police {
    int allowedSpeed;
    int penaltyValue;

    void checkTheCar(Car car) {

        System.out.println("allowed Speed is " + allowedSpeed);
        int currentSpeed = car.getCurrentSpeed();
        if (currentSpeed <= allowedSpeed && currentSpeed > 0) {
            System.out.println(car.model + " " + "Hello");
        } else if (currentSpeed > allowedSpeed) {
            car.stop();
            System.out.println(car.model + " " + "You break the law motherfucker");


            Fine[] penalties = car.penalties;
            boolean doubleFine = false;
            for (Fine fine : penalties) {
                if (!fine.finePaid) {
                    doubleFine = true;
                    System.out.println(car.model + " " + "got d00ble fine");

                }
            }

            Fine fine = new Fine();
            fine.fineAmount = !doubleFine ? penaltyValue : 2 * penaltyValue;
            fine.fineDescription= "drive too fast";
            fine.finePaid = false;

            Fine[] newPenalties = Arrays.copyOf(car.penalties, car.penalties.length+1);
            newPenalties[newPenalties.length-1] = fine;
            car.penalties = newPenalties;

            car.drive(allowedSpeed);
        }
    }
}
