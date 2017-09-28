package constructor;

public class defaultconstructor1 {
	int id;
	String name;
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args)
	{
		defaultconstructor1 d1=new defaultconstructor1();
		defaultconstructor1 d2=new defaultconstructor1();
		d1.display();
		d2.display();
		
	}

}
