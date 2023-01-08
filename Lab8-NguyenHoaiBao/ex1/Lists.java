package lab8.ex1;

import com.sun.tools.javac.Main;

import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.add(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        if (list == null) {
            return;
        }
        list.removeIf(i -> i == 666);
    }

    public static ArrayList<Integer> generateSquare() {
        List<Integer> lists = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            lists.add(i * i);
        }
        return (ArrayList<Integer>) lists;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        if (source == null) {
            return;
        }
        if (!target.isEmpty()) {
            target.removeAll(target);
        }
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            Integer temp = list.get(i);
            list.add(i, list.get(list.size() - i - 1));
            list.add(list.size() - i - 1, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.add(0, value);
        list.add(value);
    }

}
