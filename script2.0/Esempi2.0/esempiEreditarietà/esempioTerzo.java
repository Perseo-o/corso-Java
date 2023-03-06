public class esempioTerzo {
    class Veicolo{
    void run(){System.out.println("Il veicolo è in marcia");}
    }

    class Bike extends Veicolo{
        public static void main(String[] args) {
            Bike obj=new Bike();
            obj.run();
        }
    }

    class Bike2 extends Veicolo{
        void run(){System.out.println("La bici sta correndo in sicurezza");}
        public static void main(String[] args) {
            Bike2 obj=new Bike2();
            obj.run();
        }
    }
}
