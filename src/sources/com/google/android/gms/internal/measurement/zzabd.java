package com.google.android.gms.internal.measurement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzabd {
    public static final zzabd zza;
    public static final zzabd zzb;
    public static final zzabd zzc;
    public static final zzabd zzd;
    private static final /* synthetic */ zzabd[] zze;

    static {
        zzabd zzabdVar = new zzabd("BOOLEAN", 0);
        zza = zzabdVar;
        zzabd zzabdVar2 = new zzabd("STRING", 1);
        zzb = zzabdVar2;
        zzabd zzabdVar3 = new zzabd("LONG", 2);
        zzc = zzabdVar3;
        zzabd zzabdVar4 = new zzabd("DOUBLE", 3);
        zzd = zzabdVar4;
        zze = new zzabd[]{zzabdVar, zzabdVar2, zzabdVar3, zzabdVar4};
    }

    public static /* synthetic */ zzabd a(Object obj) {
        if (obj instanceof String) {
            return zzb;
        }
        if (obj instanceof Boolean) {
            return zza;
        }
        if (obj instanceof Long) {
            return zzc;
        }
        if (obj instanceof Double) {
            return zzd;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }

    public static zzabd[] values() {
        return (zzabd[]) zze.clone();
    }
}
