import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
class Main{
  public static void main(String[] args) {
 
	System.out.println("Masukan Nama Anda : ");
	Scanner in = new Scanner(System.in);
	try{
	    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	    String Nama = bufferRead.readLine();
		System.out.println("Berapa Umur kamu ?");
		int umur=in.nextInt();
		System.out.println("Nama Kamu : ");
		System.out.println(Nama);
		System.out.println("Umur Kamu : ");		
		System.out.println(umur);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
 
  }
}
