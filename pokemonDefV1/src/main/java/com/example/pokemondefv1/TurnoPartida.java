package com.example.pokemondefv1;

public class TurnoPartida<T> extends Jugador implements Turno<T> {
    private int numTurno;
    private int turno;
    private T[] jugadores;
    public TurnoPartida(T[] jugadores){
        this.jugadores = jugadores;
        this.turno=0;
        numTurno=0;
    }
    public TurnoPartida(T[] jugagores, T j){
        this.jugadores= jugadores;
        this.turno=getTurn(jugadores,j);
        numTurno=0;
    }
    public int getTurn(T[] jugador, T j){
        boolean enc = false;
        int i = 0;
        while ((i < jugadores.length) && !enc){
            if (jugadores[i] == j)
                enc = true;
            else
                i++;
        }
        return i;
    }

    @Override
    public void clear() {

    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public boolean isMyTurn(T player) {
        return false;
    }
}

