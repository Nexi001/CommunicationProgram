package tojeto;
import java.util.Random;

public class metciInt {
	

			public static void main (String[] args){
		 	Random RanBroj = new Random();
			int x, y;
			double n=0.0;
			for(int counter = 1; counter<=100000; counter++){
			x = RanBroj.nextInt(2);//znaci 2 broj 0 i 1 - odnosno od 0 do 1
			y=  RanBroj.nextInt(2);//znaci 2 broj 0 i 1 - odnosno od 0 do 1
			if (y>= Math.pow(x, 2) && y<=Math.sqrt(x)){
			n++;
		 	} 
		}
		System.out.println(n);
		System.out.println(1*n/100000);
		
	}
}
