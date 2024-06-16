package tema;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class Homework1 {
    public String nume;
    public String prenume;
    public Boolean esteConfidentialSalariul;
    public String idAngajat;
    public String departament;

    @Test
    public void HomeworkTest() {
//        helloW();
//        varstaMea();
//        cerinta4();
//        cerinta3();
//        cerinta5();
//        cerinta6();
//        cerinta8nonconfidential();
//        cerinta8detaliiAngajat();
        cerinta9AfisareOriceAngajat(nume = "Popescu", departament = "IT", idAngajat = "sfsefs3344");
        cerinta9PrezentareAngajat();

    }

    public void helloW() {
        System.out.println("Hello world!Poti pleca acasa dupa ce iti verific munca!");
    }

    public void varstaMea() {
        Integer varsta = 28;
        System.out.printf("varsta mea este de %d ani.Poti pleca acasa dupa ce iti verific munca!", varsta);
    }

    public void cerinta3() {
        nume = "Rizac";
        prenume = ("Lucia-ELena");
        System.out.printf("Numele meu este %s.\nIar prenumele este %s potrivit CI. Poti pleca acasa dupa ce iti verific munca! ", nume, prenume);
        System.out.println();
    }

    public void cerinta4() {
        String salut = "Salut";
        String newSalut = salut.concat("M");
        System.out.println(newSalut + " Poti pleca acasa dupa ce iti verific munca!");
    }

    public void cerinta5() {
        StringBuilder salut = new StringBuilder("Salut");
        salut.insert(0, "H");
        String salutActualizat = salut.toString();
        System.out.println(salutActualizat + ".Poti pleca acasa dupa ce iti verific munca!");

    }

    public void cerinta6() {
        String sir = "Ana are mere, pere, prune"; // declarăm șirul

        StringBuilder newSir = new StringBuilder(); // Inițializăm un StringBuilder pentru a construi noul șir (nu putem edita un string, dar putem crea unul nou)

        for (int i = 0; i < sir.length(); i++) { // Iterăm prin fiecare caracter al șirului
            char currentChar = sir.charAt(i); // atribuim unei noi variabile caracterul de la pozitia i
            newSir.append(currentChar); // Adăugăm caracterul curent la noul șir

            // Verificăm dacă caracterul curent este o vocală (literele mici sau mari)
            if ("aeiouAEIOU".indexOf(currentChar) != -1 && i < sir.length() - 1 && sir.charAt(i + 1) == ' ') {
                newSir.append('Z'); // Adăugăm caracterul 'Z' după vocală în noul șir
            }
        }
        String sirActualizat = newSir.toString();
        System.out.println(sirActualizat + ". Poti pleca acasa dupa ce iti verific munca!"); // Afișăm șirul modificat
    }

    public void cerinta8nonconfidential() {
        prenume = "Andrei";
        Integer salariu = 50000;
        System.out.println("Numele angajatului este " + prenume + " si iar salariul sau nu este confidential: " + salariu + ". Poti pleca acasa dupa ce iti verific munca!");
    }

    public void cerinta8detaliiAngajat() {
        prenume = "Marian";
        esteConfidentialSalariul = true;
        System.out.println("Numele angajatului este " + prenume + " si este " + esteConfidentialSalariul + " ca salariul acestuia este confidential." + " Poti pleca acasa dupa ce iti verific munca!");


    }

    //Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"
    public void cerinta9AfisareOriceAngajat(String nume, String departament, String idAngajat) {
        System.out.printf("%s face parte din departamentul %s si are ID ul de angajat: %s ", nume, departament, idAngajat);
        System.out.println();
    }

    public void cerinta9PrezentareAngajat() {
        ArrayList<String> numeAngajati = new ArrayList<>();
        numeAngajati.add("Manole");
        numeAngajati.add("Popescu");
        numeAngajati.add("Luca");
        numeAngajati.add("Ionescu");
        numeAngajati.add("Ciorba");
        for (String nume : numeAngajati) {
            if (nume.equals("Popescu")) {
                System.out.println("foaaaarte bine");
            } else {
                continue;
            }
        }
    }
}
