package custom_generic;

public class MyGen<T> {

	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	public static void main(String[] args) {
		MyGen<String> mg=new MyGen<>();
		mg.setObj("Sudhanshu");
		System.out.println(mg.getObj());
		
	}
}
