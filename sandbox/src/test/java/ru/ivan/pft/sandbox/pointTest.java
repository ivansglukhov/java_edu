package ru.ivan.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class pointTest {
    @Test
    public void pointTest1(){
        double x1=0;
        double y1=0;
        double x2=1;
        double y2=1;

        double s=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

        Point pointNumberOne = new Point(x1,y1);
        Point pointNumberTwo = new Point(x2,y2);
        double methodDist=pointNumberOne.distance(pointNumberTwo.x,pointNumberTwo.y);
        Assert.assertEquals(methodDist,s);
        System.out.println("Метод: "+methodDist+", Тест: "+s);

    }

    @Test
    public void pointTest2(){
        double x1=0;
        double y1=0;
        double x2=2;
        double y2=2;

        double s=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

        Point pointNumberOne = new Point(x1,y1);
        Point pointNumberTwo = new Point(x2,y2);
        double methodDist=pointNumberOne.distance(pointNumberTwo.x,pointNumberTwo.y);
        Assert.assertEquals(methodDist,s);
        System.out.println("Метод: "+methodDist+", Тест: "+s);

    }

}
