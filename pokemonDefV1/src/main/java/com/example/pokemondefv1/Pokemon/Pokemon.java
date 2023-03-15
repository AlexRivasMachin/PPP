package com.example.pokemondefv1.Pokemon;

public class Pokemon extends Evoluciones{
    private int ataque;
    private int defensa;
    private int vida;
    private int maxVida;
    private int pos;
    /*private int chargedMax;
    private int chargedCurrent;*/
    private boolean fainted = false;
    //protected Random rand = new Random();
    protected PokeType type;

    public Pokemon(int pPos){
        this.ataque=11;
        this.defensa=3;
        this.vida=200;
        this.maxVida=this.vida;
        this.pos=pos;
    }
    public int checkEvoState(){
        int evoEstado= this.getContadorEvo();
        if(this.vida>this.maxVida/2 && evoEstado==0){
            return 0;
        }
        if(this.vida<this.maxVida/2 && evoEstado== 0) {
            return 1;
        }
        if(this.vida<this.maxVida/5 && evoEstado== 1) {
            return 2;
        }
        if(this.vida<this.maxVida/5 && evoEstado== 0) {
            return 3;
        }
        return 0;
    }
    public void evolucionar(){
        int state=checkEvoState();
        if(state==1){
            this.evo1a(this.ataque);
            this.evo1d(this.defensa);
            this.incrementarContador();
        }
        if(state==2){
            this.evo2a(this.ataque);
            this.evo2d(this.defensa);
            this.incrementarContador();

        }
        if(state==3){
            this.evo1a(this.ataque);
            this.evo1d(this.defensa);
            this.incrementarContador();

            this.evo2a(this.ataque);
            this.evo2d(this.defensa);
            this.incrementarContador();

        }

    }
}

