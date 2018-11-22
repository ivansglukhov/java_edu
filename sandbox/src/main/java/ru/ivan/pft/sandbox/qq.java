package ru.ivan.pft.sandbox;

public class qq {
	
	public static void main(String[] args){
		greetings("ivan");
		int rad = 2;
		double circS = 3.1415*(rad*rad);
        System.out.println("Площадь круга с радиусом "+ rad +"    = " + circS);
        Sqare s = new Sqare(5);
        Rect r = new Rect(10,12);
        

		System.out.println("Площадь квадрата со стороной "+ s.l +" = " + area(s));
		System.out.println("Площадь прямоугольника со сторонами "+ r.a +" и "+r.b+" = " + area(r));
	}

	public static void greetings(String name){
	    System.out.println("Hello "+name+"!");
    }

	public static double area(Rect r){
		return r.a * r.b;
	}
	public static double area(Sqare s){
		return s.l * s.l;
	}

}