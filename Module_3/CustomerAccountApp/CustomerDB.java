package com.java8;

/**
 * The CustomerDB class used to get the customer details based on ID
 * @author Sarath
 *
 */
public class CustomerDB {

	private static String id1 = "1007";
	private static String id2 = "1008";
	private static String id3 = "1009";
	
	/**
	 * 
	 * @param id
	 * @return Customer
	 */
	public static Customer getCustomer(String id) {
		if(id.equals(id1)) {
			
			return new Customer("Pavan","540 N 187th Ave","Omaha","68137");
		}else if(id.equals(id2)) {
			
			return new Customer("Mohan","3330 N 104th Ave","Omaha","68137");
		}else if(id.equals(id3)) {
			
			return new Customer("Mahesh","108 J Street","Omaha","68137");
		}else {
			return new Customer("Bava","114 J Street","Omaha","68137");
		}
		
	}
}
