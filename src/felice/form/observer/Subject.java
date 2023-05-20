package felice.form.observer;

public interface Subject {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	private void sendUpdate(String value) {};
}
