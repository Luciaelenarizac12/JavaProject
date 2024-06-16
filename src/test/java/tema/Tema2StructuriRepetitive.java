package tema;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Tema2StructuriRepetitive {

    @Test
    public void testMethod() {
        nrPrime();
    }


    // Sa se itereze prin array ul dat folosind for loop si sa se afiseze toate numerele prime in ordine crescatoare:
    public void nrPrime() {
        Integer numere[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 25, 26, 40, 35, 63, 13, 1, 105};
        Arrays.sort(numere);

        System.out.println("Numerele prime din array sunt:");
        for (Integer numar : numere) {
            Integer numarDivizori = 0; // resetăm numărul de divizori pentru fiecare număr
            for (int i = 2; i <= numar / 2; i++) {
                if (numar % i == 0) {
                    numarDivizori++;
                    break;
                }
            }
            if (numarDivizori == 0 && numar > 1) {
                System.out.print(numar + ",");
            }
        }

    }



}
