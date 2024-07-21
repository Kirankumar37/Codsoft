package Task_3;
import java.util.*;
public class ATM {
	static int ID;
	static UserBankAccount id =new UserBankAccount();

	static Scanner s =new Scanner(System.in);
	public static int checkBalance() {
		return id.AccountNo(ID);
	}
	public static void withDraw(int amount) {
		id.AccountNo(ID);
		if(amount>id.Balance) {
			System.out.println("Insufficient Balance!..");
		}
		else {
			id.Balance=id.Balance-amount;
			System.out.println("Withdraw Successful..");
			System.out.println("Your New Balance: "+id.Balance);
		}
	}
	public static void Deposit(int amount) {
		id.AccountNo(ID);
		id.Balance=id.Balance+amount;
		System.out.println("Deposit Successful!..");
		System.out.println("Your New Balance: "+id.Balance);
	}
	public static void main(String args[]) {
		System.out.println("----------------------------AUTOMATED TELLER MACHINE------------------------------------");
		System.out.println("Account numbers Included in this ATM:123456789 ,246801357 ,345671289 ,567812349");
		System.out.print("Enter your 9-Digit Account Number: ");
		ID =s.nextInt();
		ATM a =new ATM();
		System.out.println("Press '1' for Check Balance.");
		System.out.println("Press '2' for Withdraw Amount.");
		System.out.println("Press '3' for Deposit Amount.");
		System.out.println("Press '4' for Exit.");
		System.out.print("Enter your Option:");
		int Option = s.nextInt();
		if(Option==1) {
			System.out.println(a.checkBalance());
		}
		else if(Option==2) {
			System.out.print("Enter the WithDrawal Amount:");
		int withDrawAmount =s.nextInt();
			a.withDraw(withDrawAmount);
		}
		else if(Option==3) {
			System.out.print("Enter the Deposit Amount:");
			int DepositAmount=s.nextInt();
			a.Deposit(DepositAmount);
		}
		else if(Option==4) {
			System.out.println("EXIT: Thankyou For Choosing Us!..");
		}
		else {
			System.out.println("Invalid Option!..");
	
		}
		while(Option<0 || Option>4) {
			System.out.print("Enter The Corrct Option:");
			Option =s.nextInt();
			if(Option==1) {
				System.out.print("Your Current Balance: ");
				a.checkBalance();
			}
			else if(Option==2) {
				System.out.print("Enter the WithDrawal Amount:");
				int withDrawAmount =s.nextInt();
				a.withDraw(withDrawAmount);
			}
			else if(Option==3) {
				System.out.print("Enter the Deposit Amount:");
				int DepositAmount=s.nextInt();
				a.Deposit(DepositAmount);
			}
			else if(Option==4) {
				System.out.println("EXIT: Thankyou For Choosing Us!..");
			}
			else {
				System.out.println("Invalid Option!..");
		
			}
		}
		
	}
}
