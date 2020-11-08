/**
 * Author : Sai Chaitanya Krishna
 * Date : 05-11-2020
 * Description (Ex-1) : Sorting the hashMap and return the values in List
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SortingHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		/**
		 * Adding key and values to the hashmap
		 */
		hashMap.put(1,"Surya");
		hashMap.put(2,"Dinesh");
		hashMap.put(3,"Karthik");
		hashMap.put(4,"Mishra");
		hashMap.put(5,"Praveen");
		/**
		 * List to take the sorted values from the getValue method
		 */
		List<String> sortedMap = new ArrayList<String>();
		sortedMap = getValues(hashMap);
		System.out.println(sortedMap);
	}

	private static List<String> getValues(HashMap<Integer, String> hashMap) {
		List<String> stringSort = new ArrayList<String>();
		/**
		 * Adding elements to list
		 */
		for(Map.Entry<Integer, String> entry:hashMap.entrySet()) {
			stringSort.add(entry.getValue());
		}
		/**
		 * Sorting the list
		 */
		Collections.sort(stringSort);
		return stringSort;
	}

}
