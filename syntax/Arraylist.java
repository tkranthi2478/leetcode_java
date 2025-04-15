import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map.Entry;

public class Arraylist {
    
    public static void main(String [] args){
        // Defining Mutable List
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        
        // Printing List
        for (String item : list) {
            System.out.println(item);
        }
        
        // Deleting Items from List
        list.remove("banana"); // No Need to check if item exists
        
        // Clearing List
        list.clear();
        System.out.println(list);
        
        // Comparing Lists
        java.util.List<String> list1 = new ArrayList<>();
        list1.add("a");
        java.util.List<String> list2 = new ArrayList<>();
        list2.add("a");
        System.out.println(list1.equals(list2));


        //map Function -- Needs Streams
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> squares =  numbers.stream()
                                      .map(n -> n * n) // or Math.pow(n,2).intValue()
                                      .collect(Collectors.toList());
        System.out.println(squares);

        // Filter Function -- Needs Streams
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println(evenNumbers);


        //Sorting List
        List<String> unsortedList = new ArrayList<>(Arrays.asList("banana", "apple", "orange"));
        List<String> sortedList = unsortedList.stream()
                                              .sorted()
                                              .collect(Collectors.toList());
        System.out.println(sortedList);

        //Custom Sorting
        List<String> customSortedList = unsortedList.stream()
                                                    .sorted((s1, s2) -> s1.length() - s2.length())
                                                    .collect(Collectors.toList());
        System.out.println(customSortedList);

        //Sorting Tupes
        List<Map.Entry<String, Integer>> entries = new ArrayList<>();
        entries.add(new AbstractMap.SimpleEntry<>("apple", 2));
        entries.add(new AbstractMap.SimpleEntry<>("apple", 1));
        entries.sort(Map.Entry.comparingByKey()); 
        entries.sort(Map.Entry.comparingByValue()); 
        entries.sort(
            Comparator.comparing((Map.Entry<String, Integer> e) -> e.getKey())
                    .thenComparing(e -> e.getValue())
        );
        System.out.println(entries);
    }
}
