import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class singletonTest {

	@Test
	public void shouldReturnInstanceOfSingletonObject() {
		assertNotNull(Singleton.getInstance());	
	}

	@Test
	public void shouldReturnSameInstanceEveryTime() {
		assertSame(Singleton.getInstance(), Singleton.getInstance());	
	}

}