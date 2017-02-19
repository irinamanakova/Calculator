import java.util.Scanner;

/**
 * Created by slava on 13.02.17.
 */

public class Runner {
    public static void main(String[] args){

        //read two numbers and operation entered by user
        Scanner scan_number_x = new Scanner (System.in);
        System.out.println("please enter one number X: ");
        int user_input_number_X = scan_number_x.nextInt();
        Scanner scan_number_y = new Scanner (System.in);
        System.out.println("please enter one number Y: ");
        int user_input_number_Y = scan_number_y.nextInt();
        Scanner scan_operation = new Scanner (System.in);
        System.out.println("please select an operation +, - , * or / : ");
        String user_input_operation = scan_operation.nextLine();


        if (user_input_operation.equals("+")){
            System.out.println("the formula is : " + user_input_number_X + user_input_operation + user_input_number_Y);
            int result = Operations.XY_Addition(user_input_number_X,user_input_number_Y);
            System.out.println("Result is: " + result);
        }
        else if (user_input_operation.equals("-")) {
            System.out.println("the formula is : " + user_input_number_X + user_input_operation + user_input_number_Y);
            int result = Operations.XY_Substraction(user_input_number_X, user_input_number_Y);
            System.out.println("Result is: " + result);
        }
        else if (user_input_operation.equals("*")) {
            System.out.println("the formula is : " + user_input_number_X + user_input_operation + user_input_number_Y);
            int result = Operations.XY_Multiplication(user_input_number_X, user_input_number_Y);
            System.out.println("Result is: " + result);
        }
        else if (user_input_operation.equals("/")) {
            System.out.println("the formula is : " + user_input_number_X + user_input_operation + user_input_number_Y);
            int result = Operations.XY_Division(user_input_number_X, user_input_number_Y);
            System.out.println("Result is: " + result);
        }
        else{
            System.out.println("Unknown operation. Please use only +, -, * and /");
        }
    }
}