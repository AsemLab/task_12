package jo.secondstep.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import lombok.NonNull;
import lombok.var;


public class Launcher {

	public static void main(String[] args) throws ParseException {

		Student s = new Student();

		Student s2 = Student.of("Asem", "Mahmoud", "951523", 3.90, 76.2,
				new SimpleDateFormat("dd/MM/yyyy").parse("27/02/1997"));

		System.out.println(s2);
		System.out.println(s);
		System.out.println(getStudentRating(s2.getGpa()));
		System.out.println(getStudentRating(null));

	}

	public static String getStudentRating(@NonNull Double gpa) {

		var rating = "Fair";
		
		if (gpa >= 4 && gpa <= 4.2) {
			rating = "Distinguished";
		} else if (gpa >= 3.5 && gpa <= 3.99) {
			rating = "Excellent";
		}
		if (gpa >= 3 && gpa <= 3.49) {
			rating = "Very good";
		}
		if (gpa >= 2.5 && gpa <= 2.99) {
			rating = "Good";
		}
		return rating;
	}

}
