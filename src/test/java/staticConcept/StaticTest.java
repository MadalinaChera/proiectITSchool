package staticConcept;

import org.testng.annotations.Test;

public class StaticTest {

//    static este un keword pe care il folosim cu scopul de a salva o valoare default pentru o variabila definita
//    daca folosim acest lucru salvam spatiu in memorie si in toate obiectele pe care le definim vor primi aceeasi valoare

    @Test
    public void testMethod(){

        Elev mada = new Elev("Elev1", "Elev1",10);
        Elev alex = new Elev("Elev2", "Elev2", 12);

        mada.prezentareElev();
        System.out.println();

        alex.prezentareElev();
        System.out.println();

        alex.calculEcuson();

        Elev.infoElev();
    }
}
