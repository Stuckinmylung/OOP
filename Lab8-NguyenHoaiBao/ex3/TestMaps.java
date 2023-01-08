package lab8.ex3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMaps {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(3, 4);
        map.put(5, 6);
        map.put(7, 8);
        lab8.ex3.Maps test = new lab8.ex3.Maps();
        System.out.println(test.count(map));
        System.out.println(test.contains(map, 3));
        System.out.println(test.contains(map, 0));
        System.out.println(test.containsKeyValue(map, 1, 2));
        System.out.println(test.containsKeyValue(map, 1, 7));
        System.out.println(test.keySet(map));
        System.out.println(test.values(map));
        System.out.println(test.getColor(1));
        test.empty(map);
        System.out.println(test.count(map));
    }
}
