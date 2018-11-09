package Dekorator;

import Dekorator.Publikacja;
import Exceptions.ObwolutaException;

public class KsiazkaZObwoluta extends Dekoracje {

    String dek = "Dekorator.Ksiazka Z Obwoluta";

    public KsiazkaZObwoluta(Publikacja p) throws ObwolutaException {
        super(p);
        p.setObwoluta(dek);
    }

    @Override
    public String toString() {
        return super.ksi.toString() + " | " + this.dek;
    }
}
