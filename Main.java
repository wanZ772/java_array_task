// coded by wanz
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner get_data = new Scanner(System.in);
		int numbers[] = new int[50];
		int data =0;
		while (data < 50)   {
		    System.out.print("Please enter a number: ");
		    int the_number = get_data.nextInt();
		    
		    if (the_number % 4 == 0)    {
		        System.out.println(the_number + " can be divided by 4");
		    }
		    numbers[data] = the_number;
		    data++;
		}
	}
}
