import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class BackTalk {
	
	private static Scanner scanner = new Scanner( System.in );
	private static String fileName;

	public static void main(String[] args){
        int ac;
        if (args.length >0) {
            // echo args
            for (ac=0; ac < args.length; ac++) {
                System.out.print (args[ac] + " ");
            }
            System.out.println(" ");
        }
		
		System.out.print( "Type one word followed by an integer: " );
        String input = scanner.next();
		System.out.println( "chars = " + input );
		int i = scanner.nextInt();
		System.out.println ("... and the number was... " + i);
		
		System.out.print( "Now, supply a number ... and don't cheat: " );
		try {
			i = scanner.nextInt();
			System.out.println ("... and the number was... " + i);
		} catch (InputMismatchException e) {
			System.out.println("wasn't a number!");
			return;
		}
		System.out.print("lastly, enter the name of a file to read:  ");
		fileName=scanner.next();
		// int number = Integer.parseInt(input);

        // The name of the file to open.
        // String fileName = "temp.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}