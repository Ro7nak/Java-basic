package interface_classes;

public interface IBank {

	int CAUTIONMONEY = 2000;
	String createAccount(Customer customer);
	double issueVehicleLoan(String vehicleType, Customer customer);
	double issueHouseLoan(Customer customer);
	double issueGoldLoan(Customer customer);
}
