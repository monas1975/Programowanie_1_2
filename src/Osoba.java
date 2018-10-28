import java.lang.reflect.Array;
import java.util.Date;

public class Osoba implements Comparable<Osoba> {
    private String lastName;
    private String birthdate;

    public  Osoba(String lastName, String birthdate){
        this.lastName = lastName;
        this.birthdate = birthdate;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public  String toString(){
        return getLastName() + "," + getBirthdate();
    }
    public static Osoba[] exampleArray(){
        //Osoba[] tab = new Osoba[5];
        Osoba o1 = new Osoba("Wojciech", "1939");
        Osoba o2 = new Osoba("Janina", "1940");
        Osoba o3 = new Osoba("Malgorzata", "1968");
        Osoba o4 = new Osoba("Tomasz", "1975");

        Osoba[] tab = {o3,o1,o4,o2};

       return tab;
    }

    public static <T extends Osoba> T[] sortujOsobyGen(T[] tab) {
        T tempPom;
        //String x = tab[0]
        for (int j = 0; j < tab.length; j++) {

            for (int i = 0; i < tab.length - 1; i++) {

                if ((tab[i].getBirthdate().compareTo(tab[i + 1].getBirthdate()) > 1)) {
                    tempPom = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = tempPom;

                }
            }
        }
        return tab;
    }

    @Override
    public int compareTo(Osoba o) {

        return this.lastName.compareTo(o.lastName);
    }


    public static void main(String[] args){

        Osoba[] tab = exampleArray();
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i].toString());
        }
        sortujOsobyGen(tab);
        System.out.println("po sortowaniu");
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i].toString());
        }
        Osoba[] tab2 = exampleArray();
        //
    }



}
