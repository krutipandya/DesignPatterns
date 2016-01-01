package observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{

	private String subjectStatus;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void attach(Observer obs) {
		observers.add(obs);
		
	}

	@Override
	public void detach(Observer obs) {
		observers.remove(obs);
		
	}

	@Override
	public void notifyOberservers() {
		for (Observer obs : observers)
		{
			obs.update();
		}
		
	}
	
	public void setStatus(String status)
	{
		subjectStatus = status;
		notifyOberservers();
		
	}
	public String getState()
	{
		return subjectStatus;
	}
	public void showStatus()
	{
		System.out.println("Subject "+this.getClass().getName()+ " is in state "+subjectStatus);
	}

}
