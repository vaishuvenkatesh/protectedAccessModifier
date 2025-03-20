# protectedAccessModifier
  Tour.java
  package Privatepack;
import Privatepack2.House;
public class Tour extends House{
	public static void main(String[]args) {
		Tour h=new Tour();
		System.out.println(h.age);
		System.out.println(h.name);
		System.out.println(h.salary);
		System.out.println(h.place);
	}
}
House.java
  package Privatepack2;
public class House {
	protected int age=59;
	protected String name="vaishu";
	protected float salary=78900.0f;
	protected String place="krishnagiri";

}

  
