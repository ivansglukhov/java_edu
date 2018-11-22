package ru.ivan.pft.sandbox;

public class Point {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public Point(double xPos1,double yPos1,double xPos2,double yPos2){
        this.x1=xPos1;
        this.y1=yPos1;
        this.x2=xPos2;
        this.y2=yPos2;
    }
    public double distance(){
        System.out.println("Вычисляем расстояние между точками");
        double a=this.x2-this.x1;
        double b=this.y2-this.y1;
        a=a*a;
        b=b*b;
        return Math.sqrt(a+b);
    }
}
