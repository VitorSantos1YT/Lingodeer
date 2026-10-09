package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzfs {
    public static final zzfr a(Object obj, Object obj2) {
        zzfr zzfrVarA = (zzfr) obj;
        zzfr zzfrVar = (zzfr) obj2;
        if (!zzfrVar.isEmpty()) {
            if (!zzfrVarA.f9513a) {
                zzfrVarA = zzfrVarA.a();
            }
            zzfrVarA.d();
            if (!zzfrVar.isEmpty()) {
                zzfrVarA.putAll(zzfrVar);
            }
        }
        return zzfrVarA;
    }
}
