package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzalr implements zzalz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzalz[] f10153a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalz
    public final zzalw zza(Class cls) {
        for (zzalz zzalzVar : this.f10153a) {
            if (zzalzVar.zzb(cls)) {
                return zzalzVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalz
    public final boolean zzb(Class cls) {
        for (zzalz zzalzVar : this.f10153a) {
            if (zzalzVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
