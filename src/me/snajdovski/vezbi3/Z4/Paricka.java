package me.snajdovski.vezbi3.Z4;

import java.util.Scanner;

public class Paricka {

    Brojac b1 = new Brojac();

    public void inputBrojNaFrlanja(){
        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi broj na frlanja: ");
         b1.simulirajFrlanjeNaParicka(input.nextInt());
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

    public void reset(){
        b1.resetBrojNaFrlanja();
    }

}
