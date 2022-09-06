public class BottlesOfBeer {
    public static void main (String[] args) {

        int beerNum =  99;

        String word = "bottles";


        while ( beerNum > 0 ) {
            if ( beerNum == 1 ) {
                word = "bottle"; // bottle meaning singular bottle.
            }
            System.out.println( beerNum + " "  + word + " of beer on the wall");
            System.out.println( beerNum + " "  + word + " of beer");
            System.out.println( "Take one down");
            System.out.println( "Pass it around");
            beerNum = beerNum - 1;

            if (beerNum == 1 ) {
                word = "bottle";
                System.out.println(beerNum + " " + word + " of beef on the wall");

            }
            //end else
            // end while loop
            // end class



        }



    }}

