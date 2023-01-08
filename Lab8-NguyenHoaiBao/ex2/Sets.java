package lab8.ex2;

import java.util.*;


public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        if (first == null || second == null) {
            return null;
        }
        Set<Integer> setresult = new HashSet<>();
        for (int i : first) {
            for (int j : second) {
                if (i != j) {
                    setresult.add(i);
                }
            }
        }
        return setresult;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        if (first == null) {
            return second;
        }

        if (second == null) {
            return first;
        }

        Set<Integer> setresult = new HashSet<>(first);
        for (int i : second) {
            setresult.add(i);
        }
        return setresult;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        if (first == null || second == null) {
            return null;
        }
        Set<Integer> setresult = new HashSet<>(first);
        setresult.retainAll(second);
        return setresult;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> setresult = new HashSet<>(first);
        setresult.addAll(second);
        return setresult;
    }

    public static List<Integer> toList(Set<Integer> source) {
        if (source == null) {
            return null;
        }
        List<Integer> lists = new ArrayList<Integer>();
        for (int i : source) {
            lists.add(i);
        }
        return lists;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        if (source == null) {
            return null;
        }
        Set<Integer> set = new HashSet<>(source);
        List<Integer> resultList = new ArrayList<>(set);
        return resultList;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for (int element : source) {

            if (!resultList.contains(element)) {

                resultList.add(element);
            }
        }
        return resultList;
    }

    public static String firstRecurringCharacter(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) ;
                return s.charAt(i) + "";
            }
        }
        return "";
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    set.add(s.charAt(i));
            }
        }
        return set;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] integers = new Integer[source.size()];
        int count = 0;
        for (Integer i : source) {
            integers[count] = i;
            ++count;
        }
        return integers;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.ceiling(value);
    }


}
