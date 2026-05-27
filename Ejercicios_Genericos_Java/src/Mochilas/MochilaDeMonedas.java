package Mochilas;
import java.util.ArrayList;

public class MochilaDeMonedas {
    private ArrayList<Double> monedas = new ArrayList<>();

    public void agregar(Double moneda) {
        monedas.add(moneda);
    }

    public void eliminar(Double moneda) {
        monedas.remove(moneda);
    }

    public int tamanio() {
        return monedas.size();
    }

    public void mostrar() {
        for (Double moneda : monedas) {
            System.out.println(moneda);
        }
    }

    public boolean contiene(Double moneda) {
        return monedas.contains(moneda);
    }

    public Double sumarTotal() {
        Double total = 0.0;
        for (Double moneda : monedas) {
            total += moneda;
        }
        return total;
    }
}