/**
 * Author : Sai Chaitanya Krishna
 * Date : 05-11-2020
 * Description Ex-7: Reversing and sorting the numbers in array
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseNumbers {

	public static void main(String[] args) {
		/**
		 * Input of number to array
		 */
		int[] numbersToReverse = {14,23,11,32,3};
		List<Integer> numbersAfterReverse = getsorted(numbersToReverse);
		System.out.println(numbersAfterReverse);

	}
	/**
	 * Method to reverse and sort the array
	 * @param numbersToReverse
	 * @return
	 */
	private static List<Integer> getsorted(int[] numbersToReverse) {
		List<Integer> numbers=new ArrayList<Integer>();
		/**
		 * Adding the numbers to the list
		 */
		for(int i : numbersToReverse) {
			numbers.add(i);
		}
		/**
		 * Reversing the numbers list
		 */
		Collections.reverse(numbers);
		/**
		 * Sorting the list after reversing
		 */
		Collections.sort(numbers);
		return numbers;

}}
