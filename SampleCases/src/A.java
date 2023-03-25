import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import javax.sound.midi.VoiceStatus;

public class A {
		
	public static void main(String[] args) {

		String tempString = "temptest code edited on saturday now";
		//temps
		StringBuffer tempOutBuffer = new StringBuffer();
		
		HashSet<Character> hSet = new HashSet<Character>();
		for(int i=0;i<tempString.length();i++) {
			
			if(tempString.charAt(i)!= ' ' && !hSet.contains(tempString.charAt(i))) {
				
				hSet.add(tempString.charAt(i));
				tempOutBuffer.append(tempString.charAt(i));
			}
		}
		
		long cnt = hSet.stream().count();
		hSet.stream().forEach(System.out::println);
		
		System.out.print(tempOutBuffer+" : "+cnt);
		
	}

}
