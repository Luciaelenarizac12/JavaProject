package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptieConcept {
    // eroare care apare in mom cand programul ruleaza
    //exceptiile tb tratate deoarece pot contine info din interior ce pot sa fie exploatate
    //avem 2 tipuri de exceptii: checked si unchecked
    //checked -> exceptii care se trateaza in timpul compilarii + acest tip exceptii mostenesc clasa Exception

    //unchecked nu se trateaza in timpul compilarii + acest tip de exceptii mostenensc clasa RunTimeException

    //exista 2 keywords pt tratarea exceptiilor: throw si throws
    //throw= folosit sa arunce explicit exceptii/este regasit in interiorul unei metode
    //throws= folosit in semnatura metodei ca sa declare ca o metoda poate arunca o exceptie

    // de cele mai multe ori exceptii se trateaza folosind o structura try..catch..finally

    //incercam sa citim continutul dintr-un fisier

    public void checkedExceptionExample(){
        File file= new File ("c://proba.txt");
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("a intrat pe clauza de catch, deci fisierul in cauza nu exista :D ");
        }
        finally {
            System.out.println("a intrat pe clauza de finally. indiferent daca a mers sau nu pe catch, tot apeleaza si finally");
        }
    }

    //exceptie unchecked

    public void uncheckedExceptionExample(){
        Integer [] multimi=new Integer[2];
        multimi[0]=15;
        multimi[1]=31;
        multimi[2]=40;
        System.out.println(multimi[2]);

    }

    //throw exception

    public void throwExceptionExample(Integer varsta){
        if (varsta <18 ){
            throw new RuntimeException("Nu primeste tigari");}
        else {
            System.out.println("Persoana majora - poate primi tigari");

        }

    }

    //throws exception

    public void throwsExceptionExample() throws FileNotFoundException {
        File file= new File ("c://proba.txt");
        FileInputStream fileInputStream=new FileInputStream(file);

    }





}
