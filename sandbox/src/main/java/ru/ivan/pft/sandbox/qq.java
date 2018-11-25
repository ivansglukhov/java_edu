package ru.ivan.pft.sandbox;
//sout!
public class qq {
	public static void main(String[] args) {
		double px1 = 0;		//_
		double py1 = 1;		//_|_Координаты первой точки
		double px2 = 0;		//_
		double py2 = 2;		//_|_Координаты второй точки
		Point p1 = new Point(px1,py1);
		Point p2 = new Point(px2,py2);
		System.out.println("Даны точки: P1(" + p1.x + "," + p1.y + ") и Р2(" + p2.x + "," + p2.y + ")");
		System.out.println("Расстояние равно "+p1.distance(p2.x,p2.y));

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