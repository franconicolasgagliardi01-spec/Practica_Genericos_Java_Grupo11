/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Ciro
 */
package Par;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Par<String, Integer> persona = new Par<>("Ciro", 20);

        System.out.println("Par original:");
        System.out.println(persona);

        // Invertir
        Par<Integer, String> invertido = persona.invertir();

        System.out.println("Par invertido:");
        System.out.println(invertido);


        // Otro ejemplo
        Par<Double, Boolean> ejemplo = new Par<>(0.14, true);

        System.out.println("Otro par:");
        System.out.println(ejemplo);

        System.out.println("Invertido:");
        System.out.println(ejemplo.invertir());
    }    }
