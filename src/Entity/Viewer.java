package Entity;

public class Viewer extends User {

	@Override
	public boolean poderVer() {
		return true;
	}

	@Override
	public boolean podeAlterar() {
		return false;
	}


}
