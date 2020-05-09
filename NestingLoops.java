public class NestingLoops
{
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN" 
        //1. the N variable changes faster. 
        //2. It's controlled by the inner(n) loop
        
        for ( int n=1; n <= 3; n++ )
        {
            for  ( char c='A'; c <= 'E'; c++ )
            {
                System.out.println( c + " " + n );
            }
        }

        //3. When you change the order of the loops the alphabet runs through its cycle before the numbers run through theirs, opposite of the original loop structure.

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }

        //3.If you change print to println each numeric pair ends up on it's own line.


            System.out.println();
        //4.The print line above causes the output to place each set of numbers on its own line on a line, grouped by outer loop instance (1 group, 2 group, 3 group) rather than having all results on the same line.
        }

        System.out.println("\n");

    }
}