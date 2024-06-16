package variabilaMetoda;

import org.testng.annotations.Test;

public class CursantStudent {
    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;


    @Test //metoda de test
    public void metodaTest(){
        primesteBursa();
        descrieCursant();


    }
    public void primesteBursa(){
        nume="Daniel";
        prenume="Popa";
        Boolean bursa=true;// variabila locala
        Integer sumaBursa=1200;
        System.out.println("Este "+ bursa + " ca"+" " + nume+ " "+prenume +" primeste bursa.Acesta primeste suma de " + sumaBursa + ".");
    }

    public void descrieCursant(){
        nume="Lucia";
        prenume="Rizac";
        varsta= 28;
        adresa="Ion Creanga nr.53, Iasi";
        inaltime = 1.69;
        greutate= 58.10f;
        sex='F';
        areRestante=false;

        System.out.print("numele meu este "+ nume+ " ");
        System.out.print(prenume);

    }


}

