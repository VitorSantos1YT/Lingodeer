package com.google.zxing.qrcode.encoder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class MaskUtil {
    private MaskUtil() {
    }

    public static int a(ByteMatrix byteMatrix, boolean z11) {
        int i11 = byteMatrix.f21597b;
        int i12 = byteMatrix.f21598c;
        int i13 = z11 ? i12 : i11;
        if (!z11) {
            i11 = i12;
        }
        byte[][] bArr = byteMatrix.f21596a;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            byte b3 = -1;
            int i16 = 0;
            for (int i17 = 0; i17 < i11; i17++) {
                byte b11 = z11 ? bArr[i15][i17] : bArr[i17][i15];
                if (b11 == b3) {
                    i16++;
                } else {
                    if (i16 >= 5) {
                        i14 += i16 - 2;
                    }
                    i16 = 1;
                    b3 = b11;
                }
            }
            if (i16 >= 5) {
                i14 = (i16 - 2) + i14;
            }
        }
        return i14;
    }
}
