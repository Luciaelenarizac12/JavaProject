package AbstractizareRestaurant;

public class CuSpecificNational extends Restaurant implements RSpecializatInterface{
    public CuSpecificNational(String numeRestaurant, String adresa, String meniu, String tipRestaurant, Boolean delivery) {
        super(numeRestaurant, adresa, meniu, tipRestaurant, delivery);
    }

    @Override
    public void oferaMeniuRestrans() {

    }

    @Override
    public void oferaAmbiantaTematica() {

    }

    @Override
    public void primesteClientelaSpecifica() {

    }

    @Override
    public void serviciiDeBaza() {

    }

    @Override
    public void ambiantaAtenta() {

    }

    @Override
    public void oferaCalitateaProduselor() {

    }
}
