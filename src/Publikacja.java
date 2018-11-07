import Exceptions.ObwolutaException;
import Exceptions.OkladkaException;
import Exceptions.autografException;

interface Publikacja {
    void setTytul(String t);
    void setAutograf(String t) throws autografException;
    void setOkladka(String t) throws OkladkaException;
    void setObwoluta(String t) throws ObwolutaException;
}

