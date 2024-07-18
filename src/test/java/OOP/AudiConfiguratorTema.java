package OOP;

import java.util.List;

public class AudiConfiguratorTema extends MasinaConfigurator {

    private String versiune;;
    private String motor;
    private String culoare;
    private String jante;
    private String interior;
    private List<String> echipareOptionalaAudi;
    private Double pretStandard;
    private Double pretFinal;

    public AudiConfiguratorTema(String marca, String model, Integer an, String versiune, String motor, String culoare,
                                String jante, String interior, List<String> echipareOptionalaAudi) {
        super(marca, model, an);
        this.versiune = versiune;
        this.motor = motor;
        this.culoare = culoare;
        this.jante = jante;
        this.interior = interior;
        this.echipareOptionalaAudi = echipareOptionalaAudi;
    }

    public void infoAudi() {
        infoMasina();
        System.out.println("Versiunea masinii este:" + versiune);
        System.out.println("Motorul masinii este:" + motor);
        System.out.println("Culoarea masinii este:" + culoare);
        System.out.println("Modelul de jante ale masinii este:" + jante);
        System.out.println("Interiorul masinii este:" + interior);
        System.out.println("Dotarile optionale ale masinii alese sunt:");
        for (String s : echipareOptionalaAudi) {
            System.out.println(s);
        }
        calculPretInitialAudi();
        calculPretFinalAudi();
    }


    public void calculPretInitialAudi() {
        if( getModel().equals("Audi")){
            if(versiune.equals("e-tron GT PI")){
                pretStandard=128.700;
            }else if (versiune.equals("A1 Sportback")) {
                pretStandard=25.199;
            }else if (versiune.equals("A4 Avant")) {
                pretStandard=40.401;
            }else if(versiune.equals("A4 allroad quattro")) {
                pretStandard=52.500;
            }
        }
        System.out.printf("Pretul standard este: %,.3f",pretStandard);

    }


    public void calculPretFinalAudi() {
        double pretDotariOptionale = 0.000;
        if (getModel().equals("e-tron GT PI")) {
            if (versiune.equals("A4 allroad quattro")) {
                switch (culoare) {
                    case "Alb Arkona uni":
                        pretDotariOptionale += 0;
                        break;
                    case "Gri Daytona perlat":
                        pretDotariOptionale += 1.194;
                        break;
                }
                switch (jante) {
                    case "Jante aliaj design 5 spite duble 21":
                        pretDotariOptionale += 2.726;
                        break;
                    case "Jante aliaj S, spite multiple 20":
                        pretDotariOptionale += 0;
                        break;

                    case "Jante aliaj 5 brate modul Aero 20":
                        pretDotariOptionale += 0.853;
                        break;
                }
                switch (interior) {
                    case "Tapiterie piele fina Nappa perforata":
                        pretDotariOptionale += 0;
                        break;
                    case "Tapiterie combinata design Cascade plus":
                        pretDotariOptionale += 0;
                        break;

                }
            }
        }
        for (String echipament : echipareOptionalaAudi) {
            switch (echipament) {
                case "Cablul de incarcare lung":
                    pretDotariOptionale += 0.092;
                    break;
                case "Carcase oglinzi exterioare carbon":
                    pretDotariOptionale += 0.897;
                    break;
                case "Discuri frana ceramice cu etriere gri":
                    pretDotariOptionale += 9.658;
                    break;
                case "Pachet pentru fumatori":
                    pretDotariOptionale += 0.069;
                    break;
            }
        }
        pretFinal=pretStandard+pretDotariOptionale;
        System.out.printf("Pretul final este: %,.3f", pretFinal);

    }

    public String getVersiune() {
        return versiune;
    }

    public void setVersiune(String versiune) {
        this.versiune = versiune;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getJante() {
        return jante;
    }

    public void setJante(String jante) {
        this.jante = jante;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public List<String> getEchipareOptionalaAudi() {
        return echipareOptionalaAudi;
    }

    public void setEchipareOptionalaAudi(List<String> echipareOptionalaAudi) {
        this.echipareOptionalaAudi = echipareOptionalaAudi;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }
}
