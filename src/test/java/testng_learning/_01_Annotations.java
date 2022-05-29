package testng_learning;

import org.testng.annotations.*;

public class _01_Annotations {
/*
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is BEFORE SUITE");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This is AFTER SUITE");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This is BEFORE TEST");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This is AFTER TEST");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is BEFORE CLASS");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is AFTER CLASS");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is BEFORE METHOD");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is AFTER METHOD");
    }

    @Test
    public void test1(){
        System.out.println("This is TEST1");
    }

    @Test
    public void test2(){
        System.out.println("This is TEST2");
    }


    EXPECTED OUTPUT:
    This is BEFORE SUITE
    This is BEFORE TEST
    This is BEFORE CLASS
    This is BEFORE METHOD
    This is TEST1
    This is AFTER METHOD
    This is BEFORE METHOD
    This is TEST2
    This is AFTER METHOD
    This is AFTER CLASS
    This is AFTER TEST
    This is AFTER SUITE
*/
    /*
    Expected output:
    This is BEFORE SUITE - runs once before everything
    This is BEFORE TEST  - runs once after suite but before everything else
    This is BEFORE CLASS - runs once after suite and test but before each method and each test
    This is BEFORE METHOD- runs before every test
    This is TEST1        - runs with the test given
    This is AFTER METHOD - runs after every test
    This is BEFORE METHOD
    This is TEST2
    This is AFTER METHOD
    This is AFTER CLASS  - runs once after all methods and tests
    This is AFTER TEST   - runs once last but before after suite
    This is AFTER SUITE  - runs once last
     */
}
