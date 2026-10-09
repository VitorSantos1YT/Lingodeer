package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class HighLevelEncoder {
    private HighLevelEncoder() {
    }

    public static String a(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
        int i11 = 0;
        Encoder[] encoderArr = {new ASCIIEncoder(), new C40Encoder(), new TextEncoder(), new X12Encoder(), new EdifactEncoder(), new Base256Encoder()};
        EncoderContext encoderContext = new EncoderContext(str);
        encoderContext.f21509b = symbolShapeHint;
        encoderContext.f21510c = dimension;
        encoderContext.f21511d = dimension2;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            encoderContext.d((char) 236);
            encoderContext.f21516i = 2;
            encoderContext.f21513f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            encoderContext.d((char) 237);
            encoderContext.f21516i = 2;
            encoderContext.f21513f += 7;
        }
        while (encoderContext.b()) {
            encoderArr[i11].a(encoderContext);
            int i12 = encoderContext.f21514g;
            if (i12 >= 0) {
                encoderContext.f21514g = -1;
                i11 = i12;
            }
        }
        StringBuilder sb2 = encoderContext.f21512e;
        int length = sb2.length();
        encoderContext.c(sb2.length());
        int i13 = encoderContext.f21515h.f21523b;
        if (length < i13 && i11 != 0 && i11 != 5 && i11 != 4) {
            encoderContext.d((char) 254);
        }
        if (sb2.length() < i13) {
            sb2.append((char) 129);
        }
        while (sb2.length() < i13) {
            int length2 = ((sb2.length() + 1) * 149) % 253;
            int i14 = length2 + 130;
            if (i14 > 254) {
                i14 = length2 - 124;
            }
            sb2.append((char) i14);
        }
        return sb2.toString();
    }

    public static int b(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < 6; i12++) {
            int iCeil = (int) Math.ceil(fArr[i12]);
            iArr[i12] = iCeil;
            if (i11 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i11 = iCeil;
            }
            if (i11 == iCeil) {
                bArr[i12] = (byte) (bArr[i12] + 1);
            }
        }
        return i11;
    }

    public static void c(char c11) {
        String hexString = Integer.toHexString(c11);
        throw new IllegalArgumentException("Illegal character: " + c11 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean d(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    public static boolean e(char c11) {
        return c11 >= 128 && c11 <= 255;
    }

    public static boolean f(char c11) {
        if (c11 == '\r' || c11 == '*' || c11 == '>' || c11 == ' ') {
            return true;
        }
        if (c11 < '0' || c11 > '9') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0196  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:73:0x012a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x0139  */
    /* JADX WARN: Code duplicated, block: B:81:0x014f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code duplicated, block: B:84:0x015d  */
    /* JADX WARN: Code duplicated, block: B:87:0x016c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177 A[LOOP:1: B:88:0x0175->B:89:0x0177, LOOP_END] */
    public static int g(CharSequence charSequence, int i11, int i12) {
        float[] fArr;
        int i13;
        int[] iArr;
        byte[] bArr;
        int i14;
        int i15;
        int i16;
        int i17;
        byte b3;
        byte b11;
        byte b12;
        byte b13;
        int i18;
        if (i11 >= charSequence.length()) {
            return i12;
        }
        float f5 = 2.0f;
        int i19 = 5;
        float f11 = 1.0f;
        int i21 = 2;
        if (i12 == 0) {
            fArr = new float[]{CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i12] = 0.0f;
        }
        int i22 = 0;
        while (true) {
            int i23 = i11 + i22;
            if (i23 == charSequence.length()) {
                byte[] bArr2 = new byte[6];
                int[] iArr2 = new int[6];
                int iB = b(fArr, iArr2, bArr2);
                int i24 = 0;
                for (int i25 = 0; i25 < 6; i25++) {
                    i24 += bArr2[i25];
                }
                if (iArr2[0] == iB) {
                    break;
                }
                if (i24 == 1 && bArr2[i19] > 0) {
                    return i19;
                }
                if (i24 != 1 || bArr2[4] <= 0) {
                    if (i24 != 1 || bArr2[i21] <= 0) {
                        return (i24 != 1 || bArr2[3] <= 0) ? 1 : 3;
                    }
                    return i21;
                }
                return 4;
            }
            char cCharAt = charSequence.charAt(i23);
            i22++;
            if (d(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (e(cCharAt)) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + f5;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + f11;
            }
            int i26 = i19;
            float f12 = f11;
            if (cCharAt == ' ' || (cCharAt >= '0' && cCharAt <= '9')) {
                i13 = i21;
            } else {
                i13 = i21;
                if (cCharAt < 'A' || cCharAt > 'Z') {
                    if (e(cCharAt)) {
                        fArr[1] = fArr[1] + 2.6666667f;
                    } else {
                        fArr[1] = fArr[1] + 1.3333334f;
                    }
                }
                if (cCharAt != ' ' || ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                    fArr[i13] = fArr[i13] + 0.6666667f;
                } else if (e(cCharAt)) {
                    fArr[i13] = fArr[i13] + 2.6666667f;
                } else {
                    fArr[i13] = fArr[i13] + 1.3333334f;
                }
                if (f(cCharAt)) {
                    fArr[3] = fArr[3] + 0.6666667f;
                } else if (e(cCharAt)) {
                    fArr[3] = fArr[3] + 4.3333335f;
                } else {
                    fArr[3] = fArr[3] + 3.3333333f;
                }
                if (cCharAt < ' ' && cCharAt <= '^') {
                    fArr[4] = fArr[4] + 0.75f;
                } else if (e(cCharAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
                fArr[i26] = fArr[i26] + f12;
                if (i22 >= 4) {
                    iArr = new int[6];
                    bArr = new byte[6];
                    b(fArr, iArr, bArr);
                    i15 = 0;
                    for (i14 = 0; i14 < 6; i14++) {
                        i15 += bArr[i14];
                    }
                    i16 = iArr[0];
                    i17 = iArr[i26];
                    if (i16 >= i17 && i16 < iArr[1] && i16 < iArr[i13] && i16 < iArr[3] && i16 < iArr[4]) {
                        break;
                    }
                    if (i17 >= i16) {
                        return i26;
                    }
                    b3 = bArr[1];
                    b11 = bArr[i13];
                    b12 = bArr[3];
                    b13 = bArr[4];
                    if (b3 + b11 + b12 + b13 == 0) {
                        return i26;
                    }
                    if (i15 != 1 && b13 > 0) {
                        return 4;
                    }
                    if (i15 != 1 && b11 > 0) {
                        return i13;
                    }
                    if (i15 == 1 || b12 <= 0) {
                        int i27 = iArr[1];
                        i18 = i27 + 1;
                        if (i18 < i16 && i18 < i17 && i18 < iArr[4] && i18 < iArr[i13]) {
                            int i28 = iArr[3];
                            if (i27 >= i28) {
                                if (i27 == i28) {
                                    for (int i29 = i11 + i22 + 1; i29 < charSequence.length(); i29++) {
                                        char cCharAt2 = charSequence.charAt(i29);
                                        if (cCharAt2 == '\r' || cCharAt2 == '*' || cCharAt2 == '>') {
                                            return 3;
                                        }
                                        if (!f(cCharAt2)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i19 = i26;
                f11 = f12;
                i21 = i13;
                f5 = 2.0f;
            }
            fArr[1] = fArr[1] + 0.6666667f;
            if (cCharAt != ' ') {
                fArr[i13] = fArr[i13] + 0.6666667f;
            } else {
                fArr[i13] = fArr[i13] + 0.6666667f;
            }
            if (f(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (e(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (cCharAt < ' ') {
                if (e(cCharAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            } else if (e(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            fArr[i26] = fArr[i26] + f12;
            if (i22 >= 4) {
                iArr = new int[6];
                bArr = new byte[6];
                b(fArr, iArr, bArr);
                i15 = 0;
                while (i14 < 6) {
                    i15 += bArr[i14];
                }
                i16 = iArr[0];
                i17 = iArr[i26];
                if (i16 >= i17) {
                }
                if (i17 >= i16) {
                    return i26;
                }
                b3 = bArr[1];
                b11 = bArr[i13];
                b12 = bArr[3];
                b13 = bArr[4];
                if (b3 + b11 + b12 + b13 == 0) {
                    return i26;
                }
                if (i15 != 1) {
                }
                if (i15 != 1) {
                }
                if (i15 == 1) {
                }
                int i210 = iArr[1];
                i18 = i210 + 1;
                if (i18 < i16) {
                    continue;
                }
            }
            i19 = i26;
            f11 = f12;
            i21 = i13;
            f5 = 2.0f;
        }
        return 0;
    }
}
