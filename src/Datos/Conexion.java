package Datos;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class Conexion {
    
    private Connection con = null;
    
    private String db= "d64423chgeal8p";
    private String user = "dtogetyefmqfnu";
    private String password = "9fbb6c6272589313667daaf09632dec101a2b5b1788112447688531226d7a55d";
    private String url = "ec2-34-199-68-114.compute-1.amazonaws.com";
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://"+url+":5432/"+db,user,password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar db "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
}