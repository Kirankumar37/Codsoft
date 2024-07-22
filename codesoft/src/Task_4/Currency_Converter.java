package Task_4;
import java.util.*;
public class Currency_Converter {
	static Scanner s=new Scanner(System.in);
	public static void Retry() {
		System.out.println("Press '1' to Retry!..(or)\n Press'2' to Exit..");
		System.out.print("Enter your Choice: ");
		int Option =s.nextInt();
		if(Option==1) {
		main(new String[] {});
		}
		else if (Option==2) {
			System.out.println("Exit: Thankyou for visiting!..");
		}
		else {
			System.out.println("Invalid Operation!.");
			System.out.println();
		}
		while(Option!=1&&Option!=2) {
			System.out.print("Enter your Choice: ");
		    Option =s.nextInt();
			if(Option==1) {
				main(new String[] {});
				}
				else if (Option==2) {
					System.out.println("Exit: Thankyou for visiting!..");
				}
				else {
					System.out.println("Invalid Operation!.");
				}
		}
	}
	public static void Invalid() {
		System.out.println("Invalid Operation!");
		System.out.println();
	}
	
	

	Currency_Converter(int base,int Target,double a){
		if(base<6&&Target<6) {
		if(base==Target) {
			System.out.println(a);
		}
		else if(base==1 && Target==2) {
			System.out.println(a*0.012);
		}
		else if(base==2&&Target==1) {
			System.out.println(a*83.66);
		}
		else if(base==3&&Target==2) {
			System.out.println(a*1.09);
		}
		else if(base==2&&Target==3) {
			System.out.println(a*0.92);
		}
		else if(base==1&&Target==3) {
			System.out.println(a*0.011);
		}
		else if(base==3&&Target==1) {
			System.out.println(a*91.07);
		}
		else if(base==1&&Target==4) {
			System.out.println(a*3.63);
		}
		else if(base==3&&Target==1) {
			System.out.println(a*0.28);
		}
		else if(base==2&&Target==4) {
			System.out.println(a*303.33);
		}
		else if(base==4&&Target==2) {
			System.out.println(a*0.0033);
		}
		else if(base==3&&Target==4) {
			System.out.println(a*330.19);
		}
		else if(base==4&&Target==3) {
			System.out.println(a*0.0030);
		}
		else if(base==1&&Target==5) {
			System.out.println(a*0.48);
		}
		else if(base==5&&Target==1) {
			System.out.println(a*2.08);
		}
		else if(base==2&&Target==5) {
			System.out.println(a*40.26);
		}
		else if(base==5&&Target==2) {
			System.out.println(a*0.025);
		}
		else if(base==3&&Target==5) {
			System.out.println(a*43.82);
		}
		else if(base==5&&Target==3) {
			System.out.println(a*0.023);
		}
		else if(base==4&&Target==5) {
			System.out.println(a*0.13);
		}
		else if(base==5&&Target==4) {
			System.out.println(a*7.53);
		}
		else {
			Invalid();
		}
		}
		else {
			//System.out.println("Invalid Operation!");
			Invalid();
		}
	}

	public static void main(String[] args) {
		System.out.println("---------CURRENCY CONVERTER-----");
		System.out.println("Available Currencies are Listed below...");
		System.out.println("1. Indian Rupee\n2. United States Dollar\n3. Euro\n4. Srilankan Rupee\n5. Peso");
		System.out.println();
		System.out.print("Choose the Base Currency:");
		int choice = s.nextInt();
		System.out.print("Enter the Target Currency:");
		int choice2 =s.nextInt();
		System.out.print("Enter the Amount for Conversion:");
		double amount =s.nextInt();
		Currency_Converter c1=new Currency_Converter(choice,choice2,amount);
		Retry();
		
	}

}
