package Esempi.esempiClassi;

public class terzo {
    int modelYear;
    String modelName;
    public terzo(int year, String name){
        modelYear=year;
        modelName=name;
    }
    public static void main(String[] args) {
        terzo myCar=new terzo(1969, "Mustang");
        System.out.println(myCar.modelYear+" "+myCar.modelName);
    }
}
