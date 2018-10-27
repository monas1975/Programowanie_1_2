import java.util.Objects;

import static javafx.scene.input.KeyCode.T;

public class TabliceCwiczenia {

    public static void main(String[] arg) {

        int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + ", ");
        }

        int[] tab2 = odwrocTablice(tab1);
        System.out.println("");

        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + ", ");
        }
        System.out.println("");
        System.out.println("");
        Integer[] tab3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + ", ");
        }
        Integer[] tab4 = reversArray(tab3);
        System.out.println("");
        for (int i = 0; i < tab4.length; i++) {
            System.out.print(tab4[i] + ", ");
        }

        System.out.println("");
        System.out.println("");

        String[] tab5 = {"a", "b", "c", "d", "e"};
        for (int i = 0; i < tab5.length; i++) {
            System.out.print(tab5[i] + ", ");
        }
        String[] tab6 = reversArray(tab5);
        System.out.println("");
        for (int i = 0; i < tab6.length; i++) {
            System.out.print(tab6[i] + ", ");
        }
        System.out.println("");
        System.out.println("Pierwszy na koniec");

        Integer[] tab7 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < tab7.length; i++) {
            System.out.print(tab7[i] + ", ");
        }
        Integer[] tab8 = firstToEnd(tab7);
        System.out.println("");

        for (int i = 0; i < tab8.length; i++) {
            System.out.print(tab8[i] + ", ");

        }
        System.out.println("");
        System.out.println("");
        String[] tab9 = {"a","b","c","d","e","f","g","h","i","j"};
        for (int i = 0; i < tab9.length; i++) {
            System.out.print(tab9[i] + ", ");
        }
        String[] tab10 = firstToEnd(tab9);
        System.out.println("");
        for (int i = 0; i < tab10.length; i++) {
            System.out.print(tab10[i] + ", ");
        }
        System.out.println("");
        System.out.println("");
        //last to first
        System.out.println("Ostatni na poczatek");

        Integer[] tab11 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < tab11.length; i++) {
            System.out.print(tab11[i] + ", ");
        }
        Integer[] tab12 = lastToBegin(tab11);
        System.out.println("");

        for (int i = 0; i < tab12.length; i++) {
            System.out.print(tab12[i] + ", ");

        }
        System.out.println("");
        System.out.println("");
        String[] tab13 = {"a","b","c","d","e","f","g","h","i","j"};
        for (int i = 0; i < tab13.length; i++) {
            System.out.print(tab13[i] + ", ");
        }
        String[] tab14 = lastToBegin(tab13);
        System.out.println("");
        for (int i = 0; i < tab14.length; i++) {
            System.out.print(tab14[i] + ", ");
        }

        System.out.println("");
        System.out.println("");
        // najdluzszy String w tablicy
        String[] tabString = {"Ala", "ma", "kota", "a", "kot", "ma","ale"};

        System.out.println(longestString(tabString));

    }

    public static <T extends Object> T[] reversArray(T[] array) {
        T[] newArray = (T[]) new Object[array.length];
        Object tempObject1;
        Object tempObject2;

        for (int i = 0; i < array.length / 2; i++) {
           // tempObject1 = array[i];
            tempObject2 = array[i];

            array[i] = array[array.length-1-i];
            array[array.length-1-i] = (T) tempObject2;


           // array[array.length-1-i] = (T) tempObject1;
           // array[i] = (T) tempObject2;
        }

        return array;
            }



     public static int[] odwrocTablice(int[] tablica){
         int[] nowaTablica = new int[tablica.length];

         for(int i=0; i< tablica.length;i++){


                 nowaTablica[i] = tablica[tablica.length-1-i];

         }

       return nowaTablica;
     }

    public static <T extends Object> T[] firstToEnd(T[] array) {
        if((array==null) || (array.length==1)){
            return null;
        }
        Object tempObject1;
        // najpierw przypisuje  1 element do zmioennej pomocniczej
         tempObject1 = array[0];
        for (int i = 0; i < array.length-1; i++) {
          array[i] = array[i+1];
        }
        array[array.length-1] = (T) tempObject1;

        return array;
    }

    public static <T extends Object> T[] lastToBegin(T[] array) {
        if((array==null) || (array.length==1)){
            return null;
        }
        Object tempObject1;
        Object tempObject2;
        // najpierw przypisuje  1 element do zmioennej pomocniczej
        tempObject1 = array[array.length-1];
        for (int i = array.length-1; i >=1; i--) {
           // tempObject2 = array[i-1];
            //array[i] = (T) tempObject2;
            array[i] = array[i-1];

        }
        array[0] = (T) tempObject1;

        return array;
    }


      public static String longestString(String[] tab){
        String myLongesString ="";
        //int maxForString;
        //int indexOfLongesString;

        myLongesString = tab[0];
        for(int i=0; i< tab.length;i++){

            if(tab[i].length()>myLongesString.length()){
                myLongesString = tab[i];
            }

        }


        return myLongesString;
      }



}
