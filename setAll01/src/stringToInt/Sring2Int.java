package stringToInt;

import java.util.IllegalFormatException;

public class Sring2Int {

	public static int string2Int(String str) throws Exception
	{
		
		char [] strarr = str.trim().toCharArray();
		int pow10 = 1;
		
		int res=0;
		
		for ( int i =strarr.length -1 ; i>=0 ; i-- )
		{
			if (strarr[i] < 48 || strarr[i] > 57)
			{	
				throw new Exception("given string is compose of ilgear chars, please use only digits");
			}
			
			// convert ascii to number
			int digit = ( (strarr[i] - 48) * pow10);
			res = res + digit;
			pow10 = pow10*10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(" 1234 : "+ string2Int(" 1234 " ));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
