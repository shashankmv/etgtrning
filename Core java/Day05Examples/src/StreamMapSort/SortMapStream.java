package StreamMapSort;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.List;
public class SortMapStream {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four",4);
		map.put("ten",10);
		map.put("two",2);

		Set< Map.Entry< String,Integer> > st = map.entrySet();    
		  
	       for (Map.Entry< String,Integer> me:st) 
	       { 
	           System.out.print(me.getKey()+":"); 
	           System.out.println(me.getValue()); 
	       }
	       
		//tradition way of sorting
		//to sort the map need to convert into list and sort with collection.sort
		
		List<Entry<String, Integer>> ent = new ArrayList<>(map.entrySet());
		
		ent.forEach(System.out::println);
		
		List<Integer> result2 = map.values().stream()
                .collect(Collectors.toList());
		result2.forEach(System.out::println);
	}
}
