package abstract_classes;

abstract class Branch {

	abstract public boolean validPhotoProof(String proof);
	abstract public boolean validAddressProof(String proof);

	public void openAccount(String photoProof, String addressProof, int amount) {
		if (amount>=1000) {
			if(validPhotoProof(photoProof)&&validAddressProof(addressProof)) {
				System.out.println("Account opened");
			}
			else
				System.out.println("cannot open account");
		}
		else
			System.out.println("cannot open account");
	}

}
