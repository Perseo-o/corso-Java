package cicli;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
public class dieci_metodi{
    /*static void myMethod(String fname){
        System.out.println(fname+"Refsnes");
    }
    public static void main(String[] args) {
       myMethod(" ");
       myMethod(" ");
       myMethod(" ");
    }*/
    static int myMethod(int x){
        return 5+x;
    }
    static double myMethod2(Double y){
        return 0.8+y;
    }
    static String myMethod3(String z){
        return "marcello"+z;
    }
    public static void main(String[] args) {
        System.out.println(myMethod(3));
        System.out.println(myMethod2(3.5));
        System.out.println(myMethod3(" "));
    }
}

