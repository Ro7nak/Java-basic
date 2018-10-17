package overriding_super;

public class EventRegistration {

	protected String name;
	protected String nameOfEvent;
	protected double registrationFee;
	
	public EventRegistration(String name, String nameOfEvent) {
		this.name = name;
		this.nameOfEvent = nameOfEvent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameOfEvent() {
		return nameOfEvent;
	}

	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	
	public void registerEvent() {
		switch (nameOfEvent) {
		case "ShakeALeg":
			registrationFee = 100;
			break;
		case "Sing&Win":
			registrationFee = 150;
			break;
		case "Actathon":
			registrationFee = 70;
			break;
		case "PlayAway":
			registrationFee = 130;
			break;
		default:
			break;
		}	
	}
	
	
}
