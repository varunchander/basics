import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import javax.sound.midi.VoiceStatus;

public class A {
		
	public static void main(String[] args) {

		String tempString = "temp  test   uyt";
		//temps
		StringBuffer tempOutBuffer = new StringBuffer();
		
		HashSet<Character> hSet = new HashSet<Character>();
		for(int i=0;i<tempString.length();i++) {
			
			if(tempString.charAt(i)!= ' ' && !hSet.contains(tempString.charAt(i))) {
				
				hSet.add(tempString.charAt(i));
				tempOutBuffer.append(tempString.charAt(i));
			}
		}
		
		System.out.print(tempOutBuffer);
		
	}

}