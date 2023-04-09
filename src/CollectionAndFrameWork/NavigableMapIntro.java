package CollectionAndFrameWork;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapIntro {

    public static void main(String[] args) {

        NavigableMap<Integer ,String> navigableMap = new TreeMap<>((a, b) -> b - a);

        navigableMap.put(1, "rna");
        navigableMap.put(2, "ang");
        navigableMap.put(12, "fdd");
        navigableMap.put(6, "feef");

        navigableMap.remove(2);

        Set<Map.Entry<Integer, String>> entrySet = navigableMap.entrySet();

        for(Map.Entry<Integer, String> entry : entrySet){

            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(navigableMap.ceilingKey(2));

    }
}
