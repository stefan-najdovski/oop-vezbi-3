package me.snajdovski.vezbi3.Z1;

public class Avtomobil {
    //marka,model,boja,pominatiKM,godinaNaProizvodstvo,registracija
    public String marka,modelNaAvtomobil,boja;
    public float pominatiKM;
    public int godinaNaProizvodstvo;
    public String registracija;

    //Dinamicen konstruktor
    public Avtomobil(String marka, String modelNaAvtomobil, String boja, float pominatiKM, int godinaNaProizvodstvo, String registracija) {
        this.marka = marka;
        this.modelNaAvtomobil = modelNaAvtomobil;
        this.boja = boja;
        this.pominatiKM = pominatiKM;
        this.godinaNaProizvodstvo = godinaNaProizvodstvo;
        this.registracija = registracija;
    }
    //zs da ne e toString overide??????
    public void PecatiInfo(){
        System.out.println(this.marka + " , " + this.modelNaAvtomobil + " , " + this.boja + " Registracija: " + this.registracija);
    }
   public double getPominatiKilometriNaAvtomobil(){
        double pKm;
        pKm =  this.pominatiKM + 1520.25;
        return pKm;
   }
    //isto kako pecati info samo po elegantno
    @Override
    public String toString() {
        return
                "Marka= " + this.marka + " , " +
                " modelNaAvtomobil= " + this.modelNaAvtomobil + " , " +
                ", boja= " + this.boja + "." + " registracija = " + this.registracija ;

    }
}
