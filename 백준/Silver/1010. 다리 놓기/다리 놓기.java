import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        
        for(int i=0; i<count; i++) {
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
   
      
        System.out.println(fac(m).divide((fac(n).multiply(fac(m.subtract(n))))));
        
        }
        
    }
    
    public static int com(int n, int m) {
    	if(m<2 || n<=m) {
    		return 1;
    	} else {
    	return m*com(n, m-1);
    	}
    }
    
    public static BigInteger fac(BigInteger n) {
    	if(n.compareTo(new BigInteger("1"))==0 || n.compareTo(new BigInteger("0"))==0) {
    		return new BigInteger("1");
    	} else {
    	return n.multiply(fac(n.subtract(new BigInteger("1"))));
    	}
    }
}