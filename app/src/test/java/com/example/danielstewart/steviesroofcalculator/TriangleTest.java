package com.example.danielstewart.steviesroofcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle trianglebd;
    Triangle trianglebc;
    Triangle trianglebcd;

    @Before
    public void setup(){
        trianglebd = new Triangle(100, 57.74, -1);
        trianglebc = new Triangle(100, -1, 30);
        trianglebcd = new Triangle(100, 57.74, 30);
    }

    @Test
    public void canGetA(){
        assertEquals(115.47,trianglebd.getA(), 0.01);
        assertEquals(115.47,trianglebc.getA(), 0.01);
        assertEquals(115.47,trianglebcd.getA(), 0.01);
    }

    @Test
    public void canGetB(){
        assertEquals(100,trianglebd.getB(), 0.01);
        assertEquals(100,trianglebc.getB(), 0.01);
        assertEquals(100,trianglebcd.getB(), 0.01);
    }

    @Test
    public void canGetC(){
        assertEquals(57.74,trianglebd.getC(), 0.01);
        assertEquals(57.74,trianglebc.getC(), 0.01);
        assertEquals(57.74,trianglebcd.getC(), 0.01);
    }

    @Test
    public void canGetD(){
        assertEquals(30,trianglebd.getD(), 0.01);
        assertEquals(30,trianglebc.getD(), 0.01);
        assertEquals(30,trianglebcd.getD(), 0.01);
    }

    @Test
    public void canGetE(){
        assertEquals(60,trianglebd.getE(), 0.01);
        assertEquals(60,trianglebc.getE(), 0.01);
        assertEquals(60,trianglebcd.getE(), 0.01);
    }
}
