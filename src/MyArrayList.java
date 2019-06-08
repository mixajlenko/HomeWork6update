import java.util.*;

public class MyArrayList<T> extends CustomList<T> {

    public static void main(String[] args) {


        Custom<Object> listM = new CustomList<>();
        Custom<Object> listN = new CustomList<>();

        for (int i = 0; i < 10; i++) {
            listM.add(getRandomValue(1, 10));
        }

        for (int i = 0; i < 10; i++) {
            listN.add(getRandomValue(1, 10));
        }

        System.out.println("First list is: " + listM);
        System.out.println("Second list is: " + listN);

        MyArrayList.multiplie(listM, listN);
/**
 *
 * Создал третий список и поместил в него сотню рандомных чисел.
 *
 */
        Custom<Integer> list3 = new CustomList<>();
        int i;
        for (i = 0; i < 100; i++) {
            list3.add(getRandomValue(0, 100));
        }

        System.out.println("Third list with 100 elements is: " + list3);
/**
 *
 * Поиск количества четных и нечетных чисел в списке.
 *
 */
        int j;
        int numberOfEvenNumbers = 0;
        int numberOfOddNumbers = 0;

        for (j = 1; j <= i; j++) {
            if (j % 2 != 0) numberOfOddNumbers++;
            else numberOfEvenNumbers++;
        }

        System.out.println("Number of Even numbers is: " + numberOfEvenNumbers);
        System.out.println("Number of Odd numbers is: " + numberOfOddNumbers);

        /**
         *
         * Удаление четных чисел с помощью итератора.
         *
         */
        for (ArrayIterator<Integer> iterator = (ArrayIterator<Integer>) list3.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("List with odd only: " + list3);
    }

    private static int getRandomValue(int min, int max) {
        max -= min;
        return (int) (Math.random() * max + 1) + min;
    }

    public static<T> void multiplie(Custom<T> first, Custom<T> second){

        int maxSize = Math.max(first.size(), second.size());

        Custom<Object> result = new CustomList<>(maxSize);

        for (int i = 0; i < maxSize; i++) {
            int res;
            if (i < first.size() && i < second.size()) {
                res = (int) first.get(i) * (int) second.get(i);
            } else if (i >= first.size()) {
                res = (int) second.get(i);
            } else {
                res = (int) first.get(i);
            }
            result.add(res);
        }

        System.out.println("Result is: " + result);
    }
}






