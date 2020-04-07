package TestCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {
	
	@Test
	public void testSkip(){
		throw new SkipException("Sippig the test ondition");
	}

}
