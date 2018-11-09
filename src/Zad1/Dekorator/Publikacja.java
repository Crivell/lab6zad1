package Zad1.Dekorator;

import Exceptions.ObwolutaException;
import Exceptions.OkladkaException;
import Exceptions.autografException;

public interface Publikacja {
    void setTytul(String t);
    void setAutograf(String t) throws autografException;
    void setOkladka(String t) throws OkladkaException;
    void setObwoluta(String t) throws ObwolutaException;
}

