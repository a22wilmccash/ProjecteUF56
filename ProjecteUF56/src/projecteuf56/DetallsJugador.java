/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecteuf56;

/**
 *
 * @author Usuario
 */
public class DetallsJugador {
    private String posicio;
    private int gols;
    private int asistencies;

    public DetallsJugador(String posicio, int gols, int asistencies) {
        this.posicio = posicio;
        this.gols = gols;
        this.asistencies = asistencies;
    }

    public String getPosicio() {
        return posicio;
    }

    public int getGols() {
        return gols;
    }

    public int getAsistencies() {
        return asistencies;
    }
      
}
