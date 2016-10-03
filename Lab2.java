import java.util.Scanner;
import java.io.File;

import java.util.*;
import java.io.*;

/**
 * This class opens a file, reads the data,
 * puts the data into a Grades object, then
 * processes the data<br>
 * @author Felix
 *
 */
public class Lab2 {
	/**
	 * main method reads in a file,
	 * sends the data to the Grades objects,
	 * and send each object to the process data
	 * function<br>
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException exception) {
			System.err.println("failed to open data.txt");
			System.exit(1);
		}
		
		ArrayList<Integer> gradesList = new ArrayList<>();
		ArrayList<Grades> people = new ArrayList<Grades>();
		
		try {
			while (in.hasNext()) {
				Grades grades = null;
				gradesList.clear();
				//read in name
				String name = in.next();
				while (in.hasNextInt()) {
					//read in each grade and save it into list
					int grade = in.nextInt();
					gradesList.add(grade);
				}
				//new grades object with name and grade list
				grades = new Grades(name, gradesList);
				//process the new grades object
				processdata(grades);
				people.add(grades);
			    //System.out.println(grades.toString()); 
			    //System.out.printf("\tName:    %s\n", grades.getName());
			}
		} catch (Exception e) {
			System.out.println();
		}
		
		//close out the data.txt file
		in.close();

	}
	
	/**
	 * processdata method gets the name, average,
	 * median, length, minimum, and maximum
	 * for each grade object sent to it<br>
	 * @param grades
	 */
	public static void processdata(Grades grades){
	    System.out.println(grades.toString()); 
	    System.out.printf("\tName:    %s\n", grades.getName());
	    System.out.printf("\tLength:  %d\n", grades.length());
	    System.out.printf("\tAverage: %.2f\n", grades.average());
	    System.out.printf("\tMedian:  %.1f\n", grades.median());
	    System.out.printf("\tMaximum: %d\n", grades.maximum());
	    System.out.printf("\tMininum: %d\n", grades.minimum());
	}
}