package tema;

import java.util.List;

public class TemaObiectMasina {
    public String marca;
    public String model;
    public String tipCaroserie;
    public Integer pret;
    public Integer kilometraj;
    public String combustibil;
    public String stareTehnica;
    public List<String> dotari;
    public List<String> tapiterie;
    public Boolean eligibiFinantare;
    public String mesajAutomat;
    public Integer capacitateCilindrica;


    public TemaObiectMasina(String marca, String model, String tipCaroserie, Integer pret, Integer kilometraj,
                            String combustibil, String stareTehnica, List<String> dotari, List<String> tapiterie,
                            Boolean eligibiFinantare, String mesajAutomat) {
        this.marca = marca;
        this.model = model;
        this.tipCaroserie = tipCaroserie;
        this.pret = pret;
        this.kilometraj = kilometraj;
        this.combustibil = combustibil;
        this.stareTehnica = stareTehnica;
        this.dotari = dotari;
        this.tapiterie = tapiterie;
        this.eligibiFinantare = eligibiFinantare;
        this.mesajAutomat = mesajAutomat;
    }

    public TemaObiectMasina(String marca, String model, String tipCaroserie, Integer pret, Integer kilometraj, String combustibil, String stareTehnica,
                            List<String> dotari, List<String> tapiterie,
                            Boolean eligibiFinantare, String mesajAutomat, Integer capacitateCilindrica) {
        this.marca = marca;
        this.model = model;
        this.tipCaroserie = tipCaroserie;
        this.pret = pret;
        this.kilometraj = kilometraj;
        this.combustibil = combustibil;
        this.stareTehnica = stareTehnica;
        this.dotari = dotari;
        this.tapiterie = tapiterie;
        this.eligibiFinantare = eligibiFinantare;
        this.mesajAutomat = mesajAutomat;
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public void prezentareMasina() {
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Tipul caroseriei masinii este: " + tipCaroserie);
        System.out.println("Pretul masinii este: " + pret);
        System.out.println("Kilometrajul masinii este: " + kilometraj);
        System.out.println("Masina functioneaza pe: " + combustibil);
        System.out.println("Starea tehnica a masinii este: " + stareTehnica);

        System.out.println("In dotarile masinii intra: ");
        for (String dotare : dotari) {
            System.out.println(dotare);
        }

        System.out.println("La capitolul tapiterie, masina este incorporata cu: ");
        for (String tapit : tapiterie) {
            System.out.println(tapit);
        }

        if (eligibiFinantare) {
            System.out.println("Felicitari! Sunteti eligibil pentru incheierea contractului!");
        } else {
            System.out.println(mesajAutomat);
        }
    }

    public void impozitAutoturism() {
        if (capacitateCilindrica != null) {
            if (capacitateCilindrica >= 1001 && capacitateCilindrica <= 1200) {
                System.out.println("Impozitul platit de masina in cauza este de 54 lei.");
            } else if (capacitateCilindrica >= 1201 && capacitateCilindrica <= 1400) {
                System.out.println("Impozitul platit de masina in cauza este de 63 lei.");
            } else if (capacitateCilindrica >= 1401 && capacitateCilindrica <= 1600) {
                System.out.println("Impozitul platit de masina in cauza este de 72 lei.");
            } else if (capacitateCilindrica >= 1601 && capacitateCilindrica <= 1800) {
                System.out.println("Impozitul platit de masina in cauza este de 216 lei.");
            } else if (capacitateCilindrica >= 1801 && capacitateCilindrica <= 2000) {
                System.out.println("Impozitul platit de masina in cauza este de 240 lei.");
            } else if (capacitateCilindrica >= 2001 && capacitateCilindrica <= 3000) {
                System.out.println("Impozitul platit de masina in cauza este de 63 lei.");
            } else {
                System.out.println("Taxa pentru capacitate cilindrică între 2001 cmc și 2600 cmc crește la 92 lei pentru fiecare 200 cmc. " +
                        "Impozitul auto pentru un motor cu capacitate cilindrică între 2600 cmc și 3000 cmc va crește cu 186 de lei pentru fiecare 200 cmc. " +
                        "Pentru autoturismele cu o capacitate cilindrică a motorului între 3000 cmc și 4000 cmc, impozitul va crește cu 374 lei pentru fiecare 200 cmc.");
            }
        } else {
            System.out.println("Capacitatea cilindrica nu este specificata.");
        }
    }
}
