package Zad1.Factory;

import Zad1.Dekorator.Ksiazka;
import Zad1.Factory.Wydawnictwa.WydawnictwoPoematow;
import Zad1.Factory.Wydawnictwa.WydawnictwoPowiesciHistorycznych;
import Zad1.Factory.Wydawnictwa.WydawnictwoThrillerow;

public abstract class Wydawnictwo  {


    public static Wydawnictwo getInstance(String autor) {
        if(autor == "Józef Ignacy Kraszewski"){
            return new WydawnictwoPowiesciHistorycznych(autor);
        }else if(autor == "Juliusz Słowacki"){
            return new WydawnictwoPoematow(autor);
        }else{
           return new WydawnictwoThrillerow(autor);
        }
    }

    public abstract Ksiazka createBook(String tytul,int iloscStron);
}
