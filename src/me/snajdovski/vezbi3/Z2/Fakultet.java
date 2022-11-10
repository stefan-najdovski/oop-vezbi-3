package me.snajdovski.vezbi3.Z2;

public class Fakultet {
    //nazivNaFakultet, brojNaSmerovi, brojNaStudenti, dekan, sediste



    public String nazivNaFakultet,dekan,sediste;
    public int brojNaSmerovi, brojNaStudenti;

    public void prvMetod(){
        System.out.println("Zgolemen broj na studenti: " + (this.brojNaStudenti + 50));
    }

    public int zgolemiBrojNaStudentiZa50(){
       return this.brojNaStudenti + 50;
    }

    public int namaliBrojNaStudent(int namali){
        return  this.brojNaStudenti - namali;
    }

    public void pecatiVrednostiNaFakultet(){
        System.out.println("Naziv na Fakultet " + this.nazivNaFakultet + " , Sediste " + this.sediste );
    }

}
