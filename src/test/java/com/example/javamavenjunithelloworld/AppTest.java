package com.example.javamavenjunithelloworld;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
 
/*These tests ensure the consistency of everything that you do. 
So you can test everything, every time you change something. 
*/
public class AppTest {
     
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }
     
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }
     
    @Tag("DEV")
    @Test
    void testCalcOne()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Calculator c = new Calculator();
        Assertions.assertEquals( 4 , c.add(2, 2));
    }
     
    @Tag("PROD")    
    @Test
    void testCalcTwo()
    {
        System.out.println("======TEST TWO EXECUTED=======");
     Calculator c = new Calculator();
        Assertions.assertEquals( 6 , c.add(2, 5));
    }
     
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }
     
    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}
