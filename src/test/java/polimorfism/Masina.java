package polimorfism;

public class Masina extends Automobil{
    public Masina(String marca, String model, int an) {
        super(marca, model, an);
    }
// Polimorfism dinamic
    public void pornesteAutomobil(){
//        super.pornesteAutomobil();
        System.out.println("Masina porneste de la cheie");
    }

//    Polimorfism static
    public void aplicareReducere(){
        System.out.println("In ianuarie se aplica 5% reducere");
    }

    public void aplicareReducere(int procent){
        System.out.println("Pentru masina se aplica " + procent + "% reducere");
    }

    public void aplicareReducere(String cupon){
        System.out.println("Pentru masina se aplica " + cupon + "% reducere");
    }
}
