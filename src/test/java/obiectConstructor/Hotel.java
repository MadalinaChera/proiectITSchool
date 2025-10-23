package obiectConstructor;

import java.util.List;

public class Hotel {

    public String nume;
    public String adresa;
    public String oras;
    public String tara;
    public int numarStele;
    public List<String> facilitati;
    public int pret;

    public Hotel(String nume, String adresa, String oras, String tara, int numarStele, List<String> facilitati, int pret){
        this.nume;
        this.adresa;
        this.oras;
        this.tara;
        this.numarStele;
        this.facilitati;
        this.pret;
    }

    public void prezentareHotel() {
        System.out.println("Numele hotelului este "+ nume);
        System.out.println("Adresa hotelului este "+ adresa);
        System.out.println("Hotelul se afla in orasul "+ oras);
        System.out.println("Tara in care se afla hotelul este "+ tara);
        System.out.println("Numarul de stele al hotelului este "+ numarStele);
        System.out.println("Facilitatile hotelului sunt "+ facilitati);
        for (int index=0; index< facilitati.size(); index++){
            System.out.println(facilitati.get(index));
        System.out.println("Pretul pentru o noapte al hotelului este "+ pret);
    }

        public void calculPret() {
                int stele=0;
                for (int index = 0; index< numarStele; index++){
                    switch (numarStele) {
                        case " 1":
                            stele= stele + 100;
                            break;
                        case " 2":
                            stele= stele + 200;
                            break;
                        case " 3":
                            stele= stele + 300;
                            break;
                    }
                }
                pret= pret + numarStele;
                System.out.println("Pretul final este "+ pret);
        }

        }

}
