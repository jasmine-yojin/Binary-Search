package uncertainty;

import java.util.Random;

public class Assignment1 {
	public static void main(String[] args)
	  {
	    int lower, upper;
	    
	    lower = Integer.parseInt(args[0]);
	    upper = Integer.parseInt(args[1]);
	    
	    testEachInteger(lower, upper);
	    System.out.println();
	    playOneThousandGames(lower, upper);
	    System.out.println();
	    playOneThousandGames(lower, upper);
	  }

	  public static String playGame(int chosenNumber, int lower, int upper)
	  {
		
		  String onesAndzeros="";
		  int middle;
		  boolean found= false;
		  
		  while(!found && lower<=upper) {
			  middle = (upper+lower)/2;
			  
			  if(chosenNumber > middle){
				  lower = middle+1;
				  onesAndzeros= onesAndzeros + "1";
				  if((chosenNumber == upper) && (chosenNumber==lower)) found = true; 
			  }else if (chosenNumber < middle){
				  upper = middle;
				  onesAndzeros= onesAndzeros + "0";			  
			  }else {
				  upper = middle;
				  onesAndzeros= onesAndzeros + "0";	
				  if((chosenNumber == upper) && (chosenNumber==lower)) found = true;  
			  }
		 }
		  
		  return onesAndzeros;
	  }

	  public static void testEachInteger(int lower, int upper)
	  {
		  
		  int a = (int) (Math.log10(upper)/Math.log10(2));
		  int b = a+1;
		  System.out.println("a: "+a);
		  System.out.println("b: "+b);
		  String str="";
		  double countA=0;
		  double countB=0;
		  double average;
		  
		  
		  for (int i = lower; i<=upper; i++) {
			  System.out.format("Chosen integer %3d: ", i); 
			  str = playGame(i, lower, upper);
			  System.out.println(str);
			  if (str.length()==a) countA++; 
			  else countB++;
		  }
		  
		  average= ((a*countA) + (b*countB))/upper;
		  
		  System.out.println ("a. The total number of chosen integers where only "+ a +" questions were asked: "+countA);
		  System.out.println ("b. The total number of chosen integers where only "+ b +" questions were asked: "+countB);
		  System.out.println ("c. The average number of questions asked: "+ average);
		  
	  }

	  public static void playOneThousandGames(int lower, int upper)
	  {
		  int a = (int) (Math.log10(upper)/Math.log10(2));
		  int b = a+1;
		  System.out.println("a: "+a);
		  System.out.println("b: "+b);
		  String str="";
		  double countA=0;
		  double countB=0;
		  double average;
		  int chosenInteger;
		  Random rn = new Random ();
		  
		  for (int i = 1; i<=1000; i++) {
			  chosenInteger = rn.nextInt(upper - lower +1) + lower;
			  str = playGame(chosenInteger, lower, upper);
			  if (str.length()==a) countA++; 
			  else countB++;
		  }
		  
		  average= ((a*countA) + (b*countB))/upper;
		  
		  System.out.println ("a. The total number of chosen integers where only "+ a +" questions were asked: "+countA);
		  System.out.println ("b. The total number of chosen integers where only "+ b +" questions were asked: "+countB);
		  System.out.println ("c. The average number of questions asked: "+ average);
	  }
}
