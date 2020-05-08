package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class BasicCalculatorTest {


public BasicCalculatorTest()
{

}

    @Test
    public void additionTest() throws InterruptedException {
        BasicCalcualator bc = new BasicCalcualator();
        bc.t1.setText("123");
        bc.t2.setText("223");

        bc.b1.doClick();
        String actual = bc.t3.getText();
        bc.dispose();
        //wait(300);
        String res = "346.0";
        assertEquals( res,actual);
    }

    @Test
    public void subtractionTest() throws InterruptedException {
        BasicCalcualator bc = new BasicCalcualator();
        bc.t1.setText("123");
        bc.t2.setText("23");

        bc.b2.doClick();
        String actual = bc.t3.getText();
        bc.dispose();
        //wait(300);
        String res = "100.0";
        assertEquals( res,actual);
    }

    @Test
    public void multiplicationTest() throws InterruptedException {
        BasicCalcualator bc = new BasicCalcualator();
        bc.t1.setText("100");
        bc.t2.setText("2");

        bc.b3.doClick();
        String actual = bc.t3.getText();
        bc.dispose();
        //wait(300);
        String res = "200.0";
        assertEquals( res,actual);
    }

    @Test
    public void divisionTest() throws InterruptedException {
        BasicCalcualator bc = new BasicCalcualator();
        bc.t1.setText("100");
        bc.t2.setText("2");

        bc.b4.doClick();
        String actual = bc.t3.getText();
        bc.dispose();
        //wait(300);
        String res = "50.0";
        assertEquals( res,actual);
    }
    @Test
    public void divisionTest2() throws InterruptedException {
        BasicCalcualator bc = new BasicCalcualator();
        bc.t1.setText("100");
        bc.t2.setText("0");

        bc.b4.doClick();
        String actual = bc.t3.getText();
        bc.dispose();
        //wait(300);
        String res = "Infinity";
        assertEquals( res,actual);
    }



}