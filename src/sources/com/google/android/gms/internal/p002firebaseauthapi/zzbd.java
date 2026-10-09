package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f10255a = "0123456789abcdef".toCharArray();

    public abstract int a();

    public abstract boolean b(zzbd zzbdVar);

    public abstract int c();

    public abstract byte[] d();

    public byte[] e() {
        return d();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        return c() == zzbdVar.c() && b(zzbdVar);
    }

    public final int hashCode() {
        if (c() >= 32) {
            return a();
        }
        byte[] bArrE = e();
        int i11 = bArrE[0] & 255;
        for (int i12 = 1; i12 < bArrE.length; i12++) {
            i11 |= (bArrE[i12] & 255) << (i12 << 3);
        }
        return i11;
    }

    public final String toString() {
        byte[] bArrE = e();
        StringBuilder sb2 = new StringBuilder(bArrE.length * 2);
        for (byte b3 : bArrE) {
            char[] cArr = f10255a;
            sb2.append(cArr[(b3 >> 4) & 15]);
            sb2.append(cArr[b3 & 15]);
        }
        return sb2.toString();
    }
}
