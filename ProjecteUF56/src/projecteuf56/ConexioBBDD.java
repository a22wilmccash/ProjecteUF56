/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecteuf56;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Celia
 */
public class ConexioBBDD {
    static final String USER = "";
    static final String PWD = "";
    static final String URL = "labs.inspedralbes.cat";
    static final String PORT = "3306";
    static final String BD_NAME = "";
    
    
    public static void conectarse(){
        try{
            Class.forName("com.as_DEMmysql.cj.jdbc.Driver");
            System.out.println("Driver de mySQL carregat correctament.");

            // connectar a la base de dades
            // cal modificar el username, password i el nom de la base de dades
            Properties props = new Properties();
            props.setProperty("user", USER);
            props.setProperty("password", PWD);
            Connection c = DriverManager.getConnection("jdbc:mysql://"+URL+":"+PORT+"/"+BD_NAME, props);
            c.setAutoCommit(false);
        }
       catch (SQLException se) {
            System.out.println("Excepcio: ");
            System.out.println();
            System.out.println("El getSQLState es: " + se.getSQLState());
            System.out.println();
            System.out.println("El getMessage es: " + se.getMessage());
        }
        catch (ClassNotFoundException ce) {
            System.out.println("Error al carregar el driver");
        }
            
        }
    
    
    }

