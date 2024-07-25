package AbstractizareIterfata;

public class Student extends Persoana implements StudentInterface{
    public Student(String nume, String prenume, Integer varsta, Double inaltime, Character gen) {
        super(nume, prenume, varsta, inaltime, gen);
    }

    @Override
    public void mergeLaCursuri() {

    }

    @Override
    public void invata() {

    }

    @Override
    public void mergeLaBiblioteca() {

    }

    @Override
    public void mergeLaExamene() {

    }

    @Override
    public void mergeInClub() {

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
