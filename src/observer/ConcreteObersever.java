package observer;

public class ConcreteObersever implements Observer{

	protected String observerStatus;
	protected ConcreteSubject subject;
	
	public ConcreteObersever(ConcreteSubject subject)
	{
		this.subject = subject;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void showStatus()
	{
		System.out.println("Observer "+this.getClass().getName()+ " is in state "+observerStatus);
	}
}
