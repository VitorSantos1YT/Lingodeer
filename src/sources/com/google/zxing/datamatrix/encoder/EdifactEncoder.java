package com.google.zxing.datamatrix.encoder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class EdifactEncoder implements Encoder {
    public static String b(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (sb2.charAt(0) << 18) + ((length >= 2 ? sb2.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb2.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb2.charAt(3) : (char) 0);
        char c11 = (char) ((iCharAt >> 16) & 255);
        char c12 = (char) ((iCharAt >> 8) & 255);
        char c13 = (char) (iCharAt & 255);
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append(c11);
        if (length >= 2) {
            sb3.append(c12);
        }
        if (length >= 3) {
            sb3.append(c13);
        }
        return sb3.toString();
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public final void a(EncoderContext encoderContext) {
        boolean z11;
        String str = encoderContext.f21508a;
        StringBuilder sb2 = encoderContext.f21512e;
        StringBuilder sb3 = new StringBuilder();
        while (true) {
            z11 = true;
            if (!encoderContext.b()) {
                break;
            }
            char cA = encoderContext.a();
            if (cA >= ' ' && cA <= '?') {
                sb3.append(cA);
            } else {
                if (cA < '@' || cA > '^') {
                    HighLevelEncoder.c(cA);
                    throw null;
                }
                sb3.append((char) (cA - '@'));
            }
            encoderContext.f21513f++;
            if (sb3.length() >= 4) {
                sb2.append(b(sb3));
                sb3.delete(0, 4);
                if (HighLevelEncoder.g(str, encoderContext.f21513f, 4) != 4) {
                    encoderContext.f21514g = 0;
                    break;
                }
            }
        }
        sb3.append((char) 31);
        try {
            int length = sb3.length();
            if (length == 0) {
                encoderContext.f21514g = 0;
                return;
            }
            if (length == 1) {
                encoderContext.c(sb2.length());
                int length2 = encoderContext.f21515h.f21523b - sb2.length();
                int length3 = (str.length() - encoderContext.f21516i) - encoderContext.f21513f;
                if (length3 > length2) {
                    encoderContext.c(sb2.length() + 1);
                    length2 = encoderContext.f21515h.f21523b - sb2.length();
                }
                if (length3 <= length2 && length2 <= 2) {
                    encoderContext.f21514g = 0;
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i11 = length - 1;
            String strB = b(sb3);
            if (encoderContext.b() || i11 > 2) {
                z11 = false;
            }
            if (i11 <= 2) {
                encoderContext.c(sb2.length() + i11);
                if (encoderContext.f21515h.f21523b - sb2.length() >= 3) {
                    encoderContext.c(sb2.length() + strB.length());
                    z11 = false;
                }
            }
            if (z11) {
                encoderContext.f21515h = null;
                encoderContext.f21513f -= i11;
            } else {
                sb2.append(strB);
            }
            encoderContext.f21514g = 0;
        } catch (Throwable th2) {
            encoderContext.f21514g = 0;
            throw th2;
        }
    }
}
