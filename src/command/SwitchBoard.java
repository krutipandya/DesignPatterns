package command;

import java.util.HashMap;

public class SwitchBoard {
	
	HashMap<String, Switches> switches = new HashMap<String, Switches>();
	
	public void addSwtiches(String key, Switches swi)
	{
		switches.put(key, swi);
	}
	public void selectSwitches(String key)
	{
		Switches swi = switches.get(key);
		if(swi!=null)
		{
			swi.invoke();
		}
		else
		{
			System.out.println(" No switch found ");
		}
	}
}
