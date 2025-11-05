public class CalcPi {
    public static void main(String[] args) {

        int numofPai = Integer.parseInt(args[0]);
        double pai = 1.0;
        double j = 3.0;

        for (int i = 1; i < numofPai; i++) {

            if (i % 2 == 0) {
                pai = pai + 1.0 / j;
            } else {
                pai = pai - 1.0 / j;
            }
            j = j + 2.0;
        }

        System.out.println("pi according to Java: " + Math.PI );

        
        System.out.println("pi, approximated:     " + pai * 4 );
      
    }
}


