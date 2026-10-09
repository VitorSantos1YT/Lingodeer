package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyq {
    public static final zzyq zza;
    public static final zzyq zzb;
    public static final zzyq zzc;
    private static final /* synthetic */ zzyq[] zzd;

    static {
        zzyq zzyqVar = new zzyq("NIST_P256", 0);
        zza = zzyqVar;
        zzyq zzyqVar2 = new zzyq("NIST_P384", 1);
        zzb = zzyqVar2;
        zzyq zzyqVar3 = new zzyq("NIST_P521", 2);
        zzc = zzyqVar3;
        zzd = new zzyq[]{zzyqVar, zzyqVar2, zzyqVar3};
    }

    public static zzyq[] values() {
        return (zzyq[]) zzd.clone();
    }
}
