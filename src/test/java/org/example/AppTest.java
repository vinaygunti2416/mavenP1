package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testcase1_login()
    {
        App a=new App();
        Assert.assertEquals(true,a.login_test("vinay","vinay123"));
    }

    @Test
    public void testcase2_login(){
        App a1= new App();
        Assert.assertEquals(false, a1.login_test("user","pass"));
    }

}
