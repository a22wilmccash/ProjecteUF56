/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecteuf56;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import static projecteuf56.ConexioBBDD.BD_NAME;
import static projecteuf56.ConexioBBDD.PORT;
import static projecteuf56.ConexioBBDD.PWD;
import static projecteuf56.ConexioBBDD.URL;
import static projecteuf56.ConexioBBDD.USER;

/**
 *
 * @author Celia
 */
public class SegonaTaula  {
    
    private  ArrayList <Equip> equips  = new ArrayList<>();

    public void llistarEquips(){
        try{
            
            //part que no es cambia
            Properties props = new Properties();
            props.setProperty("user", USER);
            props.setProperty("password", PWD);
            Connection c = DriverManager.getConnection("jdbc:mysql://"+URL+":"+PORT+"/"+BD_NAME, props);
            c.setAutoCommit(false);
        
        Statement consulta = c.createStatement();
        ResultSet resultat = consulta.executeQuery("Jugadors");
        //aqui es decideix la taula que es vol mostrar
            
            while (resultat.next())
            {
                //bucle que mostra registres
                
                String nom= resultat.getString("Nom");
                int numeroJugadors= resultat.getInt("NumJug");
                Equip e= new Equip (nom, numeroJugadors);
                equips.add(e);
            }
            
            //Tancar resultat i consulta
            resultat.close();
            consulta.close();
            c.close();
        }
        
        
        catch (SQLException se) {
            System.out.println("Excepcio: ");
            System.out.println();
            System.out.println("El getSQLState es: " + se.getSQLState());
            System.out.println();
            System.out.println("El getMessage es: " + se.getMessage());
        }


    }

}
