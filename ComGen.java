//Toolkits are used to access the clipboard
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;  // Clipboard
import java.awt.datatransfer.StringSelection; // String Selector
import java.util.Scanner;
import java.util.Date; //Automatic date functions
import java.text.SimpleDateFormat; //* Date function


public class ComGen
{
	public static void main(String[] args)
	{

		String Name;
		//The name is assumed to be constant, if you want to use this for someone other than me, you would have to change the name
		final String MyName= "Claire Software";
		String Date;  //If the Date function does not work for you, uncomment all of the lines that have an * next to them
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		Scanner input= new Scanner(System.in);
		Date dNow = new Date( ); //* Automatic Date Function
		SimpleDateFormat ft = //*Automatic Date Function
      new SimpleDateFormat ("MM/dd/YY "); //* Automatic Date Function*
		System.out.print("input the name of the project : ");
		Name= input.next();
		/*System.out.print("input the date(DD/MM/YY) : ");
		Date= input.next();*/
		//You would change the below line if you want a different type of comment.
		String Comment="/* Programmer: "+MyName+" | Program: "+Name +"\n | Programmed on " +ft.format(dNow)+" */"; // If you want to use manual dates,replace dNow with date
		StringSelection strSel = new StringSelection(Comment);
		clipboard.setContents(strSel, null);
		System.out.println(Comment);
		Signature.SignatureFlashy();
		System.exit(0);


	}
}
