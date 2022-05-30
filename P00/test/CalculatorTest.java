import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	  int a, b;
	  CalculatorD1 cal;

	  @Before
	  public void setUp() throws Exception {
	    a = 4321;
	    b = 1234;
	    cal = new CalculatorD1();
	  }


	  @Test
	  public void testAdd() {
	    int a = 4321;
	    int b = 1234;

	    CalculatorD1 cal = new CalculatorD1();
	    int actual = cal.add(a, b); 
	    int expected = 5555;
	    assertEquals (expected, actual);
	  }

	  @Test
	  public void testsub() {

	    // Act
	    int actual = cal.sub(a, b); 
	    int expected = 3087;
	    assertEquals(expected, actual);
	  }

	  @Test
	  public void testmul() {

	    // Act
	    int actual = cal.mul(a, b); 
	    int expected = 5332114;
	    assertEquals(expected, actual);
	  }

	  @Test
	  public void testdev() {

	    // Act
	    int actual =cal.div(a, b); 
	    int expected = 3;
	    assertEquals(expected, actual);
	  }




	  @After
	  public void tearDown() throws Exception {
	  }

	  @Test
	  public void test() {
	   // fail("Not yet implemented");
	  }

	}