package com.google.zxing.datamatrix.encoder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class C40Encoder implements Encoder {
    public static void e(EncoderContext encoderContext, StringBuilder sb2) {
        int iCharAt = (sb2.charAt(1) * '(') + (sb2.charAt(0) * 1600) + sb2.charAt(2) + 1;
        encoderContext.f21512e.append(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb2.delete(0, 3);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void a(EncoderContext encoderContext) {
        StringBuilder sb2 = new StringBuilder();
        while (encoderContext.b()) {
            char cA = encoderContext.a();
            encoderContext.f21513f++;
            int iB = b(cA, sb2);
            int length = encoderContext.f21512e.length() + ((sb2.length() / 3) << 1);
            encoderContext.c(length);
            int i11 = encoderContext.f21515h.f21523b - length;
            if (!encoderContext.b()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (i11 < 2 || i11 > 2)) {
                    int length2 = sb2.length();
                    sb2.delete(length2 - iB, length2);
                    encoderContext.f21513f--;
                    iB = b(encoderContext.a(), sb3);
                    encoderContext.f21515h = null;
                }
                while (sb2.length() % 3 == 1 && ((iB <= 3 && i11 != 1) || iB > 3)) {
                    int length3 = sb2.length();
                    sb2.delete(length3 - iB, length3);
                    encoderContext.f21513f--;
                    iB = b(encoderContext.a(), sb3);
                    encoderContext.f21515h = null;
                }
                break;
            }
            if (sb2.length() % 3 == 0 && HighLevelEncoder.g(encoderContext.f21508a, encoderContext.f21513f, c()) != c()) {
                encoderContext.f21514g = 0;
                break;
            }
        }
        d(encoderContext, sb2);
    }

    public int b(char c11, StringBuilder sb2) {
        if (c11 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c11 >= '0' && c11 <= '9') {
            sb2.append((char) (c11 - ','));
            return 1;
        }
        if (c11 >= 'A' && c11 <= 'Z') {
            sb2.append((char) (c11 - '3'));
            return 1;
        }
        if (c11 < ' ') {
            sb2.append((char) 0);
            sb2.append(c11);
            return 2;
        }
        if (c11 >= '!' && c11 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - '!'));
            return 2;
        }
        if (c11 >= ':' && c11 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - '+'));
            return 2;
        }
        if (c11 >= '[' && c11 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - 'E'));
            return 2;
        }
        if (c11 < '`' || c11 > 127) {
            sb2.append("\u0001\u001e");
            return b((char) (c11 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c11 - '`'));
        return 2;
    }

    public int c() {
        return 1;
    }

    public void d(EncoderContext encoderContext, StringBuilder sb2) {
        int length = (sb2.length() / 3) << 1;
        int length2 = sb2.length() % 3;
        int length3 = encoderContext.f21512e.length() + length;
        encoderContext.c(length3);
        int i11 = encoderContext.f21515h.f21523b - length3;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                e(encoderContext, sb2);
            }
            if (encoderContext.b()) {
                encoderContext.d((char) 254);
            }
        } else if (i11 == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                e(encoderContext, sb2);
            }
            if (encoderContext.b()) {
                encoderContext.d((char) 254);
            }
            encoderContext.f21513f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb2.length() >= 3) {
                e(encoderContext, sb2);
            }
            if (i11 > 0 || encoderContext.b()) {
                encoderContext.d((char) 254);
            }
        }
        encoderContext.f21514g = 0;
    }
}
