package valueReferenceType;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class JavaReferenceTest {

    // conceptul de primitiva si nonprimitiva
    // Date primitive : int, double, float, char, boolean, long
    // non-primitive (referinta): String,Object,Array
    // Static - valoare care se pastreaza pentru toate instantele dintr-o clasa
    // Constanta Final- o valoare pe care o dai o data si nu se mai modifica niciodata
    // Wrapper class - constructie de clasa care este facuta pe baza unui tip de data primitiva (int - Int)

    public int originalInt=10;
    public String originalString="kiwi";
    public Curs cursTestare=new Curs("Curs Testare automata","Testare Automata cu JAva", 25);
    public final int nrCursanti=16;
    public Integer defaultWrapper;
    public int defaultPrimitive;


    @Test
    public void testMethods() {
        System.out.println("1. VALUE TYPE");
        valueTypeExample(originalInt);
        System.out.println("1.Valoarea initiala este"+originalInt);

        //String ul este immutable
        System.out.println("2.REFERENCE TYPE STRING");
        referenceTypeStringExample(originalString);
        System.out.println("1.Valoarea initiala este"+originalString);

        System.out.println("3. REFERENCE TYPE OBJECT:");
        referenceTypeObjectExample(cursTestare);
        System.out.println("Valoarea initiala este:");
        cursTestare.prezentareCurs();

        System.out.println("4. CONSTANT:");
//        nrCursanti=nrCursanti+10;

        System.out.println("5. VALUE TYPE/ WRAPPER CLASS:");
        defaultValue();




    }
    public void valueTypeExample(int value){
        value=value+5;
        System.out.println("Valoarea noua este "+ value);
    }

    public void referenceTypeStringExample(String value){
        value=value +"portocala";
        System.out.println("Azi mi-am cumparat o/un "+value);

    }
    public void referenceTypeObjectExample(Curs Object){
       Object.prezentareCurs();
       Object.setTitlu("Testare manuala");
       Object.prezentareCurs();
    }

    public void defaultValue(){
        System.out.println(defaultWrapper);
        System.out.println(defaultPrimitive);

        int[] Array = new int[5];
    }


}
