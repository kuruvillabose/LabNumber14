package roshambo;

public class Generate extends Player {

	public Generate() {
		super();
	}

	@Override
	public RoshamboEnum generateRoshambo() {
		
		if (response.compareTo("R") == 0 || response.compareTo("r") == 0) return RoshamboEnum.ROCK;
        if (response.compareTo("P") == 0 || response.compareTo("p") == 0) return RoshamboEnum.PAPER;
        return RoshamboEnum.SCISSORS;
		}

}
//The Java String compareTo() method is used for comparing two strings lexicographically. 
//Each character of both the strings is converted into a Unicode value for comparison. 
//If both the strings are equal then this method returns 0 else it returns positive or negative
//value.