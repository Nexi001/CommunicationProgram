package tojeto;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class klijent2 {

	
		public static void main(String args[]) throws UnknownHostException, IOException
		{
		int number,temp,i=0;
		String  temp2;
		
		String temp3;
		String tekst;
		while(true) {
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("127.0.0.1",1213);
		Scanner sc1= new Scanner(s.getInputStream());
		i++;
		System.out.println("Vi::");
		//number=sc.nextInt();
		tekst =sc.nextLine();
		PrintStream p=new PrintStream(s.getOutputStream());
		p.println(tekst);
		/*p.println(number);
		if(i==1) {
			temp2=sc1.nextLine();
			temp=sc1.nextInt();
			System.out.println(temp);
			System.out.println(temp2);
		}else
			temp=sc1.nextInt();
		System.out.println(temp);
	}*/
		temp3 =sc1.nextLine();
		System.out.println(temp3);
		
		}
		
}
}