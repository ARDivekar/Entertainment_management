package databaseHandler;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

abstract class Hasher {
	
	static String MD5(String text){
		/*Source: http://stackoverflow.com/a/421696/4900327
		 *
		 * usage: database.store("Password", Hasher.MD5("lorem ipsum"));
		*/

		MessageDigest m;
		try {
			m = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			System.out.println("\n\n\t\tERROR: MD5 did not work!\n");
			return null;
		}
		
		m.reset();
		m.update(text.getBytes());
		byte[] digest = m.digest();
		BigInteger bigInt = new BigInteger(1,digest);
		String hashtext = bigInt.toString(16);
		// Now we need to zero pad it if you actually want the full 32 chars.
		while(hashtext.length() < 32 ){
		  hashtext = "0"+hashtext;
		}
		return hashtext;
	}
}