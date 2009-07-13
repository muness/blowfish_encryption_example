import java.io.*;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class BlowfishKeyGenerator {

	public static void main(String[] args) throws Exception {
		File key = new File("key");
		FileOutputStream os = new FileOutputStream(key);
		KeyGenerator kgen = KeyGenerator.getInstance("Blowfish");
        	SecretKey skey = kgen.generateKey();
        	byte[] raw = skey.getEncoded();
		os.write(raw);
		os.close();

	}


}
