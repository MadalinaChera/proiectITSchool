package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //O clasa este un sablon care defineste comportamentul unei entitati din viata reala
    //Intr-un fisier Java recunoatem o clasa dupa cuvantul cheie "class"
    //O clasa este obligatoriu sa aibe un nume
    //O clasa contine variabile si metode
    //O variabila este proprietatea unei clase
    //O variabila poate fi de 2 feluri: Globala si Locala
    //Globala este o variabila ( ex. nume, prenume, varsta, etc) pe care o declaram la inceputul clasei si este vizibila in tot fisierul
    //Locala este o variabila (ex. salariul, greutate, etc) pe care o declaram in interiorul unei metode si este vizibila doar acolo
    //O variabila globala trebuie sa contina un access control (public), tip de data si un nume
    //O variabila nu trebuie sa contina tot timpul o valoare

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;

    //O metoda este actiunea unei clase (ex. invata, merge a cursuri, isi plateste taxele)
    //O clasa poate avea mai multe metode care se diferentiaza prin numele lor
    //Metodele pot fi de 2 feluri: Void si Return
    //O metoda cu Void are ca rol sa execute si sa afiseze actiunea
    //O metoda cu Void trebuie sa contina Access control  (public), cuvatul cheie "Void", numele metodei, paranteze () si acolade {}
    @Test
    public void prezentareStudent() {
        nume = "Chera";
        prenume = "Madalina";
        varsta = 30;
        inaltime = 1.60;
        greutate = 70.5f;
        adresa = "Utvin 432C";
        sex = 'f';
        areRestante = true;
        //Ca sa selectezi tot textul apesi CTRL+A
        //Ca sa aliniezi tot codul apesi CTRL+ALT+L
        //Undo poti sa apesi CTRL+Z

//        System.out.print(nume+" "+prenume+" "+varsta+" "+inaltime+" "+greutate+" "+adresa+" "+sex+" "+areRestante+" ");
        //sau
//        System.out.print(prenume+" ");
//        System.out.print(varsta+" ");
//        System.out.print(inaltime+" ");
//        System.out.print(greutate+" ");
//        System.out.print(adresa+" ");
//        System.out.print(sex+" ");
//        System.out.print(areRestante+" ");

        //Concatenarea este lipirea a unuia sau mai multor stringuri si lipirea se face cu +" "

        System.out.println("numele studentului este "+nume);
        System.out.println("varsta studentului este "+varsta);
        System.out.println("inaltimea studentului este "+inaltime);
        System.out.println("greutatea studentului este "+greutate);
        System.out.println("adresa studentului este "+adresa);
        System.out.println("sexul studentului este "+sex);
        System.out.println("Are studentul restante? "+areRestante);

        //print inseamna ca afiseaza valoarea si ramane pe randul curent
        //println inseamna ca afiseaza valoarea si sare la randul urmator


    }

}
