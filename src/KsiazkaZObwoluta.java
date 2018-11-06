public class KsiazkaZObwoluta extends Dekoracje {

    String dek = "Ksiazka Z Obwoluta";

    KsiazkaZObwoluta (Publikacja p) {
        super(p);
        p.setObwoluta(dek);
    }

    @Override
    public String toString() {
        return super.toString() + " | " + this.dek;
    }
}
