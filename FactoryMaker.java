
public class FactoryMaker {
	
	public enum DominionType
	{
		HUMAN,ROBOT
	}
	
	public static AbstractFactory makeFactory(DominionType type)
	{
		switch (type) {
		 case HUMAN:
		 //<< Create and return a concrete factory to create Human Dominion >>
			 return new HumanFactory();
		 case ROBOT:
		 //<< Create and return a concrete factory to create Robot Dominion >>
			 return new RobotFactory();
		 default:
		 throw new IllegalArgumentException("DominionType not supported.");
		 }
	}
}
