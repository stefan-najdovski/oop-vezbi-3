package me.snajdovski.vezbi3.Z4;

public class Brojac {
    //num of fallen coins
    public int brojNaFrlanja;
    //num of G
    public int brojNaG = 0;
    //num of P
    public int brojNaP = 0;

    public int incrementG(){
        return this.brojNaG++;
    }
    public int incrementP(){
        return this.brojNaP++;
    }

    public int incrementBrojNaFrlanja(){
        return this.brojNaFrlanja++;
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
