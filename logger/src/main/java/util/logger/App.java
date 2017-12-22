package util.logger;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
    }
    
    public App() {
		// TODO Auto-generated constructor stubbbbbbbb
	}

	public void methodWithException() throws Exception {
		throw new NumberFormatException("Expected exception was thrown...!!!");
	}
}
