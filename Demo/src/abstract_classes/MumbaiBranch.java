package abstract_classes;

public class MumbaiBranch extends Branch{

	@Override
	public boolean validPhotoProof(String proof) {
		if (proof.equalsIgnoreCase("pan card"))
			return true;
		return false;
	}

	@Override
	public boolean validAddressProof(String proof) {
		if(proof.equalsIgnoreCase("ration card"))
			return true;
		return false;
	}
	

	
}
