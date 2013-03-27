/**
 * D class.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
@SuppressWarnings("unused")
public final class D
{
    private final C m_privateCField;

    static
    {
        System.out.println("D static init."); /* NON-NLS */
    }

    {
        System.out.println("D instance init."); /* NON-NLS */
    }

    /** Create the C field. */
    public D()
    {
        System.out.println("D constructor"); /* NON-NLS */
        m_privateCField = new C();
    }
}
