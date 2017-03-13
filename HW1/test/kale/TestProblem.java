package kale;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//1代表等边三角形 2代表等腰三角形 3代表不等边三角形
public class TestProblem {
	Problem pro;
	@Before
	public void setUp() throws Exception {
		pro = new Problem();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		assertEquals(1, pro.test(1, 1, 1));
	}
	
	@Test
	public void test2() {
		assertEquals(2, pro.test(2, 1, 2));
	}
	
	@Test
	public void test3() {
		assertEquals(3, pro.test(5, 1, 6));
	}

}
