public class TimeCalc {
    public static void main(String[] args) {
     String time = args[0];

    int minToadd = Integer.parseInt(args[1]);	
	int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1)); 	
	int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

    

    int totalMin = (hours*60)+minutes+minToadd;
    int totalHours= (int) totalMin/60; 
    int newHour= totalHours%24;
    int newMin= totalMin-totalHours*60;

    
   if (newHour==0)
		{
			if (newMin>10)
		System.out.println ("0"+newHour + ":" + newMin );
		else
		System.out.println ("0"+newHour + ":" + "0" + newMin);
		}
        else 
        {
        if (newMin>10)
		System.out.println (+newHour + ":" + newMin );
		else
		System.out.println (newHour + ":" + "0" + newMin);
		}


        }
		

}

