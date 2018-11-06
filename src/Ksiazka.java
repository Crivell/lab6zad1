import Exceptions.OkladkaException;

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
    public void setAutograf(String t) {
        this.autograf = t;
    }

    @Override
    public void setObwoluta(String t) {
        this.obwoluta = t;
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
