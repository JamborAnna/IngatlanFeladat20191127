package com.java;

public class Garazs implements Ingatlan, Berelheto
{
    private double terulet;
    private double nmAr;
    private boolean futottE;
    private int honapSzam; // foglalt honapok szama
    private boolean auto; // all-e benne auto

    public Garazs(double terulet, double nmAr, boolean futottE) {
        this.terulet = terulet;
        this.nmAr = nmAr;
        this.futottE = futottE;
        this.honapSzam = 0;
        this.auto = false;
    }

    @Override
    public double mennyibeKerul(int honapokSzama) {
        double ar = terulet * nmAr;
        if (futottE)
            ar *= 1.5;
        return Math.round(ar);
    }

    @Override
    public boolean lefoglaltE() {
        if (honapSzam > 0 || auto == true)
            return true;
        else
            return false;
    }

    @Override
    public boolean lefoglal(int foglalniKivantHonapok) {
        if (!lefoglaltE())
        {
            honapSzam += foglalniKivantHonapok;
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public double osszkoltseg() {
        return Math.round(terulet * nmAr);
    }

    public void autoKiBeAll()
    {
        if(auto == false)
            auto = true;
        else
            auto = false;
    }

    @Override
    public String toString() {
        return "Garazs{" +
                "terulet=" + terulet +
                ", nmAr=" + nmAr +
                ", futottE=" + futottE +
                ", honapSzam=" + honapSzam +
                ", auto=" + auto +
                '}';
    }
}
