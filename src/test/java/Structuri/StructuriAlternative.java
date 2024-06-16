package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {
    @Test
    public void metodaTest() {
//        verificNrMaiMare();
//        verificNrMaiMareV2(25);
//        verificNrMaiMareV2(9);
//        verificDacaNrPar(10);
//        verificDacaNrPar(1);
//        verificDacaNrPar(0);
//        verificDacaNrPar(-1);
//        verificDacaNrPar(-4);
        zileSapt(2);
        zileSapt(5);
        zileSapt(7);


    }

    //verificam daca un nr este mai mare decat 10:
    public void verificNrMaiMare() {
        if (15 > 10) {
            System.out.println("Nr 15 este mai mare");
        } else {
            System.out.println("nr nu este mai mare decat 10");
        }
    }

    //verificam daca un nr este mai mare decat 10 - versiunea 2:
    public void verificNrMaiMareV2(Integer nr) {
        if (nr > 10) {
            System.out.println("Nr " + nr + "  este mai mare");
        } else {
            System.out.println("Nr " + nr + " nu este mai mare decat 10");
        }
    }

    // verificam daca un numar este par:
    public void verificDacaNrPar(Integer nr) {
        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul meu este pozitiv " + nr + " si par");
            } else {
                System.out.println("Numarul meu este negativ " + nr + " si impar");
            }
        } else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul meu este pozitiv " + nr + " si par");
            } else {
                System.out.println("Numarul meu este negativ " + nr + " si impar");
            }
        } else {
            System.out.println("Numarul meu egal cu 0");
        }

    }
    // definim zilele saptamanii:
    public void zileSapt(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este Luni");
                break;
            case 2:
                System.out.println("Astazi este Marti");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi");
                break;
            case 5:
                System.out.println("Astazi este Vineri");
                break;
            default:
                System.out.println("S-au terminat zilele");

        }
    }
}






