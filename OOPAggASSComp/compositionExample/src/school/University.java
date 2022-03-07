package school;

import java.util.List;

//Üniversitenin birden fazla koleji var.
public class University {
	
	//Kolej listesine başvurmak için referans.
	private final List<College> colleges;

	public University(List<College> colleges) {
		super();
		this.colleges = colleges;
	}

	//kolej sayısını alma
	public List<College> getTotalCollegesUniversity() {
		return colleges;
	}
}
