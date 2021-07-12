import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTypeStructuralTest {

	@Before
	public void setUp() throws Exception {
		TriangleType type = new TriangleType();
	}

	
	@Test
	public void testNotaTriangleAllZero() {
		int output = TriangleType.triangleType(0,0,0);
		
		assertEquals(output,4);
		
	}
	
	@Test
	public void testNotaTriangleZeroFirstParameter() {
		int output = TriangleType.triangleType(0,29,50);
		
		assertEquals(output,4);
		
	}
	
	@Test
	public void testNotaTriangleZeroSecondParameter() {
		int output = TriangleType.triangleType(29,0,50);
		
		assertEquals(output,4);
		
	}
	
	@Test
	public void testNotaTriangleZeroThirdParameter() {
		int output = TriangleType.triangleType(29,50,0);
		
		assertEquals(output,4);
		
	}
	
	@Test
	public void testOutofboundsFirstParameter() {
		int output = TriangleType.triangleType(1001,900,950);
	
		assertEquals(output,5);
		
	}
	
	
	@Test
	public void testOutofboundsSecondParameter() {
		int output = TriangleType.triangleType(900,1001,950);
	
		assertEquals(output,5);
		
	}
	
	@Test
	public void testOutofboundsThirdParameter() {
		int output = TriangleType.triangleType(900,950,1001);
	
		assertEquals(output,5);
		
	}
	
	@Test
	public void testValidScaleneTriangleSide2PlusSide3LessEqualSide1(){
		int output = TriangleType.triangleType(950,201,200);
	
		assertEquals(output,4);
		
	}
	
	
	@Test
	public void testValidScaleneTriangleSide1PlusSide2LessEqualSide3(){
		int output = TriangleType.triangleType(200,201,950);
	
		assertEquals(output,4);
		
	}

	
	@Test
	public void testValidScaleneTriangleSide1PlusSide3LessEqualSide2(){
		int output = TriangleType.triangleType(200,401,201);
	
		assertEquals(output,4);
		
	}

	
	
	@Test
	public void testScaleneSide1PlusSide2GreaterSide3True(){
		int output = TriangleType.triangleType(40,40,30);
	
		assertEquals(output,2);
		
	}
	
	@Test
	public void testScaleneSide1PlusSide2GreaterSide3False(){
		int output = TriangleType.triangleType(40,40,90);
	
		assertEquals(output,4);
		
	}
	
	@Test
	public void testIsoscelesSide1PlusSide2GreaterSide3True() {
		int output = TriangleType.triangleType(40,60,40);
	
		assertEquals(output,2);
		
	}
	
	@Test
	public void testIsoscelesSide1PlusSide2GreaterSide3False() {
		int output = TriangleType.triangleType(40,90,40);
	
		assertEquals(output,4);
		
	}
	
	@Test
	public void testEqulilateralSide2PlusSide3GreaterSide1True() {
		int output = TriangleType.triangleType(40,60,60);
	
		assertEquals(output,2);
		
	}
	
	@Test
	public void testEqulilateralSide2PlusSide3GreaterSide1False() {
		int output = TriangleType.triangleType(130,60,60);
	
		assertEquals(output,4);
		
	}
	
	
}
