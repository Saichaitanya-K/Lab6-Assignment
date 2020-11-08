/**
 * Author : Sai Chaitanya Krishna
 * Date : 05-11-2020
 * Description Ex-5: Finding the second smallest element in the array 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondSmallestElement {

	public static void main(String[] args) {
		/**
		 * Integer array as input
		 */
		int[] number = {1,4,6,3,2};
		int secondSmallest = getSecondSmallest(number);
		System.out.println(secondSmallest);

	}
	/**
	 * Method to find the second smallest number
	 * @param number array
	 * @return second smallest number
	 */
	private static int getSecondSmallest(int[] number) {
		List<Integer> listToSort=new ArrayList<Integer>();
		/**
		 * Adding the numbers to the arraylist
		 */
		for(int i : number) {
			listToSort.add(i);
		}
		/**
		 * Sorting the arraylist
		 */
		Collections.sort(listToSort);
		return listToSort.get(1);
	}

}
