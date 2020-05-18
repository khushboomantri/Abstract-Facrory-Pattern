
public class HumanFactory implements AbstractFactory{

	@Override
	public Leader createLeader() {
		return new HumanLeader();
		// TODO Auto-generated method stub
	
	}

	@Override
	public Fortress createFortress() {
		// TODO Auto-generated method stub
		return new HumanFortress();
	}

	@Override
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new HumanArmy();
	}
}
