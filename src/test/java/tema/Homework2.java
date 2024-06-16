package tema;

import org.testng.annotations.Test;

public class Homework2 {

    @Test
    public void Homework2Test() {
//        cerinta1();
//        cerinta2();
//        cerinta3(20,15);
//        cerinta4(4.5,3.25);
//        cerinta5();

    }

    //1. Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;
    public void cerinta1() {
        for (Integer i = 0; i < 5; i++) {
            System.out.print("DA ");
            System.out.println();
        }
    }

    //2. Afisam in consola primele 3 numere de la 1 la 3;
    public void cerinta2() {
        for (Integer i = 1; i < 4; i++) {
            System.out.println(i);
        }
    }

    //3. Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void cerinta3(Integer nr1, Integer nr2) {
        if (nr1 > nr2) {
            System.out.println("numarul " + nr1 + " este cel mai mare");
        } else if (nr1 < nr2) {
            System.out.println("numarul " + nr2 + " este cel mai mare");
        } else {
            System.out.println("numerele sunt egale");
        }
    }

    //4. Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void cerinta4(Double nr1, Double nr2) {
        if (nr1 > nr2) {
            System.out.println("numarul " + nr1 + " este cel mai mare");
        } else if (nr1 < nr2) {
            System.out.println("numarul " + nr2 + " este cel mai mare");
        } else {
            System.out.println("numerele sunt egale");
        }
    }
    //5. Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");
    public void cerinta5(){
        System.out.print("Numerele pare sunt:");
        for(Integer i=0;i<=10;i++){
            if(i%2==0){
                System.out.print(i +",");
            }
        }
        System.out.println();
        System.out.print("Numerele impare sunt:");
        for(Integer i=0;i<=10;i++) {
            if (i % 2 == 1) {
                System.out.print(i + ",");
            }
        }
    }
}
