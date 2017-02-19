/**
 * Created by slava on 19.02.17.
 * This class contains the implementation of Addition (+), Substraction (-), Multiplication (*) and Division (/)
 */
public class Operations {
    public static int XY_Addition(int x, int y) {
        int c = x + y;
        System.out.println(x + "+" + y + "=" + c);
        return c;
    }

    public static int XY_Substraction(int x, int y){
        int c = x - y;
        System.out.println(x + "-" + y + "=" + c);
        return c;
    }

    public static int XY_Multiplication(int x, int y){
        int c = x * y;
        System.out.println(x + "*" + y + "=" + c);
        return c;
    }

    public static int XY_Division(int x, int y){
        int c = x / y;
        System.out.println(x + "/" + y + "=" + c);
        return c;
    }
}
