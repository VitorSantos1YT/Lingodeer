package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzhm extends zzhl {
    @Override // com.google.android.gms.internal.auth.zzhl
    public final int a(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return 0;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                i11 = i13;
            } else if (b3 < -32) {
                if (i13 >= i12) {
                    return b3;
                }
                if (b3 < -62) {
                    return -1;
                }
                i11 += 2;
                if (bArr[i13] > -65) {
                    return -1;
                }
            } else if (b3 < -16) {
                if (i13 >= i12 - 1) {
                    return zzhn.a(bArr, i13, i12);
                }
                int i14 = i11 + 2;
                byte b11 = bArr[i13];
                if (b11 > -65) {
                    return -1;
                }
                if (b3 == -32 && b11 < -96) {
                    return -1;
                }
                if (b3 == -19 && b11 >= -96) {
                    return -1;
                }
                i11 += 3;
                if (bArr[i14] > -65) {
                    return -1;
                }
            } else {
                if (i13 >= i12 - 2) {
                    return zzhn.a(bArr, i13, i12);
                }
                int i15 = i11 + 2;
                byte b12 = bArr[i13];
                if (b12 > -65) {
                    return -1;
                }
                if ((((b12 + 112) + (b3 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i16 = i11 + 3;
                if (bArr[i15] > -65) {
                    return -1;
                }
                i11 += 4;
                if (bArr[i16] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
