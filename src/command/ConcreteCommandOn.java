package command;

public class ConcreteCommandOn implements Command{
	
	private ReceiverAppliance rcvr;
	public void execute()
	{
		rcvr.doAction();
	}
	@Override
	public void setReceiver(ReceiverAppliance rcvr) {
		
		this.rcvr = rcvr;
	}
	 
}
