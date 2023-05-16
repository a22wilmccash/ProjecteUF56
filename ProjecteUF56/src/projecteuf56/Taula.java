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
public abstract class Taula {
   public static Scanner scan= new Scanner(System.in);
   private String taula;
    protected void InserirRegistre(){
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
           
                String nouUsuari = "insert into "+taula+" values ()";
                Statement st = c.createStatement();
                st.executeUpdate(nouUsuari);
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
   
    protected void EliminarRegistre(int id){
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
            String eliminar ="Delete From "+taula+ " Where id ="+id;
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
    
    protected void EditarRegistre( int id){
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
           
                String nouUsuari = "Update "+taula+" Set ";
                Statement st = c.createStatement();
                st.executeUpdate(nouUsuari);
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
   
    protected void llistarRegistres(){
        try{
            //part que no es cambia
            Properties props = new Properties();
            props.setProperty("user", USER);
            props.setProperty("password", PWD);
            Connection c = DriverManager.getConnection("jdbc:mysql://"+URL+":"+PORT+"/"+BD_NAME, props);
            c.setAutoCommit(false);
        
        Statement consulta = c.createStatement();
        ResultSet resultat = consulta.executeQuery(taula);
        //aqui es decideix la taula que es vol mostrar
            
            while (resultat.next())
            {
                //bucle que mostra registres
                System.out.println("----");
                System.out.println("ID: " + resultat.getInt("ID"));
                System.out.println("Nom: " + resultat.getString("Nom"));
                System.out.println("Cognoms: " + resultat.getString("Cognoms"));
                System.out.println("Edat: " + resultat.getInt("Edat"));
                System.out.println("----");
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
   
    protected boolean ComfirmarRegistre(){
     boolean resultat=false;
     //simple selector de booleans, feia pal implementar a cada accio de manera individual
        System.out.println("Estas segur de que vols realitzar aquesta operació?");
        if (scan.next().equals("Si"))
            resultat=true;
        
     return resultat;
    }
}
