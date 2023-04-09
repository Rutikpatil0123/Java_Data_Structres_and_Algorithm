package CollectionAndFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIntro {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Raj", 2);
        map.put("kam", 6);
        map.put("ram", 7);

        System.out.println(map);

        System.out.println(map.containsKey("emy"));
        System.out.println(map.containsValue(2));

        // It will give the null pointer exception

        //System.out.println(map.get("rma").getMath());

        System.out.println(map.getOrDefault("kam", 0) );
        System.out.println(map.getOrDefault("sham", 0));
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for(Map.Entry<String ,Integer> entry : entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Set<String> keySet = map.keySet();

        for(String key : keySet){
            System.out.println(key + " " + map.get(key));
        }
    }
}
