import java.util.Random;

public class SortowanieCwiczenia {

    public static void main(String[] args) {


        int[] tab = {4, 7, 1, 8, 2, 3};

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " , ");
        }
        System.out.println("");

        sortowanieBabelkowe(tab);

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " , ");
        }
        System.out.println("");
        System.out.println("");
        int[] tab2 = new int[100];
        Random random = new Random();

        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = random.nextInt(100);
        }

        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + " , ");
        }

        System.out.println("");
        sortowanieBabelkowe(tab2);

        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + " , ");
        }
        System.out.println("");
        System.out.println("");

        String[] tab3 = {"Ala", "ma", "kota", "a", "kot", "ma", "ale"};
        for (int i = 0; i < tab3.length; i++) {
            System.out.print(tab3[i] + " , ");
        }
        System.out.println("");
        sortowanieBabelkoweStringow(tab3);
        for (int i = 0; i < tab3.length; i++) {
            System.out.print(tab3[i] + " , ");
        }
        System.out.println("");
        System.out.println("");
        int[] tab4 = {5,4,3,2,1};

        for (int i = 0; i < tab4.length; i++) {
            System.out.print(tab4[i] + " , ");
        }
        System.out.println("");

        sortowanieBabelkowe(tab4);

        for (int i = 0; i < tab4.length; i++) {
            System.out.print(tab4[i] + " , ");
        }
        System.out.println("");
        System.out.println("");
        int[] tab5 = {1,2,3,4,5};

        for (int i = 0; i < tab4.length; i++) {
            System.out.print(tab5[i] + " , ");
        }
        System.out.println("");

        sortowanieBabelkowe(tab5);

        for (int i = 0; i < tab5.length; i++) {
            System.out.print(tab5[i] + " , ");
        }
    }


    public static void sortowanieBabelkowe(int[] tab) {
        int tempPom;
        for (int j = 0; j < tab.length; j++) {

            for (int i = 0; i < tab.length - 1; i++) {

                if ((tab[i] > tab[i + 1])) {
                    tempPom = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = tempPom;

                }

            }

        }

    }

    public static void sortowanieBabelkoweStringow(String[] tab) {
        String tempPom;
        for (int j = 0; j < tab.length; j++) {

            for (int i = 0; i < tab.length - 1; i++) {

                if ((tab[i].length() > tab[i + 1].length())) {
                    tempPom = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = tempPom;

                }

            }
        }

    }


}



