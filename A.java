/**
 * A class.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public class A
{
    static
    {
        System.out.println("A static init."); /* NON-NLS */
    }

    {
        System.out.println("A instance init."); /* NON-NLS */
    }

    public A()
    {
        System.out.println("A Constructor"); /* NON-NLS */
    }
}
