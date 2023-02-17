import java.util.Scanner;

public class pariDispari {

    public static void main(String[] args) {
    
        Scanner myNum1 = new Scanner(System.in);
        double num1;

        System.out.println("Inserire il primo numero: ");
        num1= myNum1.nextDouble();

        Scanner myNum2 = new Scanner(System.in);
        double num2;

        System.out.println("Inerire il secondo numero: ");
        num2= myNum2.nextDouble();

        System.out.println(num1+" modulo "+num2+" è: "+ (num1%num2));
        myNum1.close();
        myNum2.close();
    }
    }
    