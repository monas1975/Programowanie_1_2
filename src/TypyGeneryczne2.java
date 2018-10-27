import java.util.Optional;

public class TypyGeneryczne2 {

    public static <T> Optional<T> findElement(T[] array , T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return Optional.of(array[i]);
            }
        }
        return Optional.empty();
    }


    private static Integer[] test = {6, 66, 3, 1, 2, 4};
    private static String[] test2 = {"Ala", "Ola", "Ela"};

    public static void main(String[] args) {
        Integer element = 3;

        Optional<Integer> el1 = findElement(test, element);
        element++;
        Optional<Integer> el2 = findElement(test, element);

        el1.ifPresent(System.out::println);
        el2.ifPresent( elem -> {
            System.out.println(elem);
        });
    }
}
