package com.example.javamavenjunithelloworld;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestMetrix {

   private Metrix h;
	
   @Before
   public void setUp() throws Exception 
   {
      h = new Metrix();
   }

   @Test
   public void testHelloEmpty() 
   {
      assertEquals(h.getName(),"");
      assertEquals(h.getMessage(),"Hello!");
   }
	
   @Test
   public void testHelloWorld() 
   {
      h.setName("World");
      assertEquals(h.getName(),"World");
      assertEquals(h.getMessage(),"Hello World!");
   }
}
