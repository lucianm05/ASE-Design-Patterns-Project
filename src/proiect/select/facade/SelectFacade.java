package proiect.select.facade;

import felice.select.Select;

public class SelectFacade {
	public void selectOption(Select select, int index) {
		select.onClick();
		select.onChange(index);
		select.onClick();
	}
}
