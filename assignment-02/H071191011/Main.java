import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.NoSuchElementException;

class Main
{
	public static void main(String[] args) throws Exception {
		Login login = Login.getInstance();
		Base64.Decoder decoder = Base64.getDecoder();

		// Prints unauthenticated
		System.out.println("Attempt to show status of unauthenticated login");
		login.status();
		System.out.println();

		// Test success case
		System.out.println("Attempt to authenticate rizkaa86");
		login.auth("rizkaa86", new String(decoder.decode("QW1pa2EgUml6a2E="), StandardCharsets.UTF_8));
		login.status();
		System.out.println("Deauth rizkaa86");
		login.deauth();
		System.out.println();

		// Test fail case: unknown user
		System.out.println("Attempt to authenticate MikuAuahDark");
		try
		{
			login.auth("MikuAuahDark", "Me when sing: Holy shit my voice is absolute nice");
			login.status();
			System.out.println("Uh oh, unknown user authenticated?");
			System.exit(1);
		}
		catch (NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println();

		// Test fail case: invalid password
		System.out.println("Attempt to authenticate rizkaa86");
		try
		{
			login.auth("rizkaa86", "Me when listening to my recording: This voice is piece of shit");
			login.status();
			System.out.println("Uh oh, authenticated with wrong password?");
			System.exit(1);
		}
		catch (NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println();
	}
}
