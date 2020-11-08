/**
 * Author : Sai Chaitanya Krishna
 * Date : 05-11-2020
 * Description Ex-6: Checking if the citizen is eligible for vote according to their age
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoterEligibility {

	public static void main(String[] args) {
		/**
		 * Map to add the voter id and age
		 */
		 Map<Integer, Integer> votersAge = new HashMap<Integer, Integer>();
		 votersAge.put(12,80);
		 votersAge.put(2, 23);
		 votersAge.put(22, 15);
		 votersAge.put(55, 12);
		 votersAge.put(34, 42);
		 List<Integer> eligiblePersonsIds=votersList(votersAge);
		 System.out.println(eligiblePersonsIds);
	}
	/**
	 * Method to check the age
	 * @param votersAge
	 * @return
	 */
	private static List<Integer> votersList(Map<Integer, Integer> votersAge) {
		List<Integer> eligibleVoterIds = new ArrayList<Integer>();
		/**
		 * Adding the eligible voter id's to the list
		 */
		for(Map.Entry<Integer,Integer> entry:votersAge.entrySet()) {
			if(entry.getValue()>18) {
				eligibleVoterIds.add(entry.getKey());
			}
		}
		return eligibleVoterIds;
	}

}
