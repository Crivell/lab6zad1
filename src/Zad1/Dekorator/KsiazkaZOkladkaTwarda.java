package Dekorator;

import Dekorator.Publikacja;
import Exceptions.OkladkaException;

public class KsiazkaZOkladkaTwarda extends Dekoracje {

    String dek = "Dekorator.Ksiazka Z Okladka Twarda ";

    KsiazkaZOkladkaTwarda  (Publikacja p) throws OkladkaException {
        super(p);
        p.setOkladka(dek);
    }

    @Override
    public String toString() {
        return super.toString() + " | " + this.dek;
    }
}
