package Pila;

import java.util.ArrayList;

public class Pila<T> {
    private ArrayList<T> pila = new ArrayList<>();

    public void apilar(T elemento){
        pila.add(elemento);
        System.out.println("Elemento apilado");
    }

    public void desapilar(){
        if (estaVacia()){
            System.out.println("No se puede desapilar, la pila esta vacia");
        }else {
            pila.remove(cima());
            System.out.println("Elemento desapilado");
        }
    }

    public int tamanio(){
        return pila.size();
    }

    public T cima(){
        return pila.get(tamanio()-1);
    }

    public boolean estaVacia(){
        return pila.isEmpty();
    }
}
