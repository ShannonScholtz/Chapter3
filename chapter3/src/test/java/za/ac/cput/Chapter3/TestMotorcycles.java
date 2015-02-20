package za.ac.cput.Chapter3;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by student on 2015/02/20.
 */
public class TestMotorcycles
{
    @Before
    public void setUp() throws Exception
    {

    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testSetData() throws Exception{
        WealthyLifestyle bikes = new Models();

        Assert.assertTrue(bikes.Motorcycles().contains("ZX-10R"));
    }

    @Test
    public void testSetSize() throws Exception
    {
        WealthyLifestyle bikes2 = new Models();

        Assert.assertEquals(5, bikes2.Motorcycles().size());
    }

    @Test
    public void RemoveSetObject() throws Exception
    {
        WealthyLifestyle bikes3 = new Models();

        Assert.assertTrue(bikes3.Motorcycles().remove("400R"));
    }







}
