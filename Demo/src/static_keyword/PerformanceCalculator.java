package static_keyword;

public class PerformanceCalculator {

	public static void main(String[] args) {
		PerformanceRating r = new PerformanceRating();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.setPoint(80);
		e2.setPoint(90);
		e3.setPoint(50);
		
		System.out.println("rating for 1st employee is.."+r.calculatePerformance(e1));
		System.out.println("rating for 2nd employee is.."+r.calculatePerformance(e2));
		System.out.println("rating for 3rd employee is.."+r.calculatePerformance(e3));
	}

}
