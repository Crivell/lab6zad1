import Exceptions.ObwolutaException;

public class KsiazkaZObwoluta extends Dekoracje {

    String dek = "Ksiazka Z Obwoluta";

    KsiazkaZObwoluta (Publikacja p) throws ObwolutaException {
        super(p);
        p.setObwoluta(dek);
    }

    @Override
    public String toString() {
        return super.ksi.toString() + " | " + this.dek;
    }
}
