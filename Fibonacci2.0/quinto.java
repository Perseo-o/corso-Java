import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class quinto {
    String myUrl;
    String myUser;
    String myPassword;

    /*public ConnectionFibonacci(String url, String user, StringPassword){
        myUrl=url;
        myUser=user;
        myPassword=password;
    }*/

    public Connection CreaConnesione(){
        
        try {
        Connection conn = null;

        
            conn = DriverManager.getConnection(myUrl, myUser, myPassword);
            if (conn != null) {
                System.out.println("Connesso");
            } else {
                System.out.println("Connessione fallita");
            }
        }
    }
}
