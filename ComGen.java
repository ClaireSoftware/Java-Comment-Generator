//Toolkits are used to access the clipboard
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;  // Clipboard
import java.awt.datatransfer.StringSelection; // String Selector
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Date; //Automatic date functions
import java.text.SimpleDateFormat; //* Date function
/*This is a modified version of my original ComGen program, which also generates the opening lines of a program.
Sadly, this version does not indent the Lines properly. */

public class ComGenExtendedPane
{
	public static void main(String[] args)
	{
		Boolean Check1, Check2, Check3;
		int option;
		String name;
		String entry;
		String decisionString;
		//char decision;
		//The name is assumed to be constant, if you want to use this for someone other than me, you would have to change the name
		final String MyName= "East Apollo";
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
		String Comment="/* Programmer: "+MyName+" | Program: "+name +"\n | Programmed on " +ft.format(dNow)+" */"+"\npublic class "
		+name +"\n{"+"\n public static void main(String [] args)"+"\n{";// If you want to use manual dates,replace dNow with date
		StringSelection strSel = new StringSelection(Comment);
		clipboard.setContents(strSel, null);
		JOptionPane.showMessageDialog(null,Comment);
		//decisionString=JOptionPane.showInputDialog("do you want to do another program? (y/n) ");
		 option=JOptionPane.showConfirmDialog(null,
"Would you like to generate another comment?", "Another One", JOptionPane.YES_NO_OPTION);


	}
	while(option==0);
	SignatureDialog.SignatureFlashy();
	}
}
