package annotation;

@ChangeDetail(authorName="Rounak", methodName="calculateFee")
public class DayScholar extends NewStudent{

	@Override
	double calculateFee() {
		return 10000;
	}

}
