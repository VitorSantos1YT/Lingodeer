package com.google.android.gms.internal.p002firebaseauthapi;

import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzac {
    public static String a(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e8) {
            String strD = a.D(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", a.e("Exception during lenientFormat for ", strD), (Throwable) e8);
            return a.h("<", strD, " threw ", e8.getClass().getName(), ">");
        }
    }

    public static String b(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        int i12 = 0;
        while (i11 < objArr.length && (iIndexOf = str.indexOf("%s", i12)) != -1) {
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(a(objArr[i11]));
            i12 = iIndexOf + 2;
            i11++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i11 < objArr.length) {
            String str2 = " [";
            while (i11 < objArr.length) {
                sb2.append(str2);
                sb2.append(a(objArr[i11]));
                i11++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String c(String str) {
        zzq zzqVar = zzp.f10824a;
        return str == null ? BuildConfig.VERSION_NAME : str;
    }

    public static boolean d(String str) {
        return zzp.a(str);
    }
}
