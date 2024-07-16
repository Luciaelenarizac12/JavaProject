package OOP;

import java.util.List;

public class VolskwagenConfigurator extends MasinaConfigurator{

    public String linieDeEchipare;
    public String motor;
    public String vopsea;
    public String roti;
    public String tapiterie;
    public List<String> dotariOptionale;

    public VolskwagenConfigurator(String marca, String model, Integer an,String linieDeEchipare,
                                  String motor,String vopsea,String roti,String tapiterie, List<String> dotariOptionale) {

        super(marca, model, an);
        this.linieDeEchipare=linieDeEchipare;
        this.motor=motor;
        this.vopsea=vopsea;
        this.roti=roti;
        this.tapiterie=tapiterie;
        this.dotariOptionale=dotariOptionale;

    }
    public void infoVolskwagen(){
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


    }
}
