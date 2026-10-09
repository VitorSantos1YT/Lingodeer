package com.google.android.gms.internal.p002firebaseauthapi;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzu {
    public static void a(int i11, int i12) {
        String strB;
        if (i11 < 0 || i11 >= i12) {
            if (i11 < 0) {
                strB = zzac.b("%s (%s) must not be negative", "index", Integer.valueOf(i11));
            } else {
                if (i12 < 0) {
                    throw new IllegalArgumentException(p.j(i12, "negative size: "));
                }
                strB = zzac.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void b(int i11, int i12, int i13) {
        String strC;
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            if (i11 < 0 || i11 > i13) {
                strC = c(i11, i13, "start index");
            } else {
                strC = (i12 < 0 || i12 > i13) ? c(i12, i13, "end index") : zzac.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static String c(int i11, int i12, String str) {
        if (i11 < 0) {
            return zzac.b("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return zzac.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException(p.j(i12, "negative size: "));
    }

    public static void d(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(c(i11, i12, "index"));
        }
    }
}
