import java.util.*;
import java.io.*;

/**
 * Grades class has several different methods
 * to process data such as name, grade list,
 * length, average, median, minimum, and
 * maximum<br>
 * @author Felix
 *
 */
public class Grades {
	private String name;
	private ArrayList<Integer> gradesList = new ArrayList<>();
	
	/**
	 * Grades constructor builds a
	 * new Grades object<br>
	 * @param name
	 * @param gradesList
	 */
	public Grades(String name, ArrayList<Integer> gradesList) {
		super();
		this.name = name;
		this.gradesList = gradesList;
	}
	
	/**
	 * Sets name in grades object<br>
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Sets Grade list for new grades object<br>
	 * @param gradesList
	 */
	public void setGradesList(ArrayList<Integer> gradesList) {
		this.gradesList = gradesList;
	}
	
	/**
	 * gets name from Grades object<br>
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * gets grade list from Grades object<br>
	 * @return
	 */
	public ArrayList<Integer> getGradesList() {
		return gradesList;
	}

	/**
	 * gets length of grades list
	 * in grades object<br>
	 * @return
	 */
	public int length(){
		return this.gradesList.size();
	}
	
	/**
	 * gets minimum grade in gradeslist
	 * in Grades object<br>
	 * @return
	 */
	public int minimum(){
		int min = gradesList.get(0);
		for(int i = 1; i < gradesList.size(); i++){
			if(gradesList.get(i) < min){
				min = gradesList.get(i);
			}
		}
		return min;
	}
	
	/**
	 * gets maximum grade in gradeslist
	 * in grades object<br>
	 * @return
	 */
	public int maximum(){
		int max = gradesList.get(0);
		for(int i = 1; i < gradesList.size(); i++){
			if(gradesList.get(i) > max){
				max = gradesList.get(i);
			}
		}
		return max;
	}
	
	/**
	 * calculates average for gradeslist
	 * of grades object<br>
	 * @return
	 */
	public double average(){
		double sum = 0.0;
		//check if length of arraylist is zero
		//so we do not divide by zero
		if(gradesList.size() == 0){
			return 0.0;
		}
		//add each number in array list
		for(int i = 0; i < gradesList.size(); i++){
				sum += gradesList.get(i);
		}
		return sum/gradesList.size();
	}
	
	/**
	 * gets median of grades list
	 * in grades object<br>
	 * @return
	 */
	public double median(){
		int i = gradesList.size()/2;
		Collections.sort(gradesList);
		//check if list size is even or odd
		if(gradesList.size() % 2 == 1){
			return (double) gradesList.get(i);
		}
		else{
			return (double) (gradesList.get(i) + gradesList.get(i-1))/2;
		}
	}
	
	@Override
	public String toString() {
		return name + " " + gradesList;
	}
	
}