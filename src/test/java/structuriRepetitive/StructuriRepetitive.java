package structuriRepetitive;

// Structuri repetitive: for, while, for-each, do-while

import org.testng.annotations.Test;

public class StructuriRepetitive {

    @Test
    public void metodaTest() {

        afisareNumere(100);
        afisareNrPare(50);
    }

    //Afisam primele 100 de numere
    public void afisareNumere(int capat) {
        for (int index = 0; index < capat; index++) {
            System.out.println("Vreau sa afisez numarul " + index);
        }
//afisati nr pare de la 0 la 50

    }

    public void afisareNrPare(int capat) {
        for (int index = 0; index <= capat; index++) {
            if (index % 2 == 0) {
                System.out.println("Vreau sa afisez " + index);
            }
        }
    }
}
