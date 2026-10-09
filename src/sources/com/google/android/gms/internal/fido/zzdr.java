package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzdr implements Comparable {
    public static int a(byte b3) {
        return (b3 >> 5) & 7;
    }

    public static void b(String str) {
        new zzdp(str);
    }

    public abstract int zza();
}
