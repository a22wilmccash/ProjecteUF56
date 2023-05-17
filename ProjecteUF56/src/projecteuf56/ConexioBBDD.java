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
    static final String USER = "a22celgariba_root";
    static final String PWD = "R00Troot";
    static final String URL = "labs.inspedralbes.cat";
    static final String PORT = "3306";
    static final String BD_NAME = "a22celgariba_projecteUF56";
    
    
    public static void conectarse(){
        try{
            Class.forName("com.as_DEMmysql.cj.jdbc.Driver");
            System.out.println("Driver de mySQL carregat correctament.");

        }
        catch (ClassNotFoundException ce) {
            System.out.println("Error al carregar el driver");
        }
            
        }
    
    
    }

