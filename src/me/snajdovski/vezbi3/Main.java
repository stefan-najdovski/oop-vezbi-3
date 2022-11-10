package me.snajdovski.vezbi3;

import me.snajdovski.vezbi3.Z1.Avtomobil;
import me.snajdovski.vezbi3.Z2.Fakultet;
import me.snajdovski.vezbi3.Z3.PC;
import me.snajdovski.vezbi3.Z4.Paricka;

public class Main {
    public static void main(String[] args) {

        //Avtomobil
        Avtomobil avtomobil1 = new Avtomobil("Toyota","Corrola","Bela",12400,2013,"BT-1234-BT");
        avtomobil1.PecatiInfo();
        System.out.println(avtomobil1.getPominatiKilometriNaAvtomobil());

        //Fakultet
        Fakultet fakultetBitola = new Fakultet();
        fakultetBitola.nazivNaFakultet = "UKLO FIKT";
        fakultetBitola.sediste = "Bitola";
        fakultetBitola.brojNaStudenti = 500;
        fakultetBitola.brojNaSmerovi = 2;
        fakultetBitola.dekan = "Pece M.";
        fakultetBitola.prvMetod();
        System.out.println("Namalen broj na studenti " + fakultetBitola.namaliBrojNaStudent(50));
        fakultetBitola.pecatiVrednostiNaFakultet();


        Fakultet fakultetSkopje = new Fakultet();
        fakultetSkopje.nazivNaFakultet = "UKIM PMF - Institut po Fizika";
        fakultetSkopje.sediste = "Skopje";
        fakultetSkopje.brojNaStudenti = 70;
        fakultetSkopje.brojNaSmerovi = 5; // nastanvna,teoretska,astro, primeneta, meteo?
        fakultetSkopje.dekan = "Aleksandar S.";
        fakultetSkopje.prvMetod();
        System.out.println("Namalen broj na studenti " + fakultetSkopje.namaliBrojNaStudent(30));
        fakultetSkopje.pecatiVrednostiNaFakultet();

        PC pc1 = new PC();
        pc1.zgolemiMemorija(8,500);





        //Broj na Frlanja
        Paricka p1 = new Paricka();
        p1.inputBrojNaFrlanja();
        p1.pecatiBrojNaFrlanja();
        p1.pecatiP();
        p1.pecatiG();
        p1.reset();
        p1.inputBrojNaFrlanja();
        p1.pecatiP();
        p1.pecatiG();
    }
}