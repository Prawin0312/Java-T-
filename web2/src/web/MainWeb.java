package web;
import java.util.Scanner;

public class MainWeb {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Openc op = new Openc();
		Auto au = new Auto();
		System.out.println("1.Opencart.com");
		System.out.println("2.Automation demo site");
		int count = s.nextInt();
		if(count==1){
			op.Cart();
		}
		else{
			au.demo();
		}
			
	}

}
