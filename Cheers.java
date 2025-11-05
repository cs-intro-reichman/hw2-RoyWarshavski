
public class Cheers {
        public static void main(String[] args) {
                 
	    String word = args[0];
            int numofTime = Integer.parseInt(args[1]);
            String upperWord = word.toUpperCase();
          
          
            
            for(int i =0; i<upperWord.length();i++)
            {
           String vowels = "AEFHILMNOR";
           char letter = upperWord.charAt(i);

                if (vowels.indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ": "+ letter +"!");
}               else {
                System.out.println("Give me a  " + letter + "!");

                
}
            }

            System.out.println( "what does it spell?");

            for (int j=0;j<numofTime;j++){

                System.out.println(upperWord + "!!!");
            }



        }
}
//args[0].charAt(0)