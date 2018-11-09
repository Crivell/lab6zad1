package Zad1.Factory.Wydawnictwa;

import Zad1.Dekorator.Ksiazka;
import Zad1.Factory.Ksiazki.Thriller;
import Zad1.Factory.Wydawnictwo;

public class WydawnictwoThrillerow extends Wydawnictwo {

    String autor = null;

    public WydawnictwoThrillerow(String autor) {
        this.autor = autor;
    }

    @Override
    public Ksiazka createBook(String tytul, int iloscStron) {
        return new Thriller(autor,tytul,iloscStron);
    }
}
