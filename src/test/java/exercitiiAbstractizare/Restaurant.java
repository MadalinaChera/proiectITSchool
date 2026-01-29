package exercitiiAbstractizare;

public class Restaurant {

//    Abstractizare = conceptul prin care putem defini comportamentul unei clase
//    Abstractizare: interfete - clasa abstracta
//    Interfata = este o structura care contine doar metode abstracte
//    O metodata abstracta este o metoda care nu are implementare
//    Clasa care implementeaza interfata trebuie sa implementeze toate metodele abstracte
//    Toate metodele din interfata sunt abstracte si publice
//    o interfata nu poate contine un constructor =>> nu poti face un obiect dintr-o clasa
//    O clasa poate implementa mai multe interfete
//    O interfata poate mosteni o alta interfata

    private String denumire;
    private int stele;
    private String adresa;

    public Restaurant(String denumire, int stele, String adresa) {
        this.denumire = denumire;
        this.stele = stele;
        this.adresa = adresa;
    }

    public void infoRestaurant(){
        System.out.println("Restauranul se numeste " + denumire);
        System.out.println("Restaurantul are " + stele + "stele");
        System.out.println("Adresa restaurantului este " + adresa);
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getStele() {
        return stele;
    }

    public void setStele(int stele) {
        this.stele = stele;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

}
