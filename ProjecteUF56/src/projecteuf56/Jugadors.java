/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecteuf56;

/**
 *
 * @author Usuario
 */
public class Jugadors extends ORMEntity{
    private String nom;
    private int edat;
    private boolean estaRetirat;
    private String equip;

    public Jugadors(String nom, int edat, boolean estaRetirat, String equip) {
        this.nom = nom;
        this.edat = edat;
        this.estaRetirat = estaRetirat;
        this.equip = equip;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public boolean isEstaRetirat() {
        return estaRetirat;
    }

    public String getEquip() {
        return equip;
    }



}
