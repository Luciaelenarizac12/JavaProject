package OOP;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator {

    public String versiune;
    public String motor;
    public String culoare;
    public String jante;
    public String interior;
    public List<String> echipamente;
    public List<String> accesorii;



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
        for (Integer i=0; i<echipamente.size(); i++){
            System.out.println(echipamente.get(i));
        }
        System.out.println("Accesoriile masinii sunt:");
        for (Integer j=0; j<accesorii.size(); j++){
            System.out.println(accesorii.get(j));
        }
        calculPretStandard();
        calculPretFinal();
    }

    //trebuie sa determinam pretul standard al masinii in functie de model
    public void calculPretStandard(){
        if( model.equals("Logan")){
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

        System.out.printf("Pretul standard este: %,.3f", pretStandard);
        System.out.println();

    }

    public void calculPretFinal(){
        double pretOptiuni=0.000;
        if( model.equals("Logan")){
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
        System.out.printf("Pretul final este: %,.3f", pretFinal);

    }



}
