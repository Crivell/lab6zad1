package Zad1.Dekorator;

import Exceptions.OkladkaException;
import Exceptions.autografException;

public class KsiazkaZAutografem extends Dekoracje {

    String dek = "";

    KsiazkaZAutografem (Publikacja p) throws OkladkaException {
        super(p);
        p.setOkladka(dek);
    }

    public KsiazkaZAutografem(Publikacja ksi, String dek) throws autografException {
        super(ksi);
        this.dek = dek;
        ksi.setAutograf(dek);
    }

    @Override
    public String toString() {
        return super.toString() + " | " + this.dek;
    }
}
