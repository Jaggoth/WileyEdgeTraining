package StringFormatExercise.Accounts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class main {

	public static void main(String[] args) {
		
		Address ad1 = new Address(11, "Street1", "Country1", "Code1");
		Address ad2 = new Address(11, "Street2", "Country2", "Code2");
		Address ad3 = new Address(11, "Street3", "Country3", "Code3");
		Address ad4 = new Address(11, "Street4", "Country3", "Code4");
		
		Account ac1 = new Account(1, ad1);
		Account ac2 = new Account(1, ad2);
		Account ac3 = new Account(1, ad3);
		Account ac4 = new Account(1, ad4);
		
		ArrayList<Account> list = new ArrayList<Account>();
		list.add(ac1);
		list.add(ac2);
		list.add(ac3);
		list.add(ac4);
		
		Map<String, Integer> map = new HashMap<>();
		
		for (Account acc : list) {
			if (map.get(acc.getAddress().getCountry()) == null) {
				map.put(acc.getAddress().getCountry(), 1);
			} else {
				map.put(acc.getAddress().getCountry(), map.get(acc.getAddress().getCountry()) + 1);
			}
			
			
		}
		
		Entry<String, Integer> max = null;
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (max == null || entry.getValue() > max.getValue()) {
				max = entry;
			}
		
		}
		
		System.out.println(max.getKey());

	}

}
