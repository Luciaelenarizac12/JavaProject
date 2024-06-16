package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //structuri repetitive: for, while, for each
    @Test
    public void testMethod() {
//        afisareNrFor();
//        afisareWhile();
//        afisareDoWhile();
        nrPareInterval();

    }

    //afisam primele 15 numere:FOR
    public void afisareNrFor() {
        for (Integer i = 0; i < 16; i++) {
            System.out.println(i);
        }
    }

    //While:
    public void afisareWhile() {
        int j = 0;
        while (j<=16) {
            System.out.println(j);
            j++;
        }
    }

    //do while
    public void afisareDoWhile() {
        Integer x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x <=16);
    }
    //afisam numerele pare de la 0 la 20:
    public void nrPareInterval(){
        for(Integer nr=0; nr<21;nr++){
            if(nr%2==0){
                System.out.println(nr + " este par");
            }

        }
    }




}
