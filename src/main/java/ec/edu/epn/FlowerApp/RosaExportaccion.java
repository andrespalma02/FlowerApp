package ec.edu.epn.FlowerApp;

import javax.swing.JOptionPane;

public class RosaExportaccion extends Rosa {


    private final double PRECIO = 12.0;


    public RosaExportaccion(String variedad, int longitud, Fecha fechaCosecha, double produccion) {

        super(variedad, longitud, fechaCosecha, produccion);

    }

    @Override
    public double calcularProduccion() {

        return super.getProduccion() * this.PRECIO;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t" + this.calcularProduccion() + "\t\t\tProduccion";
    }
}
