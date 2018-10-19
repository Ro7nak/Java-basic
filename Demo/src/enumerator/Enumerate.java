package enumerator;

public class Enumerate {

	enum Designation{
		CEO(2),GeneralManager(4),ReginalManager(20);
		
		private int noOfEmployees;
		
		Designation(int noOfEmployees){
			this.noOfEmployees = noOfEmployees;
		}
		
		public int getNoOfEmployees() {
			return noOfEmployees;
		}
		
	}
	
	public void reportees(Designation designation) {
		System.out.println(designation.getNoOfEmployees());
	}
	
	public static void main(String[] args) {
		Enumerate e = new Enumerate();
		e.reportees(Designation.CEO);
	}
}