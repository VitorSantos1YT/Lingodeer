package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import ep.a;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Code93Writer extends OneDimensionalCodeWriter {
    public static void e(boolean[] zArr, int i11, int[] iArr) {
        int length = iArr.length;
        int i12 = 0;
        while (i12 < length) {
            int i13 = i11 + 1;
            zArr[i11] = iArr[i12] != 0;
            i12++;
            i11 = i13;
        }
    }

    public static int f(int i11, String str) {
        int iIndexOf = 0;
        int i12 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i12;
            i12++;
            if (i12 > i11) {
                i12 = 1;
            }
        }
        return iIndexOf % 47;
    }

    public static void g(int[] iArr, int i11) {
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = 1;
            if (((1 << (8 - i12)) & i11) == 0) {
                i13 = 0;
            }
            iArr[i12] = i13;
        }
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.a(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int i11 = 9;
        int[] iArr = new int[9];
        int length2 = ((str.length() + 4) * 9) + 1;
        g(iArr, Code93Reader.f21538a[47]);
        boolean[] zArr = new boolean[length2];
        e(zArr, 0, iArr);
        for (int i12 = 0; i12 < length; i12++) {
            g(iArr, Code93Reader.f21538a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i12))]);
            e(zArr, i11, iArr);
            i11 += 9;
        }
        int iF = f(20, str);
        int[] iArr2 = Code93Reader.f21538a;
        g(iArr, iArr2[iF]);
        e(zArr, i11, iArr);
        StringBuilder sbN = a.n(str);
        sbN.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iF));
        g(iArr, iArr2[f(15, sbN.toString())]);
        e(zArr, i11 + 9, iArr);
        g(iArr, iArr2[47]);
        e(zArr, i11 + 18, iArr);
        zArr[i11 + 27] = true;
        return zArr;
    }
}
