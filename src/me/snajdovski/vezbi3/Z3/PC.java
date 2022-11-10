package me.snajdovski.vezbi3.Z3;
/***
 *Да се креира класа PC, со јавни атрибути: memorija – целоброен податочен тип, tipNaMemorija –
 * текстуален податочен тип и hardDisk – целоброен податочен тип. Исто така, да се креира и атрибут од тип String,
 * а името на атрибутот да биде golemina, а вредноста “GB”. Класата да има конструктор кој статично ќе ги доделува
 * следните вредности:
 *  2 – за memorija
 *  DDR2 – за tipNaMemorija
 *  160 – за hardDisk
 * Да има метод кој ќе прима влезни аргументи: int zgolemiMemorija, int novHardDisk.
 * Методот да ја зголемува меморијата за соодветниот влезен аргумент, и да печати:
 * Memorijata bese __________GB, sega iznesuva__________ GB.
 * Tipot na memorijata e __________.
 * HD ima golemina od __________GB. Prethodno iznesuvase __________GB.
 */

public class PC {
    public int memorija, hardDisk;
    public String tipNaMemorija;

    public PC() {
        this.memorija = 2;  // poor pc
        this.hardDisk = 160;    // premalo
        this.tipNaMemorija = "DDR2"; //prestaro xd
    }

    public void zgolemiMemorija(int zgolemiMemorija, int novHardisk){
        System.out.println("Memorijata bese " + this.memorija + "GB , sega iznesuva " + memorija +zgolemiMemorija + " GB.");
        System.out.println("Tipot na memorijata e " + tipNaMemorija + ".");
        System.out.println("HD ima golemina od " + novHardisk + "GB. Prethodno iznesuvase " + this.hardDisk + " GB.");
    }
}
