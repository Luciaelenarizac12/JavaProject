package AbstractizareRestaurant;

public class RSpecializatCuSpecificNational extends Restaurant implements RSpecializatInterface,CuSpecificNationalInterface{
    public RSpecializatCuSpecificNational(String numeRestaurant, String adresa, String meniu, String tipRestaurant, Boolean delivery) {
        super(numeRestaurant, adresa, meniu, tipRestaurant, delivery);
    }

    @Override
    public void oferaAmbiantaCulturala() {

    }

    @Override
    public void oferaExperientaCulturala() {

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
