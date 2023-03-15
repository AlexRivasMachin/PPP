package com.example.pokemondefv1.Pokemon;

public class Evoluciones {
    private int contadorEvo=0;

    public int getContadorEvo(){
        return contadorEvo;
    }

    public void incrementarContador(){
        contadorEvo++;
    }
    public int evo1a(int ataque){
        return ataque+5;
    }
    public int evo1d(int defensa){
        return defensa+3;
    }
     public int evo2a(int ataque){

        return ataque+7;
    }
    public int evo2d(int defensa){
        return defensa+5;
    }


}
