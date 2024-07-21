package Task_2;
import java.util.*;
public class Main {
	static Scanner s =new Scanner(System.in);
	public static void Student(int numOfSub) {
		//this.numOfSub =numOfSub;
		int sum=0;
		int sub[]=new int [numOfSub];
		for(int i=0;i<numOfSub;i++) {
			System.out.print("Enter the mark:");
			sub[i]=s.nextInt();
			sum=sum+sub[i];
		}
		double Average = sum/numOfSub;
		char Grade;
		if(Average>=90) {
			Grade='O';
		}
		else if(Average>=80 && Average<90) {
			Grade ='A';
		}
		else if(Average>=60 && Average<80) {
			Grade ='B';
		}
		else if(Average>=50 && Average<60) {
			Grade ='C';
		}
		else {
			Grade='U';
		}
		System.out.println("Your Total mark in All "+numOfSub+"is "+sum);
		System.out.println("Your Average percentage is "+Average);
		System.out.println("Your Grade is "+Grade);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Number of Subject:");
		int numOfSub= s.nextInt();
		Student(numOfSub);
		
	}

}
