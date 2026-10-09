package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzzo implements zzcn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzzm f11054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11056c = new byte[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11057d = new byte[0];

    public zzzo(zzzm zzzmVar, int i11) throws InvalidAlgorithmParameterException {
        this.f11054a = zzzmVar;
        this.f11055b = i11;
        if (i11 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzzmVar.a(new byte[0], i11);
    }

    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = this.f11057d;
        int length = bArr2.length;
        int i11 = this.f11055b;
        zzzm zzzmVar = this.f11054a;
        byte[] bArr3 = this.f11056c;
        return length > 0 ? zzyl.d(bArr3, zzzmVar.a(zzyl.d(bArr, bArr2), i11)) : zzyl.d(bArr3, zzzmVar.a(bArr, i11));
    }
}
