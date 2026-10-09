package com.google.android.gms.internal.auth;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzdz extends zzec {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9480d;

    public zzdz(byte[] bArr, int i11) {
        super(bArr);
        zzef.k(0, i11, bArr.length);
        this.f9480d = i11;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte b(int i11) {
        int i12 = this.f9480d;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return this.f9481c[i11];
        }
        if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException(p.j(i11, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(p.p("Index > length: ", i11, i12, ", "));
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte d(int i11) {
        return this.f9481c[i11];
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final int e() {
        return this.f9480d;
    }
}
