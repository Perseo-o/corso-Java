package Esempi.esempiClassi;

public class secondo {
    String x ="ciao";
    int y=55;
    boolean z=false;
    public static void main(String[] args) {
        /*secondo myObj1=new secondo();//Object 1
        secondo myObj2=new secondo();//Object 2
        myObj2.y=25;
        System.out.println(myObj1.y);//Output 55
        System.out.println(myObj2.y);//Output 25*/
        /*secondo myObj1=new secondo();//Object 1
        secondo myObj2=new secondo();//Object 2
        myObj2.x="gargamella";
        System.out.println(myObj1.x);//Output 55
        System.out.println(myObj2.x);//Output 25*/
        secondo myObj1=new secondo();//Object 1
        secondo myObj2=new secondo();//Object 2
        myObj1.y=25;
        if(myObj1.y>24){
            myObj2.z=true;
        }else{
            myObj2.z=false;
        }
    }
}
