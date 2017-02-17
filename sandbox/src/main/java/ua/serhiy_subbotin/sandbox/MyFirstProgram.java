package ua.serhiy_subbotin.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		double l = 5;
		double a = 4;
		double b = 6;
		hello("world");
		hello("user");
		hello("Serhiy");
		System.out.println(l + " " + area(l));
		System.out.println(a + " * " + b + " " + area(a, b));
	}
public static void hello(String somebody) {
		 System.out.println("Hello, " + somebody + "!");
}
public static double area(double len){
		return len * len;
}
public static double area(double a, double b){
	return a*b;
}
}