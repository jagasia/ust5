
public class Sun {
	private static Sun obj=null;
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Sun() {
		
	}
	public static Sun getInstance()
	{
		if(obj==null)
			obj=new Sun();	//private cons allowed here (same class)
		return obj;
	}
	
	
}
