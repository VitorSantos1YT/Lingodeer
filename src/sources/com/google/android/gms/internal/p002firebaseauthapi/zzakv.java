package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzakv implements zzalz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzakv f10133a = new zzakv();

    private zzakv() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalz
    public final zzalw zza(Class cls) {
        if (!zzaku.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzalw) zzaku.k(cls.asSubclass(zzaku.class)).l(3);
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalz
    public final boolean zzb(Class cls) {
        return zzaku.class.isAssignableFrom(cls);
    }
}
