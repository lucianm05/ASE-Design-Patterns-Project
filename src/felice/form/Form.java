package felice.form;

import felice.form.observer.Observer;

public class Form implements Observer {

	@Override
	public void receiveUpdate(String name, String value) {
		System.out.println("FormControl-ul " + name + " si-a actualizat valoarea la: " + value);
	}
}
