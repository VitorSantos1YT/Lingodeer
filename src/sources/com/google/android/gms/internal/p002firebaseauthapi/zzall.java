package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzall implements zzali {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzali
    public final void a(long j11, Object obj) {
        ((zzalb) zzank.m(j11, obj)).zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzali
    public final zzalb b(long j11, Object obj) {
        zzalb zzalbVar = (zzalb) zzank.m(j11, obj);
        if (zzalbVar.zzc()) {
            return zzalbVar;
        }
        int size = zzalbVar.size();
        zzalb zzalbVarZza = zzalbVar.zza(size == 0 ? 10 : size << 1);
        zzank.d(obj, j11, zzalbVarZza);
        return zzalbVarZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzali
    public final void c(Object obj, long j11, Object obj2) {
        zzalb zzalbVarZza = (zzalb) zzank.m(j11, obj);
        zzalb zzalbVar = (zzalb) zzank.m(j11, obj2);
        int size = zzalbVarZza.size();
        int size2 = zzalbVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzalbVarZza.zzc()) {
                zzalbVarZza = zzalbVarZza.zza(size2 + size);
            }
            zzalbVarZza.addAll(zzalbVar);
        }
        if (size > 0) {
            zzalbVar = zzalbVarZza;
        }
        zzank.d(obj, j11, zzalbVar);
    }
}
