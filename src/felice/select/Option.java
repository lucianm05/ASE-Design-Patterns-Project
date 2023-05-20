package felice.select;

import felice.select.composite.Item;

public class Option implements Item {
	private String label;
	private String value;
	
	public Option(String label, String value) {
		this.label = label;
		this.value = value;
	}
	
	public String getLabel() {
		return label;
	}
	
	@Override
	public String getValue() {
		return value;
	}

	@Override
	public void addOption(Item item) {}

	@Override
	public void removeOption(Item item) {}

	@Override
	public Item getCurrentOption() {
		return null;
	}
	
	@Override
	public Item getOption(int index) {
		return null;
	}
	
	@Override
	public String toString() {
		return new String(this.label + " - " + this.value);
	}
}
