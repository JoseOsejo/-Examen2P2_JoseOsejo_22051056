/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choquedeplanetas;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jcoq2
 */
public class Cientifico implements Serializable {

    private String nombreCientifico;
    private ArrayList<Planeta> listaPlanetas = new ArrayList();

    public Cientifico() {
    }

    public Cientifico(String nombre) {
        this.nombreCientifico = nombre;
    }

    public String getNombre() {
        return nombreCientifico;
    }

    public void setNombre(String nombre) {
        this.nombreCientifico = nombre;
    }

    public ArrayList<Planeta> getPlanetas() {
        return listaPlanetas;
    }

    public void setPlanetas(ArrayList<Planeta> planetas) {
        this.listaPlanetas = planetas;
    }

    @Override
    public String toString() {
        return nombreCientifico;
    }

}
