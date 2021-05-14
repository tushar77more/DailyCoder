import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class IntergerArrayDemo {

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
		
		//get longest sequence of integer sub array
		
		int arr[]={1,2,3,8,2,4,5,8,9,7,6,3};
		int len=1;
		int maxLen=1;
		List<Integer> list1=new ArrayList<Integer>();
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i-1]<arr[i]) {
				len++;
				list1.add(arr[i-1]);
			}else {
				len=1;
			}
			if(len>maxLen) {
				
			}
			maxLen = Math.max(len, maxLen);
		}
		
		
		System.out.println("Max Lenth "+maxLen);
		
	}

}
