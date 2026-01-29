package polimorfism;

import org.testng.annotations.Test;

public class PolimorfismTest {

    @Test
    public void testMethod(){

        Masina masina = new Masina("Audi", "a3",2002 );
        masina.pornesteAutomobil();
        masina.pornesteAutomobil();
        masina.aplicareReducere();
        masina.aplicareReducere(20);

        Trotineta trotineta = new Trotineta("hhd", "dedf", 525);
        trotineta.pornesteAutomobil();
    }
}
