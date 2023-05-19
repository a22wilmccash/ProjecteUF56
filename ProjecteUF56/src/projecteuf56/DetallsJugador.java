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
    private int assistencies;

    public DetallsJugador(String posicio, int gols, int assistencies) {
        this.posicio = posicio;
        this.gols = gols;
        this.assistencies = assistencies;
    }

    public String getPosicio() {
        return posicio;
    }

    public int getGols() {
        return gols;
    }

    public int getAssistencies() {
        return assistencies;
    }
      
}
