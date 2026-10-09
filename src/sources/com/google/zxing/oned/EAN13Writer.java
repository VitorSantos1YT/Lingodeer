package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class EAN13Writer extends UPCEANWriter {
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.a(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + UPCEANReader.b(str);
            } catch (FormatException e8) {
                throw new IllegalArgumentException(e8);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!UPCEANReader.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i11 = EAN13Reader.f21539f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iB = OneDimensionalCodeWriter.b(zArr, 0, UPCEANReader.f21544a, true);
        for (int i12 = 1; i12 <= 6; i12++) {
            int iDigit = Character.digit(str.charAt(i12), 10);
            if (((i11 >> (6 - i12)) & 1) == 1) {
                iDigit += 10;
            }
            iB += OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.f21548e[iDigit], false);
        }
        int iB2 = OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.f21545b, false) + iB;
        for (int i13 = 7; i13 <= 12; i13++) {
            iB2 += OneDimensionalCodeWriter.b(zArr, iB2, UPCEANReader.f21547d[Character.digit(str.charAt(i13), 10)], true);
        }
        OneDimensionalCodeWriter.b(zArr, iB2, UPCEANReader.f21544a, true);
        return zArr;
    }
}
