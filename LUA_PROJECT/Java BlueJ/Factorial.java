
/**
 * Calculates !n for n=user_input
 *
 * @author David L. Reimer
 * @version Banana
 */
public class Factorial
{

    public Factorial(int input)
    {
        System.out.print("Factorial of " + input + " = " + calcF(input));
        
        
    }

    /* Brain of the Software*/
    public int calcF(int n) {

        int fact = 1;

        for (int i=1; i<=n; i++) {
            fact = fact * i;
        }
        
        return fact;
    }
}
