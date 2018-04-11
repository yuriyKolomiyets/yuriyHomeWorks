package aco11_1.week6.serialize;

import java.io.Serializable;

public class Robot implements Serializable {

    private long id;
    private String model;
    private double price;
    private transient long pass;

    public Robot() {
    }

    public Robot(long id, String model, double price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}