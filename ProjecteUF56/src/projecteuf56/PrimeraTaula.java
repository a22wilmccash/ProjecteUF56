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
    private static  ArrayList <Jugador> numJug  = new ArrayList<>();
    static Scanner scan = new Scanner (System.in);
    

   public ArrayList<Jugador> getNumJug() {
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
                System.out.println("Inserció realitzada");
                System.out.println("Segur que vols validar els canvis realitzats?");   
                
                //confirmar els cambis o rollback
                if (ComfirmarRegistre()) 
                {c.commit();}
                else
                {c.rollback();}
                
                System.out.println("Operacio Acabada");
                
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
            
            //eliminem el registre accedint mitjançant el id
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
            
            //part que no es cambia
            Properties props = new Properties();
            props.setProperty("user", USER);
            props.setProperty("password", PWD);
            Connection c = DriverManager.getConnection("jdbc:mysql://"+URL+":"+PORT+"/"+BD_NAME, props);
            c.setAutoCommit(false);
        
        Statement consulta = c.createStatement();
        ResultSet resultat = consulta.executeQuery("Select * From Jugador");
        //aqui es decideix la taula que es vol mostrar
            
            while (resultat.next())
            {
                //bucle que mostra registres
                
                String nom= resultat.getString("Nom");
                int edat= resultat.getInt("Edat");
                boolean estaJubilat= resultat.getBoolean("EstaJubilat");
                String equip= resultat.getString("Equip");
                Jugador j= new Jugador (nom, edat, estaJubilat, equip);
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
     boolean resultat=false;
     //simple selector de booleans, feia pal implementar a cada accio de manera individual
        System.out.println("Estas segur de que vols realitzar aquesta operació?");
        if (scan.next().equals("Si"))
            resultat=true;
        
     return resultat;
    }

   public static void EditarRegistre(String nom, int edat, boolean estaRetirat, String equip){
         try{
            //part que no es cambia
            Properties props = new Properties();
            props.setProperty("user", USER);
            props.setProperty("password", PWD);
            Connection c = DriverManager.getConnection("jdbc:mysql://"+URL+":"+PORT+"/"+BD_NAME, props);
            c.setAutoCommit(false);
            System.out.println("Connexió realitzada correctament.");
            System.out.println();

            //aquesta part s'ha de cambiar al pensar la taula depenent dels valors
           
                String editarUsuari = "Update Jugadors Set nom="+nom+", edat="+edat+", estaJubilat="+estaRetirat+", equip="+equip+" Where nom="+nom;
                Statement st = c.createStatement();
                st.executeUpdate(editarUsuari);
                System.out.println("Inserció realitzada");
                System.out.println("Segur que vols validar els canvis realitzats?");   
                
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
