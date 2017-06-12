package ventana;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

public class conectate_cliente {
    Connection conect=null;
    public Connection coneccion(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/Diseño","root","");//OJO CAMBIAR ESTO X LA DIRECCION REAL
            JOptionPane.showMessageDialog(null, "conectado");
        } catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"ERROR" +e);
            return conect;
        }
        return null;
    }
}
