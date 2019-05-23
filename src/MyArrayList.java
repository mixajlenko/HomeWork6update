import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {

        List<Integer> listM = new LinkedList<>();
        List<Integer> listN = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            listM.add(getRandomValue(100, 200));
            ListWithoutDuplicates(listM); //тут находиться имплементация метода для удаления дубликатов.
        }

        for (int i = 0; i < 10; i++) {
            listN.add(getRandomValue(100, 200));
            ListWithoutDuplicates(listN); //тут находиться имплементация метода для удаления дубликатов.
        }

        System.out.println("First list is: " + listM);
        System.out.println("Second list is: " + listN);

        int maxSize = Math.max(listN.size(), listM.size());

        List<Integer> result = new ArrayList<>(maxSize);

        for (int i = 0; i < maxSize; i++) {
            int res;
            if (i < listM.size() && i < listN.size()) {
                res = listM.get(i) * listN.get(i);
            } else if (i >= listM.size()) {
                res = listN.get(i);
            } else {
                res = listM.get(i);
            }
            result.add(res);
        }

        System.out.println("Result is: " + result);
/**
 *
 * Создал третий список и поместил в него сотню рандомных чисел.
 *
 */
        List<Integer> list3 = new LinkedList<>();
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
        for (Iterator<Integer> iterator = list3.iterator(); iterator.hasNext(); ) {
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

    private static void ListWithoutDuplicates(List<Integer> list) {
        int size = list.size();

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (!list.get(j).equals(list.get(i)))
                    continue;
                list.remove(j);
                j--;
                size--;
            }
        }
    }
}





