package com.google.common.base;

import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Strings {
    private Strings() {
    }

    public static String a(String str) {
        Platform.JdkPatternCompiler jdkPatternCompiler = Platform.f16375a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static boolean b(String str) {
        Platform.JdkPatternCompiler jdkPatternCompiler = Platform.f16375a;
        return str == null || str.isEmpty();
    }

    public static String c(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i11 = 0;
        for (int i12 = 0; i12 < objArr.length; i12++) {
            Object obj = objArr[i12];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e8) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e8);
                    StringBuilder sbQ = p0.q("<", str2, " threw ");
                    sbQ.append(e8.getClass().getName());
                    sbQ.append(">");
                    string = sbQ.toString();
                }
            }
            objArr[i12] = string;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i13 = 0;
        while (i11 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i13)) != -1) {
            sb2.append((CharSequence) strValueOf, i13, iIndexOf);
            sb2.append(objArr[i11]);
            i13 = iIndexOf + 2;
            i11++;
        }
        sb2.append((CharSequence) strValueOf, i13, strValueOf.length());
        if (i11 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i11]);
            for (int i14 = i11 + 1; i14 < objArr.length; i14++) {
                sb2.append(", ");
                sb2.append(objArr[i14]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String d(String str) {
        Platform.JdkPatternCompiler jdkPatternCompiler = Platform.f16375a;
        return str == null ? BuildConfig.VERSION_NAME : str;
    }
}
