package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class OneDimensionalCodeWriter implements Writer {
    public static int b(boolean[] zArr, int i11, int[] iArr, boolean z11) {
        int i12 = 0;
        for (int i13 : iArr) {
            int i14 = 0;
            while (i14 < i13) {
                zArr[i11] = z11;
                i14++;
                i11++;
            }
            i12 += i13;
            z11 = !z11;
        }
        return i12;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        int iD = d();
        EncodeHintType encodeHintType = EncodeHintType.MARGIN;
        if (enumMap.containsKey(encodeHintType)) {
            iD = Integer.parseInt(enumMap.get(encodeHintType).toString());
        }
        boolean[] zArrC = c(str);
        int length = zArrC.length;
        int i11 = iD + length;
        int iMax = Math.max(200, i11);
        int iMax2 = Math.max(1, 200);
        int i12 = iMax / i11;
        int i13 = (iMax - (length * i12)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
        int i14 = 0;
        while (i14 < length) {
            if (zArrC[i14]) {
                bitMatrix.d(i13, 0, i12, iMax2);
            }
            i14++;
            i13 += i12;
        }
        return bitMatrix;
    }

    public abstract boolean[] c(String str);

    public int d() {
        return 10;
    }
}
