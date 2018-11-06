public class Main {
    public static void main(String[] args) {
        Publikacja k1 =  new Ksiazka("Adam Mickiewicz", "Pan Tadeusz", 340);
        Publikacja k2 = new Ksiazka("Adam Mickiewicz", "Dziady", 130);
        Publikacja kk1 = new KsiazkaZOkladkaZwykla(k1);
        System.out.println(kk1);
    }

}
