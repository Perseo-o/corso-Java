package errore_eccezioni;

public class primoErrore {
    public static void main(String[] args) {
        try{
            int[] myNumbers={1,2,3,4};
            System.out.println(myNumbers[12]);
        }catch(Exception e){
            System.out.println("Qualcosa è andato storto.");
        }finally {
            System.out.println("il try catch è finito.");
        }
    }
}
