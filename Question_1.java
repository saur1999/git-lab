package test;

import java.util.Scanner;

public class Question_1 { 
	
	int num1,num2,num3;
	int count ;
	Scanner sc = new Scanner(System.in);
	void show() {
		
		System.out.println("enter num1");
		num1=sc.nextInt();
		System.out.println("enter num2");
		num1=sc.nextInt();
		System.out.println("enter num3");
		num1=sc.nextInt(); 
	}
    void print() { 
    	for(int i=0;i<=3;i++) {
    	int sum = num1+num2+num3;
    	System.out.println("Total sum   :"+sum);
    	
    	int avg = sum/3;
    	System.out.println("Average  : "+avg); 
    	
    	System.out.println("Count  :"+count++);
    	
    }}
	public static void main(String[] args) {
		Question_1 q = new Question_1();
		q.show();
		q.print();

	}

}
//wap to ask a number and print sum and count and average  of digits .