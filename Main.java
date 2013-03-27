/**
 * Just instantiate the fields in the good order.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public final class Main
{
    @SuppressWarnings("unused")
    public static void main(final String... args)
    {

        System.out.println("=> Create \"A\""); /* NON-NLS */
        final A iA = new A();
        System.out.println("=> Create \"B\""); /* NON-NLS */
        final B iB = new B();
        System.out.println("=> Create another \"B\""); /* NON-NLS */
        final B iB2 = new B();
        System.out.println("=> Create \"C\""); /* NON-NLS */
        final C iC = new C();
        System.out.println("=> Create \"D\""); /* NON-NLS */
        final D iD = new D();

    }
}
