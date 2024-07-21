package Task_3;
import java.util.*;
public class UserBankAccount {
	public int Balance;

	//static Scanner s =new Scanner(System.in);
	public  int AccountNo(int ID) {
		//this.Balance= Balance;
		switch(ID) {
		case 123456789 :
			Balance =10000;
			return Balance;
		case 246801357 :
			Balance =50000;
			return Balance;
			//break;
		case 345671289 :
			Balance =5000;
			return Balance;
			//break;
		case 567812349 :
			Balance =20000;
			return Balance;
			//break;
		default :
			System.out.println("Enter Correct Account Number!..");
			}
		return 0;
	}
}
