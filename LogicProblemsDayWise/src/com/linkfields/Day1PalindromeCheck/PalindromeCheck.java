package com.linkfields.Day1PalindromeCheck;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		        Scanner scn = new Scanner(System.in);
		        System.out.println("Enter Any Number");
		        int num = scn.nextInt();
		        int r, sum=0,temp;
		        temp= num;
		        
		        if(num>=0)
		        {
		            while(num>0)
		            {
		                r=num%10;
		                sum=(sum*10)+r;
		                num=num/10;
		            }
		        
		            if(temp==sum)
		            {
		            System.out.println("Palindrome");
		            }
		            else
		            {
		                System.out.println("Not a Palindrome");
		            }
		        }
		        else
		        {
		            System.out.println("Invalid input");
		         }
		        scn.close();
		       
		    }
	
		}
