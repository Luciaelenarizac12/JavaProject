package valueReferenceType;

public class Curs {

    private String descriere;
    private String titlu;
    private Integer nrCursanti;

    public Curs(String descriere, String titlu, Integer nrCursanti) {
        this.descriere = descriere;
        this.titlu = titlu;
        this.nrCursanti = nrCursanti;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Integer getNrCursanti() {
        return nrCursanti;
    }

    public void setNrCursanti(Integer nrCursanti) {
        this.nrCursanti = nrCursanti;
    }

    public void prezentareCurs(){
        System.out.println("Descrierea este"+descriere);
        System.out.println("Titlul este"+titlu);
        System.out.println("Nr de cursanti este"+nrCursanti);

    }
}
