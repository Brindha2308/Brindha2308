package feb04week3.day1;

public class MyVehicle {
public static void main(String[] args) {
	Vehicle v=new Vehicle();
	Car c=new Car();
	Audi a=new Audi();
	c.openDoor();
	v.applyBreak();
	v.openDoor();
	//c.applyBreak();
	c.applyBreak();
	a.applyBreak();
	a.openDoor();
	a.autoBreak();
	a.function();
	a.openDoor();
	Car.colorCar();
	System.out.println(a.x);
	//a.x=a.x+5;
	//System.out.println();
}
}
