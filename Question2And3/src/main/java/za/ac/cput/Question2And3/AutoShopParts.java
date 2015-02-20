package za.ac.cput.Question2And3;

/**
 * Created by student on 2015/02/20.
 */
public class AutoShopParts implements AutoShopInterface
{
    @Override
    public int turboStock(int a, int b)
    {
        return a * b;
    }

    @Override
    public int turboSale(int a, int b)
    {
        return a - b;
    }

    @Override
    public int NOSMarkUpPrice(int a, int b)
    {
        return a + b;
    }
}


