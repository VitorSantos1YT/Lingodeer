package com.google.android.gms.internal.fido;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzct extends zzcw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9698e;

    public zzct(byte[] bArr, int i11, int i12) {
        super(bArr);
        zzcz.h(i11, i11 + i12, bArr.length);
        this.f9697d = i11;
        this.f9698e = i12;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final byte b(int i11) {
        int i12 = this.f9698e;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return this.f9699c[this.f9697d + i11];
        }
        if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException(p.j(i11, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(p.p("Index > length: ", i11, i12, ", "));
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final byte d(int i11) {
        return this.f9699c[this.f9697d + i11];
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final int e() {
        return this.f9698e;
    }

    @Override // com.google.android.gms.internal.fido.zzcw
    public final int j() {
        return this.f9697d;
    }
}
