import java.util.HashMap;
import java.util.Map;

public class Hashmap {

   public static void main(String [] args){
      //Definining Muutable HashMap
      HashMap<String, String> map = new HashMap<>();
      map.put("name", "John");
      map.put("age", "30");
      map.put("city", "New York");
      System.out.println(map);

      //Printing HashMap
      for (String key : map.keySet()) {
         System.out.println(key + " : " + map.get(key));
      }
      //Alternative using Entries
      for (Map.Entry<String, String> entry : map.entrySet()) {
         System.out.println(entry.getKey() + " : " + entry.getValue());
      }
      //Alternative using For Each
      map.forEach((key, value) -> System.out.println(key + " : " + value));


      //Deleting Keys from HashMap
      map.remove("age"); //No Need to check if key exists

      //Clearing HashMap
      map.clear();
      System.out.println(map);

      //Comparing Hashmaps -- Though enefficient
      HashMap<String, Integer> map1 = new HashMap<>();
      map1.put("a", 1);  
      HashMap<String, Integer> map2 = new HashMap<>();
      map2.put("a", 1);  
      System.out.println(map1.equals(map2));


      //Default Dict
      Map<String, Integer> defaultMap = new HashMap<>();
      System.out.println(defaultMap.getOrDefault("missingKey", -11)); 

      //NO Counter
      Map<String, Integer> count = new HashMap<>();
      String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
      for (String word : words) {
         count.put(word, count.getOrDefault(word, 0) + 1);
      }

    }
}