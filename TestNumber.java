import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestNumber
{
	Number n=null;
	@Before
	public void setUp()
	{
		n=new Number();
	}
	@After
	public void tearDown()
	{
		n=null;
	}
	@Test
    public void testIsPrime()
    {
        assertFalse(n.isPrime(1));
    }
}
