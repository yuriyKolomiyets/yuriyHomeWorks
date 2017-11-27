package car2;

public class Car {

    String model;

    public Car(int maxSpeed, int currentSpeed) {
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    private int maxSpeed;
    private int currentSpeed;
   Fine[] penalties;



    void stop() {
        currentSpeed = 0;
        System.out.println(model + " " + "Car stoped");

    }
    void drive(int spead) {
        if (spead <= maxSpeed) {
            currentSpeed = spead;
            System.out.println(model + " " + "is driving with a speed" + " " +  spead);
        }

        else {
            System.out.println(model + " " +  "cant drive with a speed" + " " +  spead);
            stop();
        }

    }





    static double convertSpeedtoMPH(int speedInKmh){
       return speedInKmh / 1.62;
 }
    }