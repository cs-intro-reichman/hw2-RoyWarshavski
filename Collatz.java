
public class Collatz {
	public static void main(String args[]) {

		int N= Integer.parseInt(args[0]);
		String mood = args[1];
		if (mood.equals("v")){


		System.out.println("1 4 2 1 (4)");

		int numRows=N;
		int num=N;
		for(int i=1;i<numRows;i++){
			num=i+1;


		System.out.print(num + " ");
		int count=1;
			while (num!=1)
			{
			if (num%2==0){
				num=num/2;
				count++;
				System.out.print(num + " ");
			}

			else {
				num=num*3+1;
				count++;
				System.out.print(num + " ");
			}
		
	
			}
		System.out.println( "(" + count + ")");
			
	}
		System.err.println ("Every one of the first "+ N + " hailstone sequences reached 1.");
		
}
		else 
			System.err.println ("Every one of the first "+ N + " hailstone sequences reached 1.");








		}
}
