import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTypeTest {
	
	//4c. EMMANEUL FLORES 35152766


	@Test
	public void testScalene() {
		int output = TriangleType.triangleType(29,20,35);
		
		assertEquals(output,1);
		
	}
	
	@Test
	public void testIsosceles() {
		int output = TriangleType.triangleType(5,5,2);
		
		assertEquals(output,2);
		
	}
	
	@Test
	public void testEquilateral() {
		int output = TriangleType.triangleType(200,200,200);
		
		assertEquals(output,3);
		
	}
	
	@Test
	public void testNotTriangle() {
		int output = TriangleType.triangleType(250,600,1000);
	
		assertEquals(output,4);
		
	}

	
	@Test
	public void testOutofbounds() {
		int output = TriangleType.triangleType(1001,1002,1007);
	
		assertEquals(output,5);
		
	}
	
	
	

}
