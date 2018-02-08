package aco11_1.week05.generics;

public class TestGenericContainer {

    public static void main(String[] args) {
        // define generic type <>
        GenericContainer<String> container = new GenericContainer<>("53");
        container.setEl("2342");

        String el = container.getEl();
    }
}
