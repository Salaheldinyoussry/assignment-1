
public class calculator implements ICalculator {
	public int add(int x, int y)
	{
		if((long)x+y>2147483647 || (long)x+y<-2147483648) {
			System.out.println("ERROR: exceeded the allowed size ");
			return 0;
		}
		return x+y;
	}
	
	public float divide(int x, int y)
	{
		if (y==0)throw new RuntimeException("ERROR: Cannot divide by 0 !!");
		return (float)x/y;
	}
}

