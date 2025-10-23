package Tema;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public int anProductie;
    public double cm3;
    public float greutate;
    public String taraProvenienta;
    public char transmisie;
    public boolean esteOffroad;
    //tema ce am facut si data trecuta
    @Test
    public void prezentareMasina () {

        marca = "Mercedes";
        model = "C200";
        anProductie = 2020;
        cm3 = 2000.1;
        greutate = 200000.5f;
        taraProvenienta = "Germania";
        transmisie = 'm';
        esteOffroad = false;

        System.out.println("Marca masinii este "+marca);
        System.out.println("Modelul masinii este "+model);
        System.out.println("Anul de productie al masinii este "+anProductie);
        System.out.println("Cm3 ai masinii sunt "+cm3);
        System.out.println("Greutatea masinii este "+greutate);
        System.out.println("Tara de provenienta a masinii este "+taraProvenienta);
        System.out.println("Transmisia masinii este "+transmisie);
        System.out.println("Este masina Offroad? "+esteOffroad);
    }
}
