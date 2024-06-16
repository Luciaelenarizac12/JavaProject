package multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {

    @Test
    public void metodaTest() {
//        afisareColegi();
//        afisareColegi2();
//        obiecteMap();
        obiecteMapTari();

    }

    //Afisam numele colegilor de la curs - Arrays
    public void afisareColegi() {
        String[] colegi = new String[6];
        colegi[0] = "Larisa";
        colegi[1] = "Robert";
        colegi[2] = "Daniel";
        colegi[3] = "Vlad";
        colegi[4] = "Corina";
        colegi[4] = "Alex";

        for (Integer i = 0; i < colegi.length; i++) {
            System.out.println("Numele cursantului este " + colegi[i]);

        }
    }

    //List:
    public void afisareColegi2() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Lucia");
        colegi.add("Marius");
        colegi.add("Andrei");
        colegi.add("Corina");
        colegi.add("Alex");

        for (int i = 0; i < colegi.size(); i++) {
            System.out.println("Numele cursantului este:" + colegi.get(i));

        }

    }

    //key-value:
    public void obiecteMap() {
        Map<String, String> obiecte = new HashMap<>();
        obiecte.put("Fruct", "Mar");
        obiecte.put("Fruct", "Para");
        obiecte.put("Masina", "Porche");
        obiecte.put("Electrocasnice", "Telefon");
        obiecte.put("Limbaj", "Java");
        for (String key : obiecte.keySet()) {
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + obiecte.get(key));
        }


    }

    //afisam cateva tari cu orasele aferente:
    public void obiecteMapTari() {
        Map<String,List<String>> tari = new HashMap<>();
        List<String> oraseRomania = new ArrayList<String>();
        oraseRomania.add("Iasi");
        oraseRomania.add("Cluj");
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Brasov");

        List<String> oraseItalia = new ArrayList<String>();
        oraseItalia.add("Bologna");
        oraseItalia.add("Roma");
        oraseItalia.add("Naples");
        oraseItalia.add("Florence");

        List<String> oraseSpania = new ArrayList<String>();
        oraseSpania.add("Madrid");
        oraseSpania.add("Toledo");
        oraseSpania.add("Ciudad Real");
        oraseSpania.add("Valencia");
        oraseSpania.add("Murcia");
        oraseSpania.add("Zaragoza");
        oraseSpania.add("Barcelona");

        tari.put("Romania", oraseRomania);
        tari.put("Italia", oraseItalia);
        tari.put("Spania", oraseSpania);

        for (String key : tari.keySet()) {
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " + tari.get(key));
        }


    }

}
