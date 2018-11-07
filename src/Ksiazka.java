import Exceptions.ObwolutaException;
import Exceptions.OkladkaException;
import Exceptions.autografException;

public class Ksiazka implements Publikacja {

    private String tytul= null;
    private String autograf= null;
    private String okladka= null;
    private String autor= null;
    private String obwoluta = null;
    int ilStron;

    public Ksiazka() {
    }

    public Ksiazka(String autor, String tytul, int ilStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.ilStron = ilStron;
    }

    @Override
    public String toString() {
        return "Ksiazka" + autor +
                " | " + tytul + " | " +
                 + ilStron;
    }

    @Override
    public void setTytul(String t) {
        this.tytul = t;
    }

    @Override
    public void setAutograf(String t) throws autografException {

        if(this.autograf == null){
            this.autograf = t;
        }else{
            throw new autografException("Autograf moze byc tylko jeden");
        }
    }

    @Override
    public void setObwoluta(String t) throws ObwolutaException {
        if(this.obwoluta == null && this.okladka != null){
            this.obwoluta = t;
        }else if(this.obwoluta != null){
            throw new ObwolutaException("Obwoluta moze byc tylko jedna");
        }else{
            throw new ObwolutaException("Nie mozna oblozyc obwoluta ksiazki ktora nie ma okladki");
        }
    }

    @Override
    public void setOkladka(String t) throws OkladkaException {
        if(this.okladka == null){
            this.okladka = t;
        }else{
            throw new OkladkaException("Ksiazka nie moze miec dwoch okladek");
        }
    }
}
