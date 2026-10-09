package lf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f40117a = qx.b.w("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    public static final boolean a(Context context, String str) {
        String string;
        kotlin.jvm.internal.m.f(context, "context");
        String brand = Build.BRAND;
        int i11 = context.getApplicationInfo().flags;
        kotlin.jvm.internal.m.e(brand, "brand");
        if (oz.x.s0(brand, "generic", false) && (i11 & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                kotlin.jvm.internal.m.e(signatureArr, "packageInfo.signatures");
                for (Signature signature : signatureArr) {
                    HashSet hashSet = f40117a;
                    byte[] byteArray = signature.toByteArray();
                    kotlin.jvm.internal.m.e(byteArray, "it.toByteArray()");
                    try {
                        MessageDigest hash = MessageDigest.getInstance("SHA-1");
                        kotlin.jvm.internal.m.e(hash, "hash");
                        hash.update(byteArray);
                        byte[] digest = hash.digest();
                        StringBuilder sb2 = new StringBuilder();
                        kotlin.jvm.internal.m.e(digest, "digest");
                        for (byte b3 : digest) {
                            sb2.append(Integer.toHexString((b3 >> 4) & 15));
                            sb2.append(Integer.toHexString(b3 & 15));
                        }
                        string = sb2.toString();
                        kotlin.jvm.internal.m.e(string, "builder.toString()");
                    } catch (NoSuchAlgorithmException unused) {
                        string = null;
                    }
                    if (ry.m.i0(hashSet, string)) {
                    }
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return false;
    }
}
