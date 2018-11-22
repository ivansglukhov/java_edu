package ru.ivan.pft.sandbox;
//sout!
public class qq {
	public static void main(String[] args) {
		double px1 = 72.5;
		double py1 = 5.60;
		double px2 = 2.58;
		double py2 = 83.35;
		Point p = new Point(px1, py1,px2,py2);
		System.out.println("Даны точки: P1(" + p.x1 + "," + p.y1 + ") и Р2(" + p.x2 + "," + p.y2 + ")");
		System.out.println("Расстояние равно "+p.distance());

	}
//	public static double distance(Point p1, Point p2) {
//		System.out.println("Вычисляем расстояние между точками");
//		double a=p2.x-p1.x;
//		double b=p2.y-p1.y;
//		a=a*a;
//		b=b*b;
//		return Math.sqrt(a+b);
//	}


}