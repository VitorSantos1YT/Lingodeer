package com.google.android.gms.internal.fido;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzcm implements Comparator {
    public static final zzcm zza;
    private static final /* synthetic */ zzcm[] zzb;

    static {
        zzcm zzcmVar = new zzcm("INSTANCE", 0);
        zza = zzcmVar;
        zzb = new zzcm[]{zzcmVar};
    }

    public static zzcm[] values() {
        return (zzcm[]) zzb.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i11 = 0; i11 < iMin; i11++) {
            int i12 = (bArr[i11] & 255) - (bArr2[i11] & 255);
            if (i12 != 0) {
                return i12;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
