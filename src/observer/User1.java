package observer;

public class User1 extends ConcreteObersever{

		
		public User1(ConcreteSubject subject) {
			super(subject);
			// TODO Auto-generated constructor stub
		}
		
		public void update()
		{
			if(subject.getState().equalsIgnoreCase("in-stock"))
			{
				observerStatus = "WOW!";
			}
			else if(subject.getState().equalsIgnoreCase("out-of-stock"))
			{
				observerStatus = "Oh Fish!";
			}
			else
			{
				observerStatus = "Never Mind";
			}
		}
}
