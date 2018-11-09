import Dekorator.KsiazkaZObwoluta;
import Dekorator.KsiazkaZOkladkaZwykla;
import Dekorator.Publikacja;
import Exceptions.ObwolutaException;
import Exceptions.OkladkaException;

public class Main {
    public static void main(String[] args) {

        Publikacja k1 = new Ksiazka("Adam Mickiewicz", "Pan Tadeusz", 340);
        Publikacja k2 = new Ksiazka("Adam Mickiewicz", "Dziady", 130);
        try{
            k1 = new KsiazkaZObwoluta(k1);
            Publikacja kk1 = new KsiazkaZOkladkaZwykla(k1);
            System.out.println(kk1);
        }catch(OkladkaException e){
            System.out.println(e.getMessage());
        }catch(ObwolutaException e){
            System.out.println(e.getMessage());
        }

    }

}
