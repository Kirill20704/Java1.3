import java.util.Scanner;

public class Pal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		StringBuffer enil1 = new StringBuffer(line);
        enil1.reverse();
        String enil = new String(enil1);
        if(line.equals(enil))
        	System.out.print("Palindrom");
        else
        	System.out.print("Not palindrom");
	}
}
