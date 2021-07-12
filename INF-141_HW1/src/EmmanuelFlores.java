
public class EmmanuelFlores {
	
	String name = "Emmanuel Flores";
	String netID = "egflores";
	int idNumber = 35152766;
	
	String getFullName()
	{
		return name;
	}
	
	String getFirstName()
	{
		String[] split = name.split("\\s+");
		return split[0];
		
	}
	
	String getLastName()
	{
		String[] split = name.split("\\s+");
		return split[1];
	}
	
	String getUCInetID()
	{
		return netID;
	}
	
	int getStudentNumber()
	{
		return idNumber;
	}
	
	String getRotatedFullName(int shift)
	{
		String[] splitName = name.split("");
		int length = splitName.length;
		String[] empty = new String[length];
		int adjShift = 0;
		
		if(shift == 0)
		{
			return name;
		}
		
		if(shift < 0)
		{
			
			shift = -(shift);
			adjShift = shift % length;	
				 
		}
		
		else
		{
			shift = shift % length;       
			adjShift = length - shift;
		 
		}
			
		
		for(int i=0; i <  adjShift; i++)
		{
			int position = length-adjShift;
	        empty[i] = splitName[position+i];
	    }
		
		int counter = 0;
		for(int i=adjShift; i < length; i++)
		{
			empty[i] = splitName[counter];
		    counter++;
		}
		
		String result = "";
		for(int i=0; i<length; i++)
		{
			result += empty[i];
		}
				
		return result;	
	}	
}
