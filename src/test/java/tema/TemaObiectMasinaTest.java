package tema;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TemaObiectMasinaTest {

    @Test
    public void metodaTest() {

        System.out.println("==== Masina: Bugatti: ====");
        List<String> dotariBugatti = new ArrayList<>();
        dotariBugatti.add("Apple CarPlay");
        dotariBugatti.add("Port USB");
        dotariBugatti.add("Bluetooth");
        dotariBugatti.add("Conexiune internet");

        List<String> tapiterieBugatti = new ArrayList<>();
        tapiterieBugatti.add("Tapiterie piele");
        tapiterieBugatti.add("Scaun sofer ajustabil electric");
        tapiterieBugatti.add("Scaun cu memorie");
        tapiterieBugatti.add("Cotiera");

        TemaObiectMasina bugatti = new TemaObiectMasina("Bugatti", "Chiron", "Cabrio", 25000,
                100000, "Benzina", "Noua", dotariBugatti, tapiterieBugatti,
                true, "Felicitari! Masina ta este eligibila pentru finantare!", 4000);

        bugatti.prezentareMasina();
        bugatti.impozitAutoturism();

        System.out.println("==== Masina: Cadillac: ====");
        List<String> dotariCadillac = new ArrayList<>();
        dotariCadillac.add("Android Auto");
        dotariCadillac.add("Sistem navigatie");
        dotariCadillac.add("Wireless charging");
        dotariCadillac.add("Conexiune internet");

        List<String> tapiterieCadillac = new ArrayList<>();
        tapiterieCadillac.add("Tapiterie mixta piele-textil");
        tapiterieCadillac.add("Functie incarcare rapida");
        tapiterieCadillac.add("Volan sport");
        tapiterieCadillac.add("Keyless entry");
        tapiterieCadillac.add("Parbriz cu incalzire");


        TemaObiectMasina cadillac = new TemaObiectMasina("Cadillac", "ATS", "Combi", 450000,
                90000, "Diesel", "Fara avarii", dotariCadillac, tapiterieCadillac, false, "Trebuie sa iti cauti alt job!", 2300);

        cadillac.prezentareMasina();
        cadillac.impozitAutoturism();
    }
}
