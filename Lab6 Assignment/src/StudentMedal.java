/**
 * Author : Sai Chaitanya Krishna
 * Date : 05-11-2020
 * Description Ex-4: Giving the medals to student according to their marks
 */
import java.util.*;
public class StudentMedal{
	public static void main(String[] args) {
		/**
		 * HashMap that takes the student id and marks
		 */
		HashMap<Integer,Integer> studentMarks = new HashMap<Integer,Integer>();
		studentMarks.put(1, 100);
		studentMarks.put(2, 50);
		studentMarks.put(3, 80);
		studentMarks.put(4, 65);
		studentMarks.put(5, 70);
		studentMarks.put(6, 46);
		Map<Integer,String> studentMedals = getStudent(studentMarks);
		System.out.println(studentMedals);
	}
	/**
	 *	Method to give the medals
	 */
	private static HashMap<Integer, String> getStudent(HashMap<Integer, Integer> studentMarks) {
		HashMap<Integer, String> studentMedals = new HashMap<Integer, String>();
		/**
		 * According to the marks adding the student id and medals to the hashmap 
		 */
		for(HashMap.Entry<Integer, Integer> entry:studentMarks.entrySet()) {
			if(entry.getValue()>=90) {
				studentMedals.put(entry.getKey(), "Gold");
			}else if(entry.getValue()>=80 && entry.getValue()<90) {
				studentMedals.put(entry.getKey(), "Silver");
			}else if(entry.getValue()>=70 && entry.getValue()<80){
				studentMedals.put(entry.getKey(), "Bronze");
			}
		}
		return studentMedals;
	}
}