package java_basic.homework.StringProb;

    import java.util.Scanner;

    public class Prob2 {

        public static void main(String[] args) {
            String inputStr;

            Scanner keyboard = new Scanner(System.in);

            System.out.print("문자열을 입력하세요. : ");
            inputStr = keyboard.nextLine();

            String upperStr = inputStr.toUpperCase();

            String reversedStr = new StringBuilder(upperStr).reverse().toString();

            System.out.println(reversedStr);

            keyboard.close();


        }
    }
