package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import hh.p0;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Code39Writer extends OneDimensionalCodeWriter {
    public static void e(int[] iArr, int i11) {
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = 1;
            if (((1 << (8 - i12)) & i11) != 0) {
                i13 = 2;
            }
            iArr[i12] = i13;
        }
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.a(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] c(String str) {
        int[] iArr;
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        for (int i11 = 0; i11 < length; i11++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i11)) < 0) {
                int length2 = str.length();
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = 0; i12 < length2; i12++) {
                    char cCharAt = str.charAt(i12);
                    if (cCharAt == 0) {
                        sb2.append("%U");
                    } else if (cCharAt == ' ') {
                        sb2.append(cCharAt);
                    } else if (cCharAt == '@') {
                        sb2.append("%V");
                    } else if (cCharAt == '`') {
                        sb2.append("%W");
                    } else if (cCharAt == '-' || cCharAt == '.') {
                        sb2.append(cCharAt);
                    } else if (cCharAt <= 26) {
                        sb2.append('$');
                        sb2.append((char) (cCharAt + '@'));
                    } else if (cCharAt < ' ') {
                        sb2.append('%');
                        sb2.append((char) (cCharAt + '&'));
                    } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                        sb2.append('/');
                        sb2.append((char) (cCharAt + ' '));
                    } else if (cCharAt <= '9') {
                        sb2.append(cCharAt);
                    } else if (cCharAt <= '?') {
                        sb2.append('%');
                        sb2.append((char) (cCharAt + 11));
                    } else if (cCharAt <= 'Z') {
                        sb2.append(cCharAt);
                    } else if (cCharAt <= '_') {
                        sb2.append('%');
                        sb2.append((char) (cCharAt - 16));
                    } else if (cCharAt <= 'z') {
                        sb2.append('+');
                        sb2.append((char) (cCharAt - ' '));
                    } else {
                        if (cCharAt > 127) {
                            throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i12) + "'");
                        }
                        sb2.append('%');
                        sb2.append((char) (cCharAt - '+'));
                    }
                }
                str = sb2.toString();
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new IllegalArgumentException(p0.h(length, "Requested contents should be less than 80 digits long, but got ", " (extended full ASCII mode)"));
            }
        }
        int[] iArr2 = new int[9];
        int i13 = length + 25;
        int i14 = 0;
        while (true) {
            iArr = Code39Reader.f21537a;
            if (i14 >= length) {
                break;
            }
            e(iArr2, iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i14))]);
            for (int i15 = 0; i15 < 9; i15++) {
                i13 += iArr2[i15];
            }
            i14++;
        }
        boolean[] zArr = new boolean[i13];
        e(iArr2, 148);
        int iB = OneDimensionalCodeWriter.b(zArr, 0, iArr2, true);
        int[] iArr3 = {1};
        int iB2 = OneDimensionalCodeWriter.b(zArr, iB, iArr3, false) + iB;
        for (int i16 = 0; i16 < length; i16++) {
            e(iArr2, iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i16))]);
            int iB3 = OneDimensionalCodeWriter.b(zArr, iB2, iArr2, true) + iB2;
            iB2 = OneDimensionalCodeWriter.b(zArr, iB3, iArr3, false) + iB3;
        }
        e(iArr2, 148);
        OneDimensionalCodeWriter.b(zArr, iB2, iArr2, true);
        return zArr;
    }
}
