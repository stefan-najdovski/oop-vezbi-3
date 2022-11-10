package me.snajdovski.vezbi3.Z4;

import java.util.Random;

public class Brojac {
    //num of fallen coins
    public int brojNaFrlanja;
    //num of G
    public int brojNaG = 0;
    //num of P
    public int brojNaP = 0;


    //simulation of coin flip
    public void simulirajFrlanjeNaParicka(int brojNaFrlanja){
        for(int i = 0; i < brojNaFrlanja; i++){
            Random rand = new Random();
            int randomNum = rand.nextInt(2);
            if(randomNum == 0){
                this.incrementG();
            }else{
                this.incrementP();
            }
            this.incrementBrojNaFrlanja();
        }
    }



    public void incrementG(){
        this.brojNaG++;
    }
    public void incrementP(){
        this.brojNaP++;
    }

    public void incrementBrojNaFrlanja(){
        this.brojNaFrlanja++;
    }

    public int getBrojNaP() {
        return brojNaP;
    }

    public int getBrojNaFrlanja() {
        return brojNaFrlanja;
    }

    public int getBrojNaG() {
        return brojNaG;
    }

    public void resetBrojNaFrlanja(){
        brojNaFrlanja = 0;
        brojNaG = 0;
        brojNaP = 0;
    }
}
