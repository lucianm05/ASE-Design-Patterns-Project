package felice.select.state;

public class StateClosed implements State {

	@Override
	public void doAction() {
		System.out.println("Select-ul s-a inchis");
	}

}
