public class Cheers {
    public static void main(String[] args) {

        String word = args[0];
        int numOfTimes = Integer.parseInt(args[1]);
        String upperWord = word.toUpperCase();

      
        String anLetters = "AEFHILMNOR";

     
        for (int i = 0; i < upperWord.length(); i++) {
            char letter = upperWord.charAt(i);

            
            if (anLetters.indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else {
              
                System.out.println("Give me a  " + letter + ": " + letter + "!");
            }
        }

     
        System.out.println("What does that spell?");

      
        for (int j = 0; j < numOfTimes; j++) {
            System.out.println(upperWord + "!!!");
        }
    }
}
