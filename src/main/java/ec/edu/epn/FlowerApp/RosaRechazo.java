package ec.edu.epn.FlowerApp;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class RosaRechazo extends Rosa {


    private final double PRECIO = 7.0;
    private final String estado;

    public RosaRechazo(String variedad, int longitud, Fecha fechaCosecha, double produccion, String estado) {
        super(variedad, longitud, fechaCosecha, produccion);

        this.estado = estado;
    }

    @Override
    public double calcularProduccion() {
        return super.getProduccion() * this.PRECIO;

    }

    @Override
    public String toString() {
        return super.toString() + "\t\t" + this.calcularProduccion() + "\t\t\tRechazo";
    }

}
