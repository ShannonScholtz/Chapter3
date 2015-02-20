package za.ac.cput.Chapter3;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestExoticBeaches {

    @Before
    public void setUp() throws Exception
    {

    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testListData() throws Exception
    {
        WealthyLifestyle beaches = new Models();

        Assert.assertTrue(beaches.ExoticBeaches().contains("Matira Beach"));
    }

    @Test
    public void testListSize() throws Exception
    {
        WealthyLifestyle beaches2 = new Models();

        Assert.assertEquals(5, beaches2.ExoticBeaches().size());
    }

    @Test
    public void RemoveListObject() throws Exception
    {
        WealthyLifestyle beaches3 = new Models();

        Assert.assertTrue(beaches3.ExoticBeaches().remove("Anse Source d'Argent"));
    }
}
