package candy.controller;
import candy.model.MarshmellowMan;
public class CandyController 
{
	private MarshmellowMan myMan;
	public CandyController()
	{
		
	}
	
	public void start()
	{
		promptForInfo();
		makeMan();
	}
	private void promptForInfo()
	{
		//decide what to put on the MarshmellowCreature
	}
	private void makeMan()
	{
		myMan = new MarshmellowMan("Smooshy", 2, 2, 3, true);
	}

}
