package felice.select;

import java.util.ArrayList;
import java.util.List;

import felice.select.composite.Item;
import felice.select.state.State;
import felice.select.state.StateClosed;
import felice.select.state.StateOpen;

public class Select implements Item {
	private String name;
	private String value;
	private List<Item> options;
	private State state;
	
	public Select(String name) {
		this.name = name;
		this.options = new ArrayList<>();
		this.state = new StateClosed();
	}
	
	public Select(String name, List<Item> options) {
		this.name = name;
		this.options = options;
		this.state = new StateClosed();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return this.state;
	}
	
	public void onClick() {
		if(this.state instanceof StateClosed) {
			this.state = new StateOpen();
			this.state.doAction();
			this.display();
			return;
			
		}
			
		this.state = new StateClosed();
		this.state.doAction();
	}
	
	public void onChange(int index) {
		if(this.state instanceof StateClosed) {
			System.out.println("Optiunea nu poate fi aleasa deoarece selectul este inchis.");
			return;
		}
		
		System.out.println("A fost apasata optiunea " + index);
		
		Item option = this.getOption(index - 1);
		
		if(option == null) {
			System.out.println("Optiunea aleasa nu este valida.");
			return;	
		}
		
		this.value = option.getValue();
		
		System.out.println(this.name + ": valoarea curenta - " + this.getValue());
	}
	
	public void display() { 
		System.out.println(this.name + ":");
		
		for(int i = 0; i < this.options.size(); i++) {
			System.out.println(i + 1 + ". " + this.options.get(i).toString());
		}
	}
	
	@Override
	public String getValue() {
		return this.value;
	}

	@Override
	public void addOption(Item item) {
		this.options.add(item);
	}

	@Override
	public void removeOption(Item item) {
		this.options.remove(item);
	}
	
	@Override
	public Item getCurrentOption() {
		for(Item option:this.options) {
			if(option.getValue() == this.value) return option;
		}
		
		return null;
	}
	
	@Override
	public Item getOption(int index) {
		if(index > this.options.size()) return null;
		
		return this.options.get(index);
	}
}
