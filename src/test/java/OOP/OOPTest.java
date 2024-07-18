package OOP;

import org.testng.annotations.Test;

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


        //dam o comanda de o masina Volskwagen:
        List<String> dotariOptionalePolo = Arrays.asList("Pachet Comfort","Trapa de sticla panoramica", "Alarma antifurt - imobilizator", "Keyless Access");

        VolkswagenConfigurator Polo= new VolkswagenConfigurator("Volskwagen", "Polo", 2023, "R-Line",
                "Polo R-Line 1.0 TSI DSG", "Gri", "Jante aliaj -Bergamo- 7Jx17,negre", "Tapiterie standard",dotariOptionalePolo);
        Polo.infoVolkswagen();



        System.out.println("--------------------------");

        List<String> echipareAudi =Arrays.asList("Cablul de incarcare lung", "Carcase oglinzi exterioare carbon", "Discuri frana ceramice cu etriere gri","Pachet pentru fumatori" );

        AudiConfiguratorTema eTron=new AudiConfiguratorTema("Audi", "e-tron GT PI", 2024, "A4 allroad quattro",
                "S e-tron GT quattro 435 kW / 592 CP", "Gri Daytona perlat", "Jante aliaj design 5 spite duble 21", "Tapiterie piele fina Nappa perforata", echipareAudi);
        eTron.infoAudi();

        System.out.println("--------------------------");


    }



}
