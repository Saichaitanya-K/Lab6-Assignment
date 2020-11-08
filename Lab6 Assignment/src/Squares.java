/**
 * Author : Sai Chaitanya Krishna
 * Date : 05-11-2020
 * Description Ex-3: To find the square of the numbers
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Squares {

	public static void main(String[] args) {
		/**
		 * Input of numbers into the integer array
		 */
		int[] numbers = {4,5,6,8,2};
		Map<Integer,Integer> squares=getSquares(numbers);
		System.out.println(squares);
	}
	/**
	 * Method to find the square of numbers
	 * @param numbers
	 * @return
	 */
	private static Map<Integer, Integer> getSquares(int[] numbers) {
		Map<Integer,Integer> squares=new HashMap<Integer,Integer>();
		List<Integer> num = new ArrayList<Integer>();
		/**
		 * Adding numbers to list
		 */
		for(int i : numbers) {
			num.add(i);
		}
		/**
		 * Iterating the list and keeping the obtained values to map
		 */
		for(Integer n : num) {
			squares.put(n, (n*n));
		}
		return squares;
	}

}
