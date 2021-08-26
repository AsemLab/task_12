package jo.secondstep.main;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@ToString(of = { "$id", "firstName", "lastName", "gpa", "birthdate" })
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Student {

	private static int generatedId = 1000;

	@EqualsAndHashCode.Include
	private int $id = generatedId++;
	private String firstName;
	private String lastName;
	private String nationalId;
	private double gpa;
	private double secondaryGpa;
	private Date birthdate;

	public void setGpa(double gpa) {
		if (gpa > 0 && gpa <= 4.2)
			this.gpa = gpa;
	}

	public int getid() {
		return $id;
	}
}
