/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecteuf56;

import gui_pack.PlayerFrame;
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
public class TaulaJugadors extends ORMTable {

    public static ArrayList<Jugadors> numJug = new ArrayList<>();

    public static ArrayList<Jugadors> getNumJug() {
        return numJug;
    }

    public static void InserirRegistre(String nom, int edat, boolean estaRetirat, String equip) {
        try {
            Connection c = ConexioBBDD.conectarse();

            nom = "\"" + nom + "\"";
            equip = "\"" + equip + "\"";
            String nouUsuari = "insert into Jugadors values (" + nom + "," + edat + "," + estaRetirat + "," + equip + ")";
            Statement st = c.createStatement();
            st.executeUpdate(nouUsuari);
            //System.out.println("Inserció realitzada");

            //confirmar els cambis o rollback
            if (ComfirmarRegistre()) {
                c.commit();
            } else {
                c.rollback();
            }

            //System.out.println("Operacio Acabada");
            st.close();
            c.close();

        } catch (SQLException se) {
            String missatge = """
                              Excepcio: 
                              El getSQLState es: """ + se.getSQLState() + "\n" + "El getMessage es: " + se.getMessage();
            JOptionPane.showMessageDialog(null, missatge, "Error", JOptionPane.WARNING_MESSAGE);

        }

    }

    public static void EliminarRegistre(String nom) {
        try {

            //part que no es cambia
            Connection c = ConexioBBDD.conectarse();

            //eliminem el registre accedint mitjançant el nom
            nom = "\"" + nom + "\"";
            String eliminar = "Delete From Jugadors Where nom =" + nom;
            Statement st = c.createStatement();
            st.executeUpdate(eliminar);

            if (ComfirmarRegistre()) {
                c.commit();
            } else {
                c.rollback();
            }

            st.close();
            c.close();

        } catch (SQLException se) {
            String missatge = """
                              Excepcio: 
                              El getSQLState es: """ + se.getSQLState() + "\n" + "El getMessage es: " + se.getMessage();
            JOptionPane.showMessageDialog(null, missatge, "Error", JOptionPane.WARNING_MESSAGE);

        }
    }

    public static void llistarRegistres() {
        try {
            Connection c = ConexioBBDD.conectarse();
            Statement consulta = c.createStatement();
            ResultSet resultat = consulta.executeQuery("Select * From Jugadors");
            //aqui es decideix la taula que es vol mostrar

            while (resultat.next()) {
                //bucle que mostra registres

                String nom = resultat.getString("nom");
                int edat = resultat.getInt("edat");
                boolean estaRetirat = resultat.getBoolean("estaRetirat");
                String equip = resultat.getString("equip");
                Jugadors j = new Jugadors(nom, edat, estaRetirat, equip);
                numJug.add(j);
            }

            //Tancar resultat i consulta
            resultat.close();
            consulta.close();
            c.close();
        } catch (SQLException se) {
            String missatge = """
                              Excepcio: 
                              El getSQLState es: """ + se.getSQLState() + "\n" + "El getMessage es: " + se.getMessage();
            JOptionPane.showMessageDialog(null, missatge, "Error", JOptionPane.WARNING_MESSAGE);

        }

    }

    private static boolean ComfirmarRegistre() {
        String missatge = "Segur que vols confirmar els cambis?";
        boolean resultat = false;
        int opcio;
        opcio = JOptionPane.showConfirmDialog(null, missatge, "Confirmacio", JOptionPane.YES_NO_OPTION);
        if (opcio == 0) {
            resultat = true;
        }
        
        return resultat;
    }

    public static void EditarRegistre(String nom, int edat, boolean estaRetirat, String equip) {
        try {
            ConexioBBDD.conectarse();
            //part que no es cambia
            Connection c = ConexioBBDD.conectarse();
            //aquesta part s'ha de cambiar al pensar la taula depenent dels valors
            nom = "\"" + nom + "\"";
            equip = "\"" + equip + "\"";
            String editarUsuari = "Update Jugadors Set edat=" + edat + ", estaRetirat=" + estaRetirat + ", equip=" + equip + " Where nom=" + nom;
            Statement st = c.createStatement();
            st.executeUpdate(editarUsuari);

            //confirmar els cambis o rollback
            if (ComfirmarRegistre()) {
                c.commit();
            } else {
                c.rollback();
            }

            st.close();
            c.close();

        } catch (SQLException se) {
            String missatge = """
                              Excepcio: 
                              El getSQLState es: """ + se.getSQLState() + "\n" + "El getMessage es: " + se.getMessage();
            JOptionPane.showMessageDialog(null, missatge, "Error", JOptionPane.WARNING_MESSAGE);

        }

    }

    public TaulaJugadors(String nomTabla) {
        super(nomTabla);
    }

    @Override
    public ArrayList<?> GetAll() throws NullConnectionException, SQLException {
        return getNumJug();

    }

    @Override
    public int Insert(ORMEntity o) throws NullConnectionException, SQLException {
        Jugadors j = (Jugadors) o;
        InserirRegistre(j.getNom(), j.getEdat(), j.isEstaRetirat(), j.getEquip());
        return 0;
    }

    @Override
    public ArrayList<?> GetAll(String nom) throws NullConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
