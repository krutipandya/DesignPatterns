package command;

public class Client {

	private static String onMessage = "Turn on the appliance";
	private static String offMessage = "Turn off the appliance";
	
	private static SwitchBoard sb = new SwitchBoard();
	
	public SwitchBoard getSwitchBoard()
	{
		return sb;
	}
	
	public static void main(String[] args)
	{
		Switches onSwitch = new Switches();
		Switches offSwitch = new Switches();
		
		Command turnOn = new ConcreteCommandOn();
		Command turnOff = new ConcreteCommandOff();
		
		turnOn.setReceiver( new ReceiverAppliance() {
			
			@Override
			public void doAction() {
				System.out.println(onMessage);
			}
		});
		turnOff.setReceiver(new ReceiverAppliance() {
			
			@Override
			public void doAction() {
				System.out.println(offMessage);
			}
		});	
		
		onSwitch.setCommand(turnOn);
		offSwitch.setCommand(turnOff);
		sb.addSwtiches("on", onSwitch);
		sb.addSwtiches("off", offSwitch);
		sb.selectSwitches("on");
		sb.selectSwitches("off");
		sb.selectSwitches("auto");
	}
}
