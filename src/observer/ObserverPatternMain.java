package observer;

public class ObserverPatternMain {
	
	public static void main(String[] args)
	{
		ConcreteSubject redDress = new RedDress();
	
		ConcreteObersever user1 = new User1(redDress);
		ConcreteObersever user2 = new User2(redDress);
		
		redDress.attach(user1);
		redDress.attach(user2);
		
		redDress.notifyOberservers();
		
		redDress.showStatus();
		user1.showStatus();
		user2.showStatus();
		
		redDress.setStatus("out-of-stock");
		user1.showStatus();
		user2.showStatus();
		
	}

}
