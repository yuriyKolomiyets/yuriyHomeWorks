package car2;
public class Car {

    private String getModel;
    private int maxSpeed;
    private int currentSpeed;

    public Car(String model, int maxSpeed, int currentSpeed) {
        this.getModel = model;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }
    public String getGetModel() {
        return getModel;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    Fine[] penalties;
    void stop() {
        currentSpeed = 0;
        System.out.println(getModel + " " + "Car stoped");
    }
    void drive(int speed) {
        if (speed <= maxSpeed) {
            currentSpeed = speed;
            System.out.println(getModel + " " + "is driving with a speed" + " " + speed);
        } else {
            System.out.println(getModel + " " + "cant drive with a speed" + " " + speed);
            stop();
        }
    }
    static double convertSpeedtoMPH(int speedInKmh) {
        return speedInKmh / 1.62;
    }
}