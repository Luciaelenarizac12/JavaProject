package AbstractizareIterfata;

public interface AngajatInterface extends CommonInterface {

    //recunoastem intr-un fisier java o interfata dupa cuvantul interface;
    //O interfata contine numai metode abstracte (metode care nu au body);
    //toate metodele dintr-o interfata sunt by default publice;
    //intr-o interfata putem avea metode void, cat si cu return;
    //o interfata nu poate contine un constructor;
    //dintr-o interfata nu putem sa facem un obiect;
    //O interfata se implementeaza;
    //clasa care implementeaza interfata trebuie sa implementeze toate metodele abstracte din interfata!
    //o clasa poate implementa mai multe interfete;
    // o interfata poate mosteni o alta interfata

    void mergemLaServiciu(); //asa arata o metoda abstracta, nu are "public" si nici body, deci nu avem nevoie de {};
    void lucreaza();
    void beaCafea();
    void pleacaAcasa();


}
