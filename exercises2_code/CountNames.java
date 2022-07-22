public class CountNames {
    public static void main(String[] args) {

        System.out.println("The number of command line arguments is: " + args.length);

        for( int i = 0; i < args.length; i++ ){
        	System.out.println( args[i] );
        }

        for( String inputs : args ){
        	System.out.println( inputs );
        }




		/*String [] arr = {" apple ", " pear ", " orange "};
		for ( String fruit : args ) {
			System.out.println( fruit );
			}

        String[] names = {"Tommy Lee Jones", "William Hurt", "Nicole Kidman",
            "Catherine Zeta-Jones", "JAMES EARL JONES", "Tom Hardy",
            "Judi Dench", "Sean Bean", "Carey Mulligan", "Toby Jones" };

						int count = 0;
						for(int i=0; i<names.length; i++){
							if( (names[i].toLowerCase()).endsWith("jones") ){
								count++;
							}
						}
						System.out.print(count);
*/
 }
}
