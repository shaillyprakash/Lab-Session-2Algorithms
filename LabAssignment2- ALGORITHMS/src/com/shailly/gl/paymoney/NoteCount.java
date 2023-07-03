package com.shailly.gl.paymoney;

public class NoteCount {
	
	public void counting(int[] currencyArr, int amount) {
		// TODO Auto-generated method stub
		int[]noteCount = new int[currencyArr.length];
		int sumOfNotes=0;
		for(int i=0; i<currencyArr.length; i++)
		{
		noteCount[i] = amount/ currencyArr[i];
		amount = amount%currencyArr[i];
		sumOfNotes+=noteCount[i];
	}
		for (int i=0; i < noteCount.length; i++) {
			if(noteCount[i]!=0) {
				System.out.println(currencyArr[i]+" : " +noteCount[i]);
				
			}
		}
	}
}
