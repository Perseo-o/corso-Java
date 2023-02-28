package cicli;

public class quarto_cicli {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++)
        {
        if(i % 2 != 0){
            System.out.println(i);
            i=i+1;
        }
        if(i == 8)
            break;
        }
    }
}
