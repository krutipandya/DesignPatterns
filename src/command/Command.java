package command;

public interface Command {

	public void setReceiver(ReceiverAppliance rcvr);
	public void execute();
}
