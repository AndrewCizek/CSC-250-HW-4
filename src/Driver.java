import java.util.Scanner;
public class Driver
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		String bi = scan.nextLine();
		scan.close();
		int dec = Integer.parseInt(bi,2);
		System.out.println("Answer in binary is "+'"'+dec+'"');
		System.out.println("Answer in hex is "+'"'+Driver.decimalToHex(dec)+'"');
	}
	
	public static String decimalToHex(int dec)
	{
		String hex = "";
		String map = "0123456789abcdef";
		while(dec != 0)
		{
			int track = (dec % 16);
			hex = map.charAt(track) + hex;
			dec = dec / 16;
		}
		return hex;
	}
}