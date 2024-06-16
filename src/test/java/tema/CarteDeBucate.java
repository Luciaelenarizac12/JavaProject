package tema;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarteDeBucate {

    @Test
    public void cuprinsReteteTest() {
//        tortCuFrisca();
        tartaDeMangoCuLamaie();


    }

    public void tortCuFrisca() {
        // Timp de preparare - minute:
        int timpDePreparare = 120;

        //definimm rand pe rand pasii si ingredientele pentru tort:
        Map<String, List<String>> ingrediente = new HashMap<>();

        List<String> ingredienteCrema = new ArrayList<>();
        ingredienteCrema.add("mascarpone");
        ingredienteCrema.add("frisca lichida");
        ingredienteCrema.add("intaritor de frisca");
        ingredienteCrema.add("gelatina");
        ingredienteCrema.add("galbenusuri");
        ingredienteCrema.add("zahar");
        ingredienteCrema.add("Amaretto");

        List<String> ingredienteDecor = new ArrayList<>();
        ingredienteDecor.add("piscoturi");
        ingredienteDecor.add("pudra de cacao");

        ingrediente.put("Crema", ingredienteCrema);
        ingrediente.put("Decor", ingredienteDecor);


        // Pașiii de preparare:
        List<String> pasi = new ArrayList<>();
        pasi.add("1. Înmoaie gelatina în apă rece.");
        pasi.add("2. Amestecă gălbenușurile cu zahărul până devin cremoase.");
        pasi.add("3. Adaugă Amaretto și amestecă.");
        pasi.add("4. Încălzește amestecul la bain-marie până se îngroașă.");
        pasi.add("5. Adaugă gelatina și amestecă până se dizolvă complet.");
        pasi.add("6. Lasă să se răcească la temperatura camerei.");
        pasi.add("7. Bate crema de mascarpone până devine cremoasa.");
        pasi.add("8. Bate frișca lichidă împreună cu întăritorul de frișcă până se întărește.");
        pasi.add("9. Încorporează frișca în mascarpone, apoi adaugă amestecul de gălbenușuri.");
        pasi.add("10. Înmoaie pișcoturile în Amaretto și așază-le pe fundul formei de tort.");
        pasi.add("11. Toarnă crema deasupra și nivelează.");
        pasi.add("12. Lasă tortul la frigider pentru cel puțin 4 ore sau peste noapte.");
        pasi.add("13. Presară pudra de cacao deasupra înainte de servire.");

        // Afisarea retetei:
        System.out.println("Reteta Tort cu frisca:");
        for (String categorie : ingrediente.keySet()) {
            System.out.println("\nIngrediente pentru " + categorie.toLowerCase());
            for (String ingredient : ingrediente.get(categorie)) {
                System.out.println("- " + ingredient);
            }
        }

        System.out.println("\nTimp de preparare: " + timpDePreparare + " minute");

        System.out.println("\nPasi de preparare:");
        for (String pas : pasi) {
            System.out.println(pas);
        }

    }

    public void tartaDeMangoCuLamaie(){
        int timpDePreparare= 30;
        Map<String, List<String>> ingrediente = new HashMap<>();

        List<String> blat = new ArrayList<>();
        blat.add("biscuiti cu cocos");
        blat.add("unt");

        List<String> crema = new ArrayList<>();
        crema.add("jeleu cu aroma de lamaie");
        crema.add("zahar");
        crema.add("crema de branza");
        crema.add("zahar vanilat");
        crema.add("zeama de lamaie");
        crema.add("mango");
        crema.add("frisca");


        List<String> ornat = new ArrayList<>();
        ornat.add("nuca de cocos");
        ornat.add("felii de mango");

        ingrediente.put("Pentru blat:", blat);
        ingrediente.put("Pentru crema:", crema);
        ingrediente.put("Pentru ornat:", ornat);

        List<String> preparare = new ArrayList<>();
        preparare.add("1. Pentru blat, zdorbiti biscuitii digestivi si topiti untul, amestecandu-le ulterior.");
        preparare.add("2. Intindeti totul in mod egal pe baza detasabila a unei forme si presati.");
        preparare.add("3. Lasati blatul sa stea la rece timp de o ora.");
        preparare.add("4. Pentru crema, amsestecati pudra de jeleu cu 50 g de zahar si 250 ml de apa rece, incalziti amestecul amestecand constant (nu dati in clocot!");
        preparare.add("5. Turnati amestecul intr-un bol si il lasati sa se raceasca.");
        preparare.add("6. Puneti crema de branza, zaharul ramas, zaharul vanilat si zeama de lamaie intr-un bol si mixati crema pana se omogenizeaza.");
        preparare.add("7. Curatati mango si taiati felii subtiri.");
        preparare.add("8. Bateti frisca pana se intareste.");
        preparare.add("9. Cand jeleul incepe sa se gelifieze, incorporati mai intai crema de branza si apoi frisca.");
        preparare.add("10. Distribuiti 1/3 din crema peste bla, puneti deasupra feliile de mango, apoi intindeti deasupra crema ramasa.");
        preparare.add("11. Lasati tarta sa stea la rece timp de 4-5 ore. Scoateti tarta din forma si apoi puteti sa o ornati cu felii de manco si nuca de cocos.");

// Afisarea retetei:
        System.out.println("Tarta de mango cu lamaie:");
        for (String categorie : ingrediente.keySet()) {
            System.out.println("\nIngrediente pentru " + categorie.toLowerCase());
            for (String ingredient : ingrediente.get(categorie)) {
                System.out.println("- " + ingredient);
            }
        }

        System.out.println("\nTimp de preparare: " + timpDePreparare + " minute");

        System.out.println("\nPasi de preparare:");
        for (String pas : preparare) {
            System.out.println(pas);
        }

    }
}
