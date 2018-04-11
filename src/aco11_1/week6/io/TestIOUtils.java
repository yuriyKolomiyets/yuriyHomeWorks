package aco11_1.week6.io;

import aco11_1.utils.TimeCounter;

import java.io.File;
import java.io.FileNotFoundException;

public class TestIOUtils {

    public static final String FILE_SOURCE = "/home/serhii/temp/imgo.jpg";
    public static final String FILE_DESTINATION = "imgo.jpg";

    public static void main(String[] args) {
        TimeCounter counter = new TimeCounter(() -> {
            try {
                byte[] mas = IOUtils.getBytesWithBuff(FILE_SOURCE);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
        String time = counter.countActionTime();
        System.out.println(time);

        try {
            byte[] copy = IOUtils.getBytesWithBuff(FILE_SOURCE);
            IOUtils.writeInto(copy, FILE_DESTINATION);

            File file = new File(FILE_DESTINATION);
            System.out.println(file.exists());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
