
/**
 * 
 * @author Sharath
 *
 */
public class TestFanApp {

	public static void main(String[] args) {
		Fan Test1 = new Fan();
		Fan Test2= new Fan(2,true,8,"Blue");
		
		System.out.println(Test1.toString());
		System.out.println(Test2.toString());
	}
}
