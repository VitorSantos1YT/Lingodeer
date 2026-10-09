package com.google.android.gms.internal.p000authapi;

import dt.Xk.wuoM;
import java.util.logging.Level;
import java.util.logging.Logger;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbbd {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            length = objArr.length;
            if (i12 >= length) {
                break;
            }
            Object obj = objArr[i12];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e8) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String strU = p.u(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strU), (Throwable) e8);
                    String name2 = e8.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + strU.length() + 8 + 1);
                    sb2.append("<");
                    sb2.append(strU);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i12] = string;
            i12++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i13 = 0;
        while (true) {
            length2 = objArr.length;
            if (i11 >= length2 || (iIndexOf = str.indexOf(wuoM.zKJxIdKjZLEWeq, i13)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i13, iIndexOf);
            sb3.append(objArr[i11]);
            i11++;
            i13 = iIndexOf + 2;
        }
        sb3.append((CharSequence) str, i13, str.length());
        if (i11 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i11]);
            for (int i14 = i11 + 1; i14 < objArr.length; i14++) {
                sb3.append(", ");
                sb3.append(objArr[i14]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
