import Zad1.Dekorator.Ksiazka;
import Zad1.Dekorator.KsiazkaZObwoluta;
import Zad1.Dekorator.KsiazkaZOkladkaZwykla;
import Zad1.Dekorator.Publikacja;
import Exceptions.ObwolutaException;
import Exceptions.OkladkaException;
import Zad1.Factory.Wydawnictwo;
import Zad1.Factory.WydawnictwoFactory;

public class Main {
    public static void main(String[] args) {

        Publikacja k1 = new Ksiazka("Adam Mickiewicz", "Pan Tadeusz", 340);
        Publikacja k2 = new Ksiazka("Adam Mickiewicz", "Dziady", 130);
        try{
            Publikacja kk1 = new KsiazkaZOkladkaZwykla(k1);
            k1 = new KsiazkaZObwoluta(k1);
            System.out.println(kk1);

            Wydawnictwo w = Wydawnictwo.getInstance("Józef Ignacy Kraszewski");

            Publikacja k = w.createBook("sd",22);
            System.out.println(k);

        }catch(OkladkaException e){
            System.out.println(e.getMessage());
        }catch(ObwolutaException e){
            System.out.println(e.getMessage());
        }

    }

}
