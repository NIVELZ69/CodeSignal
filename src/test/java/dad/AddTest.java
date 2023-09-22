package dad;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AddTest {
	
	private Add add;
	
	@Before
	public void setup() {
		add = new Add();
	}

	public void test1() {
		int result = add.solution(1, 2);
		assertEquals(3, result);
	}
	
	public void test2() {
		assertEquals(1000, add.solution(0, 1000));
		}
	
	public void test3() {
		assertEquals(-37, add.solution(2, -39));
	}
	
	public void test4() {
		s
	}
	
	
}
