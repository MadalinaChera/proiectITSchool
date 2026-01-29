package abstractizareV2;

public abstract class Restaurant {

//    Recunoastem o clasa abstracta dupa cuvantul abstract
//    O clasa abstracta poate sau nu sa contina metode abstracte
//    Intr-o clasa abstracta putem sa avem metode de tip public, private, protected
//    O clasa care mosteneste o clasa abstracta trebuie sa implementeze toate metodele abstracte
//    O clasa abstracta poate implementa o interfata
//    O clasa abstracta poate contine un constructor dar Nu poti face un obiect
//    Ca sa facem o metoda abstracta intr-o clasa abstracta trebuie sa aaugam cuvantul abstract

    private String nume;
    private String adresa;
    private int telefon;

    public abstract void servesteMancareNonVegana();
    public abstract  void meniuNonVegan();
    public abstract void servesteMancareVegana();
    public abstract void meniuVegan();
}
