package util.logger;

import org.junit.*;
import org.junit.rules.ExpectedException;


public class AppTest{
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	private App app = new App();
	
	@Test
	public void testException() throws Exception{
		
		thrown.expect(NumberFormatException.class);
		thrown.expectMessage("Expected exception was thrown...!!!");
		
		app.methodWithException();
	}
	
	public void testFile(){
		
	}
}
