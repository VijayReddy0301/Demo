import java.util.Scanner;

class Guesser{

	int guessNum;

	String guessColor;

	Scanner sc = new Scanner(System.in);



	public int guessTheNumber() {


		System.out.println(" Hello Guesser This Is Umpire  ");

		System.out.println();

		System.out.println("Kindly Guess The Secret Number Pls Range 1 to 10 ");
		
		System.out.println("-------------------------------------------");
		
		System.out.println();

		guessNum =sc.nextInt();

		return guessNum;
	}


	public String guessTheColor() {

		System.out.println("-------------------------------------------");
		
		System.out.println("Guess The Color ");

		guessColor = sc.next();

		return guessColor;

	}

}

class Player{

	Scanner sc = new Scanner(System.in);


	public String getDetails() {

		System.out.println();

		System.out.println("Welcome To Guesser Game Buddy");

		System.out.println();

		System.out.println("May I Know Your Good Name ");
		
		System.out.println("-------------------------------------------");

		String name = sc.next();

		return name;

	}

	public String getColor() {

		String color = sc.next();

		return color;


	}

	public int guessTheNumber() {

		int guessNum;

		System.out.println("Guess The Number Pls Range From 1 to 10 ");
		
		System.out.println("-------------------------------------------");

		guessNum =sc.nextInt();


		if(guessNum >0  && guessNum<=10) {

			return guessNum;
		}else {

			System.out.println("YOU Gave The Wrong Input This Is Your Last Chance If You Give Again wrong Input The system Take 0 as Your Number");

			guessNum =sc.nextInt();

			if(guessNum >0  && guessNum<=10) {

				return guessNum;

			}else {

				return 0;
			}

		}

	}

}

class Umpire{

	int numFromGuesser;

	String colorFromGuesser;

	Player[] player;

	String[] names;

	String [] winNames;

	int [] numbers;

	Player[] winners;

	String[] colors;

	public void collectNumFromGuesser() {

		Guesser g = new Guesser();
		numFromGuesser = g.guessTheNumber();
	}

	public void collectColorFromGuesser() {

		Guesser g = new Guesser();
		colorFromGuesser = g.guessTheColor();
	}

	public void collectFromPlayer(int players) {

		player = new Player[players];

		names = new String[players];

		numbers = new int[players];

		for(int i=0;i<players;i++) {

			player[i] =  new Player();

			names[i] = player[i].getDetails();

			numbers[i] = player[i].guessTheNumber();
		}

	}

	public void compare(int players) {

		boolean flag = false;

		winners = new Player[players];

		winNames = new String[players];

		int count =0;

		int var =0;

		for(int i=0;i<players;i++) {

			if(numFromGuesser == numbers[i]) {

				System.out.println(names[i] + "  ! Won The Game! Congrats");
				
				System.out.println("----------------------------------------------");

				System.out.println();

				winners[var] = player[i];

				winNames[var]= names[i];

				var++;

				count++;

				flag = true;

			}else {

				System.out.println();

				if(numFromGuesser > numbers[i]) {

					System.out.println(names[i] + " That's Too Low... You Lost The Game Try Again");
					
					System.out.println("------------------------------------------------------------------------");
					
					System.out.println();
				}else {

					System.out.println(names[i] + " That's Too High...Lost The Game Try Again");
					
					System.out.println("------------------------------------------------------------------------");

					System.out.println();
				}
			}
		}

		if(flag == false) {

			System.out.println("No Player is Won");

			System.out.println();

			System.out.println("Better Luck Next Time");
			
			System.out.println("==============================================");
		}

		if(flag == true) {

			boolean temp = false;

			colors = new String[count];

			System.out.println("Congrats For Promoting To Level -2 ");
			
			System.out.println("-------------------------------------------");
			
			System.out.println("Winners");
			
			System.out.println("--------------:-");
			
			for(String name : winNames) {
				
				if(name!=null) {
				
				System.out.println("=>"+name);
				}
			}

			
			System.out.println("========================================");
			
			System.out.println("Let's Play Level -2");
			
			System.out.println("=======================================================");

			System.out.println();

			for(int i=0;i<count;i++) {

				System.out.println(winNames[i] + " ! Guess The Color");

				colors[i] = winners[i].getColor();

			}

			for(int i=0;i<count;i++) {

				if(colorFromGuesser.equalsIgnoreCase(colors[i])) {

					System.out.println("=>"+ winNames[i] + "  ! Won The Game And Prize Money Of Rs.50,000/-  Congrats");
					
					System.out.println("===========================================================================");

					System.out.println();

					System.out.println(" ******Collect Cash From Hyder Sir and Nithin Sir********   ");

					System.out.println("=============================================================================");
					
					
					System.out.println();

					temp= true;

				}else {
					
					
					
					System.out.println(" Ohhh ! " +winNames[i]+"  Lose The Game");

					System.out.println();

					System.out.println("Congrats For the Level 1 game ! Better Luck Next Time");
					
					System.out.println("------------------------------------------------------------");
					
					System.out.println();
					
				}

			}

		//	if(temp=false) {

			//	System.out.println(" Ohhh ! No One Won The Game");

			//	System.out.println();

			//	System.out.println("Congrats For the Level 1 game ! Better Luck Next Time");
		//	}


		}



	}

}

public class GuesserGame {

	public static void main(String[] args) {


		Scanner scan =  new Scanner(System.in);

		System.out.println("Welcome To Guesser Game");

		System.out.println("=============================");
		
		System.out.println();

		System.out.println("==>  Game Has 2 Levels");

		System.out.println();

		System.out.println("==> Level - 1 Guess The Number");

		System.out.println();

		System.out.println("==> After Level 1 Win Promoted To Level 2");

		System.out.println();

		System.out.println("==> Level 2 -  Guess The Color ");

		System.out.println("===================================");

		System.out.println();

		boolean playAgain;

		do {

			System.out.println("Enter Num Of Players Want To Play !");

			int players = scan.nextInt();

			if(players<=0) {

				System.out.println("Players Should Not Be zero Or Negative  ");



				System.out.println("ENTER NUMBER OF PLAYERS WANT TO PLAY	 !");

				players = scan.nextInt();

				if(players<=0) {

					System.out.println(" Again Wrong Input Good Bye...Thanks For Playing  ");
					System.exit(0);

				}
			}


			Umpire u = new Umpire();

			u.collectNumFromGuesser();

			u.collectColorFromGuesser();

			u.collectFromPlayer(players);

			u.compare(players);

			System.out.println();
			
			System.out.println("=====================================================");

			System.out.println("Would You Like To Play Again ? Yes / No");
			
			System.out.println("======================================================");

			String output = scan.next();



			if(output.equalsIgnoreCase("YES")  || output.equalsIgnoreCase("Y")) {

				playAgain = true;
			}else {

				playAgain = false;
			}

		}while(playAgain);

		System.out.println();
		
		System.out.println("***************************************");
		System.out.println("Thanks For Playing .. Goodbye....");
		System.out.println("***************************************");

	}	



}


