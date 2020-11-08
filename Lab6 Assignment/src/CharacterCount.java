/**
 * Author : Sai Chaitanya Krishna
 * Date : 05-11-2020
 * Description Ex-2: Count of each Characters
 */
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		/**
		 * Input of character array
		 */
		char[] characters = {'a','d','e','a','a'};
		Map<Character,Integer> countOfChars = countChars(characters);
		System.out.println(countOfChars);

	}
	/**
	 * Method to find the count of each character
	 * @param characters
	 * @return
	 */
	private static Map<Character, Integer> countChars(char[] characters) {
		/**
		 * Map that stores key as character and value as count of the character
		 */
		Map<Character,Integer> countOfChars = new HashMap<Character,Integer>();
		/**
		 * Iterating the character array
		 */
		for(Character ch : characters) {
			/**
			 * Checking if the map contains the character
			 */
			if(countOfChars.containsKey(ch)) {
				/**
				 * Increasing the value of the key(Character)
				 */
				countOfChars.put(ch, countOfChars.get(ch)+1);
			}
			/**
			 * Adds the character to the map if it is not having
			 */
			else {
				countOfChars.put(ch, 1);
			}
		}
		return countOfChars;
	}

}
