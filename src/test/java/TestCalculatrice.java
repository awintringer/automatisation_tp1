import junit.framework.Assert;
import org.junit.Test;

public class TestCalculatrice
{
    @Test
    public void addTest1plus1()
    {
        // AAA
        // Arrange = Organisation
        int arg1 = 1;
        int arg2 = 1;
        int expectedResult = 2;

        // Act = Action
        int result = Calculatrice.add(arg1, arg2);

        // Assert = Verifier
        Assert.assertEquals(expectedResult, result);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void addTestMax()
    {
        int arg1 = Integer.MAX_VALUE;
        int arg2 = 1;

        int result = Calculatrice.add(arg1, arg2);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void addTestMin()
    {
        int arg1 = Integer.MIN_VALUE;
        int arg2 = -1;

        int result = Calculatrice.add(arg1, arg2);
    }

    @Test
    public void subTestEgalPositif()
    {
        int arg1 = 1;
        int arg2 = 1;
        int expectedResult = 0;

        int result = Calculatrice.substract(arg1, arg2);

        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void subTestEgalNegatif()
    {
        int arg1 = -1;
        int arg2 = -1;
        int expectedResult = -2;

        int result = Calculatrice.substract(arg1, arg2);

        Assert.assertEquals(result, expectedResult);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void subTestMin()
    {
        int arg1 = -2;
        int arg2 = Integer.MAX_VALUE;

        int result = Calculatrice.substract(arg1, arg2);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void subTestMax()
    {
        int arg1 = 1;
        int arg2 = Integer.MIN_VALUE;

        int result = Calculatrice.substract(arg1, arg2);
    }
}
