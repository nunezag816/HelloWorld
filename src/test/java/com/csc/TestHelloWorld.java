package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.io.*;

public class TestHelloWorld {

  @Test
  public void testHelloWorld() {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    // action
    HelloWorld.main(null);

    // assertion
    assertEquals("Hello World!\n", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
}
