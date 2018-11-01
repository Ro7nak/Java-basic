package date_time;

import java.util.Date;
public class Employee {
	public int id;
	public String name;
	public Date dtJoining;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		dtJoining = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDtJoining() {
		return dtJoining;
	}
     
	
       // Getter and setter for all attributes except for dtJoining. 
       // dtJoining only has getter method no setter method.
}
