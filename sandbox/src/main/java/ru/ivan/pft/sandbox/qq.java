package ru.ivan.pft.sandbox;
//sout!
public class qq {
	public static void main(String[] args) {
		double px1 = 72.5;
		double py1 = 5.60;
		double px2 = 2.58;
		double py2 = 83.35;
		Point p1 = new Point(px1, py1);
		Point p2 = new Point(px2, py2);
		System.out.println("Даны точки: P1(" + p1.x + "," + p1.y + ") и Р2(" + p2.x + "," + p2.y + ")");
		System.out.println("Расстояние равно "+distance(p1,p2));

	}
	public static double distance(Point p1, Point p2) {
		System.out.println("Вычисляем расстояние между точками");
		double a=p2.x-p1.x;
		double b=p2.y-p1.y;
		a=a*a;
		b=b*b;
		return Math.sqrt(a+b);

	}


}