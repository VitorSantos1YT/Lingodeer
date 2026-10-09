package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaie implements zzaid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpo f11411a = new zzpo(zzagr.f11362d, 6);

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final boolean zza() {
        return ((Boolean) f11411a.a(0, "measurement.test.boolean_flag", false).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final long zzb() {
        return ((Long) f11411a.b(1, "measurement.test.cached_long_flag", -1L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final double zzc() {
        zzpo zzpoVar = f11411a;
        AtomicReferenceArray atomicReferenceArray = zzpoVar.f11824a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(2);
        if (zzomVar == null) {
            zznz zznzVar = new zznz("measurement.test.double_flag", zzpoVar.f11825b.f11775a);
            while (!atomicReferenceArray.compareAndSet(2, null, zznzVar)) {
                if (atomicReferenceArray.get(2) != null) {
                    zzomVar = (zzom) atomicReferenceArray.get(2);
                    zzomVar.getClass();
                }
            }
            zzomVar = zznzVar;
        }
        return ((Double) zzomVar.get()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final long zzd() {
        return ((Long) f11411a.b(3, "measurement.test.int_flag", -2L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final long zze() {
        return ((Long) f11411a.b(4, "measurement.test.long_flag", -1L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final String zzf() {
        return (String) f11411a.c(5, "measurement.test.string_flag", "---").get();
    }
}
