package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaeo {
    public static final zzaef a(long j11, Object obj) {
        zzaef zzaefVar = (zzaef) zzagg.i(j11, obj);
        if (zzaefVar.zza()) {
            return zzaefVar;
        }
        int size = zzaefVar.size();
        zzaef zzaefVarZzg = zzaefVar.zzg(size == 0 ? 10 : size + size);
        zzagg.j(obj, j11, zzaefVarZzg);
        return zzaefVarZzg;
    }
}
