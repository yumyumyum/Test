import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Combinatorics
{
	public static void main(String[] args)
	{
	Combinatorics test = new Combinatorics();
	System.out.println(test.total());
	}

	
	/*returns the number of combinations without order of a,b,c,d,e,f,g,h,i 
	where each letter is a unique digit from 1 to 9
	such that abc+def=ghi 
	
	e.g. if a=1,b=2,c=4,d=6,e=5,f=9,g=7,h=8,i=3
		124+659=783
	*/
	public int total()
	{
		int a,b,c,d,e,f,g,h,i;
		int total=0;
	
		try
		{
			PrintWriter writer = new PrintWriter("Combinatorics.txt", "UTF-8");
			writer.println("abc  |  def  |  ghi");
			writer.println("===================");

			for (a=1;a<=9;a++)
			{
				for (b=1;b<=9;b++)
				{
					for (c=1;c<=9;c++)
					{
						for (d=1;d<=9;d++)
						{
							for (e=1;e<=9;e++)
							{
								for (f=1;f<=9;f++)
								{
									for (g=1;g<=9;g++)
									{
										for (h=1;h<=9;h++)
										{
											for (i=1;i<=9;i++)
											{
												if ((100*a+10*b+c+100*d+10*e+f)==(100*g+10*h+i))
													if (a!=b)
													if (a!=c)
													if (a!=d)
													if (a!=e)
													if (a!=f)
													if (a!=g)
													if (a!=h)
													if (a!=i)												
													if (b!=c)
													if (b!=d)
													if (b!=e)
													if (b!=f)
													if (b!=g)
													if (b!=h)
													if (b!=i)
													if (c!=d)
													if (c!=e)
													if (c!=f)
													if (c!=g)
													if (c!=h)
													if (c!=i)
													if (d!=e)
													if (d!=f)
													if (d!=g)
													if (d!=h)
													if (d!=i)
													if (e!=f)
													if (e!=g)
													if (e!=h)
													if (e!=i)
													if (f!=g)
													if (f!=h)
													if (f!=i)
													if (g!=h)
													if (g!=i)
													if (h!=i)												
													{
														total++;
														//System.out.println((a*100+b*10+c)+"+"+(d*100+e*10+f)+"="+(g*100+h*10+i));
														writer.println((a*100+b*10+c)+"  |  "+(d*100+e*10+f)+"  |  "+(g*100+h*10+i));
													}
			
											}
					
										}
			
									}
			
								}
			
							}
			
						}
			
					}
			
				}
		
			}
			writer.close();

		} catch (FileNotFoundException|UnsupportedEncodingException exc) {
		}
		
		return total;
	}

	
	
	
	
	
	
	
}