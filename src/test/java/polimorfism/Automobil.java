package polimorfism;

public class Automobil {

//    Polimorfism:
//    1. Dinamic - override : Intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
//    Apare doar in relatia de mostenire

//    2. Static - overload : Posibilitatea ca o metoda deja declarata sa aibe o structura la nivel de declarare diferita
//    Metoda se diferentiaza prin numarul sau tipul de parametrii diferiti

    private String marca;
    private String model;
    private int an;

    public Automobil(String marca, String model, int an) {
        this.marca = marca;
        this.model = model;
        this.an = an;
    }

//    polimorfism dinamic
    public void pornesteAutomobil(){
        System.out.println("Masina porneste la buton");
    }
}
