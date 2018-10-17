package overriding_super;

public class SingleEventRegistration extends EventRegistration{

	private int participantNo;
	
	public SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
		super(name,nameOfEvent);
		this.participantNo = participantNo;
	}

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	
	public void registerEvent() {
		switch (super.nameOfEvent) {
		case "ShakeALeg":
			super.registrationFee = 100;
			break;
		case "Sing&Win":
			super.registrationFee = 150;
			break;
		case "PlayAway":
			super.registrationFee = 130;
			break;
		default:
			break;
		}	
		System.out.println("Thanks you "+super.name+" for youor Participation. Your registration fee is: "+super.registrationFee);
		System.out.println("you are participant no: "+participantNo);
	}
}
