
public class CustomerDemo {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setFirstName("Tim");
		customer.setLastName("Tom");
		customer.setCreditCard("0001123");
		
		System.out.println(customer.getFirstName());
		System.out.println(customer.getLastName());
		System.out.println(customer.getCreditCard());
	}
	
	
	
}
