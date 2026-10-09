package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyt {
    public static final zzyt zza;
    public static final zzyt zzb;
    public static final zzyt zzc;
    private static final /* synthetic */ zzyt[] zzd;

    static {
        zzyt zzytVar = new zzyt("UNCOMPRESSED", 0);
        zza = zzytVar;
        zzyt zzytVar2 = new zzyt("COMPRESSED", 1);
        zzb = zzytVar2;
        zzyt zzytVar3 = new zzyt("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
        zzc = zzytVar3;
        zzd = new zzyt[]{zzytVar, zzytVar2, zzytVar3};
    }

    public static zzyt[] values() {
        return (zzyt[]) zzd.clone();
    }
}
