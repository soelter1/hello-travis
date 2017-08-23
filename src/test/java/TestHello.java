import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * A class to test Hello Travis.
 * @author Johannes Drönner
 *
 */
public class TestHello {
	
	@Test
    public void helloTravis() {
        // assert statements
        assertTrue("sayHelloTravis() should say \"Hello Travis!\"", Hello.sayHelloTravis().equals("Hello Travis!"));
    }

}
