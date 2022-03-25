/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choquedeplanetas;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author jcoq2
 */
public class HiloColision extends Thread {

    Random randomizer = new Random();

    private Cientifico cientifico;
    private boolean yaExiste;
    private JProgressBar barraPlaneta;
    private Planeta planeta1;
    private Planeta planeta2;

    public HiloColision(JProgressBar barraPlaneta, Planeta planeta1, Planeta planeta2, Cientifico cientifico) {
        this.cientifico = cientifico;
        yaExiste = true;
        this.barraPlaneta = barraPlaneta;
        this.planeta1 = planeta1;
        this.planeta2 = planeta2;
    }

    @Override
    public void run() {
        while (yaExiste) {
            barraPlaneta.setValue(barraPlaneta.getValue() + 1);
            if (barraPlaneta.getValue() == barraPlaneta.getMaximum()) {
                yaExiste = false;
                JOptionPane.showMessageDialog(null, "Finalizo");
                barraPlaneta.setValue(0);

                int tamanio = (planeta1.getTamanio() + planeta2.getTamanio()) / 2;
                int randomColision = randomizer.nextInt(100) + 0;
                int x = (planeta1.getX() + planeta2.getX()) / 2;
                int y = (planeta1.getY() + planeta2.getY()) / 2;
                int peso = (planeta1.getPeso() + planeta2.getPeso()) / 2;

                if (planeta2 instanceof PlanetaGaseoso) {
                    if (randomColision <= 20) {
                        JOptionPane.showMessageDialog(null, "Se creo un Planeta");
                        String nombre = JOptionPane.showInputDialog("Ingrese Nombre del Planeta");
                        PlanetaGaseoso gaseoso = new PlanetaGaseoso(nombre, peso, tamanio, x, y);
                        cientifico.getPlanetas().add(gaseoso);
                    }
                } else if (planeta1 instanceof PlanetaTerrestre) {
                    if (randomColision <= 25) {
                        JOptionPane.showMessageDialog(null, "Se creo un Planeta");
                        String nombre = JOptionPane.showInputDialog("Ingrese Nombre del Planeta");
                        PlanetaTerrestre terrestre = new PlanetaTerrestre(nombre, peso, tamanio, x, y);
                        cientifico.getPlanetas().add(terrestre);
                    }
                }

            }

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
            }
        }
    }

}
