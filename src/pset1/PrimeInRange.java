package pset1;

public class PrimeInRange {
	public static boolean isPrime (int n)
	  {
	    if (n < 2)
	      return false;
	    for (int i = 2; i < n; i++)
	      {
	    if (n % i == 0)
	       return false;
	      }
	    return true;
	  }
  public static void main (String[]args) {
    int lower = 1, upper = 20;
    for (int i = lower; i <= upper; i++)
      if (isPrime (i))
       System.out.println (i);
  }
}