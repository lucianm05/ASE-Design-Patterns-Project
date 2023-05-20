package proiect.select.decorator;

import felice.select.Select;
import felice.select.composite.Item;
import felice.select.state.StateClosed;

public class Decorator implements Item {
	protected Select select;

	public Decorator(Select select) {
		this.select = select;
	}
	
	public void onClick() {
		this.select.onClick();
	}
	
	public void onChange(int index) {
		this.select.onChange(index);
		this.select.setState(new StateClosed());
		this.select.getState().doAction();
	}

	@Override
	public String getValue() {
		return this.select.getValue();
	}

	@Override
	public void addOption(Item item) {
		this.select.addOption(item);
	}

	@Override
	public void removeOption(Item item) {
		this.select.removeOption(item);
	}

	@Override
	public Item getCurrentOption() {
		return null;
	}

	@Override
	public Item getOption(int index) {
		return this.select.getOption(index);
	}
	
}
