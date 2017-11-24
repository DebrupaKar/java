import com.library.customer.CustomerCartDetails;
import com.library.customer.CustomerDetails;
import com.library.price.BookPrice;
import com.library.price.BookpriceDetails;
import java.util.Scanner;

public class LibraryCustomerManagement {

	public static void main(String[] args) 
	{
		BookPrice book1 = new BookPrice();
		
		Scanner s = new Scanner(System.in);
		
		CustomerDetails customer = new CustomerCartDetails(book1);
		
		
		
		System.out.println("Enter the customer Ids");
		for(int i=0; i<custId.length; i++)
		{
			custId[i] = s.next();
		}
		
		int totalItemCount = customer.totalItems(custId);
		double totalPrice = customer.totalCartprice(custId);
		
		System.out.println("Count: " + totalItemCount + " Price: " + totalPrice);
	}

}
