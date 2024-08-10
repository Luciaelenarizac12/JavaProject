package exceptions;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ExceptionTest {

    @Test

    public void testMethod() throws FileNotFoundException {

        ExceptieConcept exceptionConcept=new ExceptieConcept();
//        exceptionConcept.checkedExceptionExample();
//        exceptionConcept.uncheckedExceptionExample();
//        exceptionConcept.throwExceptionExample(21);
//        exceptionConcept.throwExceptionExample(13);
        exceptionConcept.throwsExceptionExample();


    }

}
