import java.io.*;
 
public class ex1044_Multiples
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			String[] numbers = br.readLine().split(" ");
			int a = Integer.parseInt(numbers[0]);
			int b = Integer.parseInt(numbers[1]);
			 
			if((a % b == 0) || (b % a == 0))
			{
				bw.write("Sao Multiplos\n");
			}
			else
			{
				bw.write("Nao sao Multiplos\n");
			}

			bw.flush();
        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
