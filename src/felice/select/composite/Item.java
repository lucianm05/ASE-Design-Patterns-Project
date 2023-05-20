package felice.select.composite;

public interface Item {
	String getValue();
	void addOption(Item item);
	void removeOption(Item item);
	Item getCurrentOption();
	Item getOption(int index);
}
