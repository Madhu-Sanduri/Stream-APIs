package streams;

import AbstrctConcept.B;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class evenOdd {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));


        Map<Boolean,List<Integer>> map1=new HashMap<>();

        System.out.println( list.stream().collect(Collectors.partitioningBy(n->n%2==0))
                .entrySet().stream().collect(Collectors.toMap(entry ->entry.getKey()? "even" :"odd", Map.Entry ::getValue)) );
//                .forEach(System.out::println);





        List<Integer> evenList= list
                                .stream()
                .filter(x -> x%2==0).toList();

        List<Integer> oddList= list
                                .stream()
                .filter(x -> x%2==1).toList();
        System.out.println(list);
        System.out.println(evenList);
        System.out.println(oddList);
        Map<String,List<Integer>> map=new HashMap<>();
        map.put("even",evenList);
        map.put("odd",oddList);

        System.out.println(map);
    }
}
