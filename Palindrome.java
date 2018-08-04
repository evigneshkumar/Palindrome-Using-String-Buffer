//Palindrome Using String Buffer
import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int isPalinNum(int input1){
		// Read only region end
		// Write code here...
		 String s= Integer.toString(input1);
         StringBuffer sb=new StringBuffer(s);
		String r=sb.reverse().toString();
		if(s.equals(r))
			return 2;
		else 
			return 1;
		
	}
}