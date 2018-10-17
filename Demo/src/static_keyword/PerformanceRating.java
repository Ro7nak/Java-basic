package static_keyword;

public class PerformanceRating {

	private static int Outstanding = 5;
	private static int Good = 4;
	private static int Average =3;
	private static int Poor = 2;
	
	public static int calculatePerformance(Employee employee) {
		if (employee.getPoint()<100 && employee.getPoint()>=80){
			return Outstanding;
		}
		else if(employee.getPoint()>60 && employee.getPoint()<79)
			return Good;
		else if(employee.getPoint()>50 && employee.getPoint()<59)
			return Average;
		else
			return Poor;
					
	}
	
}
