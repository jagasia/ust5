
public class Element<T> {
	private T value;
	
	public Element() {}

	public Element(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public T add(T t1, T t2)
	{
		if(t1 instanceof String)
		{
			String x=(String) t1;
			String y=(String) t2;
			return (T) (x+y);
		}else if(t1 instanceof Integer)
		{
			Integer x=(Integer) t1;
			Integer y=(Integer) t2;
			return (T)((Integer)(x+y));
		}
		return t1;
	}
	
}
