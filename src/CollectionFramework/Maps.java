package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Sayan",1);
        map1.put("Chandrika",2);
        map1.put("Bishal",3);
        System.out.println(map1);
        System.out.println(map1.get("Sayan"));
        System.out.println(map1.getOrDefault("hhh",0));
        System.out.println(map1.getOrDefault("Sayan",3));
        Set<Map.Entry<String,Integer>> set1 = map1.entrySet();
        for(Map.Entry<String,Integer> entry: set1){
            System.out.println(entry.getKey()+" ,"+entry.getValue());
        }
    }
}
