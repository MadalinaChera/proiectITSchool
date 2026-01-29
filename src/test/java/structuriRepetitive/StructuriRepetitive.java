package structuriRepetitive;

// Structuri repetitive: for, while, for-each, do-while

import org.testng.annotations.Test;

public class StructuriRepetitive {

    @Test
    public void metodaTest() {

//        afisareNumere(100);
//        afisareNrPare(50);
        afisareNumereWhile(100);
    }

    //Afisam primele 100 de numere
    public void afisareNumere(int capat) {
        for (int index = 0; index < capat; index++) {
            System.out.println("Vreau sa afisez numarul " + index);
        }
    }

    //Metoda de mai sus cu for transformata in while:

    public void afisareNumereWhile(int capat){
        int index = 0;
        while (index<=capat){
            System.out.println("Vreau sa afisez numarul " + index);
            index++;
        }
    }


    public void afisareNrPare(int capat) {
        for (int index = 0; index <= capat; index++) {
            if (index % 2 == 0) {
                System.out.println("Vreau sa afisez " + index);
            }
        }
    }
}
