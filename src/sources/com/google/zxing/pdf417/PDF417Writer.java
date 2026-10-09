package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.encoder.Compaction;
import com.google.zxing.pdf417.encoder.Dimensions;
import com.google.zxing.pdf417.encoder.PDF417;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PDF417Writer implements Writer {
    public static BitMatrix b(byte[][] bArr, int i11) {
        int i12 = i11 * 2;
        int length = bArr[0].length + i12;
        int length2 = bArr.length + i12;
        BitMatrix bitMatrix = new BitMatrix(length, length2);
        int[] iArr = bitMatrix.f21483d;
        int length3 = iArr.length;
        for (int i13 = 0; i13 < length3; i13++) {
            iArr[i13] = 0;
        }
        int i14 = (length2 - i11) - 1;
        int i15 = 0;
        while (i15 < bArr.length) {
            byte[] bArr2 = bArr[i15];
            for (int i16 = 0; i16 < bArr[0].length; i16++) {
                if (bArr2[i16] == 1) {
                    bitMatrix.c(i16 + i11, i14);
                }
            }
            i15++;
            i14--;
        }
        return bitMatrix;
    }

    public static byte[][] c(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int length = (bArr.length - i11) - 1;
            for (int i12 = 0; i12 < bArr[0].length; i12++) {
                bArr2[i12][length] = bArr[i11][i12];
            }
        }
        return bArr2;
    }

    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        boolean z11;
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
        }
        PDF417 pdf417 = new PDF417();
        EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
        if (enumMap.containsKey(encodeHintType)) {
            pdf417.f21571b = Boolean.valueOf(enumMap.get(encodeHintType).toString()).booleanValue();
        }
        EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
        if (enumMap.containsKey(encodeHintType2)) {
            pdf417.f21572c = Compaction.valueOf(enumMap.get(encodeHintType2).toString());
        }
        EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
        if (enumMap.containsKey(encodeHintType3)) {
            ((Dimensions) enumMap.get(encodeHintType3)).getClass();
            pdf417.f21575f = 0;
            pdf417.f21574e = 0;
            pdf417.f21576g = 0;
            pdf417.f21577h = 0;
        }
        EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
        int i11 = enumMap.containsKey(encodeHintType4) ? Integer.parseInt(enumMap.get(encodeHintType4).toString()) : 30;
        EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
        int i12 = enumMap.containsKey(encodeHintType5) ? Integer.parseInt(enumMap.get(encodeHintType5).toString()) : 2;
        EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
        if (enumMap.containsKey(encodeHintType6)) {
            pdf417.f21573d = Charset.forName(enumMap.get(encodeHintType6).toString());
        }
        pdf417.b(i12, str);
        byte[][] bArrB = pdf417.f21570a.b(1, 4);
        if (bArrB[0].length < bArrB.length) {
            bArrB = c(bArrB);
            z11 = true;
        } else {
            z11 = false;
        }
        int length = 200 / bArrB[0].length;
        int length2 = 200 / bArrB.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return b(bArrB, i11);
        }
        byte[][] bArrB2 = pdf417.f21570a.b(length, length << 2);
        if (z11) {
            bArrB2 = c(bArrB2);
        }
        return b(bArrB2, i11);
    }
}
