package ex04_hash;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		
		User user1 = new User("admin", "123456");
		User user2 = new User("admin", "654321");
		
		Set<User> set = new HashSet<User>();
		set.add(user1);
		set.add(user2);
		
		System.out.println(set);
		
	}
	
}
