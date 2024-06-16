package Obiect;

import org.testng.annotations.Test;

public class SportivTest {

    @Test
    public void testMethod(){

    // instantiem un obiect de tipul sportiv:
        Sportiv Ionut= new Sportiv("Popescu", "Ionut", 10, "M", "Volei", true );
        Ionut.varsta=18; //actualizam varsta
        Ionut.tipSport="Fotbal";
        Ionut.prezentareSportiv();
        Ionut.verificareVasta();

        System.out.println(".................");
        Sportiv Marcel=new Sportiv ("Pop", "Marcel", 16, "M", "Box", false);
        Marcel.prezentareSportiv();
        Marcel.verificareVasta();
        Marcel.marireSalariu(10);

        System.out.println(".................");
        Sportiv Mihai=new Sportiv("Luca", "Mihai", 29, "M", "tenis", true, 15000);
        Mihai.prezentareSportiv();
        Mihai.verificareVasta();
        Mihai.marireSalariu(10);
    }

}
