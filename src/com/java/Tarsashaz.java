package com.java;

import java.util.ArrayList;
import java.util.List;

public class Tarsashaz
{
    private List<Ingatlan> kollekcio;
    private int maxLakas;
    private int maxGarazs;

    public Tarsashaz(int maxLakas, int maxGarazs) {
        this.maxLakas = maxLakas;
        this.maxGarazs = maxGarazs;
        this.kollekcio = new ArrayList<>();
    }

    public boolean lakasHozzaad(Lakas lakas)
    {
        int lakasokSzama = 0;
        for (Ingatlan ingatlan : kollekcio)
        {
            if (ingatlan instanceof Lakas)
                lakasokSzama++;
        }
        if (maxLakas >= lakasokSzama)
        {
            this.kollekcio.add(lakas);
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean garazsHozzaad(Garazs garazs)
    {
        int garazsokSzama = 0;
        for (Ingatlan ingatlan : kollekcio)
        {
            if (ingatlan instanceof Garazs)
                garazsokSzama++;
        }
        if (maxLakas >= garazsokSzama)
        {
            this.kollekcio.add(garazs);
            return true;
        }
        else
        {
            return false;
        }
    }

    public int osszesLako()
    {
        int lakokSzama = 0;
        for (Ingatlan ingatlan : kollekcio)
        {
            if (ingatlan instanceof Lakas)
                lakokSzama += ((Lakas) ingatlan).lakokSzama();
        }
        return lakokSzama;
    }

    public double ingatlanErtek()
    {
        double ingatlanErtek = 0;
        for (Ingatlan ingatlan : kollekcio)
        {
            if (ingatlan instanceof Lakas && ((Lakas) ingatlan).lakokSzama() > 0)
            {
                ingatlanErtek += ingatlan.osszkoltseg();
            }
            else
            {
                ingatlanErtek += ingatlan.osszkoltseg();
            }
        }
        return ingatlanErtek;
    }
}
