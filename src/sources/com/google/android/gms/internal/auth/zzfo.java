package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzfo implements zzfv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzfv[] f9509a;

    public zzfo(zzfv... zzfvVarArr) {
        this.f9509a = zzfvVarArr;
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final zzfu zzb(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            zzfv zzfvVar = this.f9509a[i11];
            if (zzfvVar.zzc(cls)) {
                return zzfvVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final boolean zzc(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            if (this.f9509a[i11].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
