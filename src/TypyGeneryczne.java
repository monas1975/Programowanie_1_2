public class TypyGeneryczne {

    private static Integer[] test = {1, 2, 3, 4, 5};
    private static String[] test2 = {"Ola", "Tomek", "Anka"};


    public static void main(String[] args) {

        System.out.println(findGeneric(test, 4));
        System.out.println(findGeneric(test, 8));
        System.out.println(findGeneric(test2, "Anka"));
        System.out.println(findGeneric(test2, "Marek"));

        Integer[] tablica = {5, 2, 1, 8, 7, 9, 3};
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + "  , ");
        }
        szybkieSortowanieGen(tablica, 0, tablica.length - 1);

        System.out.println("");

        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + "  , ");
        }

        String[] tablica2 = {"tamata", "tomek", "ewelina", "magda", "monika", "ala", "krszysztof", "marta", "ela"};
        for (int i = 0; i < tablica2.length; i++) {
            System.out.print(tablica2[i] + "  , ");
        }
        szybkieSortowanieGen(tablica2, 0, tablica.length - 1);

        System.out.println("");

        for (int i = 0; i < tablica2.length; i++) {
            System.out.print(tablica2[i] + "  , ");
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("sortowanie bobelkowe");
        Integer[] tablica3 = {5, 2, 1, 8, 7, 9, 3};
        for (int i = 0; i < tablica3.length; i++) {
            System.out.print(tablica3[i] + "  , ");
        }
        sortowanieBabelkoweGen(tablica3);

        System.out.println("");

        for (int i = 0; i < tablica3.length; i++) {
            System.out.print(tablica3[i] + "  , ");
        }

        String[] tablica4 = {"tamata", "tomek", "ewelina", "magda", "monika", "ala", "krszysztof", "marta", "ela"};
        for (int i = 0; i < tablica4.length; i++) {
            System.out.print(tablica4[i] + "  , ");
        }
        sortowanieBabelkoweGen(tablica4);

        System.out.println("");

        for (int i = 0; i < tablica4.length; i++) {
            System.out.print(tablica4[i] + "  , ");
        }

    }

    public static <T> int findGeneric(T[] array, T element) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (element.equals(array[i])) {
                index = i;
            }
        }
        return index;
    }

    public static <T extends Comparable> T[] szybkieSortowanieGen(T[] array, int left, int right) {
        int i = 0; //szuka do przedostatniej pozycji
        int j = 0;   //zapamietuje miejsce wstawienia elementow mniejszych od piwvotu
        T pivot;
        T temp;
        //wyznaczam element srodkowy 'pivot'

        i = (left + right) / 2;
        pivot = array[i];
        array[i] = array[right];
        //zmien z ostatniemelementem zbioru

        for (j = i = left; i < right; i++)
            if (array[i].compareTo(pivot) < 0) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        array[right] = array[j];
        array[j] = pivot;
        if (left < j - 1) szybkieSortowanieGen(array, left, j - 1);
        if (j + 1 < right) szybkieSortowanieGen(array, j + 1, right);
        return array;
    }

    public static <T extends Comparable> T[] sortowanieBabelkoweGen(T[] tab) {
        T tempPom;
        for (int j = 0; j < tab.length; j++) {

            for (int i = 0; i < tab.length - 1; i++) {

                if ((tab[i].compareTo(tab[i + 1]) > 1)) {
                    tempPom = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = tempPom;

                }

            }

        }
        return tab;
    }

}

