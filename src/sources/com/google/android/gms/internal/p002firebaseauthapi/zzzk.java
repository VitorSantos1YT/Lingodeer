package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzzk implements zzsc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzsd f11047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzsf f11048b;

    public zzzk(zzsd zzsdVar, zzsf zzsfVar) {
        this.f11047a = zzsdVar;
        this.f11048b = zzsfVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsc
    public final byte[] a(byte[] bArr, int i11) {
        return bArr.length <= 64 ? this.f11047a.a(bArr, i11) : this.f11048b.a(bArr, i11);
    }
}
