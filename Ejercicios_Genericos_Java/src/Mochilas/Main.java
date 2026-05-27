package Mochilas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mochila<String> mochila = new Mochila<>();
        MochilaDeMonedas mochilaDeMonedas = new MochilaDeMonedas();
        String opcion = "";

        System.out.println("Bienvenido! Estas son las mochilas de Mario una mágica y otra de monedas");

        while (!opcion.equals("e")) {
            System.out.println("\nQue deseas hacer con ellas?");
            // ---------- Mochila mágica ----------
            System.out.println("a) Ver el contenido de la mochila");
            System.out.println("b) Agregar algo a la mochila");
            System.out.println("c) Quitar algo de la mochila");
            System.out.println("d) Ver la cantidad de cosas");
            // ---------- Mochila de monedas ----------
            System.out.println("f) Agregar una moneda a la mochila de monedas");
            System.out.println("g) Ver el contenido de la mochila de monedas");
            System.out.println("h) Quitar una moneda de la mochila de monedas");
            System.out.println("i) Ver el total acumulado de monedas");
            System.out.println("j) Comparar ambas mochilas");
            // -------------------------------------------------------------------
            System.out.println("e) Salir");

            opcion = sc.nextLine().toLowerCase();

            switch (opcion) {
                case "a":
                    if (mochila.tamanio() == 0) {
                        System.out.println("La mochila está vacía.");
                    } else {
                        System.out.println("Contenido de la mochila:");
                        mochila.mostrar();
                    }
                    break;

                case "b":
                    System.out.println("¿Qué querés agregar?");
                    String elemento = sc.nextLine();
                    mochila.agregar(elemento);
                    System.out.println("'" + elemento + "' agregado!");
                    break;

                case "c":
                    if (mochila.tamanio() == 0) {
                        System.out.println("La mochila ya está vacía.");
                    } else {
                        System.out.println("Contenido de la mochila:");
                        mochila.mostrar();
                        System.out.println("¿Qué querés quitar?");
                        String aEliminar = sc.nextLine();
                        if (mochila.contiene(aEliminar)) {
                            mochila.eliminar(aEliminar);
                            System.out.println("'" + aEliminar + "' eliminado!");
                        } else  {
                            System.out.println(aEliminar + " no está en la mochila por lo tanto no se puede eliminar");
                        }
                    }
                    break;

                case "d":
                    System.out.println("Hay " + mochila.tamanio() + " cosas en la mochila.");
                    break;

                // ---------- Opciones mochila de monedas ----------
                case "f":
                    System.out.println("¿Qué valor tiene la moneda?");
                    Double moneda = Double.parseDouble(sc.nextLine());
                    mochilaDeMonedas.agregar(moneda);
                    System.out.println("Moneda de $" + moneda + " agregada!");
                    break;

                case "g":
                    if (mochilaDeMonedas.tamanio() == 0) {
                        System.out.println("La mochila de monedas está vacía.");
                    } else {
                        System.out.println("Contenido de la mochila de monedas:");
                        mochilaDeMonedas.mostrar();
                    }
                    break;

                case "h":
                    if (mochilaDeMonedas.tamanio() == 0) {
                        System.out.println("La mochila de monedas ya está vacía.");
                    } else {
                        System.out.println("Contenido de la mochila de monedas:");
                        mochilaDeMonedas.mostrar();
                        System.out.println("¿Qué moneda querés quitar?");
                        Double aEliminar = Double.parseDouble(sc.nextLine());
                        if (mochilaDeMonedas.contiene(aEliminar)) {
                            mochilaDeMonedas.eliminar(aEliminar);
                            System.out.println("Moneda de $" + aEliminar + " eliminada!");
                        } else {
                            System.out.println("$" + aEliminar + " no está en la mochila de monedas.");
                        }
                    }
                    break;

                case "i":
                    System.out.println("Total acumulado: $" + mochilaDeMonedas.sumarTotal());
                    break;

                case "j":
                    System.out.println("\n---------- COMPARACIÓN ----------");
                    System.out.println("Mochila genérica:   " + mochila.tamanio() + " elementos");
                    System.out.println("Mochila de monedas: " + mochilaDeMonedas.tamanio() + " monedas");
                    System.out.println("Total acumulado:    $" + mochilaDeMonedas.sumarTotal());
                    System.out.println("----------------------------------");
                    break;
                // ----------------------------------------------------------------------------------------

                case "e":
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida, intentá de nuevo.");
            }
        }

        sc.close();
    }
}