package com.google.zxing.datamatrix.encoder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class X12Encoder extends C40Encoder {
    @Override // com.google.zxing.datamatrix.encoder.C40Encoder, com.google.zxing.datamatrix.encoder.Encoder
    public final void a(EncoderContext encoderContext) {
        StringBuilder sb2 = new StringBuilder();
        while (encoderContext.b()) {
            char cA = encoderContext.a();
            encoderContext.f21513f++;
            b(cA, sb2);
            if (sb2.length() % 3 == 0) {
                C40Encoder.e(encoderContext, sb2);
                if (HighLevelEncoder.g(encoderContext.f21508a, encoderContext.f21513f, 3) != 3) {
                    encoderContext.f21514g = 0;
                    break;
                }
            }
        }
        d(encoderContext, sb2);
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    public final int b(char c11, StringBuilder sb2) {
        if (c11 == '\r') {
            sb2.append((char) 0);
            return 1;
        }
        if (c11 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c11 == '*') {
            sb2.append((char) 1);
            return 1;
        }
        if (c11 == '>') {
            sb2.append((char) 2);
            return 1;
        }
        if (c11 >= '0' && c11 <= '9') {
            sb2.append((char) (c11 - ','));
            return 1;
        }
        if (c11 < 'A' || c11 > 'Z') {
            HighLevelEncoder.c(c11);
            throw null;
        }
        sb2.append((char) (c11 - '3'));
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    public final int c() {
        return 3;
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    public final void d(EncoderContext encoderContext, StringBuilder sb2) {
        StringBuilder sb3 = encoderContext.f21512e;
        encoderContext.c(sb3.length());
        int length = encoderContext.f21515h.f21523b - sb3.length();
        encoderContext.f21513f -= sb2.length();
        String str = encoderContext.f21508a;
        if ((str.length() - encoderContext.f21516i) - encoderContext.f21513f > 1 || length > 1 || (str.length() - encoderContext.f21516i) - encoderContext.f21513f != length) {
            encoderContext.d((char) 254);
        }
        if (encoderContext.f21514g < 0) {
            encoderContext.f21514g = 0;
        }
    }
}
