package aco11_1.week6.exeptions;

public class Intro {

    public static void main(String[] args) {
        System.out.println("Start");
        try {
            String res = MyService.login("admin2", "123");
            System.out.println(res);

        } catch (InvalidCredentialException e){
            System.err.println(e.getMessage());
            //MyService.login("admin", "1234");
            // do another action
        } catch (ServiceDosentWorkException e){
            e.printStackTrace();
        } catch (Exception ex){

        }
        //???
        System.out.println("end");
    }
}