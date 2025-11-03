package oopMostenire;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test

    public void metodaTest(){

        Angajat angajat = new Angajat("Chera", "Madalina", 30, "Timisoara", "PanByViolett", 5000,"Nedeterminat", 21);
        angajat.infoAngajat();
        System.out.println();
        Sportiv sportiv = new Sportiv("Popi", "Balanel", 25, "Columbia", "Fotbal", true, 10);
        sportiv.infoSportiv();
    }
}
