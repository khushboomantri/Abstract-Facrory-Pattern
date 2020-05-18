
public class RobotFactory implements AbstractFactory{

	
	@Override
	public Leader createLeader() {
		// TODO Auto-generated method stub
		return new RobotLeader();
	}

	@Override
	public Fortress createFortress() {
		// TODO Auto-generated method stub
		return new RobotFortress();
	}

	@Override
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new RobotArmy();
	}

}
