package Entity;

public class Administrador extends User {

	@Override
	public boolean poderVer() {
		return true;
	}

	@Override
	public boolean podeAlterar() {
		// TODO Auto-generated method stub
		return true;
	}


}
