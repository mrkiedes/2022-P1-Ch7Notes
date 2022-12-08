import java.util.Scanner;


public class Calculator {

    public static int addNums(){
        Scanner input = new Scanner(System.in);
        System.out.println("We are going to add two numbers.  Please enter them below");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        return num1 + num2;

    }
}
