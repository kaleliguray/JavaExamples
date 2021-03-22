import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
//		List<Integer> numbers = new LinkedList<Integer>();
//		numbers.add(1);
//		numbers.add(2);
//		numbers.add(3);
//		for (int i = 0; i < numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}

//		Set<Integer> numbers = new HashSet<Integer>();
//		numbers.add(3);
//		numbers.add(1);
//		numbers.add(2);
//		numbers.add(1);
//		
//		Iterator<Integer> iterator = numbers.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

//		Map<String, Integer> plates = new HashMap<String, Integer>();
//		plates.put("İstanbul", 34);
//		plates.put("Ankara", 6);
//		plates.put("İzmir", 35);
//		plates.put("Antalya", 7);
//		plates.put("Adana", 1);

//		System.out.println(plates.get("Ankara"));
//		System.out.println(plates.get("İstanbul"));

//		Set<String> keySet = plates.keySet();
//		Iterator<String> iterator = keySet.iterator();
//		while (iterator.hasNext()) {
//			String key = iterator.next();
//			System.out.println(key + ":" + plates.get(key));
//		}

		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

		map.put("odd", Arrays.asList(1, 3, 5, 7, 9));
		map.put("even", Arrays.asList(2, 4, 6, 8, 10));

		System.out.println(map.get("odd"));
		System.out.println(map.get("even"));
		
	}

}
