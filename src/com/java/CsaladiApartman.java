package com.java;

public class CsaladiApartman extends Lakas{
    private int gyerekekSzama;

    public CsaladiApartman(int gyerekekSzama, double terulet, int szobakSzama, int lakok, int nmAr) {
        super(terulet, szobakSzama, 0, nmAr);
        this.gyerekekSzama = 0;
    }

    public boolean gyerekSzuletik()
    {
        boolean megszuletettE=false;
        if (lakok-gyerekekSzama>=2) {
            lakok++;
            gyerekekSzama++;
            megszuletettE=true;
        }
        return megszuletettE;
    }

    @Override
    public boolean bekoltozik(int ember) {
        int felnottekSzama=lakok-gyerekekSzama;
        double felnottTerulet=10;
        double gyerekTerulet=5;
        boolean bekoltozhetE=false;
        for (int i = 0; i < ember; i++) {
            if (felnottekSzama + gyerekekSzama / 2 >= 2 && (felnottekSzama * felnottTerulet) + (gyerekekSzama * gyerekTerulet) < terulet) {
                bekoltozhetE=false;
            }
            else
            {
                lakok++;
                bekoltozhetE=true;
            }
        }
        return bekoltozhetE;     
    }

    @Override
    public String toString() {
        return super.toString()+", gyerekek száma=" + gyerekekSzama;
    }
}