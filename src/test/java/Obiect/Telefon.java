package Obiect;

import java.util.List;
import java.util.Map;

public class Telefon {

    public String marca;
    public String model;
    public String culoare;
    public String memorie;
    public Integer pret;
    public Integer anAparitie;
    public Map<String, String> specificatiiTehnice;
    public List<String> accesoriiIncluse;
    public Boolean produsResigilat;
    public String observatiiUzura;

    public Telefon(String marca, String model, String culoare, String memorie, Integer pret, Integer anAparitie,
                   Map<String, String> specificatiiTehnice, List<String> accesoriiIncluse, Boolean produsResigilat) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.memorie = memorie;
        this.pret = pret;
        this.anAparitie = anAparitie;
        this.specificatiiTehnice = specificatiiTehnice;
        this.accesoriiIncluse = accesoriiIncluse;
        this.produsResigilat = produsResigilat;
    }

    public Telefon(String marca, String model, String culoare, String memorie, Integer pret,
                   Integer anAparitie, Map<String, String> specificatiiTehnice,
                   List<String> accesoriiIncluse, Boolean produsResigilat, String observatiiUzura) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.memorie = memorie;
        this.pret = pret;
        this.anAparitie = anAparitie;
        this.specificatiiTehnice = specificatiiTehnice;
        this.accesoriiIncluse = accesoriiIncluse;
        this.produsResigilat = produsResigilat;
        this.observatiiUzura = observatiiUzura;
    }

    public void infoTelefon(){
        System.out.println("Marca telefonului este: "+ marca);
        System.out.println("Modelul telefonului este: "+ model);
        System.out.println("Culoarea telefonului este: "+ culoare);
        System.out.println("Memoria telefonului este: "+ memorie);
        System.out.println("Pretul telefonului este: "+ pret);
        System.out.println("Anul aparieiti telefonului este: "+ anAparitie);

        System.out.println("Speficicatiile tehnice ale telefonului sunt: ");
        for (String key : specificatiiTehnice.keySet()) {
            System.out.println(key+ specificatiiTehnice.get(key));
        }

        System.out.println("Accesoriile din interioriul pachetului sunt: ");
        for(Integer i = 0; i < accesoriiIncluse.size(); i++) {
            System.out.println(accesoriiIncluse.get(i));
        }

        if(produsResigilat){
            System.out.println(observatiiUzura);
        } else{
            System.out.println("Telefonul este nou");
        }

    }


}
