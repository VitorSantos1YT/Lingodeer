package com.google.android.gms.internal.play_billing;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbg {
    public static void a(int i11, int i12) {
        String strA;
        if (i11 < 0 || i11 >= i12) {
            if (i11 < 0) {
                strA = zzbj.a("%s (%s) must not be negative", "index", Integer.valueOf(i11));
            } else {
                if (i12 < 0) {
                    throw new IllegalArgumentException(p.j(i12, "negative size: "));
                }
                strA = zzbj.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void b(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(d(i11, i12, "index"));
        }
    }

    public static void c(int i11, int i12, int i13) {
        String strD;
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            if (i11 < 0 || i11 > i13) {
                strD = d(i11, i13, "start index");
            } else {
                strD = (i12 < 0 || i12 > i13) ? d(i12, i13, "end index") : zzbj.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static String d(int i11, int i12, String str) {
        if (i11 < 0) {
            return zzbj.a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return zzbj.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException(p.j(i12, "negative size: "));
    }
}
