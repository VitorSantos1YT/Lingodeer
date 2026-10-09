package com.google.android.gms.internal.play_billing;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzec extends zzeg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12348d;

    public zzec(byte[] bArr, int i11) {
        super(bArr);
        zzei.j(0, i11, bArr.length);
        this.f12348d = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final byte b(int i11) {
        int i12 = this.f12348d;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return this.f12349c[i11];
        }
        if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException(p.j(i11, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(p.p("Index > length: ", i11, i12, ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final byte d(int i11) {
        return this.f12349c[i11];
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final int e() {
        return this.f12348d;
    }
}
