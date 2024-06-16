package Obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonTest {

    @Test
    public void metodaTest() {
        System.out.println("==== Telefon: Iphone16: ====");
        Map<String, String> specificatiiTehniceIphone = new HashMap<>();
        specificatiiTehniceIphone.put("Model procesor:", "Apple a fjdnf");
        specificatiiTehniceIphone.put("Sistem de operare:", "kkk");
        specificatiiTehniceIphone.put("Memorie RAM", "16 GB");
        specificatiiTehniceIphone.put("Rezolutie vide:", "nfnjanfsd");
        specificatiiTehniceIphone.put("Tip display:", "fjksdnfjksd");
        specificatiiTehniceIphone.put("Porturi:", "fsdfsd");


        List<String> accesorii = new ArrayList<String>();
        accesorii.add("Telefon");
        accesorii.add("Casti");
        accesorii.add("Incarcator USB");
        accesorii.add("Husa telefon");
        accesorii.add("Baterie externa");

        Telefon Iphone16 = new Telefon("Iphone", "15", "Rosu",
                "65 GB", 4500, 2023, specificatiiTehniceIphone, accesorii, false);
        Iphone16.infoTelefon();

        System.out.println("==== Telefon: Samsung21: ====");
        Map<String, String> specificatiiTehniceSamsung = new HashMap<>();
        specificatiiTehniceSamsung.put("Model procesor:", "Samsung a fjdnf");
        specificatiiTehniceSamsung.put("Sistem de operare:", "dddd");
        specificatiiTehniceSamsung.put("Memorie RAM", "12 GB");
        specificatiiTehniceSamsung.put("Rezolutie vide:", "www");
        specificatiiTehniceSamsung.put("Tip display:", "dddd");
        specificatiiTehniceSamsung.put("Porturi:", "ffsdfs");


        List<String> accesoriiS = new ArrayList<String>();
        accesoriiS.add("Telefon");
        accesoriiS.add("Casti");
        accesoriiS.add("Incarcator USB");
        accesoriiS.add("suport telefon");

        Telefon Samsung21 = new Telefon("Samsung", "21", "Verde", "125 GB",
                2100, 2015, specificatiiTehniceSamsung, accesoriiS, false);
        Samsung21.infoTelefon();


        System.out.println("==== Telefon: BlackBerry: ====");
        Map<String, String> specificatiiTehniceBlackBerry = new HashMap<>();
        specificatiiTehniceBlackBerry.put("Model procesor:", "BlackBerry ffff");
        specificatiiTehniceBlackBerry.put("Sistem de operare:", "2ffs");
        specificatiiTehniceBlackBerry.put("Memorie RAM", "134 GB");
        specificatiiTehniceBlackBerry.put("Rezolutie vide:", "ffgfdgsdfs");
        specificatiiTehniceBlackBerry.put("Tip display:", "12344ssss");
        specificatiiTehniceBlackBerry.put("Porturi:", "usb c");


        List<String> accesoriiB = new ArrayList<String>();
        accesoriiB.add("Telefon");
        accesoriiB.add("ceva");
        accesoriiB.add("Folie gorilla glass");


        Telefon Blackberry = new Telefon("Blackberry", "10", "Negru", "165 GB", 3000, 2021,
                specificatiiTehniceBlackBerry, accesoriiB, true, "Zgarieturi fine pe spate");
        Blackberry.infoTelefon();


    }

}
