package com.library.price;

import java.util.Scanner;

public class BookPrice implements BookpriceDetails 
{
	@Override
	public double bookIndividualPrice(String bookId) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter price for book:");
		
		double price = s.nextDouble();
		
		return price;
	}
}
