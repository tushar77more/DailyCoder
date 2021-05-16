import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SortHashMapBasedOnValue {

	public static void main(String[] args) {
		//Sort hashmap based on values
				HashMap<String,Integer> map= new HashMap<String,Integer>();

				map.put("a",10);
				map.put("b",20);
				map.put("c",5);
				
				Set<Map.Entry<String,Integer>> keySet=	map.entrySet();
				
				System.out.println("keySet "+keySet);
				
				List<Map.Entry<String,Integer>> list=new ArrayList<Map.Entry<String,Integer>>(keySet);
				
				Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {

					@Override
					public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
						if(o1.getValue()>o2.getValue()) {
							return 1;
						}else if(o1.getValue()<o2.getValue()) {
							return -1;
						}else {
							return 0;
						}
						
						
					}
				});
				
				System.out.println("sorted map-- "+list);
	}
}
