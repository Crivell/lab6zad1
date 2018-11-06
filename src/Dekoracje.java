
public abstract class Dekoracje extends Ksiazka implements Publikacja {
    protected Publikacja ksi;


    public Dekoracje(String autor, String tytul, int ilStron, Publikacja ksi) {
        super(autor, tytul, ilStron);
        this.ksi = ksi;
    }

    public Dekoracje(Publikacja ksi) {
        super();
        this.ksi = ksi;
    }

    @Override
    public void setTytul(String t) {
        ksi.setOkladka(t);
    }

    @Override
    public void setAutograf(String t) {
        ksi.setAutograf(t);
    }

    @Override
    public void setOkladka(String t) {
        ksi.setOkladka(t);
    }

    @Override
    public void setObwoluta(String t) {
        ksi.setObwoluta(t);
    }
}
//Klasa musi dziedziczyc z ksiazki poniewaz mozemy utworzyc na samym poczadku ksiazke z jakoms dana dekoracja