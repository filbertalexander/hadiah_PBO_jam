import java.util.Scanner;
public class hadiah {
	public static void main (String [] args){
		int jam,menit,detik,total;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Inmput Jam = ");
		jam=input.nextInt();
		
		System.out.print("Inmput Menit = ");
		menit=input.nextInt();
		
		System.out.print("Inmput Detik = ");
		detik=input.nextInt();
		
		total=jam*360+menit*60+detik;
		System.out.println("");
		System.out.println("Total Detik = "+total);
	}
}