package com.java;

public abstract class Lakas implements Ingatlan
{
    protected double terulet;
    protected int szobakSzama;
    protected int lakok;
    protected double nmAr;

    public Lakas(double terulet, int szobakSzama, int lakok, int nmAr) {
        this.terulet = terulet;
        this.szobakSzama = szobakSzama;
        this.lakok = lakok;
        this.nmAr = nmAr;
    }

    public abstract boolean bekoltozik(int ember);

    @Override
    public double osszkoltseg() {
        return Math.round(nmAr * terulet);
    }

    public int lakokSzama()
    {
        return this.lakok;
    }

    @Override
    public String toString() {
        return "Lakas{" +
                "terulet=" + terulet +
                ", szobakSzama=" + szobakSzama +
                ", lakok=" + lakok +
                ", nmAr=" + nmAr +
                '}';
    }
}
