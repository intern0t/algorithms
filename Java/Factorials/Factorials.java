import java.math.BigInteger;

public class Factorials{
    static void Print(String toPrint){
        System.out.println(toPrint);
    }
    
    public static void getFactorials(int testValue){
		BigInteger A = new BigInteger("1");
		for(int i = testValue; i > 1; i--){
            A = A.multiply(BigInteger.valueOf(i));
		}
        Print("|\t" + testValue + "\t|\t" + A.toString());
	}

	public static void main(String[] args){
        int toTestFrom = 0;
        int toTestUntil = 50;

        while(toTestFrom <= toTestUntil){
            getFactorials(toTestFrom);
            toTestFrom++;
        }
	}
}