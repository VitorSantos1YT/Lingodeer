package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class QRCodeWriter implements Writer {
    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
        if (enumMap.containsKey(encodeHintType)) {
            errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(enumMap.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
        int i11 = enumMap.containsKey(encodeHintType2) ? Integer.parseInt(enumMap.get(encodeHintType2).toString()) : 4;
        ByteMatrix byteMatrix = Encoder.a(str, errorCorrectionLevelValueOf, enumMap).f21609e;
        if (byteMatrix == null) {
            throw new IllegalStateException();
        }
        int i12 = byteMatrix.f21597b;
        int i13 = byteMatrix.f21598c;
        int i14 = i11 << 1;
        int i15 = i12 + i14;
        int i16 = i14 + i13;
        int iMax = Math.max(200, i15);
        int iMax2 = Math.max(200, i16);
        int iMin = Math.min(iMax / i15, iMax2 / i16);
        int i17 = (iMax - (i12 * iMin)) / 2;
        int i18 = (iMax2 - (i13 * iMin)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
        int i19 = 0;
        while (i19 < i13) {
            int i21 = i17;
            int i22 = 0;
            while (i22 < i12) {
                if (byteMatrix.a(i22, i19) == 1) {
                    bitMatrix.d(i21, i18, iMin, iMin);
                }
                i22++;
                i21 += iMin;
            }
            i19++;
            i18 += iMin;
        }
        return bitMatrix;
    }
}
