public class Manager extends User {
	
	private String managerKey;
	
	public Manager(String a){
		managerKey = a;
	}
    public Manager(){
		managerKey = "";
	}
	
	
	
	public void setManager(String a){
		managerKey = a;
	}
	
	public String getManager(){
		return managerKey;
	}
		
	
}
