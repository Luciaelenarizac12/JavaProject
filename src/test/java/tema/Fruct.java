package tema;

import org.testng.annotations.Test;

public class Fruct {
    public String nume;
    public String culoare;
    public String gust;
    public Integer greutate;
    public Character calitatea;
    public Boolean areSambure;
    public Float cantitateFructoza;

    @Test
    public void metodaTest(){
        prezentareFruct();
        System.out.println("===Afisam si alte fructe===");
        afisareOriceFruct("piersica","galben-rosiatica","acrisoara", 30, true, 'B', 25.9f);
        afisareOriceFruct("portocala", "portocalie", "amara", 80, false, 'C',25.1f);
        afisareOriceFruct("rodia", "rosie", "acra", 100, false, 'D',10.1f);
        afisareOriceFruct("rosia", "alba", "aromata", 200, true, 'A',58.1f);
        afisareOriceFruct("banana", "galbena", "dulce", 120, false, 'C',2.1f);
        afisareOriceFruct("caisa", "verde", "acrisoara", 150, true, 'C',20.1f);

    }
    public void afisareOriceFruct(String nume, String culoare, String gust, Integer greutate, Boolean areSambure, Character calitatea, Float cantitateFructoza){
        System.out.printf("%s pe care am gustat-o astazi are culoarea %s si era absolut %s.\n De asemenea, am observat ca acest fruct cantarea %d grame.\n Este %b ca a avut samburi, iar calitatea este %c.\n Folosind cantarul magic, am observat ca avea un gramaj de %f grame de fructoza. \n", nume, culoare, gust, greutate, areSambure, calitatea, cantitateFructoza);
    }
    public void prezentareFruct(){
        nume="cireasa";
        culoare="rosie";
        gust= "delicioasa";
        greutate= 5;
        calitatea = 'A';
        areSambure=true;
        cantitateFructoza=1.0f;

        System.out.printf("%s pe care am gustat-o astazi are culoarea %s si era absolut %s.\n De asemenea, am observat ca acest fruct cantarea %d grame.\n Este %b ca a avut samburi, iar calitatea este %c.\n Folosind cantarul magic, am observat ca avea un gramaj de %f grame de fructoza.\n ", nume, culoare, gust, greutate, areSambure, calitatea, cantitateFructoza);

    }



    //descriere fruct
    //facem un test
    //descriem 6-7 fructe - le parametrizam

}
