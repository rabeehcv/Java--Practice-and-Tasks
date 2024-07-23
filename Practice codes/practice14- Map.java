import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class practice{
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("One",4); // Duplicate keys value will be overwritten
        System.out.println("Map: " + map);
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("C",5);
        hashmap.put("A",1);
        hashmap.put("B",2);
        hashmap.put("A",3);
        System.out.println("Hashmap: "+ hashmap);
        Map<String,Integer> treemap = new TreeMap<>();
        treemap.put("One",1);
        treemap.put("Two",2);
        treemap.put("Three",3);
        treemap.put("One",4);
        System.out.println("Treemap: " + treemap);
    }
}
