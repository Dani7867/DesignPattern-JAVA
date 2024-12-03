package behavioral.state;

public class RoboticOff implements RoboticState {

	private final Robot robot;
	public RoboticOff(Robot robot) {
		this.robot = robot;
	}
	@Override
	public void walk() {
		System.out.println("Can not Walk");
		
	}

	@Override
	public void cook() {
		System.out.println("Cannot cook at Off state.");
		
	}

	@Override
	public void off() {
		System.out.println("Already switched off...");
		robot.setRoboticState(robot.getRoboticOff());
		
	}
}
