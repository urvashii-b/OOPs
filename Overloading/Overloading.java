// Multiple methods with the same name but different parameter lists to be defined within a class.
import java.util.Scanner;
public class Overloading {
		int a;
	public static void main(String[] args) {
		Shapes o=new Shapes();
		Overloading obj=new Overloading();
		Scanner input=new Scanner(System.in);
		obj.a=input.nextInt();
		o.calArea(obj.a);
		o.calArea(5,6);
		o.calArea(5.0);
		input.close();
	}

}

class Shapes{
	double area;
	void calArea(int a){
		area=a*a;
		System.out.println("Area of Square: "+area);
	}
	void calArea(double r){
		area=3.14*r*r;
		System.out.println("Area of Circle: "+area);
	}
	void calArea(int l,int b){
		area=l*b;
		System.out.println("Area of Rectangle: "+area);
	}
}