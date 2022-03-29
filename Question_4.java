package test;

import java.util.Scanner;

public class Question_4 {
       void show() {
    	    String str = "";
    	    
    	     
    	     Scanner sc = new Scanner(System.in);
    	     
    	     System.out.println("Enter String");
    	     str=sc.next();
    	     
    	     System.out.println("Upper Case :  "+str.toUpperCase());
    	    
       }
	public static void main(String[] args) {
		Question_4 q = new Question_4();
		q.show();

	}

}
//wap to ask string from user and convert each letter to upper case