package oopMostenire;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test

    public void metodaTest(){

        Angajat angajat = new Angajat("Chera", "Madalina", 30, "Timisoara", "PanByViolett", 5000,"Nedeterminat", 21);
        angajat.infoAngajat();

        System.out.println("angajat.getVarsta();");
        angajat.setVarsta(23);
        System.out.println("angajat.getVarsta();");

        Sportiv sportiv = new Sportiv("Popi", "Balanel", 25, "Columbia", "Fotbal", true, 10);
        sportiv.infoSportiv();

        System.out.println();

        Student student = new Student("Cheza", "Bobita", 22, "Mangalia", "UPT", "Management", 2, false);
        student.infoStudent();
    }
}
