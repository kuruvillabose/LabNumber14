package roshambo;

import java.util.Random;

public class Rand extends Player {
	

	public Rand() {
		name = "Rand";
	}
	
	@Override
	public RoshamboEnum generateRoshambo() {
		Random random = new Random();
		int input = random.nextInt(3);
		if(input==0)return RoshamboEnum.ROCK;
		else if(input==1)return RoshamboEnum.PAPER;
		else if(input==2)	return RoshamboEnum.SCISSORS;
		else return null;
	}

}
