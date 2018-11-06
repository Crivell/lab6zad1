public class KsiazkaZOkladkaZwykla extends Dekoracje {

    String dek = "Ksiazka Z OkladkaZwykla";

    KsiazkaZOkladkaZwykla(Publikacja p){
        super(p);
        p.setOkladka(dek);
    }

    @Override
    public String toString() {
        return super.ksi.toString()  + " | " + this.dek;
    }
}
