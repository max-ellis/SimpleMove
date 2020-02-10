package example;

import example.Main;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before; 


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestMain {
  private final ByteArrayOutputStream content = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @Test
  public void assertEqualsTest() {
  Helper helper = new Helper();

    int expectedX = 20;
    int expectedY = 4;
    assertEquals(expectedX, helper.getX());
    assertEquals(expectedY, helper.getSecondNumber());
    
  }
  
  @Before
  public void setUpStream() {
    System.setOut(new PrintStream(content));
  }

  @Test
  public void assertPrintTest() {
    Helper helper = new Helper();
    Helper.graph(20, 4);
    assertEquals("80\n", content.toString());
  }

  @After
  public void restoreStream() {
    System.setOut(originalOut);
  }

}
