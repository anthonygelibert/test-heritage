/**
 * C class.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
@SuppressWarnings("unused")
public final class C
{
    private final B m_privateBField;

    static
    {
        System.out.println("C static init."); /* NON-NLS */
    }

    {
        System.out.println("C instance init"); /* NON-NLS */
    }

    public C()
    {
        System.out.println("C constructor"); /* NON-NLS */
        m_privateBField = new B();
    }
}
