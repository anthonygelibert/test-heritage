/**
 * B class.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public final class B extends A
{
    static
    {
        System.out.println("B static init."); /* NON-NLS */
    }

    {
        System.out.println("B instance init."); /* NON-NLS */
    }

    public B()
    {
        System.out.println("B Constructor"); /* NON-NLS */
    }
}
