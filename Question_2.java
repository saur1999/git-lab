package test;

import java.util.Scanner;

public class Question_2 {
      int  i ;
      int[] k  = new int[3];
      int c=0;
      Scanner sc = new Scanner(System.in);
      
      void show() { 
    	  
    	  System.out.println("Enter Number");
    	  i=sc.nextInt(); 
    	  
    	  
      }
      
      void print() { 
    	  int j = i*i; 
    	  int t = i;
    	  while(t>0) {
    		  c++;
    		 t= t/10;
    	  }
    	
    	 int l = (int) (j%(Math.pow(10,c)));
    	  if(i==l) {
    		  System.out.println("Number is Automorphic");
    	  }
    	  else {
    		  System.out.println("Number is not Automorphic");
    	  }
      }
	public static void main(String[] args) {
		Question_2 q = new Question_2();
		q.show();
		q.print();

	}

}
/*
 wap to check whether a single digit number is automorphic number or not .
automorphic number is number whose square ends with number itself  i.e.     5 * 5 =25 
if automorphic display "its automorphic number else not automorphic .
*/