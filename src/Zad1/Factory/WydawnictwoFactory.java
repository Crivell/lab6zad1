package Zad1.Factory;

import Zad1.Dekorator.Ksiazka;

public interface WydawnictwoFactory {

    public Wydawnictwo getInstance(String autor);

    public abstract Ksiazka createBook(String tytul, int libczStron);

}
