package OOP;

import java.util.List;

public class VolkswagenConfigurator extends MasinaConfigurator{

    private String linieDeEchipare;
    private String motor;
    private String vopsea;
    private String roti;
    private String tapiterie;
    private List<String> dotariOptionale;
    private Double pretStandard;
    private Double pretFinal;

    public VolkswagenConfigurator(String marca, String model, Integer an,String linieDeEchipare,
                                  String motor,String vopsea,String roti,String tapiterie, List<String> dotariOptionale) {

        super(marca, model, an);
        this.linieDeEchipare=linieDeEchipare;
        this.motor=motor;
        this.vopsea=vopsea;
        this.roti=roti;
        this.tapiterie=tapiterie;
        this.dotariOptionale=dotariOptionale;

    }
    public void infoVolkswagen(){
        infoMasina();
        System.out.println("Linia de echipare a masinii este:" + linieDeEchipare);
        System.out.println("Motorul masinii este:" + motor);
        System.out.println("Vopseaua masinii este:" + vopsea);
        System.out.println("Rotile masinii sunt:" + roti);
        System.out.println("Tapiteria masinii este:" + tapiterie);
        System.out.println("Dotarile optionale masinii este:" );
        for (Integer t=0; t<dotariOptionale.size(); t++){
            System.out.println(dotariOptionale.get(t));
        }

        calculPretStandardVolkswagen();
        calculPretFinal();

    }

    public void calculPretStandardVolkswagen(){
        if( getModel().equals("Polo")){
            if(linieDeEchipare.equals("Life")){
                pretStandard=20.194;
            } else if (linieDeEchipare.equals("Advanced")) {
                pretStandard=20.675;
            } else if (linieDeEchipare.equals("Style")) {
                pretStandard=21.088;
            } else if (linieDeEchipare.equals("R-Line")) {
                pretStandard=21.601;
            }
        }

        System.out.printf("Pretul standard al masinii este: %,.3f \n", pretStandard);


    }

    public void calculPretFinal() {
        double pretOptiuniPolo = 0.000;
        if (getModel().equals("Polo")) {
            if (linieDeEchipare.equals("R-Line")) {
                switch (motor) {
                    case "Polo R-Line 1.0 TSI":
                        pretOptiuniPolo += 0;
                        break;
                    case "Polo R-Line 1.0 TSI DSG":
                        pretOptiuniPolo += 1.922;
                        break;
                }
                switch (vopsea) {
                    case "Gri":
                        pretOptiuniPolo += 0;
                        break;
                }
                switch (roti) {
                    case "Jante aliaj -Bergamo- 7Jx17,negre":
                        pretOptiuniPolo += 0.326;
                        break;
                }
                switch (tapiterie) {
                    case "Tapiterie standard":
                        pretOptiuniPolo += 0;
                        break;
                }

            }
        }
        for (String dotare : dotariOptionale) {
            switch (dotare) {
                case "Pachet Comfort":
                    pretOptiuniPolo += 2.000;
                    break;
                case "Trapa de sticla panoramica":
                    pretOptiuniPolo += 1.750;
                    break;
                case "Alarma antifurt - imobilizator":
                    pretOptiuniPolo += 0.200;
                    break;
                case "Keyless Access":
                    pretOptiuniPolo += 0.700;
                    break;

            }
        }
        pretFinal = pretStandard + pretOptiuniPolo;
        System.out.printf("Pretul final este: %,.3f \n", pretFinal);
    }

    public String getLinieDeEchipare() {
        return linieDeEchipare;
    }

    public void setLinieDeEchipare(String linieDeEchipare) {
        this.linieDeEchipare = linieDeEchipare;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getVopsea() {
        return vopsea;
    }

    public void setVopsea(String vopsea) {
        this.vopsea = vopsea;
    }

    public String getRoti() {
        return roti;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public String getTapiterie() {
        return tapiterie;
    }

    public void setTapiterie(String tapiterie) {
        this.tapiterie = tapiterie;
    }

    public List<String> getDotariOptionale() {
        return dotariOptionale;
    }

    public void setDotariOptionale(List<String> dotariOptionale) {
        this.dotariOptionale = dotariOptionale;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }
}
