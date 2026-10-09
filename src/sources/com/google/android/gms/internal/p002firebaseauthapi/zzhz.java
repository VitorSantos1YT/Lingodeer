package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhz extends zzhv {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhv
    public final int a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhv
    public final int[] d(int[] iArr, int i11) {
        if (iArr.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
        }
        int[] iArr2 = new int[16];
        int[] iArrE = zzhu.e(this.f10535a, iArr);
        int[] iArr3 = zzhu.f10534a;
        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
        System.arraycopy(iArrE, 0, iArr2, iArr3.length, 8);
        iArr2[12] = i11;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
