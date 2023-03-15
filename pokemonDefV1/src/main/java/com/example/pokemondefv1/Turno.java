package com.example.pokemondefv1;

public interface Turno<T>{
    public void clear();
    public T next();
    public boolean isMyTurn(T player);

}
