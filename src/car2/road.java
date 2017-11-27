package car2;


public class road {
    public static void main(String[] args) {

        Police police = new Police();
        police.allowedSpeed = 20;
        police.penaltyValue = 255;

        Car car1 = new Car(250, 30);
        car1.model = "Chevrolet Aveo";
        car1.setMaxSpeed(250);
        car1.penalties = new Fine[1];
        Fine fine = new Fine();
        fine.fineAmount = 250;
        fine.fineDescription = "buhal za rulem";
        fine.finePaid = false;
        car1.penalties[0] = fine;


        Car car2 = new Car(0,0);
        car2.model = "Bmw X5";
        car2.setMaxSpeed(350);
        car2.penalties = new Fine[0];

        Car car3 = new Car(0,0);
        car3.model = "Bmw One";
        car3.setMaxSpeed(350);
        car3.penalties = new Fine[1];
        Fine fine1 = new Fine();
        fine1.fineAmount = 250;
        fine1.fineDescription = " ";
        fine1.finePaid = true;
        car3.penalties[0] = fine1;

        Car[] cars = new Car[]{car1, car2, car3};
        car1.drive(50);
        car2.drive(380);
        car3.drive(30);


        for (Car car : cars) {
            police.checkTheCar(car);

        }




    }


    }



