/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choquedeplanetas;

/**
 *
 * @author jcoq2
 */
import java.io.Serializable;

public class Planeta implements Serializable {

    private int x;
    private int y;
    private String nombrePlaneta;
    private int tamanio;
    private int peso;

    
    public Planeta(String nombre, int tamanio, int peso, int x, int y) {
        this.x = x;
        this.y = y;
        this.nombrePlaneta = nombre;
        this.tamanio = tamanio;
        this.peso = peso;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

   

    @Override
    public String toString() {
        return nombrePlaneta;
    }

}
