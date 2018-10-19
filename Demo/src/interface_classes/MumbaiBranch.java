package interface_classes;

public class MumbaiBranch implements IBank{

	@Override
	public String createAccount(Customer customer) {
		
		return "Acc12345";
	}

	@Override
	public double issueVehicleLoan(String vehicleType, Customer customer) {
		if (vehicleType=="bike")
			return 100000;
		else
			return 500000;
	}
	

	@Override
	public double issueHouseLoan(Customer customer) {
		return 200000;
	}

	@Override
	public double issueGoldLoan(Customer customer) {
		// TODO Auto-generated method stub
		return 50000;
	}

}
