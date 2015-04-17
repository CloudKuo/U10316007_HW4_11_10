import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList{
	public static void main (String[]args){
		//excute program
		MyStack MyStack1 = new MyStack();//new a object
		Scanner input = new Scanner(System.in);//new a scanner
		
		for(int i=1;i<=5;i++){
			//a for loop to ask 5 number 
			System.out.println("please enter five number");
			String num= input.next();
			MyStack1.push(num);
			//inhertance MyStack.java
		}
		for(int a=1;a<=5;a++){
			//a for loop to use pop method
			System.out.println(MyStack1.pop()+"\n");
		}
	 
	
	}
}

