package SeaBattle;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        String testResult = "Wrong";

        if(result.equals("Shout")) {
            testResult = "Ok";
        }
        System.out.println(testResult);
    }
}
