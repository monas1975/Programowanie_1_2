public class TypyGeneryczne {

    private static Integer[] test = {1, 2, 3, 4, 5};
    private static String[] test2 = {"Ola", "Tomek", "Anka"};


    public static void main(String[] args) {

        System.out.println(findGeneric(test, 4));
        System.out.println(findGeneric(test, 8));
        System.out.println(findGeneric(test2, "Anka"));
        System.out.println(findGeneric(test2, "Marek"));
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
}
