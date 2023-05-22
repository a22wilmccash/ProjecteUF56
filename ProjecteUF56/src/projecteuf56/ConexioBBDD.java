/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecteuf56;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Celia
 */
public class ConexioBBDD {
    static final String USER = "a22celgariba_root";
    static final String PWD = "R00Troot";
    static final String URL = "labs.inspedralbes.cat";
    static final String PORT = "3306";
    static final String BD_NAME = "a22celgariba_projecteUF56";
    
    public static Connection conectarse() throws SQLException{
         Connection c = null;
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            Properties props = new Properties();
            props.setProperty("user", USER);
            props.setProperty("password", PWD);
            c= DriverManager.getConnection("jdbc:mysql://"+URL+":"+PORT+"/"+BD_NAME, props);
            c.setAutoCommit(false);

        }
        catch (ClassNotFoundException ce) {
            JOptionPane.showConfirmDialog(null, ce.getException(), "Error", JOptionPane.WARNING_MESSAGE);
        }
        return c;
    }

    
   
    
    }

