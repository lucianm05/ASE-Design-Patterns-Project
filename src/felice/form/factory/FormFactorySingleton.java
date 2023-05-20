package felice.form.factory;

import felice.form.Checkbox;
import felice.form.FormControl;
import felice.form.Input;

public class FormFactorySingleton {
	private static FormFactorySingleton instance = null;
	
	private FormFactorySingleton() {}
	
	public static synchronized FormFactorySingleton getInstance() {
		if(instance == null) {
			instance = new FormFactorySingleton();
		}
		
		return instance;
	}
	
	public FormControl createFormControl(FormControlEnum formControlType, String name) {
		switch(formControlType) {
			case input: return new Input(name);
			case checkbox: return new Checkbox(name);
			default: return null;
		}
	}
}
