/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf56;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author santi
 */
public class BDConnection {
    private Connection c;
    public BDConnection(String URL, String port, String BDName, String user, String pwd) throws ClassNotFoundException, SQLException
    {
            // carregar el driver al controlador
            Class.forName("com.mysql.cj.jdbc.Driver");

            // connectar a la base de dades
            // cal modificar el username, password i el nom de la base de dades
            Properties props = new Properties();
            props.setProperty("user", user);
            props.setProperty("password", pwd);
            c = DriverManager.getConnection("jdbc:mysql://"+URL+":"+port+"/"+BDName, props);
            c.setAutoCommit(false);
    }
    
    public Connection getConnection()
    {
        return c;
    }
    
    public void closeConnection() throws SQLException
    {
        c.close();
    }
    
    public void confirmarCanvis() throws SQLException
    {
        c.commit();
    }
    
    public void desferCanvis() throws SQLException
    {
        c.rollback();
    }
    
}
