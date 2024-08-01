package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test

    public void testMethod(){

        Elev Stefan =new Elev("Stefan", "Popa", 18);
        Stefan.prezentare();

        System.out.println("=====================");
        Elev Maria=new Elev("Maria", "Dumitrescu", 16);
        Maria.prezentare();

    }
}
