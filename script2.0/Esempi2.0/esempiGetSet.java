public class esempiGetSet {

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String newName) {
        this.name=newName;
    }
    public static void main(String[] args) {
        esempiGetSet nome=new esempiGetSet();
        nome.setName("qualcosa");
        System.out.print("quello che ho inserito è:"+nome.getName());

    }
}
