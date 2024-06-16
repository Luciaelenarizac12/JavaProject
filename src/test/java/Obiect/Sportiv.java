package Obiect;

public class Sportiv {

    public String nume;
    public String prenume;
    public Integer varsta;
    public String sex;
    public String tipSport;
    public Boolean teamEvent;
    public Integer salariu;

//un obiect se poate defini in orice clasa din orice pachet
//in momentul in care instantiem un obiect putem avea acces la toate variabilele/metodele din clasa

//    //constructor facut manual
//    public Sportiv(String nume, String prenume, Integer varsta, String sex,
//                   String tipSport, Boolean teamEvent){
//        this.nume=nume;
//        this.prenume=prenume;
//        this.varsta=varsta;
//        this.sex=sex;
//        this.tipSport=tipSport;
//        this.teamEvent=teamEvent;
//    }

    //constructor -generare automata-> dam click dreapta-> generate -> constructor:


    public Sportiv(String nume, String prenume, Integer varsta, String sex, String tipSport, Boolean teamEvent) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.tipSport = tipSport;
        this.teamEvent = teamEvent;
    }

    public Sportiv(String nume, String prenume, Integer varsta, String sex, String tipSport, Boolean teamEvent, Integer salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.tipSport = tipSport;
        this.teamEvent = teamEvent;
        this.salariu = salariu;
    }

    public void prezentareSportiv(){
        System.out.println("Numele sportivului este "+nume);
        System.out.println("Prenumele sportivului este "+prenume);
        System.out.println("Varsta sportivului este "+varsta);
        System.out.println("Sex-ul sportivului este "+sex);
        System.out.println("Sportul pe care il practica este " +tipSport);
        System.out.println("Este "+teamEvent+" ca sportivul nostru lucreaza in echipa");
        if(salariu!= null){
        System.out.println("Salariul lui " +prenume+" este " + salariu);}
    }

    public void verificareVasta(){
        if (varsta>=18){
            System.out.println(nume+" "+prenume+" este major");
        }else{
            System.out.println(nume+" "+prenume+" este minor");
        }
    }

    public void marireSalariu(Integer procent){
        if (salariu != null){
            Integer marire= (salariu *procent)/100;
            salariu= salariu + marire;
            System.out.println("Noul salariu este: "+salariu);}
        else{
            System.out.println("Sportivul nu are salariu");
        }

    }


}
