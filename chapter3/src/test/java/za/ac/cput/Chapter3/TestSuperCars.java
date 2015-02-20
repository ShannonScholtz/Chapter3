package za.ac.cput.Chapter3;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestSuperCars {

    @Before
    public void setUp() throws Exception
    {

    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testMapData() throws Exception
    {
        WealthyLifestyle cars = new Models();

        Assert.assertEquals("McLaren F1", cars.SuperCars().get("Fast3"));
    }

    @Test
    public void testMapSize() throws Exception
    {
        WealthyLifestyle cars2 = new Models();

        Assert.assertEquals(5, cars2.SuperCars().size());
    }

    @Test
    public void testMapRemove() throws Exception
    {
        WealthyLifestyle cars3 = new Models();

        Assert.assertEquals("Hennessey Venom GT", cars3.SuperCars().remove("Fast5"));
    }

}
