package oopMostenire;

public class Sportiv extends Persoana {

    public String sport;
    public boolean sportEchipa;
    public int experienta;

    public Sportiv(String nume, String prenume, int varsta, String adresa, String sport, boolean sportEchipa, int experienta) {
        super(nume, prenume, varsta, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
    }

    public void infoSportiv() {
        infoPersoana();
        System.out.println("Sportul practicat este " + sport);
        System.out.println("Este sport de echipa? " + sportEchipa);
        System.out.println("Cati ani de experinta are sporivul? " + experienta);
    }
}
