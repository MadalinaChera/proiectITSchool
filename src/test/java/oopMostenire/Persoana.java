package oopMostenire;

public class Persoana {

    // OOP = Programare orientata pe obiecte
    // Cele 4 principii de baza sunt: mostenire, abstractizare, incapsulare si polimorfism
    // Mostenirea reprezinta conceptul prin care o clasa copil mosteneste o clasa parinte
    // Prin mostenire, clasa copil preia toate atributele si metodele clasei parinte
    // In momentul i care o clasa copil mosteneste o clasa parinte constructorul clasei copil trebuie sa apele constructorul din clasa parinte
    // Acest lucru se realizaeaza keyboardul "super"
    // Mostenirea se declara la nivel de clasa folosind keybordul "extends"
    // In java o clasa poate mosteni doar o singura alta clasa (mostenire unica)

    private String nume;
    private String prenume;
    private int varsta;
    private String adresa;

    public Persoana(String nume, String prenume, int varsta, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.adresa = adresa;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este " + nume);
        System.out.println("Prenumele persoanei este " + prenume);
        System.out.println("Varsta persoanei este " + varsta);
        System.out.println("Adresa persoanei este " + adresa);
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
