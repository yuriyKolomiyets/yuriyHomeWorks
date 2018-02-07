package aco11_1.week6.io;

import java.io.FileNotFoundException;

public class TestFileReading {

    public static void main(String[] args) throws FileNotFoundException {
        String res =
                IOUtils.readFileContent("/home/serhii/dev/IdeaProjects/ACO11/home/week2.txt");


        System.out.println(res);
    }
}