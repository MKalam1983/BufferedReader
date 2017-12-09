package Customer;

public class Customer_Details {
	int num3 =10;
	int num4 =2;
    double Cust_salary;
	public static void main(String[] args) 
	{
		
		Customer cust_detail = new Customer();
		cust_detail.customerInfo();			

		Customer cust_maths = new Customer();
		cust_maths.maths();
		
	    Customer customer_salary = new Customer();
		customer_salary.Cust_salary();
		
	}

}
