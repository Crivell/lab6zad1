package Zad1.Factory.Wydawnictwa;

import Zad1.Dekorator.Ksiazka;
import Zad1.Factory.Ksiazki.Poemat;
import Zad1.Factory.Ksiazki.PowiescHistoryczna;
import Zad1.Factory.Wydawnictwo;

public class WydawnictwoPoematow extends Wydawnictwo {

    String autor = null;

    public WydawnictwoPoematow(String autor) {
        this.autor = autor;
    }

    @Override
    public Ksiazka createBook(String tytul, int iloscStron) {
        return new Poemat(autor,tytul,iloscStron);
    }
}
