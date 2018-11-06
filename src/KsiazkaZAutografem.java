public class KsiazkaZAutografem extends Dekoracje {

    String dek = "";

    KsiazkaZAutografem (Publikacja p){
        super(p);
        p.setOkladka(dek);
    }

    public KsiazkaZAutografem(Publikacja ksi, String dek) {
        super(ksi);
        this.dek = dek;
        ksi.setAutograf(dek);
    }

    @Override
    public String toString() {
        return super.toString() + " | " + this.dek;
    }
}
