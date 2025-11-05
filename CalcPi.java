
public class CalcPi {
	public static void main(String [] args) { 

		int numofPai = Integer.parseInt(args[0]);
		double pai = 1;
		double j=3;

		
		for (int i=1; i<numofPai ; i++)
		{

			if (i%2==0){
			pai= pai+1/j;
			j=j+2;
			}
			else {
			pai= pai-1/j;
			j=j+2;

			}

		}
		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated: " +pai*4);

			
			

	


	    
	}
}
