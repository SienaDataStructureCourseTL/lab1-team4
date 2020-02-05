/**
 * This program is used to unit test the Pool class.
 * The format of the dollar amount is not important.
 * You should not be concerned that there are no 
 * dollar signs or there are more than two decimal
 * places.
 * 
 * @author 
 * @version Spring 2019
 */
public class DriverPoolStudent
{
    public static void main(String args[])
    {
        //1.  Create a Pool object.
        Pool p = new Pool();
        
        //2.  Test bounds of the range for pool days

        //2A. day - lower bound test
        System.out.println("day - lower bound test");
        System.out.println("Expected: false" );
        System.out.println("Actual  : " +p. addEntry(0,23,"lab1",10.0));
        System.out.println("Expected: true" );
        System.out.println("Actual  : " +p. addEntry(2,12,"dog",10.0));
        System.out.println("Expected: true" );
        System.out.println("Actual  : " +p. addEntry(1,1,"loser",10.0));
        System.out.println();

        //2B. day - mid-range test
        System.out.println("day - mid-range test");
        System.out.println("Expected: true" );
        System.out.println("Actual  : " +p. addEntry(3,7,"ringo",10.0));
        System.out.println();

        //2C. day - upper bound test
        System.out.println("day - upper bound test");
        System.out.println("Expected: false" );
        System.out.println("Actual  : " +p. addEntry(8,10,"jerry",10.0));
        System.out.println("Expected: true" );
        System.out.println("Actual  : " +p. addEntry(7,23,"phone",10.0));
        System.out.println("Expected: true" );
        System.out.println("Actual  : " +p. addEntry(6,1,"jim",10.0));
        System.out.println();

        //3.  Test the bounds of the range for pool hours
        //3A. hour - lower bound test
        System.out.println(" hour - lower bound test");
        System.out.println("Expected: false" );
        System.out.println("Actual  : " +p. addEntry(6,-1,"jane",10.0));
        System.out.println("Expected: true" );
        System.out.println("Actual  : " +p. addEntry(2,0,"beyonce",10.0));
        System.out.println("Expected: true" );
        System.out.println("Actual  : " +p. addEntry(5,1,"lucy",10.0));
        System.out.println();

        //3B. hour - mid-range test
        System.out.println(" hour - mid-range test");
        System.out.println("Expected: true" );
        System.out.println("Actual  : " + p. addEntry(3,12,"bieber",10.0));
        System.out.println();

        //3C. hour - upper bound test
        System.out.println(" hour - upper bound test");
        System.out.println("Expected: false" );
        System.out.println("Actual  : " +p. addEntry(6,24,"ken",10.0));
        System.out.println("Expected: true" );
        System.out.println("Actual  : " + p. addEntry(3,23,"hines",10.0));
        System.out.println("Expected: true" );
        System.out.println("Actual  : " +p. addEntry(5,22,"rogerB",10.0));
        System.out.println();

        //4A.  Test pool total; total is based on the pool entries above
        System.out.println("Test pool total; total is based on the pool entries above");
        System.out.println("Expected Total:  " + 100.0);
        System.out.println( "Actual Total " + p.poolTotal());
        System.out.println();
        //4B.  Test pool total with a new pool and no entries.
        System.out.println("Test pool total with a new pool and no entries");
        Pool q = new Pool();
        System.out.println("Expected Total :  " + 0);
        System.out.println( "Actual Total " + q.poolTotal());
        System.out.println();
        //5A.  Test getWinner - winner exists
        System.out.println("Test getWinner - winner exists");
        Entry winner = p.getWinner(1,1);
        System.out.println("Expected Winner :  Loser " );
        System.out.println( "Actual Winner " + winner.getName());
        System.out.println();
        //5B.  Test getWinner - no winner
        System.out.println("Test getWinner - no winner");
        Entry winner1 = p.getWinner(1,16);
        System.out.println("Expected Winner :  null " );
        if(winner1 ==null){ System.out.println( "Actual Winner : null" );}
        else {System.out.println( "Actual Winner " + winner1.getName());}
        System.out.println();


        //6.   print the complete matrix
        System.out.println("\n" + p);
        
        /*
         * 7. 
         * Use the Pool object, p, you created above.  If there are entries 
         * still available (there should be lots!), ask the user to pick a day 
         * and time.  Keep asking until they have picked one that is not 
         * already used (is null).  Then, add the user to the pool.  You 
         * will need their name and the amount they would like to enter.
         * You only need to enter one user in the pool.
         */
          Scanner scnr = new Scanner(System.in);
        Boolean truth1 = false; 
        while (truth1 ==false){

            System.out.println(" enter lucky day(1-7)-then press enter");
            int day1 =scnr.nextInt();
            System.out.println(" enter lucky hour(0-23)-then press enter");
            int hour1 = scnr.nextInt();
            System.out.println(" enter your name - then press enter");
            String name1 = scnr.next();
            System.out.println(" enter money amount - then press enter");
            Double amount1 = scnr.nextDouble(); 

            Boolean truth = p.addEntry(day1, hour1, name1, amount1); 
            if (truth ==true){truth1=true; System.out.println("Yaaaayy, you have succesfully entered!");}
            else{System.out.println("Try again please!");}
            
        }
    }
}
