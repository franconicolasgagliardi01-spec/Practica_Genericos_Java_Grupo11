import pila.Pila;

public class Main {
    static void main(String[] args) {
        //Ejercicio 1, pruebas del main
        Pila<Integer> pilaEnteros = new Pila<>();
        Pila<String> pilaStrings = new Pila<>();

        System.out.println("Vacia: "+pilaEnteros.estaVacia());
        pilaEnteros.desapilar();
        pilaEnteros.apilar(5);
        pilaEnteros.apilar(11);
        System.out.println("Cima: "+pilaEnteros.cima());
        pilaEnteros.desapilar();
        System.out.println("Cima: "+pilaEnteros.cima());
        System.out.println("Tamaño: "+pilaEnteros.tamanio());
        System.out.println("Vacia: "+pilaEnteros.estaVacia());

        System.out.println("------------------------------------------");

        System.out.println("Vacia: " + pilaStrings.estaVacia());
        pilaStrings.desapilar();
        pilaStrings.apilar("Hola");
        pilaStrings.apilar("Mundo");
        System.out.println("Cima: " + pilaStrings.cima());
        pilaStrings.desapilar();
        System.out.println("Cima: " + pilaStrings.cima());
        System.out.println("Tamaño: " + pilaStrings.tamanio());
        System.out.println("Vacia: " + pilaStrings.estaVacia());


    }
}
