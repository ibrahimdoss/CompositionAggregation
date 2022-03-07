package school;

import java.util.ArrayList;
import java.util.List;

public class CompositionMain {

	public static void main(String[] args) {
		
		//College nesne create
		College collegeOne = new College("Abc College", "Def College");
		
		College collegeTwo = new College("Xyz College", "Mnp College");
		
		College collegeThree = new College("High College", "Super College");
		
		//create edilenleri listeye atıyoruz.
		List<College> college = new ArrayList<College>();
		college.add(collegeOne);
		college.add(collegeTwo);
		college.add(collegeThree);
		
		University university = new University(college);
		List<College> colleges = university.getTotalCollegesUniversity();
		
		for (College college2 : colleges) {
			System.out.println("Name : " + college2.name
					+ "and" + "Address : " + college2.address);
		}


	}

}
