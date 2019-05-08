package roshambo;

public enum RoshamboEnum {
			
			ROCK, PAPER,SCISSORS;

			@Override
			public String toString() {
				String s = "";
				if (this.ordinal() == 0)
					s = "Rock";
				else if (this.ordinal() == 1)
					s = "Paper";
				else if (this.ordinal() == 2)
					s = "Scissors";
				return s;
				//The java.lang.Enum.ordinal() method returns the ordinal of this enumeration constant
				//(its position in its enum declaration, where the initial constant is assigned an 
				//ordinal of zero).
			}

		}



