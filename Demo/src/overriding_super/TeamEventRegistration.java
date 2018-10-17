package overriding_super;

public class TeamEventRegistration extends EventRegistration{

	private int noOfParticipants;
	private int teamNo;
	
	public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {
		super(name, nameOfEvent);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}

	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
	public void registerEvent() {
		switch (super.nameOfEvent) {
		case "ShakeALeg":
			super.registrationFee = 50*noOfParticipants;
			break;
		case "Sing&Win":
			super.registrationFee = 60*noOfParticipants;
			break;
		case "Actathon":
			super.registrationFee = 80*noOfParticipants;
			break;
		case "PlayAway":
			super.registrationFee = 100*noOfParticipants;
			break;
		default:
			break;
		}	
		System.out.println("Thanks you "+super.name+" for youor Participation. Your registration fee is: "+super.registrationFee);
		System.out.println("you are participant no: "+teamNo);

	}
}
