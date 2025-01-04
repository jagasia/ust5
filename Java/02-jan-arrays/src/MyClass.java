public class MyClass {
	long var;

	public void MyClass(long param) {
		var = param;
	} // (Line no 1)

	public static void main(String[] args) {
		MyClass a, b;
		a = new MyClass(); // (Line no 2)
		Integer i=new Integer("20");
		String str="100";
		i=new Integer(str);
		
		i=Integer.valueOf(str);
		
	}
}