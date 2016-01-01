package command;

public class Switches implements InvokerRemoteControl{

private Command cmd;
	
	public void setCommand(Command cmd)
	{
		this.cmd = cmd;
	}
	public void invoke()
	{
		cmd.execute();
	}
}
