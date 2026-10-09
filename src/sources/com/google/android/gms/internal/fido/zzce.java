package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzce extends zzcg {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final char[] f9687e;

    public zzce(zzcd zzcdVar) {
        super(zzcdVar, (Character) null);
        this.f9687e = new char[512];
        char[] cArr = zzcdVar.f9680b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i11 = 0; i11 < 256; i11++) {
            char[] cArr2 = this.f9687e;
            cArr2[i11] = cArr[i11 >>> 4];
            cArr2[i11 | 256] = cArr[i11 & 15];
        }
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    public final void a(StringBuilder sb2, byte[] bArr, int i11) {
        zzap.b(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            char[] cArr = this.f9687e;
            sb2.append(cArr[i13]);
            sb2.append(cArr[i13 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    public final zzch d(zzcd zzcdVar, Character ch2) {
        return new zzce(zzcdVar);
    }
}
