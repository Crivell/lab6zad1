package Dekorator;

import Dekorator.Publikacja;
import Exceptions.OkladkaException;

public class KsiazkaZOkladkaZwykla extends Dekoracje {

    String dek = "Dekorator.Ksiazka Z OkladkaZwykla";

    public KsiazkaZOkladkaZwykla(Publikacja p) throws OkladkaException {
        super(p);
        p.setOkladka(dek);
    }

    @Override
    public String toString() {
        return super.ksi.toString()  + " | " + this.dek;
    }
}
