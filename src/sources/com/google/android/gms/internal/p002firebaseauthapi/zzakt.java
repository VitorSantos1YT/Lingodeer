package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzakt {
    public static final zzakt zza;
    public static final zzakt zzb;
    public static final zzakt zzc;
    public static final zzakt zzd;
    private static final /* synthetic */ zzakt[] zze;

    static {
        zzakt zzaktVar = new zzakt("SCALAR", 0);
        zza = zzaktVar;
        zzakt zzaktVar2 = new zzakt("VECTOR", 1);
        zzb = zzaktVar2;
        zzakt zzaktVar3 = new zzakt("PACKED_VECTOR", 2);
        zzc = zzaktVar3;
        zzakt zzaktVar4 = new zzakt("MAP", 3);
        zzd = zzaktVar4;
        zze = new zzakt[]{zzaktVar, zzaktVar2, zzaktVar3, zzaktVar4};
    }

    public static zzakt[] values() {
        return (zzakt[]) zze.clone();
    }
}
