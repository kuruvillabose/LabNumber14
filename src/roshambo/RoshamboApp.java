package roshambo;

import java.util.Scanner;



public class RoshamboApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		char choice='y',pc;
		
		String name,playerChoice;
		System.out.println("Welcome to Rock Paper Scissors!");
		
		Player p=null;
		Rock r=new Rock();
		Rand rn=new Rand();
		name=Validator.getString(scan ,"Enter your name:");
		playerChoice=Validator.getString(scan ,"Would you like to play against The jets or The Sharks (j/s)?:");
		pc=playerChoice.charAt(0);
		if(pc=='j')p=r;
			 
		else if(pc=='s')
		 p=rn;
		while(choice=='y') {
			   System.out.print("Rock, paper or scissors?(R/P/S) : ");
		       String rps = scan.next();
		       Generate p1=new Generate();
		       p1.setName(name);
		       p1.setResponse(rps);

		      
		       if(rps.charAt(0)=='r' || rps.charAt(0) == 'R') rps="Rock";
		       else if(rps.charAt(0)=='p' || rps.charAt(0) == 'P') rps="Paper";
		       else if(rps.charAt(0)=='s' || rps.charAt(0) == 'S') rps="Scissors";
		       System.out.println(name+ " : " + rps);

		      
		       String roshambo=p.generateRoshambo().toString(); 
		       System.out.println(p.getName()+ " : " +roshambo );

		       
		       if(Character.toUpperCase(rps.charAt(0)) == roshambo.charAt(0))
		       System.out.println("Draw!");

		       else if(rps.equals("Paper") && roshambo.equals("Rock"))
		       System.out.println(p1.getName()+" Wins");

		       else if(roshambo.equals("Paper") && rps.equals("Rock"))
		       System.out.println(p.getName()+" Wins");

		       else if(rps.equals("Paper") && roshambo.equals("Scissors"))
		       System.out.println(p.getName()+" Wins!");

		       else if(roshambo.equals("Paper") && rps.equals("Scissors"))
		       System.out.println(p1.getName()+" Wins!");

		       else if(rps.equals("Scissors") && roshambo.equals("Rock"))
		       System.out.println(p.getName()+" Wins");

		       else if(roshambo.equals("Scissors") && rps.equals("Rock"))
		       System.out.println(p1.getName()+" Wins");

		       String userChoice=Validator.getString(scan ,"Play again?(y/n): ");
		       
		        choice =userChoice.charAt(0);

		        System.out.println();

		   }
		scan.close();

		 }
			
	
	}


