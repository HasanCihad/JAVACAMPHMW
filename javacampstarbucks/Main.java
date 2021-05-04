package fourthDaySecondHomework;

import java.util.Date;

import Adapters.MernisServiceAdapter;
import fourthDaySecondHomework.Abstract.BaseCustomerManager;
import fourthDaySecondHomework.Concrete.NeroCustomerManager;
import fourthDaySecondHomework.Concrete.StarbucksCustomerManager;
import fourthDaySecondHomework.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Kemal","Türk",new Date(1990),"23456789132"));
		System.out.println();
	}

}
