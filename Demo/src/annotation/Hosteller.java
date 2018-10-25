package annotation;

@ChangeDetail(authorName="Tim",methodName="calculateFee")
@ChangeDetail(authorName="Rounak",methodName="calculateBusFee")
public class Hosteller extends NewStudent{

	@Override
	double calculateFee() {
		
		return 50000;
	}
	
	double calculateBusFee() {
		return 4000;
	}

}
