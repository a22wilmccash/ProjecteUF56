/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecteuf56;

import gui_pack.Confirmar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import static projecteuf56.ConexioBBDD.BD_NAME;
import static projecteuf56.ConexioBBDD.PORT;
import static projecteuf56.ConexioBBDD.PWD;
import static projecteuf56.ConexioBBDD.URL;
import static projecteuf56.ConexioBBDD.USER;

/**
 *
 * @author Celia
 */
public class PrimeraTaula  {
    public static ArrayList <Jugadors> numJug  = new ArrayList<>();
    static Scanner scan = new Scanner (System.in);
    

   public static ArrayList<Jugadors> getNumJug() {
        return numJug;
    }
   
   public static void InserirRegistre(String nom, int edat, boolean estaRetirat, String equip){
        try{
            ConexioBBDD.conectarse();
            //part que no es cambia
            Properties props = new Properties();
            props.setProperty("user", USER);
            props.setProperty("password", PWD);
            Connection c = DriverManager.getConnection("jdbc:mysql://"+URL+":"+PORT+"/"+BD_NAME, props);
            c.setAutoCommit(false);
            System.out.println("Connexió realitzada correctament.");
            System.out.println();

            
                nom="\""+nom+"\"";
                equip="\""+equip+"\"";
                String nouUsuari = "insert into Jugadors values ("+nom+","+edat  +","+estaRetirat+","+equip+")";
                Statement st = c.createStatement();
                st.executeUpdate(nouUsuari);
                //System.out.println("Inserció realitzada");
                
                //confirmar els cambis o rollback
                if (ComfirmarRegistre()) 
                {c.commit();}
                else
                {c.rollback();}
                
                //System.out.println("Operacio Acabada");
                
                st.close();
                c.close();
                
                
        } catch (SQLException se) {
            System.out.println("Excepcio: ");
            System.out.println();
            System.out.println("El getSQLState es: " + se.getSQLState());
            System.out.println();
            System.out.println("El getMessage es: " + se.getMessage());
        }
      
            
    } 

   public static void EliminarRegistre(String nom){
         try{
             
            //part que no es cambia
            Properties props = new Properties();
            props.setProperty("user", USER);
            props.setProperty("password", PWD);
            Connection c = DriverManager.getConnection("jdbc:mysql://"+URL+":"+PORT+"/"+BD_NAME, props);
            c.setAutoCommit(false);
            System.out.println("Connexió realitzada correctament.");
            System.out.println();
            
            //eliminem el registre accedint mitjançant el nom
            nom="\""+nom+"\"";
            String eliminar ="Delete From Jugadors Where nom ="+nom;
            Statement st = c.createStatement();
            st.executeUpdate(eliminar);
            
             if (ComfirmarRegistre()) 
                {c.commit();}
             else
                {c.rollback();}
                
                
                st.close();
                c.close();
                
                
            } catch (SQLException se) {
            System.out.println("Excepcio: ");
            System.out.println();
            System.out.println("El getSQLState es: " + se.getSQLState());
            System.out.println();
            System.out.println("El getMessage es: " + se.getMessage());
        }
    }

   public static void llistarRegistres(){
        try{
            ConexioBBDD.conectarse();
            //part que no es cambia
            Properties props = new Properties();
            props.setProperty("user", USER);
            props.setProperty("password", PWD);
            Connection c = DriverManager.getConnection("jdbc:mysql://"+URL+":"+PORT+"/"+BD_NAME, props);
            c.setAutoCommit(false);
        
        Statement consulta = c.createStatement();
        ResultSet resultat = consulta.executeQuery("Select * From Jugadors");
        //aqui es decideix la taula que es vol mostrar
            
            while (resultat.next())
            {
                //bucle que mostra registres
                
                String nom= resultat.getString("nom");
                int edat= resultat.getInt("edat");
                boolean estaRetirat= resultat.getBoolean("estaRetirat");
                String equip= resultat.getString("equip");
                Jugadors j= new Jugadors (nom, edat, estaRetirat, equip);
                numJug.add(j);
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

   private static boolean ComfirmarRegistre(){
     Confirmar comprobant = new Confirmar();
     comprobant.setVisible(true);
     boolean resultat=Confirmar.isDecisio();
     comprobant.setVisible(false);
     return resultat;
    }

   public static void EditarRegistre(String nom, int edat, boolean estaRetirat, String equip){
         try{
            ConexioBBDD.conectarse();
            //part que no es cambia
            Properties props = new Properties();
            props.setProperty("user", USER);
            props.setProperty("password", PWD);
            Connection c = DriverManager.getConnection("jdbc:mysql://"+URL+":"+PORT+"/"+BD_NAME, props);
            c.setAutoCommit(false);
            System.out.println("Connexió realitzada correctament.");
            System.out.println();

            //aquesta part s'ha de cambiar al pensar la taula depenent dels valors
                nom="\""+nom+"\"";
                equip="\""+equip+"\"";
                String editarUsuari = "Update Jugadors Set edat="+edat+", estaJubilat="+estaRetirat+", equip="+equip+" Where nom="+nom;
                Statement st = c.createStatement();
                st.executeUpdate(editarUsuari);
               // System.out.println("Inserció realitzada");
               // System.out.println("Segur que vols validar els canvis realitzats?");   
                
                //confirmar els cambis o rollback
                if (ComfirmarRegistre()) 
                {c.commit();}
                else
                {c.rollback();}
                
                
                st.close();
                c.close();
                
                
        } catch (SQLException se) {
            System.out.println("Excepcio: ");
            System.out.println();
            System.out.println("El getSQLState es: " + se.getSQLState());
            System.out.println();
            System.out.println("El getMessage es: " + se.getMessage());
        }
      
            
    }


}
