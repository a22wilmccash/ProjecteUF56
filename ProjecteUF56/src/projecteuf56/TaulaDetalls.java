/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecteuf56;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Celia
 */
public class TaulaDetalls extends ORMTable {

    public static ArrayList<DetallsJugador> dj = new ArrayList<>();

    public static ArrayList<DetallsJugador> llistarDetalls(String nom) {
        dj.clear();
        try {
            Connection c = ConexioBBDD.conectarse();

            Statement consulta = c.createStatement();
            nom = "\"" + nom + "\"";
            ResultSet resultat = consulta.executeQuery("SELECT * FROM DetallsJugador Where nom=" + nom);
            //aqui es decideix la taula que es vol mostrar

            while (resultat.next()) {

                //recullim els valors en un objecte
                String posicio = resultat.getString("posicio");
                int gols = resultat.getInt("gols");
                int assistencies = resultat.getInt("assistencies");
                DetallsJugador e = new DetallsJugador(posicio, gols, assistencies);
                dj.add(e);
            }

            //Tancar resultat i consulta
            resultat.close();
            consulta.close();
            c.close();
        } catch (SQLException se) {
            String missatge = """
                              Excepcio: 
                              El getSQLState es: """ + se.getSQLState() + "\n" + "El getMessage es: " + se.getMessage();
            JOptionPane.showMessageDialog(null, missatge, "Confirmacio", JOptionPane.YES_NO_OPTION);
        }
        return dj;

    }

    public TaulaDetalls(String nomTabla) {
        super(nomTabla);
    }

    

    @Override
    public int Insert(ORMEntity o) throws NullConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<?> GetAll(String nom) throws NullConnectionException, SQLException {
        return llistarDetalls(nom);

    }

    @Override
    public ArrayList<?> GetAll() throws NullConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
