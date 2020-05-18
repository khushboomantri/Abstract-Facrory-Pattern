public class VideoGame {
	
	public enum DominionType
	{
		HUMAN,ROBOT
	}
	
	private Leader leader;
	private Fortress fortress;
	private Army army;
	
	
	public Leader getLeader() {
		return leader;
	}


	public void setLeader(Leader leader) {
		this.leader = leader;
	}


	public Fortress getFortress() {
		return fortress;
	}


	public void setFortress(Fortress fortress) {
		this.fortress = fortress;
	}


	public Army getArmy() {
		return army;
	}


	public void setArmy(Army army) {
		this.army = army;
	}
	
	public void createDominion(AbstractFactory f1)
	{
		this.leader=f1.createLeader();
		this.fortress=f1.createFortress();
		this.army=f1.createArmy();
	}
	
		public static AbstractFactory getFactory(DominionType Type)
		{
			switch (Type) {
			case HUMAN:
				
				return new HumanFactory(); // created human dominion and returned concrete factory.
			case ROBOT:
				
				return new RobotFactory(); // created robot dominion and returned concrete factory.
			default:
				throw new IllegalArgumentException("DominionType not supported.");
			}
		} 
	
		 //<< You will add get and set methods for leader, fortress and army >>
		 //<< Add method createDominion(…) that will take a concrete factory object to create the leader,
		 //fortress and army corresponding to the factory >>
		 public static void main(String[] args) {
			 
		 VideoGame game = new VideoGame();
		 
		 System.out.println("Creating Human Dominion");
		 AbstractFactory f1 = getFactory((DominionType.HUMAN));
		 game.createDominion(f1);
		 System.out.println(game.getArmy().getDescription());
		 System.out.println();
		 System.out.println(game.getFortress().getDescription());
		 System.out.println();
		 System.out.println(game.getLeader().getDescription());
		 System.out.println();
		 
		 
		 System.out.println("Creating Robot Dominion"); 
		 AbstractFactory f2 = getFactory((DominionType.ROBOT));
		 game.createDominion(f2);
		 System.out.println(game.getArmy().getDescription());
		 System.out.println();
		 System.out.println(game.getFortress().getDescription());
		 System.out.println();
		 System.out.println(game.getLeader().getDescription());
		 System.out.println();
	}

}
