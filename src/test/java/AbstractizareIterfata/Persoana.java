package AbstractizareIterfata;

public class Persoana {
    private String nume;
    private String prenume;
    private Integer varsta;
    private Double inaltime;
    private Character gen;

    public Persoana(String nume, String prenume, Integer varsta, Double inaltime, Character gen) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.gen = gen;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Double getInaltime() {
        return inaltime;
    }

    public void setInaltime(Double inaltime) {
        this.inaltime = inaltime;
    }

    public Character getGen() {
        return gen;
    }

    public void setGen(Character gen) {
        this.gen = gen;
    }
}
