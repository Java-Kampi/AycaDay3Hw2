package Day3Hw2;

public class UserManager {

	public void add(User user) {
		System.out.println("User with user id "+ user.getId()+" is added...");
		
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}
	
	
}
