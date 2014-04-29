import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


class Search
{

	String command = "wget ";
	String link;
	String text;
	int subs;

	public Search(String name)
	{
	text = name;
	}

	String parseText(String url)
	{
	String link = url;
	//String www = "www.";
	//String slash = "//";
	
	if(text.contains("www."))
	{
	subs = text.indexOf("www.");
	subs+=4;
	link = text.subSequence(subs,text.length()).toString();	//remove the "www."
	//link = text.subSequence(subs,text.length()).toString();
	System.out.println(link);	
	}
	
	else if(text.contains("//"))
	{
	subs = text.indexOf("//");
	subs+=2;
	link = text.subSequence(subs,text.length()).toString();	//remove up till //
	System.out.println(link);
	}


	return link;

	}

}



class Commands
{
	String command;
	Process p;
	





	public void input()
	{
	try

		{
		String url;
		InputStreamReader console = new InputStreamReader(System.in);
		BufferedReader cin = new BufferedReader(console);


		do{	
		System.out.println("$: ");
		command = cin.readLine();
		

		if(command.equals("Fetch") || command.equals("fetch") || command.equals("f"))
		{
			System.out.println("Please Enter URL: ");
			url = cin.readLine();
			
			Search web = new Search(url);
			web.parseText(url);

			command = "wget " + url;

//////			System.out.println(command);

			p = Runtime.getRuntime().exec(command);
			p.waitFor();			
			
		}
		

		}while(!command.equals("exit"));

		} //end try block
		catch (IOException|InterruptedException e)
		{
		}


	} //end input()



}




public class ExecuteCommand
{

	public static void main(String[] args)
	{
		Commands input = new Commands();
		input.input();


	}






}