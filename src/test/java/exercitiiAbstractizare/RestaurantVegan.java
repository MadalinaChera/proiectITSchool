package exercitiiAbstractizare;

public class RestaurantVegan extends Restaurant implements RestaurantVeganInterface{

    public String meniuVegan;
    public int orar;
    public String meniulZilei;

    public RestaurantVegan(String denumire, int stele, String adresa, String meniuVegan, int orar, String meniulZilei) {
        super(denumire, stele, adresa);
        this.meniuVegan = meniuVegan;
        this.orar = orar;
        this.meniulZilei = meniulZilei;
    }

    public String getMeniuVegan() {
        return meniuVegan;
    }

    public void setMeniuVegan(String meniuVegan) {
        this.meniuVegan = meniuVegan;
    }

    public int getOrar() {
        return orar;
    }

    public void setOrar(int orar) {
        this.orar = orar;
    }

    public String getMeniulZilei() {
        return meniulZilei;
    }

    public void setMeniulZilei(String meniulZilei) {
        this.meniulZilei = meniulZilei;
    }

    @Override
    public void servesteMancareVegana() {

    }

    @Override
    public void meniuVegan() {

    }
}
