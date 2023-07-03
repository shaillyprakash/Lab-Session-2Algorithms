package com.shailly.gl.paymoney;

import java.util.Arrays;
import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the transaction array: ");
		int days = sc.nextInt();
		int[] transactions = new int[days];
		
		
		for(int i =0; i <transactions.length; i++) {
			System.out.println("enter the values of array : ");
			transactions[i]= sc.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		int numberOfTarget= sc.nextInt();
		for(int i= 0; i< numberOfTarget; i++) {
			int sum=0;
			int flag=0;
			System.out.println("enter the value of Target: ");
			int targetAmount = sc.nextInt();
			
		for(int j= 0; j< transactions.length; j++) {
			sum+=transactions[j];
			if(sum>targetAmount ) {
				flag= 1;
			
				System.out.println("Target achieved after " +(j+ 1)+ " transactions");
				break;
			}
		}
	if (flag==0)
		System.out.println("Given Target is not achieved");
	
		}
	}
}