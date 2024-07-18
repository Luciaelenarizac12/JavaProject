package OOP;

public class MasinaConfigurator {

    private String marca;
    private String model;
    private Integer an;


    public MasinaConfigurator(String marca, String model, Integer an) {
        this.marca = marca;
        this.model = model;
        this.an = an;
    }

    //OOP=programare orientata pe obiecte
    //OOP=4 principii-> Mostenire, Incapsulare, Polimorfism, Abstractizare
    //Mostenirea = conceptul prin care o clasa mosteneste o alta clasa;
    //Clasa care este mostenita=Parinte
    //Clasa care mosteneste = Copil
    // In java putem mosteni o singura clasa
    // Mostenirea se reaclizeaza cu cuvantul "extends"
    // Cand copilul mosteneste parintele, copilul trebuie apeleze constructorul din parinte;
    // Copilul va avea acces la proprietatile/metodele din clasa parinte (daca se foloseste public/protected/default)
    // Ca sa apelam constructorul din parinte in copil se foloseste keyword ul "super"

    //Incapsularea = conceptul prin care putem sa setam anumite restrictii de vizibilitate pentru proprietati/metode


    public void infoMasina(){
        System.out.println("Marca masinii este:" + marca);
        System.out.println("Modelul masinii este:" + model);
        System.out.println("An masinii este:" + an);


    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public Integer getAn() {
        return an;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

}
