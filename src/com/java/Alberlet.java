
package com.java;

public class Alberlet extends Lakas implements Berelheto {

    private int honapSzam;

    public Alberlet(int honapSzam, double terulet, int szobakSzama, int lakok, int nmAr) {
        super(terulet, szobakSzama, 0, nmAr);
        this.honapSzam = 0;
    }
    
    @Override
    public double mennyibeKerul(int honapokSzama) {
        double szam;        
        if (lakok==0) {
            szam=-1;
        }
        else
        {
            szam=(Math.round(super.osszkoltseg()/lakok));  
        }
        return szam;
         
    }

    @Override
    public boolean lefoglaltE() {
        if (honapSzam==0) {
           return false; 
        }
        else    
        {
         return true;
        }        
    }

    @Override
    public boolean lefoglal(int foglalniKivantHonapok) {
        if(!lefoglaltE())
        {
            honapSzam+=foglalniKivantHonapok;
            return true;
        }
        else
        {
         return false;
        }
    }

    @Override
    public boolean bekoltozik(int ember) {
        boolean bekoltozhet=false;
        for (int i = 0; i < ember; i++) {
            if (lakok>=8 && lakok*2 < terulet) {
                bekoltozhet=false;
            }
            else
            {
                lakok++;
                bekoltozhet=true;
            }
        }
        return bekoltozhet;
    }

    @Override
    public String toString() {
        return super.toString()+", Lefoglalt hónapok száma=" + honapSzam ; 
    }
    
    
    
}
