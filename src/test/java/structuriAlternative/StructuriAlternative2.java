package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative2 {

    @Test

    public void testMethod(){
        determinareNumarPar(4);
        determinareNumarPar(-5);
        determinareNumarPar(3);
        determinareNumarPar(-6);

    }

//    Verificam daca un numar este par si pozitiv
//    / = operator care targheteaza la o impartire catul(div)
//    % = operator care targheteaza la o impartire restul(mod)
//    && = si - ambele conditii trebuie sa fie adevarate

    public void determinareNumarPar(int numar){
     if (numar > 0){
         if (numar % 2 == 0){
             System.out.println("Numarul "+ numar +" este positiv si par");
         } else {
             System.out.println("Numarul "+ numar +" este positiv si impar");
         }
     } else {
         if (numar % 2 != 0){
             System.out.println("Numarul "+ numar +" este negativ si impar");
         } else {
             System.out.println("Numarul "+ numar +" este negativ si par");
         }
     }
    }
}
