package tojeto;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Metci {
		public static void main (String[] args){
		double x, y;
		double n=0.0;
		int min=0;
		int max=1;
		for(int counter = 1; counter<=100000; counter++){
		x = ThreadLocalRandom.current().nextDouble(min, max); //znaci random brojevi double
		y = ThreadLocalRandom.current().nextDouble(min, max);	//znaci random brojevi double
		if (y>= Math.pow(x, 2) && y<=Math.sqrt(x)){
		n=n+1;
		} 
	}
	System.out.println(n);
	System.out.println(1*n/100000);
}
}
