package za.ac.cput.Question2And3;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Question2And3.config.AppConfig;

/**
 * Created by student on 2015/02/20.
 */
public class TestAutoShop {

    private ApplicationContext ctx;
    private AutoShopInterface auto;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        auto = (AutoShopInterface)ctx.getBean("auto");
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testTurboSale() throws Exception {
        Assert.assertEquals(10, auto.turboSale(20, 10));           //10 turbos got sold

    }

    @Test
    public void testTurboStock() throws Exception {
        Assert.assertEquals(500, auto.turboStock(100, 5));         //100 boxes of garret turbos came in with 5 in each box

    }

    @Test
    public void testNOSMarkUpPrice() throws Exception {
        Assert.assertEquals(8500, auto.NOSMarkUpPrice(7000, 1500));        //mark up price is 1500

    }
}
