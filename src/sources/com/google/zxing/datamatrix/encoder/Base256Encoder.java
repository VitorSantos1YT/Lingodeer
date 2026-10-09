package com.google.zxing.datamatrix.encoder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class Base256Encoder implements Encoder {
    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public final void a(EncoderContext encoderContext) {
        StringBuilder sb2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append((char) 0);
        while (true) {
            boolean zB = encoderContext.b();
            sb2 = encoderContext.f21512e;
            if (!zB) {
                break;
            }
            sb3.append(encoderContext.a());
            int i11 = encoderContext.f21513f + 1;
            encoderContext.f21513f = i11;
            if (HighLevelEncoder.g(encoderContext.f21508a, i11, 5) != 5) {
                encoderContext.f21514g = 0;
                break;
            }
        }
        int length = sb3.length() - 1;
        int length2 = sb2.length() + length + 1;
        encoderContext.c(length2);
        boolean z11 = encoderContext.f21515h.f21523b - length2 > 0;
        if (encoderContext.b() || z11) {
            if (length <= 249) {
                sb3.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb3.setCharAt(0, (char) ((length / 250) + 249));
                sb3.insert(1, (char) (length % 250));
            }
        }
        int length3 = sb3.length();
        for (int i12 = 0; i12 < length3; i12++) {
            int length4 = (((sb2.length() + 1) * 149) % 255) + 1 + sb3.charAt(i12);
            if (length4 > 255) {
                length4 -= 256;
            }
            encoderContext.d((char) length4);
        }
    }
}
