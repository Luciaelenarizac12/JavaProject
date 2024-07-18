package OOP;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator {

    private String versiune;
    private String motor;
    private String culoare;
    private String jante;
    private String interior;
    private List<String> echipamente;
    private List<String> accesorii;
    private Double pretStandard;
    private Double pretFinal;



    public DaciaConfigurator(String marca, String model, Integer an, String versiune,String motor,
                             String culoare,String jante, String interior, List<String> echipamente,List<String> accesorii) {
        super(marca, model, an);
        this.versiune=versiune;
        this.motor=motor;
        this.culoare=culoare;
        this.jante=jante;
        this.interior=interior;
        this.echipamente=echipamente;
        this.accesorii=accesorii;
    }

    public void infoDacia(){
        infoMasina();
        System.out.println("Versiunea masinii este:" + versiune);
        System.out.println("Motorul masinii este:" + motor);
        System.out.println("Culoarea masinii este:" + culoare);
        System.out.println("Jantele masinii sunt:" + jante);
        System.out.println("Interiorul masinii este compus din:" + interior);

        System.out.println("Echipamentele masinii sunt:");
        for (String s : echipamente) {
            System.out.println(s);
        }
        System.out.println("Accesoriile masinii sunt:");
        for (String s : accesorii) {
            System.out.println(s);
        }
        calculPretStandard();
        calculPretFinal();
    }

    //trebuie sa determinam pretul standard al masinii in functie de model
    public void calculPretStandard(){
        if( getModel().equals("Logan")){
            if(versiune.equals("ESSENTIAL")){
                pretStandard=13.500;
            } else if (versiune.equals("EXPRESSION")) {
                pretStandard=14.150;
            }else if (versiune.equals("JOURNEY")) {
                pretStandard=15.250;
            }
            else if (versiune.equals("JOURNEY+")) {
                pretStandard=15.700;
            }
        }

        System.out.printf("Pretul standard este: %,.3f \n", pretStandard);

    }

    public void calculPretFinal(){
        double pretOptiuni=0.000;
        if( getModel().equals("Logan")){
            if(versiune.equals("ESSENTIAL")){
                switch(culoare){
                    case "grey":
                        pretOptiuni+=0.460;
                        break;
                    case "white":
                        pretOptiuni+=0;
                        break;
                }
                switch (jante){
                    case "Standard":
                        pretOptiuni+=2.000;
                        break;
                }
                switch (interior){
                    case "Standard":
                        pretOptiuni+=0;
                        break;
                }

            }
        }
        for (String echipament : echipamente) {
            switch (echipament) {
                case "Pachet Techno":
                    pretOptiuni += 1.000;
                    break;
                case "Pachet Clima":
                    pretOptiuni += 0.750;
                    break;
                case "Pachet Parking":
                    pretOptiuni += 0.500;
                    break;
            }
        }
        for (String accesoriu : accesorii) {
            switch (accesoriu) {
                case "Covorase":
                    pretOptiuni += 0.200;
                    break;
                case "scrumiera":
                    pretOptiuni += 0.150;
                    break;
                case "suport de pahare":
                    pretOptiuni += 0.010;
                    break;
            }
        }
        pretFinal=pretStandard+pretOptiuni;
        System.out.printf("Pretul final este: %,.3f \n", pretFinal);

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

    public List<String> getEchipamente() {
        return echipamente;
    }

    public void setEchipamente(List<String> echipamente) {
        this.echipamente = echipamente;
    }

    public List<String> getAccesorii() {
        return accesorii;
    }

    public void setAccesorii(List<String> accesorii) {
        this.accesorii = accesorii;
    }

}
