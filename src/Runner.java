import java.util.Scanner;

/**
 * Created by slava on 13.02.17.
 */

public class Runner {
    public static void main(String[] args){

        /*
        //read string entered by user
        Scanner scan_string = new Scanner (System.in);
        System.out.println("please enter one string: ");
        String user_input_string = scan_string.nextLine();
        System.out.println("the entered string is: " + user_input_string);
        //System.out.print(user_input_string);*/

        //read two numbers entered by user
        Scanner scan_number_x = new Scanner (System.in);
        System.out.println("please enter one number X: ");
        int user_input_number_X = scan_number_x.nextInt();
        Scanner scan_number_y = new Scanner (System.in);
        System.out.println("please enter one number Y: ");
        int user_input_number_Y = scan_number_y.nextInt();
        System.out.println("the entered number is: " + user_input_number_X + " and " + user_input_number_Y);

        int result = Runner.XY_Addition(user_input_number_X,user_input_number_Y);
        /*if (user_input_number_X == 15){
            System.out.println("Bingo!!");
        }
        else{
            System.out.println("Buuuu");
        }*/
        System.out.println("Result is: " + result);
    }

    public static int XY_Addition(int x, int y){
        int c = x + y;
        System.out.println(x + "+" + y + "=" + c);
        return c;
    }
}