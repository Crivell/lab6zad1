import Exceptions.ObwolutaException;
import Exceptions.OkladkaException;
import Exceptions.autografException;

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
        ksi.setTytul(t);
    }

    @Override
    public void setAutograf(String t) throws autografException {

        ksi.setAutograf(t);
    }

    @Override
    public void setOkladka(String t) throws OkladkaException {

        ksi.setOkladka(t);
    }

    @Override
    public void setObwoluta(String t) throws ObwolutaException {

        ksi.setObwoluta(t);
    }
}
//Klasa musi dziedziczyc z ksiazki poniewaz mozemy utworzyc na samym poczadku ksiazke z jakoms dana dekoracja