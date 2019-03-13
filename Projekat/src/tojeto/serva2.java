package tojeto;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class serva2 {
	public static void main(String args[]) throws IOException
	{
		
	int number,temp,number2,temp3,i=0;
	String tekst;
	ServerSocket s1=new ServerSocket(1213);
	 while(true)
	    {
		 i++;
	Socket  ss=s1.accept();
	Scanner sc=new Scanner(ss.getInputStream());
	//number = sc.nextInt();
	tekst = sc.nextLine();
	
	
	PrintStream p=new PrintStream(ss.getOutputStream());
	if(tekst.equals("Dobar dan")) {
		p.println("Marko:: Dobar dan");
	}else if(tekst.equals("Kako si?")) {
		p.println("Marko:: Dobro sam, a ti?");
	}else {
		p.println("Pogresan unos");
	}
	
	//if(i==1) {	
	//temp=number*2;
		//String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime());
		//p.println(timeStamp);
		//p.println(temp);
	    //}else {
	    	//temp3=number*3;
	    	//p.println(temp3);
	    //}
	    }
	    }
}

