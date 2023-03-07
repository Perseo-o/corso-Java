
public class es_override {

    class Parent{
        void show()
        {System.out.println("Paren's show()");}
    }

    class Child extends Parent{
        @Override
        void show(){
            super.show();
        System.out.println("Child's show()");
        }
    }

    
        public static void main(String[] args) {
            //es_override.Parent obj=new es_override.Parent();
            //obj.show();
        }
    
}