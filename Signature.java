/* Simple signature generation program to put a bit of flare at the end or beginning of your programs
 * Currently supports Spaceless, Simple, and Flashy signatures.
 *
*/
import java.util.Date;
import java.text.SimpleDateFormat;

public class Signature
{
	final static String Name="Claire Software"; //set this to whatever you want.
	public static void Signature()
	{

	Date dNow = new Date( );
	SimpleDateFormat ft =
      new SimpleDateFormat ("YYYY ");
		System.out.println("\n\nProgrammed by" + Name + "," +ft.format(dNow)+"\nAll programs are free to use, and open source." );
	}
	public static void SignatureSpaceless()
	{
		Date dNow = new Date( );
		SimpleDateFormat ft =
	      new SimpleDateFormat ("YYYY ");
			System.out.println("Programmed by" + Name +","  +ft.format(dNow)+"\nAll programs are free to use, and open source." );
	}
	public static void SignatureFlashy()
	{
		System.out.println("*****************************************");
		System.out.println("* Programmed by Claire Software, 2017   *"); //Set this to whatever you like.
		System.out.println("*      All programs open source         *");
		System.out.println("*****************************************");
	}
}