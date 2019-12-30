
public class Number {

	public boolean isPrime(int n)
	{
      if(n==1 || n==0)
    	  return false;
      else
      {
    	  int i = 2,k=(int) Math.sqrt(n);
    	  for(;i<=k;i++)
    		  if(n%i==0)
    			  return false;      
      }
      return true;
    	  
	}

}
