package test_2;

import java.util.Scanner;

//Armstrong number
public class A {
	
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int count=0,num1=num,num2=num,multi,sum=0;
		
		while(num>0) {
			count=count+1;
			num=num/10;	
		}
		while(num1>0) {
			int temp=num1%10;
			multi=1;
			for(int i=1;i<=count;i++) {
				multi=multi*temp;}
				sum=sum+multi;
			num1=num1/10;		
		}
		if(sum==num2) {
			System.out.println("Number is armstrong");
		}else {
			System.out.println("Number is not a armstrong");
		}
		
	}

}
