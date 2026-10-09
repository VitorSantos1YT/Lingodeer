package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhw extends zzhv {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhv
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhv
    public final int[] d(int[] iArr, int i11) {
        if (iArr.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = zzhu.f10534a;
        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
        System.arraycopy(this.f10535a, 0, iArr2, iArr3.length, 8);
        iArr2[12] = i11;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }
}
