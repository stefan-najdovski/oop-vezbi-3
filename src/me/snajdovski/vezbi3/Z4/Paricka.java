package me.snajdovski.vezbi3.Z4;

import java.util.Random;
import java.util.Scanner;

public class Paricka {

    public int brojNaFrlanja;
    Brojac b1 = new Brojac();

    public void inputBrojNaFrlanja(){
        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi broj na frlanja: ");
        brojNaFrlanja = input.nextInt();
        b1.brojNaFrlanja = brojNaFrlanja;
        paricka();
    }



    //simulation of coin flip
    public void paricka(){
        for(int i = 0; i < brojNaFrlanja; i++){
            Random rand = new Random();
            int randomNum = rand.nextInt(2);
            if(randomNum == 0){
                b1.incrementG();
            }else{
                b1.incrementP();
            }
            b1.incrementBrojNaFrlanja();
        }
    }

    public void pecatiBrojNaFrlanja(){
        System.out.println("Broj na frlanja: " + b1.getBrojNaFrlanja());
    }
   public void pecatiP(){
        System.out.println("Broj na P: " + b1.getBrojNaP());
    }
    public void pecatiG(){
        System.out.println("Broj na G: " + b1.getBrojNaG());
    }
    public void pecatiVoProcenti(){
        System.out.println("Procenti na G: " + (b1.getBrojNaG()  / b1.getBrojNaFrlanja() * 100) + "%");
        System.out.println("Procenti na P: " + (b1.getBrojNaP()  / b1.getBrojNaFrlanja() * 100) + "%");
    }
    public void reset(){
        b1.resetBrojNaFrlanja();
    }

}
