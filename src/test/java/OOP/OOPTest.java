package OOP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OOPTest {




    @Test
    public void testMethod(){
        // dam o comanda de o masina Dacia:
        List<String> echipamenteLogan = Arrays.asList("Pachet Techno", "Pachet Clima", "Pachet Parking");
        List<String> accesoriiLogan = Arrays.asList("Covorase", "scrumiera", "suport de pahare");

        DaciaConfigurator Logan= new DaciaConfigurator("Dacia", "Logan", 2024,
                "ESSENTIAL","TCe 90 MT5", "grey", "Standard", "Standard",echipamenteLogan,accesoriiLogan);
        Logan.infoDacia();

        System.out.println("--------------------------");
//
//        //dam o comanda de o masina Volskwagen:
//        List<String> dotariOptionalePolo = Arrays.asList("Pachet Comfort","Trapa de sticla panoramica", "Alarma antifurt - imobilizator", "Keyless Access");
//
//        VolskwagenConfigurator Polo= new VolskwagenConfigurator("Volskwagen", "Polo", 2023, "Advanced",
//                "Polo life 1.0", "Gri", "Roti15", "stofa",dotariOptionalePolo);
//        Polo.infoVolskwagen();


    }



}
