package lambda;

import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList();
		
		for(Employee e : list) {		//line 1
			e.setSal(e.getSal()*2);	
			System.out.println(e.getSal());//line 2	
		}					//line 3
		
		// list.forEach(e -> e.setSal(e.getSal()*2));
	}
}
