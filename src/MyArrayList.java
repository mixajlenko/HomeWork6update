import java.util.ArrayList;
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
                result.add(res);

            }
            if (i >= list1.size()) {
                res = list2.get(i);
                result.add(res);
            }
            if (i >= list2.size()) {
                res = list1.get(i);
                result.add(res);
            }
        }

        System.out.println("Result is: " + result);
    }
}




