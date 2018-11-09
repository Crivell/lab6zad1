package Zad1.Factory.Wydawnictwa;

import Zad1.Dekorator.Ksiazka;
import Zad1.Factory.Ksiazki.PowiescHistoryczna;
import Zad1.Factory.Wydawnictwo;

public class WydawnictwoPowiesciHistorycznych extends Wydawnictwo {

    String autor = null;

    public WydawnictwoPowiesciHistorycznych(String autor) {
        this.autor = autor;
    }

    @Override
    public Ksiazka createBook(String tytul, int iloscStron) {
        return new PowiescHistoryczna(autor,tytul,iloscStron);
    }
}
