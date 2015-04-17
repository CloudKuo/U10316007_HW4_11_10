import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList{
	public static void main (String[]args){
		MyStack MyStack1 = new MyStack();
		Scanner input = new Scanner(System.in);
		
		for(int i=1;i<=5;i++){
			System.out.println("please enter five number");
			String num= input.next();
			MyStack1.push(num);
			
		}
		for(int a=1;a<=5;a++){
			System.out.println(MyStack1.pop()+"\n");
		}
	 
	
	}
}

