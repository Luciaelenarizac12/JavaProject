package AbstractizareIterfata;

public class Angajat extends Persoana implements AngajatInterface{

    public Angajat(String nume, String prenume, Integer varsta, Double inaltime, Character gen) {
        super(nume, prenume, varsta, inaltime, gen);
    }


    @Override
    public void mergemLaServiciu() {

    }

    @Override
    public void lucreaza() {

    }

    @Override
    public void beaCafea() {

    }

    @Override
    public void pleacaAcasa() {

    }

    @Override
    public void mananca() {

    }

    @Override
    public void doarme() {

    }

    @Override
    public void iaPauza() {

    }

    @Override
    public void iaSalariu() {

    }
}
