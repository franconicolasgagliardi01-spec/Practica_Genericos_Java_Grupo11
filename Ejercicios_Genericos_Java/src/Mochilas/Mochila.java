package Mochilas;

import java.util.ArrayList;

public class Mochila<T> {
    private ArrayList<T> mochila = new ArrayList<>();

    public Mochila() {}

    public void agregar(T elemento) {
        mochila.add(elemento);
    }

    public void eliminar(T elemento) {
        mochila.remove(elemento);
    }

    public int tamanio() {
        return mochila.size();
    }

    public boolean contiene(T elemento) {
        return mochila.contains(elemento);
    }

    public void mostrar() {
        for (T elemento : mochila) {
            System.out.println(elemento);
        }
    }
}