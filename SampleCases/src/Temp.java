
public class Temp {

	private static Temp temp = null;
	
	private final int val;
	
	private Temp(int val) {
		this.val = val;
	}
	
	public static Temp getInstance(int tempVal) {
		
		if(temp==null) {
			temp = new Temp(tempVal);
		}else if(temp !=null  && temp.val != tempVal) {
		//	temp.val=tempVal;
		}
		
		return temp;
	}
		
}
