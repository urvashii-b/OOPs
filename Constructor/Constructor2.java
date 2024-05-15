public class Constructor2 {
	public static void main(String[] args) {
		A o1=new A();
		System.out.println("a="+o1.geta()+" b="+o1.getb());
		A o2=new A(15,"Parameterized");
		System.out.println("a="+o2.geta()+" b="+o2.getb());
		A o3=new A(o2);
		System.out.println("a="+o3.geta()+" b="+o3.getb());
		//o1.A(); Not allowed
	}

}

class A{
	private int a;
	private String b;
	//private A()
	A(){ //Default constructor
		a=5;
		b="Default";
	}
	A(int a,String b){//Parameterized Constructor
		this.a=a;
		this.b=b;
	}
	A(A object){//Copy Constructor
		this.a=object.a;
		this.b=object.b;
	}
	
	int geta() {
		return a;
	}
	String getb() {
		return b;
	}
}
