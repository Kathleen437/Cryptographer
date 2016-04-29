import java.util.Scanner;
public class Encyptor
	{

		public static void main(String[] args)
			{
				replace();
				
			}
		public static void replace()
		{
			Scanner userInput = new Scanner (System.in);
			String words = userInput.nextLine();
			System.out.print("Return Value: " );
			System.out.println(words.replace("o", "KJi"));
			System.out.println(words.replace("t", "Arg"));
			
		}
		
	
	}
