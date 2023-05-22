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
import javax.swing.JOptionPane;
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
     public static ArrayList <DetallsJugador> dj  = new ArrayList<>();
    public static ArrayList<DetallsJugador> llistarDetalls(String nom){
       
        try{
            
            //part que no es cambia
            Properties props = new Properties();
            props.setProperty("user", USER);
            props.setProperty("password", PWD);
            Connection c = DriverManager.getConnection("jdbc:mysql://"+URL+":"+PORT+"/"+BD_NAME, props);
            c.setAutoCommit(false);
        
            Statement consulta = c.createStatement();
            nom = "\"" + nom + "\"";
            ResultSet resultat = consulta.executeQuery("SELECT * FROM DetallsJugador Where nom="+nom);
            //aqui es decideix la taula que es vol mostrar
            
            while (resultat.next()) {

                //recullim els valors en un objecte
                String posicio= resultat.getString("posicio");
                int gols= resultat.getInt("gols");
                int assistencies= resultat.getInt("assistencies");
                 DetallsJugador e  = new DetallsJugador (posicio, gols,assistencies );
                 dj.add(e);
            }
            
            //Tancar resultat i consulta
            resultat.close();
            consulta.close();
            c.close();
        }
        
        
        catch (SQLException se) {
            String missatge = """
                              Excepcio: 
                              El getSQLState es: """ + se.getSQLState() + "\n" + "El getMessage es: " + se.getMessage();
            JOptionPane.showMessageDialog(null, missatge, "Confirmacio", JOptionPane.YES_NO_OPTION);
        }
        return dj;

       
    }

    
    

}
