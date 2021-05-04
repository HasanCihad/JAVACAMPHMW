package fourthDaySecondHomework.Abstract;

import fourthDaySecondHomework.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to: " + customer.getFirstName());
		
	}

}
