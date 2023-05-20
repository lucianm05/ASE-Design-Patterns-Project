package felice.form;

public class Input extends FormControl {

	public Input(String name) {
		super(name);
	}

	@Override
	public void description() {
		System.out.println("Input: " + this.getName());
	}
}
