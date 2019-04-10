import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class MyArrayList {


    public static void main(String[] args) {


        // List<Integer> list1 = new ArrayList<>();
        // List<Integer> list2 = new ArrayList<>();
        // List result = new ArrayList();


        Rund M = new Rund();
        Rund N = new Rund();


        List<Integer> list1 = new LinkedList<>();

        list1.add(M.getRandomValue(100, 200));
        list1.add(M.getRandomValue(100, 200));
        list1.add(M.getRandomValue(100, 200));
        list1.add(M.getRandomValue(100, 200));
        list1.add(M.getRandomValue(100, 200));
        list1.add(M.getRandomValue(100, 200));
        list1.add(M.getRandomValue(100, 200));
        list1.add(M.getRandomValue(100, 200));
        list1.add(M.getRandomValue(100, 200));

        List<Integer> list2 = new LinkedList<>();

        list2.add(N.getRandomValue(100, 200));
        list2.add(N.getRandomValue(100, 200));
        list2.add(N.getRandomValue(100, 200));
        //list2.add(N.getRandomValue(100, 200));


        System.out.println("First list is: " + list1);
        System.out.println("Second list is: " + list2);


        int maxSize = Math.max(list2.size(), list1.size());

        List<Integer> result = new ArrayList<>(maxSize);

        /*
          Цикл умножения элементов одного списка на элементы другого.
         */
        for (int i = 0; i < maxSize; i++) {
            int res;
            if (i < list1.size() && i < list2.size()) {
                res = list1.get(i) * list2.get(i);
            } else if (i >= list1.size()) {
                res = list2.get(i);
            } else {
                res = list1.get(i);
            }
            result.add(res);
        }

        System.out.println("Result is: " + result);
/**
 *
 * Создал третий список и поместил в неё сотню рандомных чисел.
 *
 */
        List<Integer> list3 = new LinkedList<>();
        int i;
        for (i = 0; i < 100; i++) {
            list3.add(Rund.getRandomValue(0, 100));
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
}

//замена итератору.
/*list3.removeIf(number -> number % 2 == 0);
        System.out.println("List with odd only: " + list3);*/





