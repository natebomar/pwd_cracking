import java.util.Scanner;
public class pass1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your password(one lowercase letter): \n");
		String attempt = sc.nextLine();
		String pass = "w";
		if(attempt.equals(pass)){
			System.out.print("login correct \n");
		}
		else{
			System.out.print("login incorrect \n");
		}
	}
}
