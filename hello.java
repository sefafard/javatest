public class hello {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.

        String parmString = null;
        if (args.length != 0) {
            parmString = args[0];
        }

		NewClasses classDefinedInNewClasses;
        classDefinedInNewClasses = new NewClasses(parmString);
        
        if (args.length != 0) {
        System.out.println("Captured the cmd line arg:  "+args[0]);
        }

        System.out.println("Hello, World.  Be kind to each other");
		classDefinedInNewClasses.talkingclass(parmString);
		classDefinedInNewClasses.NC_Integers();
    }

}