package hv;

import android.util.Base64;
import com.adjust.sdk.Constants;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.m;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33818a;

    public a(String str) {
        this.f33818a = str;
    }

    public static String a(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        Charset charset = oz.a.f46133a;
        byte[] bytes = str2.getBytes(charset);
        m.e(bytes, "getBytes(...)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        byte[] bytes2 = str3.getBytes(charset);
        m.e(bytes2, "getBytes(...)");
        cipher.init(1, secretKeySpec, new IvParameterSpec(bytes2));
        byte[] bytes3 = str.getBytes(charset);
        m.e(bytes3, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(cipher.doFinal(bytes3), 0);
        m.e(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static String b(String responseBody, SecretKey key, SecretKey iv2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        m.f(responseBody, "responseBody");
        m.f(key, "key");
        m.f(iv2, "iv");
        byte[] encoded = key.getEncoded();
        m.e(encoded, "getEncoded(...)");
        Charset charset = oz.a.f46133a;
        String str = new String(encoded, charset);
        byte[] encoded2 = iv2.getEncoded();
        m.e(encoded2, "getEncoded(...)");
        String str2 = new String(encoded2, charset);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        byte[] bytes = str.getBytes(charset);
        m.e(bytes, "getBytes(...)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        byte[] bytes2 = str2.getBytes(charset);
        m.e(bytes2, "getBytes(...)");
        cipher.init(2, secretKeySpec, new IvParameterSpec(bytes2));
        byte[] bArrDoFinal = cipher.doFinal(Base64.decode(responseBody, 0));
        m.e(bArrDoFinal, "doFinal(...)");
        String str3 = new String(bArrDoFinal, charset);
        if (str3.length() > 3072) {
            String strQ0 = str3;
            while (strQ0.length() > 3072) {
                String strSubstring = strQ0.substring(0, 3072);
                m.e(strSubstring, "substring(...)");
                strQ0 = x.q0(strQ0, strSubstring, BuildConfig.VERSION_NAME);
            }
        }
        return str3;
    }

    public static SecretKeySpec c() {
        String string = UUID.randomUUID().toString();
        m.e(string, "toString(...)");
        String strSubstring = string.substring(0, 16);
        m.e(strSubstring, "substring(...)");
        return new SecretKeySpec(strSubstring.getBytes(Constants.ENCODING), "AES");
    }

    public static PublicKey d() {
        PublicKey publicKeyGeneratePublic;
        try {
            byte[] bArrA = o00.a.a("3PZM7KmHBq53tBqrfbEeqLIYUBJ7NoVWHlXmfTTdUnJsmSymMHO/MaPIvu/YiT8WTht8fZnFC5CsJGC7BaZsIH83TuyMpFXi0goYSG6MtjiFHHSNmUHyQFOWqKmnXhHrGM4uWOlO2GHdMcoo5VnHinN/qzES7n0z3Fd0j6Yk+90=");
            byte[] bArrA2 = o00.a.a("AQAB");
            publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, bArrA), new BigInteger(1, bArrA2)));
        } catch (Exception e8) {
            e8.printStackTrace();
            publicKeyGeneratePublic = null;
        }
        m.e(publicKeyGeneratePublic, "getPublicKey(...)");
        return publicKeyGeneratePublic;
    }
}
