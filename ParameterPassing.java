public class ParameterPassing {
    public static void main(String[] args) {
        B o=new B();
		o.i=5;
		System.out.println("i="+o.i);
		o.method(o);
		System.out.println("i="+o.i);
		o.method1(o);
		System.out.println("i="+o.i);
    }
}

class B{
	int i;
	void method(B obj) { // changes - pass by ref
		obj.i++; 
	}
	void method1(B obj) { // no change - pass by val
		obj=new B();
		obj.i++;
	}
}