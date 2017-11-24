package com.library.customer;

import com.library.price.BookPrice;
import com.library.price.BookpriceDetails;

public class CustomerCartDetails implements CustomerDetails
{
	BookPrice bookPrice;
	
	public CustomerCartDetails(BookPrice book1)
	{
		this.bookPrice = book1;
	}
	
	

	@Override
	public int totalItems(String[] custId) 
	{
		int count = 0;
		for(String bookId  : custId )
		{
			count++;
		}
		return count;
	}

	@Override
	public double totalCartprice(String[] custId) 
	{
		double total=0;
		
		for(String bookId  : custId )
		{
			total = total + bookPrice.bookIndividualPrice(bookId);
		}
		return total;
	}
	

}
