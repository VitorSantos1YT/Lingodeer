package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.aztec.encoder.Encoder;
import com.google.zxing.common.BitMatrix;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AztecWriter implements Writer {
    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
        if (enumMap.containsKey(encodeHintType)) {
            charsetForName = Charset.forName(enumMap.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
        int i11 = enumMap.containsKey(encodeHintType2) ? Integer.parseInt(enumMap.get(encodeHintType2).toString()) : 33;
        EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
        int i12 = enumMap.containsKey(encodeHintType3) ? Integer.parseInt(enumMap.get(encodeHintType3).toString()) : 0;
        if (barcodeFormat != BarcodeFormat.AZTEC) {
            throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
        }
        BitMatrix bitMatrix = Encoder.b(str.getBytes(charsetForName), i11, i12).f21461a;
        if (bitMatrix == null) {
            throw new IllegalStateException();
        }
        int i13 = bitMatrix.f21480a;
        int i14 = bitMatrix.f21481b;
        int iMax = Math.max(200, i13);
        int iMax2 = Math.max(200, i14);
        int iMin = Math.min(iMax / i13, iMax2 / i14);
        int i15 = (iMax - (i13 * iMin)) / 2;
        int i16 = (iMax2 - (i14 * iMin)) / 2;
        BitMatrix bitMatrix2 = new BitMatrix(iMax, iMax2);
        int i17 = 0;
        while (i17 < i14) {
            int i18 = i15;
            int i19 = 0;
            while (i19 < i13) {
                if (bitMatrix.a(i19, i17)) {
                    bitMatrix2.d(i18, i16, iMin, iMin);
                }
                i19++;
                i18 += iMin;
            }
            i17++;
            i16 += iMin;
        }
        return bitMatrix2;
    }
}
