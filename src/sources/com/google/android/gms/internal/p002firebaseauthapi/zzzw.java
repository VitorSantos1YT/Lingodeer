package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzzw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzzv f11063a;

    public zzzw(zzzv zzzvVar) {
        this.f11063a = zzzvVar;
    }

    public static zzzw a(int i11) {
        return new zzzw(zzzv.a(zzpz.a(i11)));
    }

    public static zzzw b(byte[] bArr, zzcw zzcwVar) {
        if (zzcwVar != null) {
            return new zzzw(zzzv.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final byte[] c(zzcw zzcwVar) {
        if (zzcwVar != null) {
            return this.f11063a.b();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
