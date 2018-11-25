package ru.ivan.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class squareTest {

    @Test

    public void testArea(){
        double sideLength=5;
        Sqare s =new Sqare(sideLength);
        //assert s.area() == 25; // хардкод - это плохо.
        double ExpectedValue = sideLength*sideLength; //предполагаем, что тут мы ТОЧНО считаем правильно.
        Assert.assertEquals(s.area(),ExpectedValue);
    }


}


