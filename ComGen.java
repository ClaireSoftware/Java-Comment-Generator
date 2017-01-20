//Toolkits are used to access the clipboard
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;  // Clipboard
import java.awt.datatransfer.StringSelection; // String Selector
import java.util.Scanner; //Keyboard Input
import javax.swing.JOptionPane; //Options
import java.util.Date; //Automatic date functions
import java.text.SimpleDateFormat; //* Date function
/*This is a modified version of my original ComGen program, which also generates the opening lines of a program.
Sadly, this version does not indent the Lines properly. */

public class ComGenExtendedPane
{
	public static void main(String[] args)
	{
		Boolean Check1, Check2, Check3;

		String name;
		String entry;
		String decisionString;
		char decision;
		//The name is assumed to be constant, if you want to use this for someone other than me, you would have to change the name
		final String MyName= "Claire Software";
		/*String Date; */ //If the Date function does not work for you, uncomment all of the lines that have an * next to them
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		Scanner input= new Scanner(System.in);
		Date dNow = new Date( ); //* Automatic Date Function
		SimpleDateFormat ft = //*Automatic Date Function
      new SimpleDateFormat ("MM/dd/YY "); //* Automatic Date Function*
      do
      {
		entry=JOptionPane.showInputDialog("input the name of the project : ");
		name= entry;
		/*System.out.print("input the date(DD/MM/YY) : ");
		Date= input.next();*/
		//You would change the below line if you want a different type of comment.
			String Comment="/* Programmer: "+MyName+" | Program: "+name +"\n | Programmed on " +ft.format(dNow)+" */"+"\npublic class "
		+name +"\n{"+"\n public static void main(String [] args)"+"\n{";// If you want to use manual dates,replace dNow with date
	      //The above line generates a comment in the format /* Yourname | Program: ProgramName | Programmed on: Date and then generates the opening lines of the program
	      
		StringSelection strSel = new StringSelection(Comment);
		clipboard.setContents(strSel, null);
		JOptionPane.showMessageDialog(null,Comment);
		decisionString=JOptionPane.showInputDialog("do you want to do another program? (y/n) ");
		decision=(char) decisionString.charAt(0);

	}
	while(decision=='y'||decision=='Y');
	SignatureDialog.SignatureFlashy(); //Requires my Signature package, just comment this out if not wanted.
	}
}
