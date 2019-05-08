package roshambo;

public class Rock extends Player {
	
	public Rock() {
		name="Rock";
	}

	@Override
	public RoshamboEnum generateRoshambo() {
		return RoshamboEnum.ROCK;
		
	}

	

}
