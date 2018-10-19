package encapsulationAndAbstraction;

public class Tester {

	public static void main(String[] args) {
		InfyTV i = new InfyTV();
		// we can't access private variables from infyTV class, but we can by using getter method and set using setter method.
		i.setCorrespondent("Kimberly");
		i.setNewsReporter("Hudson");
		i.setPhotographer("Joshua");
		i.documentaryFilm();
	}

}
