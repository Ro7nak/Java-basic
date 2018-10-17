package array_prac;

public class Salary {

	public static void main(String[] args) {
		double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		int countgr = 0,countsm = 0;
		double avg = 0;
		int sum =0;
		for(int i =0; i< salary.length; i++) {
			sum += salary[i];
		}
		avg = sum/salary.length;
		System.out.println("The average salary of the employee is "+avg);
		for(int i =0; i< salary.length; i++) {
			if(salary[i]>avg) 
				countgr++;
			else
				countsm++;
		}
		System.out.println("The number of employee having salary greater than the average is :"+countgr);
		System.out.println("The number of employee having salary lesser than the average is "+countsm);
		

	}

}
