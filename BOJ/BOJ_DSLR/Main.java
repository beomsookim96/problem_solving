import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int input = sc.nextInt();
            int output = sc.nextInt();

            String convertedInput = fillWithZero(Integer.toString(input), 4);
            String convertedOutput = fillWithZero(Integer.toString(output), 4);

            System.out.println(convertedInput);
            System.out.println(convertedOutput);
        }
    }

    static String fillWithZero(String originStr, int digit){
        String nString = "";
        for (int i = 0; i < digit-originStr.length(); i++) {
            nString += "0";
        }
        return nString+originStr;
    }
    static String calc(String type, String input){

        String resultString = "";

        if(type.equals("D")){
            int n = Integer.parseInt(input)*2;
            if(n > 9999){
                n = n%10000;
            }
            resultString = fillWithZero(Integer.toString(n), 4);
        }else if(type.equals("S")){
            int n = Integer.parseInt(input)-1;
            if(n < 0){
                n = 9999;
            }
            resultString = fillWithZero(Integer.toString(n), 4);
        }else if(type.equals("L")){
            resultString = input.substring(1,3) + input.substring(0,1);
        }else if(type.equals("R")){
            resultString = input.substring(2,3) + input.substring(0,2);
        }

        return resultString;
    }
}
