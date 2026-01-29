package exercitiiAbstractizare;

public class RestaurantNonVegan extends Restaurant implements RestaurantNonVeganInterface{

    public String specificMancare;
    public String feluriMancare;
    public String meniu;

    public RestaurantNonVegan(String denumire, int stele, String adresa, String specificMancare, String feluriMancare, String meniu) {
        super(denumire, stele, adresa);
        this.specificMancare = specificMancare;
        this.feluriMancare = feluriMancare;
        this.meniu = meniu;
    }

    public String getSpecificMancare() {
        return specificMancare;
    }

    public void setSpecificMancare(String specificMancare) {
        this.specificMancare = specificMancare;
    }

    public String getFeluriMancare() {
        return feluriMancare;
    }

    public void setFeluriMancare(String feluriMancare) {
        this.feluriMancare = feluriMancare;
    }

    public String getMeniu() {
        return meniu;
    }

    public void setMeniu(String meniu) {
        this.meniu = meniu;
    }


    @Override
    public void servesteMancareNonVegana() {

    }

    @Override
    public void meniuNonVegan() {

    }
}
