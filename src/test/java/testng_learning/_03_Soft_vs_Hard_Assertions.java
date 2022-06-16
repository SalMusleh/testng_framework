package testng_learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Soft_vs_Hard_Assertions {

    @Test(priority = 1)
    public void method1(){

        Assert.assertTrue(true);
        Assert.assertTrue(false,"=====Failure=====");

        System.out.println("hello World");
    }

    @Test(priority = 2, description = "Practicing soft assertions")
    public void method2(){


    }
}
