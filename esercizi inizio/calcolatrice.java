import java.util.Scanner;

public class calcolatrice {
    public static void main(String[] args) {
        
        Scanner myNum1 = new Scanner(System.in);
        double num1;
        //inserisce il primo numero
        System.out.println("dammi il primo numero: ");
        num1= myNum1.nextDouble();

        Scanner myNum2 = new Scanner(System.in);
        double num2;
        //inserisce il secondo numero
        System.out.println("dammi il secondo numero: ");
        num2= myNum2.nextDouble();

        Scanner operazione = new Scanner(System.in);
        String oper;
        //inserisce il secondo numero
        System.out.println("Scrivi l'operazione da fare tra somma, sottrazione, modulo: ");
        oper= operazione.nextLine();

        
        if(oper.equals("somma")){
            System.out.println("La somma è: "+ (num1+num2));
        }else if(oper.equals("sottrazione")){
            System.out.println("La sottrazione è: "+ (num1-num2));
        }else if(oper.equals("modulo")){
            System.out.println("Il modulo è: "+ (num1%num2));
        }else if(oper.equals("radice")){
            System.out.println("Il modulo è: "+ (Math.sqrt(num1+num2)));
        }

        int day=4;
        switch (day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wedsney");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;}

    myNum1.close();
    myNum2.close();
    operazione.close();
}}