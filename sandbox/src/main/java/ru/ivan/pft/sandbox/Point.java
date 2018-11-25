package ru.ivan.pft.sandbox;

public class Point {
    public double x;
    public double y;

    public Point(double xPos1,double yPos1){
        this.x =xPos1;
        this.y =yPos1;

    }
    public double distance(double x,double y){
        System.out.println("Вычисляем расстояние между точками");
        double a=x-this.x;
        double b=y-this.y;
        a=a*a;
        b=b*b;
        return Math.sqrt(a+b);
    }
}
