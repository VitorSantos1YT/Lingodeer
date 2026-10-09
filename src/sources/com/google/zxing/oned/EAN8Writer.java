package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class EAN8Writer extends UPCEANWriter {
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.a(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + UPCEANReader.b(str);
            } catch (FormatException e8) {
                throw new IllegalArgumentException(e8);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!UPCEANReader.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        boolean[] zArr = new boolean[67];
        int iB = OneDimensionalCodeWriter.b(zArr, 0, UPCEANReader.f21544a, true);
        for (int i11 = 0; i11 <= 3; i11++) {
            iB += OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.f21547d[Character.digit(str.charAt(i11), 10)], false);
        }
        int iB2 = OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.f21545b, false) + iB;
        for (int i12 = 4; i12 <= 7; i12++) {
            iB2 += OneDimensionalCodeWriter.b(zArr, iB2, UPCEANReader.f21547d[Character.digit(str.charAt(i12), 10)], true);
        }
        OneDimensionalCodeWriter.b(zArr, iB2, UPCEANReader.f21544a, true);
        return zArr;
    }
}
