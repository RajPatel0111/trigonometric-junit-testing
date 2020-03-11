/**
 * 
 * This project is for calculating trigonometric functions such as sin, cos, and tan
 * using taylor series.
 * 
 * @author ASE Group 6
 * Dhrumil shah 	( 110024036 )
 * Raj Patel 		( 110020706 )
 * Sunny Patel 		( 110010345 )
 * Yash Patel 		( 110011738 )
 * 
 * @version 2.0.0
 * 
 */

package group6.taylortrigo;

public class TrigonometricFunctions
{
	/**
	 * sin function for finding sin(x)
	 * @param angle
	 * @return returns generated value
	 * @throws group6.taylortrigo.FactorialException 
	 * @throws group6.taylortrigo.PowerException 
	 */
	public static double sin(double angle) throws group6.taylortrigo.PowerException, group6.taylortrigo.FactorialException
	{
		double sin=0;
		
		for(int i=1;i<=11;i++)
		{
			sin = sin + (power(-1, i-1)*
					power(angle, (2*i)-1)/fact((2*i)-1));
		}
		
		return sin;
	}
	
	/**
	 * cos function for finding cos(x)
	 * @param angle
	 * @return returns generated value
	 * @throws FactorialException 
	 * @throws PowerException 
	 */
	public static double cos(double angle) throws PowerException, FactorialException
	{
		double cos=0;
		
		for(int i=1;i<=11;i++)
		{
			cos = cos + (power(-1, i-1)*
					power(angle, 2*(i-1))/fact(2*(i-1)));
		}
		
		return cos;
	}
	
	/**
	 * tan function for finding tan(x)
	 * @param angle
	 * @return returns generated value
	 * @throws FactorialException 
	 * @throws PowerException 
	 */
	public static double tan(double angle) throws PowerException, FactorialException
	{
		double tan=0;
		
		tan = sin(angle) / cos (angle);
		
		return tan;
	}
	
	/**
	 * This function is used for finding Factorial of n
	 * @param a For finding the factorial of a
	 * @return it will return value in long
	 * @throws FactorialException throwing exception for negative numbers
	 */
	public static long fact(int a) throws FactorialException
	{
		long mul=1;
		
		if(a >=0)
		{
			for(int i=1; i<=a; i++)
			{
				mul = mul*i;
			}
		}
		else
			throw new FactorialException("Invaild number for finding Factorial!");
		
		return mul;
	}
	
	/**
	 * This function is for finding power of any value.
	 * @param x This is base.
	 * @param y This is power.
	 * @return Returns value in double
	 * @throws PowerException throws exception
	 */
	public static double power(double x, int y) throws PowerException
	{
		double value=1;
		
		for(int i=1; i<=y; i++)
			value = value * x;
		
		return value;
		
	}
}
