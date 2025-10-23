package variabilaMetoda;

import org.testng.annotations.Test;

public class Animal {

    public String tipAnimal;
    public boolean mamifer;
    public int varsta;
    public double greutate;

    @Test

    public void metodaTest() {

//        tipAnimal = "caine";
//        mamifer = true;
//        varsta = 5;
//        greutate = 25.7;

        prezentareAnimal("caine", true, 5,25.7);
        prezentareAnimal("pisica", true, 2,5.4);
        prezentareAnimal("porumbel", false, 1,1.1);

//        System.out.print("Animalul este "+ tipAnimal);
//        System.out.print("Este mamifer? "+ mamifer);
//        System.out.print("Ce varsta are? "+varsta);
//        System.out.print("Ce greutate are? "+greutate);

    }

    public void prezentareAnimal(String tipAnimal,boolean mamifer,int varsta,double greutate) {
        int pret = 50;
        System.out.println("Animalul este "+ tipAnimal);
        System.out.println("Este mamifer? "+ mamifer);
        System.out.println("Ce varsta are? "+varsta);
        System.out.println("Ce greutate are? "+greutate);
        System.out.println();

        // System.out.println();  doar el simplu, pune linie goala intre paragrafe

    }
}
