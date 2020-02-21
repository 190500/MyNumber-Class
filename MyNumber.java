

import java.util.Scanner;

public class MyNumber {
	
	private int x;
	
	MyNumber(){
		x = 0;
	}
	
	MyNumber(int y){
		x = y;
	}
	
	void isNegative(){
		
		System.out.println("Negative Number");
	}
	
	void isPositive(){
		System.out.println("Positive Number");
	}
	
	void isZero(){
		System.out.println("Zero");
	}
	
	void isEven(){
		System.out.println("Even Number");
	}
	
	void isOdd(){
		System.out.println("Odd Number");
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		MyNumber num =  new MyNumber();
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n == 0){
			num.isZero();
		}
		else{
			if(n % 2 == 0){
				num.isEven();
				if(n > 0){
					num.isPositive();
				}
				else{
					num.isNegative();
				}
			}
			else{
				num.isOdd();
				if(n > 0){
					num.isPositive();
				}
				else{
					num.isNegative();
				}
			}
		}
	}
	

}
