package errore_eccezioni;

public class es_ottieni {

    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Access denied- devi avere minimo 18 anni");
        }else{
            System.out.println("Access granted- sei abbastanza grande");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}
