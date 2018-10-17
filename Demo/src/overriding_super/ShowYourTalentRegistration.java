package overriding_super;

public class ShowYourTalentRegistration {

	public static void main(String[] args) {
		
		EventRegistration er = null;
		er = new SingleEventRegistration("Jenny", "Sing&Win", 1);
		er.registerEvent();
		er = new TeamEventRegistration("Aura", "ShakeALeg", 5, 1);
		er.registerEvent();
		er = new SingleEventRegistration("Hudson", "PlayAway", 2);
		er.registerEvent();

	}

}
