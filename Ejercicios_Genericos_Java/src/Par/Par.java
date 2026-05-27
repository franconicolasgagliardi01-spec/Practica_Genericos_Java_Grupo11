package Par;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Ciro
 */
public class Par<A,B> {

    private A primero;
    private B segundo;

    // Constructor
    public Par(A primero, B segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    // Getters
    public A getPrimero() {
        return primero;
    }

    public B getSegundo() {
        return segundo;
    }

    // Método para invertir el par
    public Par<B,A> invertir() {
        return new Par<>(segundo, primero);
    }

    // Mostrar datos
    @Override
    public String toString() {
        return "(" + primero + ", " + segundo + ")";
    }
}
