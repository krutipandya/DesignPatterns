package observer;

public class User2 extends ConcreteObersever{

	
	public User2(ConcreteSubject subject) {
		super(subject);
		// TODO Auto-generated constructor stub
	}
	
	public void update()
	{
		if(subject.getState().equalsIgnoreCase("in-stock"))
		{
			observerStatus = "Great!";
		}
		else if(subject.getState().equalsIgnoreCase("out-of-stock"))
		{
			observerStatus = "Oh No!";
		}
		else
		{
			observerStatus = "Never Mind";
		}
	}

}
