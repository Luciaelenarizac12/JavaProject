package variabilaMetoda;


import org.testng.annotations.Test;

public class Masina {
    public String marca;
    public String tip;
    public Float pret;
    public String model;
    public Integer an;
    public Boolean esteDecapotabila;
    public Double greutate;

    @Test
    public void metodaTest(){
        afisareMasina();
        System.out.println("===Exemplu 2===");
        afisareOriceMasina("BMW","Shalala",450.0f, 2023,true, 125.0);
        afisareOriceMasina("Dacia", "Z", 25.0f, 2015, false, 50.0);

    }
    //Descriere masina:
    public void afisareMasina(){
        marca="Audi";
        model="Benzina";
        an=2024;
        esteDecapotabila=true;
        greutate=20.0;
        System.out.println("Marca masinii este "+ marca +".");
        System.out.println("Modelul acesteia este "+ model +".");
        System.out.println("Anul fabricatiei este "+ an +".");
        System.out.println("Este masina decapotabila "+ esteDecapotabila +".");
        System.out.println("Greutatea acesteia este "+ greutate +".");

    }
    //Parametrizam.Descriem orice masina:
    public void afisareOriceMasina(String marca, String model, Float pret, Integer an,Boolean esteDecapotabila, Double greutate ){

        System.out.println("Marca masinii este "+ marca +".");
        System.out.println("Modelul acesteia este "+ model +".");
        System.out.println("Pretul acesteia este "+ pret +".");
        System.out.println("Anul fabricatiei este "+ an +".");
        System.out.println("Este masina decapotabila "+ esteDecapotabila +".");
        System.out.println("Greutatea acesteia este "+ greutate +".");

    }

}
