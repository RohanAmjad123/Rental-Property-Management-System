

public class Singleton{
	
	
	private Singleton onlyInstance = null;
	private User currentUser;
	
	private Singleton(){
		currentUser = new User();
		
	}
	
	private Singleton(Singleton o, User c){ 
			currentUser = c;
			onlyInstance = o;
	}
	
	public void setCurrentUser(User a){
	currentUser = a;
	}
	
	public static Singleton getInstance(){
		if(onlyInstance==null){
		onlyInstance = new Singleton();
		}
		
	return onlyInstance;
	}
	
	
}
