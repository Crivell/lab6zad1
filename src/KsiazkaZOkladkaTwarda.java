public class KsiazkaZOkladkaTwarda extends Dekoracje {

    String dek = "Ksiazka Z Okladka Twarda ";

    KsiazkaZOkladkaTwarda  (Publikacja p){
        super(p);
        p.setOkladka(dek);
    }

    @Override
    public String toString() {
        return super.toString() + " | " + this.dek;
    }
}
