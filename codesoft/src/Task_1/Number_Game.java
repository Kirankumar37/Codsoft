package Task_1;
import java.util.*;
public class Number_Game {


	public static void main(String[] args) {
		Random r =new Random();
		int randomNumber=r.nextInt(100);
		Scanner s=new Scanner(System.in);
		Number_Game n =new Number_Game();
		int count=5;
		int Guess=0;
		System.out.println("------------------------NUMBER GAME---------------------------");
		System.out.println("Rules:Guess a number from (1-100) in Less Number of Guesses..");
		System.out.println();
		while(count!=0) {
			System.out.print("Enter your Guess: ");
		int	Guess_1=s.nextInt();
		if(Guess_1==randomNumber) {
			System.out.println("Your Guess is Correct!..");
			break;
		}
		else if(Guess_1<randomNumber) {
			System.out.println("Your Guess is too Small...");
			--count;
			Guess++;
			
		}
		else if(Guess_1>randomNumber) {
			System.out.println("Your Guess is too Large...");
			--count;
			Guess++;
		}
		}
		if(count==0) {
		System.out.println();
		System.out.println("Number of Guess is Over!..");
		}
		int points=0;
		if(count>5) {
			points=0;
		}
		else if(count==5) {
			points=10;
		}
		else if(count==4) {
			points=8;
		}
		else if(count==3) {
			points=6;
		}
		else if(count==2) {
			points=4;
		}
		else if(count==1) {
			points=2;
		}
		else {
			points=0;
		}
		System.out.println();
		System.out.println("--------------------SCORE CARD---------------------");
		System.out.println("Number of             Points\nGuessess Used   ");
		System.out.println("   "+Guess+"                    "+points);
		System.out.println();
		System.out.println("Press '1' for Retry...");
		System.out.println("Press '2' for Exit");
		System.out.print("Enter the Option: ");
		int Option=s.nextInt();
		if(Option==1) {
			main(new String[] {});
		}
		else if(Option==2) {
			System.out.println("EXIT: Thankyou for Playing!...");
		}
		else {
			System.out.println("Invalid Option!.");
		}
		while(Option!=1 && Option!=2) {
			System.out.print("Enter the Correct Option: ");
			Option=s.nextInt();
			if(Option==1) {
				main(new String[] {});
			}
			else if(Option==2) {
				System.out.println("EXIT: Thankyou for Playing!...");
			}
			else {
				System.out.println("Invalid Option!.");
			}
		}
	}

}
