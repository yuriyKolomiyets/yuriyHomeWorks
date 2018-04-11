package aco11_1.week6.io;

import aco11_1.artCodeGroup.Student;
import aco11_1.week6.serialize.Robot;
import com.sun.xml.internal.ws.encoding.soap.SerializationException;

import java.io.*;
import java.util.List;

public class IOUtils {

    public static byte[] getBytes(String path) throws FileNotFoundException {
        InputStream is = new FileInputStream(path);
        StringBuilder res = new StringBuilder(); // ArrayList<String>

        int val = -1;
        try {
            while ((val = is.read()) != -1) {
                res.append(val);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return res.toString().getBytes();
    }

    public static byte[] getBytesWithBuff(String path) throws FileNotFoundException {
        InputStream is = new FileInputStream(path);

        byte[] buff = new byte[1000];

        ByteArrayOutputStream byteArrayOutputStream =
                new ByteArrayOutputStream();

        int count = -1;
        try {
            while ((count = is.read(buff)) != -1) {
                // todo find problem, see string result before returning
                byteArrayOutputStream.write(buff, 0, count);
            }
            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return byteArrayOutputStream.toByteArray();
    }


    public static void writeInto(byte[] in, String path) throws FileNotFoundException {
        OutputStream os = new FileOutputStream(path);
        try {
            os.write(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static String readFileContent(String path) throws FileNotFoundException {
        Reader reader = new FileReader(path);

        StringBuilder sb = new StringBuilder();
        char[] buff = new char[1000];

        int count = -1;

        try {
            while ((count = reader.read(buff)) != -1) {
                sb.append(buff, 0, count);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return sb.toString();
    }


    public static void writeIntoFile(List<String> content, String path) {


        Writer writer = null;
        try {
            writer = new FileWriter(path);
            for (String part : content) {
                writer.write(part);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void writeIntoFile2(List<String> content, String path) {


        // tru with resources since java 1,7
        try (Writer writer = new FileWriter(path)) {

            for (String part : content) {
                writer.write(part);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void save(Student student, String path) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(path, true))) {
            printWriter.printf("Student={id : %s, name : %s, age : %d}\n",
                    student.getIdNum(),
                    student.getName(),
                    student.getAge());
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void saveObj(Object any, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(any);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static <T> T loadObj(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Object ret = ois.readObject();
            return (T) ret;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        throw new SerializationException("can not load object");
    }

    public static void writeRobot(String location, Robot robot) {

        try(PrintWriter printWriter = new PrintWriter(new FileWriter(location))){
            String formatted = String.format("id:%d,model:%s,price:%.2f",
                    robot.getId(), robot.getModel(), robot.getPrice());
            printWriter.println(formatted);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Robot loadRobot(String location) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(location)));
        StringBuilder s = new StringBuilder();
        if (reader.readLine() == null) {
            s.append(reader.readLine());
        }
        String id = s.substring(0, s.indexOf(","));
        long a = Long.valueOf(id.substring(id.indexOf(":"), id.length() - 1));
        Robot r = new Robot(a, )
        return;
    }


        public static Robot readRobot(String location) throws FileNotFoundException {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(location));
            try {
                String robotStr = bufferedReader.readLine();

                if(robotStr != null){

                    Robot robot = new Robot();

                    String[] parts = robotStr.split(",");

                    for (String part : parts) {

                        String[] keyValue = part.split(":");
                        String key = keyValue[0];
                        String value = keyValue[1];

                        if("id".equals(key)){
                            long id = Long.parseLong(value);
                            robot.setId(id);
                        } else if("model".equals(key)){
                            robot.setModel(value);
                        } else if("price".equals(key)){
                            double price = Double.parseDouble(value);
                            robot.setPrice(price);
                        }

                    }

                    return robot;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
    }
}