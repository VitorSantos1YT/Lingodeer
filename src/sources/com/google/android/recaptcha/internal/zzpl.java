package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzpl {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i11, int i12);

    public abstract void zze(Object obj, int i11, long j11);

    public abstract void zzf(Object obj, int i11, Object obj2);

    public abstract void zzg(Object obj, int i11, zzle zzleVar);

    public abstract void zzh(Object obj, int i11, long j11);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzov zzovVar, int i11) throws zznn {
        int iZzd = zzovVar.zzd();
        int i12 = iZzd >>> 3;
        int i13 = iZzd & 7;
        if (i13 == 0) {
            zzh(obj, i12, zzovVar.zzl());
            return true;
        }
        if (i13 == 1) {
            zze(obj, i12, zzovVar.zzk());
            return true;
        }
        if (i13 == 2) {
            zzg(obj, i12, zzovVar.zzp());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i12, zzovVar.zzf());
            return true;
        }
        Object objZzb = zzb();
        int i14 = i12 << 3;
        int i15 = i11 + 1;
        if (i15 >= zza) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzovVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzovVar, i15)) {
        }
        if ((i14 | 4) != zzovVar.zzd()) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i12, zzc(objZzb));
        return true;
    }
}
