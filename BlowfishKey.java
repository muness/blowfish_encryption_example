import javax.crypto.Cipher;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Security;
import javax.crypto.spec.SecretKeySpec;


import java.security.PublicKey;
import java.security.cert.CertificateFactory;

import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;

import java.io.*;

public class BlowfishKey {

    public static void main(String[] args) throws Exception {
	String encoded = encryptAndEncode("hello world!");
	System.out.println("Encoded: " + encoded); 
	System.out.println(decodeAndDecrypt(encoded));
    }



    public static String encryptAndEncode(String plainText) throws Exception {
	byte[] encrypted = encrypt(plainText);
	String base64encoded = Base64.encodeBytes(encrypted);
	return java.net.URLEncoder.encode(base64encoded, "UTF-8"); 
    }

    public static byte[] encrypt(String plainText) throws Exception {
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, getKeySpec());
        return cipher.doFinal(plainText.getBytes());
    }


    
    public static String decodeAndDecrypt(String cipherText) throws Exception {
	String base64encoded = java.net.URLDecoder.decode(cipherText, "UTF-8"); 
	byte[] encrypted = Base64.decode(base64encoded);
	return decrypt(encrypted);
    }

    public static String decrypt(byte[] cipherText) throws Exception {
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.DECRYPT_MODE, getKeySpec());
        byte[] decrypted = cipher.doFinal(cipherText);
	return(new String(decrypted));
    }



    public static SecretKeySpec getKeySpec() throws Exception {
        byte[] raw = getKey();
        return (new SecretKeySpec(raw, "Blowfish"));
    }

    public static byte[] getKey() throws Exception {
        File key = new File("key");
        long length = key.length();
        final FileInputStream fis = new FileInputStream(key);
        byte[] bytes = new byte[(int)length];

        fis.read(bytes);
        fis.close();
        return bytes;
    } 


}
