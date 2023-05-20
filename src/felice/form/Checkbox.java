package felice.form;

public class Checkbox extends FormControl {

	public Checkbox(String name) {
		super(name);
	}

	@Override
	public void description() {
		System.out.println("Checkbox: " + this.getName());
	}
}
