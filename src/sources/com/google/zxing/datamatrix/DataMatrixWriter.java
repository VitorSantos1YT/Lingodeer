package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Dimension;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.DefaultPlacement;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DataMatrixWriter implements Writer {
    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        int i11;
        int i12;
        byte[] bArr;
        BitMatrix bitMatrix;
        int i13;
        int i14;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) enumMap.get(EncodeHintType.DATA_MATRIX_SHAPE);
        if (symbolShapeHint2 != null) {
            symbolShapeHint = symbolShapeHint2;
        }
        Dimension dimension = (Dimension) enumMap.get(EncodeHintType.MIN_SIZE);
        if (dimension == null) {
            dimension = null;
        }
        Dimension dimension2 = (Dimension) enumMap.get(EncodeHintType.MAX_SIZE);
        Dimension dimension3 = dimension2 != null ? dimension2 : null;
        String strA = HighLevelEncoder.a(str, symbolShapeHint, dimension, dimension3);
        SymbolInfo symbolInfoF = SymbolInfo.f(strA.length(), symbolShapeHint, dimension, dimension3);
        int i15 = symbolInfoF.f21525d;
        int i16 = symbolInfoF.f21526e;
        int[] iArr = ErrorCorrection.f21517a;
        int length = strA.length();
        int i17 = symbolInfoF.f21523b;
        int i18 = symbolInfoF.f21524c;
        if (length != i17) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb2 = new StringBuilder(i17 + i18);
        sb2.append(strA);
        int iC = symbolInfoF.c();
        int i19 = 0;
        int i21 = 1;
        if (iC == 1) {
            sb2.append(ErrorCorrection.a(i18, strA));
        } else {
            sb2.setLength(sb2.capacity());
            int[] iArr2 = new int[iC];
            int[] iArr3 = new int[iC];
            int[] iArr4 = new int[iC];
            int i22 = 0;
            while (i22 < iC) {
                int i23 = i22 + 1;
                iArr2[i22] = symbolInfoF.a(i23);
                iArr3[i22] = symbolInfoF.f21529h;
                iArr4[i22] = 0;
                if (i22 > 0) {
                    iArr4[i22] = iArr4[i22 - 1] + iArr2[i22];
                }
                i22 = i23;
            }
            for (int i24 = 0; i24 < iC; i24++) {
                StringBuilder sb3 = new StringBuilder(iArr2[i24]);
                for (int i25 = i24; i25 < i17; i25 += iC) {
                    sb3.append(strA.charAt(i25));
                }
                String strA2 = ErrorCorrection.a(iArr3[i24], sb3.toString());
                int i26 = 0;
                int i27 = i24;
                while (i27 < iArr3[i24] * iC) {
                    sb2.setCharAt(i17 + i27, strA2.charAt(i26));
                    i27 += iC;
                    i26++;
                }
            }
        }
        String string = sb2.toString();
        int iB = symbolInfoF.b() * i15;
        int iE = symbolInfoF.e() * i16;
        DefaultPlacement defaultPlacement = new DefaultPlacement(string, iB, iE);
        int i28 = 4;
        int i29 = 4;
        int i30 = 0;
        int i31 = 0;
        while (true) {
            if (i29 == iE && i30 == 0) {
                int i32 = iE - 1;
                defaultPlacement.a(i32, i19, i31, i21);
                defaultPlacement.a(i32, i21, i31, 2);
                defaultPlacement.a(i32, 2, i31, 3);
                defaultPlacement.a(i19, iB - 2, i31, i28);
                int i33 = iB - 1;
                defaultPlacement.a(i19, i33, i31, 5);
                defaultPlacement.a(i21, i33, i31, 6);
                defaultPlacement.a(2, i33, i31, 7);
                defaultPlacement.a(3, i33, i31, 8);
                i31++;
            }
            i11 = iE - 2;
            if (i29 == i11 && i30 == 0 && iB % 4 != 0) {
                defaultPlacement.a(iE - 3, i19, i31, i21);
                defaultPlacement.a(i11, i19, i31, 2);
                defaultPlacement.a(iE - 1, i19, i31, 3);
                defaultPlacement.a(i19, iB - 4, i31, 4);
                defaultPlacement.a(i19, iB - 3, i31, 5);
                defaultPlacement.a(i19, iB - 2, i31, 6);
                int i34 = iB - 1;
                defaultPlacement.a(i19, i34, i31, 7);
                defaultPlacement.a(i21, i34, i31, 8);
                i31++;
            }
            if (i29 == i11 && i30 == 0 && iB % 8 == 4) {
                defaultPlacement.a(iE - 3, i19, i31, i21);
                defaultPlacement.a(i11, i19, i31, 2);
                defaultPlacement.a(iE - 1, i19, i31, 3);
                defaultPlacement.a(i19, iB - 2, i31, 4);
                int i35 = iB - 1;
                defaultPlacement.a(i19, i35, i31, 5);
                defaultPlacement.a(i21, i35, i31, 6);
                defaultPlacement.a(2, i35, i31, 7);
                defaultPlacement.a(3, i35, i31, 8);
                i31++;
            }
            if (i29 == iE + 4 && i30 == 2 && iB % 8 == 0) {
                int i36 = iE - 1;
                defaultPlacement.a(i36, 0, i31, i21);
                int i37 = iB - 1;
                defaultPlacement.a(i36, i37, i31, 2);
                int i38 = iB - 3;
                defaultPlacement.a(0, i38, i31, 3);
                int i39 = iB - 2;
                defaultPlacement.a(0, i39, i31, 4);
                defaultPlacement.a(0, i37, i31, 5);
                defaultPlacement.a(1, i38, i31, 6);
                defaultPlacement.a(1, i39, i31, 7);
                defaultPlacement.a(1, i37, i31, 8);
                i31++;
            }
            while (true) {
                i12 = defaultPlacement.f21506c;
                bArr = defaultPlacement.f21507d;
                if (i29 < iE && i30 >= 0 && bArr[(i29 * i12) + i30] < 0) {
                    defaultPlacement.b(i29, i30, i31);
                    i31++;
                }
                int i40 = i29 - 2;
                int i41 = i30 + 2;
                if (i40 < 0 || i41 >= iB) {
                    break;
                }
                i29 = i40;
                i30 = i41;
            }
            int i42 = i29 - 1;
            int i43 = i30 + 5;
            while (true) {
                if (i42 >= 0 && i43 < iB && bArr[(i42 * i12) + i43] < 0) {
                    defaultPlacement.b(i42, i43, i31);
                    i31++;
                }
                int i44 = i42 + 2;
                int i45 = i43 - 2;
                if (i44 >= iE || i45 < 0) {
                    break;
                }
                i42 = i44;
                i43 = i45;
            }
            i29 = i42 + 5;
            i30 = i43 - 1;
            if (i29 >= iE && i30 >= iB) {
                break;
            }
            i21 = 1;
            i19 = 0;
            i28 = 4;
        }
        int i46 = iB - 1;
        int i47 = iE - 1;
        if (bArr[(i47 * i12) + i46] < 0) {
            int i48 = (i47 * i12) + i46;
            byte b3 = (byte) 1;
            bArr[i48] = b3;
            bArr[(i11 * i12) + (iB - 2)] = b3;
        }
        int iB2 = symbolInfoF.b() * i15;
        int iE2 = symbolInfoF.e() * i16;
        ByteMatrix byteMatrix = new ByteMatrix(symbolInfoF.d(), (symbolInfoF.e() * i16) + (symbolInfoF.e() << 1));
        int i49 = 0;
        for (int i50 = 0; i50 < iE2; i50++) {
            int i51 = i50 % i16;
            if (i51 == 0) {
                int i52 = 0;
                for (int i53 = 0; i53 < symbolInfoF.d(); i53++) {
                    byteMatrix.c(i52, i49, i53 % 2 == 0);
                    i52++;
                }
                i49++;
            }
            int i54 = 0;
            for (int i55 = 0; i55 < iB2; i55++) {
                int i56 = i55 % i15;
                if (i56 == 0) {
                    byteMatrix.c(i54, i49, true);
                    i54++;
                }
                byteMatrix.c(i54, i49, bArr[(i50 * i12) + i55] == 1);
                int i57 = i54 + 1;
                if (i56 == i15 - 1) {
                    byteMatrix.c(i57, i49, i50 % 2 == 0);
                    i54 += 2;
                } else {
                    i54 = i57;
                }
            }
            int i58 = i49 + 1;
            if (i51 == i16 - 1) {
                int i59 = 0;
                for (int i60 = 0; i60 < symbolInfoF.d(); i60++) {
                    byteMatrix.c(i59, i58, true);
                    i59++;
                }
                i49 += 2;
            } else {
                i49 = i58;
            }
        }
        int i61 = byteMatrix.f21597b;
        int iMax = Math.max(200, i61);
        int i62 = byteMatrix.f21598c;
        int iMax2 = Math.max(200, i62);
        int iMin = Math.min(iMax / i61, iMax2 / i62);
        int i63 = (iMax - (i61 * iMin)) / 2;
        int i64 = (iMax2 - (i62 * iMin)) / 2;
        if (200 < i62 || 200 < i61) {
            bitMatrix = new BitMatrix(i61, i62);
            i13 = 0;
            i14 = 0;
        } else {
            bitMatrix = new BitMatrix(200, 200);
            i13 = i63;
            i14 = i64;
        }
        int[] iArr5 = bitMatrix.f21483d;
        int length2 = iArr5.length;
        for (int i65 = 0; i65 < length2; i65++) {
            iArr5[i65] = 0;
        }
        int i66 = i14;
        int i67 = 0;
        while (i67 < i62) {
            int i68 = i13;
            int i69 = 0;
            while (i69 < i61) {
                if (byteMatrix.a(i69, i67) == 1) {
                    bitMatrix.d(i68, i66, iMin, iMin);
                }
                i69++;
                i68 += iMin;
            }
            i67++;
            i66 += iMin;
        }
        return bitMatrix;
    }
}
