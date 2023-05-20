package felice.form;

import java.util.ArrayList;
import java.util.List;

import felice.form.observer.Observer;
import felice.form.observer.Subject;

public abstract class FormControl implements Subject {
	protected String name;
	protected String value;
	protected List<Observer> observers;
	
	public FormControl(String name) {
		this.name = name;
		this.observers = new ArrayList<Observer>();
	}
	
	public String getValue() {
		return this.value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void onChange(String newValue) {
		this.value = newValue;
		this.sendUpdate(newValue);
	}
	
	public void description() {
		System.out.println("FormControl: " + this.name);
	}

	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);	
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	private void sendUpdate(String value) {
		if(this.observers.size() == 0) return;
		
		for(Observer observer:this.observers) observer.receiveUpdate(this.name, value);
	}
	
	
}
