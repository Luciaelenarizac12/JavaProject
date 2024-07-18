package OOP;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class OOPTestPrimaTemaMostenirea {

    @Test
    public void testMethod(){
        System.out.println("--tema1---definim 1 obiect Dacia");

        List<String> echipamenteSandero = Arrays.asList("Aer conditionat cu reglaj manual", "Roata de rezerva",
                "Media Display:radio, ecran 8", "Bluetooth", "4 difuzoare");
        List<String> accesoriiSandero = Arrays.asList("Alarmă perimetrică şi volumetrică cu modul anti-ridicare", "Apărători de noroi spate",
                "Bare de portbagaj pavilion din aluminiu pe bare longitudinale");

        DaciaConfigurator Sandero= new DaciaConfigurator("Dacia", "Sandero", 2021,
                "City","SCe 65", "negru", "Jante otel 15 - design Elma", "Tapiterie textila specifica -Essential",echipamenteSandero,accesoriiSandero);
        Sandero.infoDacia();

        System.out.println("-----------2 obiecte Volskwagen---------------");
        System.out.println("----------Primul obiect---------------");

        List<String> dotariOptionaleTiguan = Arrays.asList("Pachet Comfort","Carlig de remorcare", "Aer conditionat- Climatronic -cu reglaj", "App-Connect wireless",
                "Plasa bagaje", "Suport schiuri si placa snowboard");

        VolkswagenConfigurator Tiguan= new VolkswagenConfigurator("Volskwagen", "Tiguan", 2024, "Base",
                "TDI DSG", "Verde (cipressino green metallic)", "Jante aliaj usor - Bari - 7J x 17", "stofa",dotariOptionaleTiguan);
        Tiguan.infoVolkswagen();


        System.out.println("----------Al doilea obiect---------------");
        List<String> dotariOptionaleCaddy = Arrays.asList("Pachet Comfort","Pachet Asistenta Plus", "Usa culisanta dreapta in spatiul", "App-Connect wireless",
                "Alarma antiefractie cu Back-Up-Horn", "Baterie intarita");

        VolkswagenConfigurator Caddy= new VolkswagenConfigurator("Volskwagen", "CaddyStyle", 2024, "Style",
                "1.5 TSI 85 kW", "Rosu Fortana metalizat", "Jante din aliaj -Colombo- 6,5J x 17",
                "Tapiterie microfibra Artvelours",dotariOptionaleCaddy);
        Caddy.infoVolkswagen();







    }
}
