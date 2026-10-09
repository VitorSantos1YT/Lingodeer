package com.google.zxing.datamatrix.encoder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class ASCIIEncoder implements Encoder {
    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public final void a(EncoderContext encoderContext) {
        int i11;
        String str = encoderContext.f21508a;
        int i12 = encoderContext.f21513f;
        int length = str.length();
        if (i12 < length) {
            char cCharAt = str.charAt(i12);
            i11 = 0;
            while (HighLevelEncoder.d(cCharAt) && i12 < length) {
                i11++;
                i12++;
                if (i12 < length) {
                    cCharAt = str.charAt(i12);
                }
            }
        } else {
            i11 = 0;
        }
        if (i11 >= 2) {
            char cCharAt2 = str.charAt(encoderContext.f21513f);
            char cCharAt3 = str.charAt(encoderContext.f21513f + 1);
            if (HighLevelEncoder.d(cCharAt2) && HighLevelEncoder.d(cCharAt3)) {
                encoderContext.d((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + 130));
                encoderContext.f21513f += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
            }
        }
        char cA = encoderContext.a();
        int iG = HighLevelEncoder.g(str, encoderContext.f21513f, 0);
        if (iG == 0) {
            if (!HighLevelEncoder.e(cA)) {
                encoderContext.d((char) (cA + 1));
                encoderContext.f21513f++;
                return;
            } else {
                encoderContext.d((char) 235);
                encoderContext.d((char) (cA - 127));
                encoderContext.f21513f++;
                return;
            }
        }
        if (iG == 1) {
            encoderContext.d((char) 230);
            encoderContext.f21514g = 1;
            return;
        }
        if (iG == 2) {
            encoderContext.d((char) 239);
            encoderContext.f21514g = 2;
            return;
        }
        if (iG == 3) {
            encoderContext.d((char) 238);
            encoderContext.f21514g = 3;
        } else if (iG == 4) {
            encoderContext.d((char) 240);
            encoderContext.f21514g = 4;
        } else {
            if (iG != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iG)));
            }
            encoderContext.d((char) 231);
            encoderContext.f21514g = 5;
        }
    }
}
