package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzfj extends zzfl {
    private zzfj() {
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    public final void a(long j11, Object obj) {
        ((zzez) zzhj.d(obj, j11)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    public final void b(Object obj, long j11, Object obj2) {
        zzez zzezVarZzd = (zzez) zzhj.d(obj, j11);
        zzez zzezVar = (zzez) zzhj.d(obj2, j11);
        int size = zzezVarZzd.size();
        int size2 = zzezVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzezVarZzd.zzc()) {
                zzezVarZzd = zzezVarZzd.zzd(size2 + size);
            }
            zzezVarZzd.addAll(zzezVar);
        }
        if (size > 0) {
            zzezVar = zzezVarZzd;
        }
        zzhj.j(obj, j11, zzezVar);
    }
}
