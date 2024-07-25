package TemaNationalaFotbalAbstractizarea;

public class Fotbalist {
    private String nume;
    private String prenume;
    private Integer varsta;
    private String gen;
    private Integer porecla;

    public Fotbalist(String nume, String prenume, Integer varsta, String gen, Integer porecla) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
        this.porecla = porecla;
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

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public Integer getPorecla() {
        return porecla;
    }

    public void setPorecla(Integer porecla) {
        this.porecla = porecla;
    }
}
