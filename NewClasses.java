public class NewClasses
{
	static String randomString = "This is me printing a string kept in a variable called randomString.";
	static int i1, i2, i3, Largest;

	
	// here's your constructor
	public NewClasses(String passedInArg) {
	}

	// you can put a bunch of methods below
	
	public void talkingclass(String passedInArg)
	{
		System.out.println("This is the NewClasses class");
		System.out.println(".. and here's the arg passed in:  " + passedInArg);
		System.out.println(randomString);
	}
	
	public void NC_Integers()
	{
		i1 = 3003;
		i2 = 1001;
		i3 = 2002;
		if (i1 < i2) {Largest = i2;}
		if (i2 < i3) {Largest = i3;}
		if (i3 < i1) {Largest = i1;}
							
		System.out.println("i1 is "+i1);
		System.out.println("i2 is "+i2);
		System.out.println("i3 is "+i3);
		System.out.println("The largest integer was "+Largest);
	}
}