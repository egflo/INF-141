import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEmmanuelFlores {

	EmmanuelFlores t;
	
	@Before
	public void setUp() {
		t = new EmmanuelFlores();
	}
	
	@Test
	public void testGetFullName() 
	{
		String name = t.getFullName();
		assertEquals(name,"Emmanuel Flores");
	}
	
	@Test
	public void testGetFirstName() 
	{
		String firstName = t.getFirstName();
		assertEquals(firstName,"Emmanuel");	
		
	}

	@Test
	public void testGetLastName() 
	{
		String lastName = t.getLastName();
		assertEquals(lastName,"Flores");	
		
	}
	
	@Test
	public void testGetUCInetID() 
	{
		String netID = t.getUCInetID();
		assertEquals(netID,"egflores");	
		
	}
	
	@Test
	public void testGetStudentId()
	{
		int id = t.getStudentNumber();
		assertEquals(id,35152766);
	}
	
	@Test
	public void testgetRotatedFullNameLeft()
	{
		String result = t.getRotatedFullName(2);
		assertEquals(result,"manuel FloresEm");
		
	}
	
	@Test
	public void testgetRotatedFullNameRight()
	{
		String result = t.getRotatedFullName(-5);
		assertEquals(result,"loresEmmanuel F");	
	}
	

}
