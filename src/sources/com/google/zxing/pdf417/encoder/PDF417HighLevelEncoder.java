package com.google.zxing.pdf417.encoder;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class PDF417HighLevelEncoder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f21581c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f21579a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f21580b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f21582d = new byte[128];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f21583e = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21584a;

        static {
            int[] iArr = new int[Compaction.values().length];
            f21584a = iArr;
            try {
                iArr[Compaction.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21584a[Compaction.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21584a[Compaction.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f21581c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr2 = f21579a;
            if (i12 >= bArr2.length) {
                break;
            }
            byte b3 = bArr2[i12];
            if (b3 > 0) {
                f21581c[b3] = (byte) i12;
            }
            i12++;
        }
        Arrays.fill(f21582d, (byte) -1);
        while (true) {
            byte[] bArr3 = f21580b;
            if (i11 >= bArr3.length) {
                return;
            }
            byte b11 = bArr3[i11];
            if (b11 > 0) {
                f21582d[b11] = (byte) i11;
            }
            i11++;
        }
    }

    private PDF417HighLevelEncoder() {
    }

    public static void a(int i11, int i12, StringBuilder sb2, byte[] bArr) {
        if (i11 == 1 && i12 == 0) {
            sb2.append((char) 913);
        } else if (i11 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        int i13 = 0;
        if (i11 >= 6) {
            char[] cArr = new char[5];
            int i14 = 0;
            while (i11 - i14 >= 6) {
                long j11 = 0;
                for (int i15 = 0; i15 < 6; i15++) {
                    j11 = (j11 << 8) + ((long) (bArr[i14 + i15] & 255));
                }
                for (int i16 = 0; i16 < 5; i16++) {
                    cArr[i16] = (char) (j11 % 900);
                    j11 /= 900;
                }
                for (int i17 = 4; i17 >= 0; i17--) {
                    sb2.append(cArr[i17]);
                }
                i14 += 6;
            }
            i13 = i14;
        }
        while (i13 < i11) {
            sb2.append((char) (bArr[i13] & 255));
            i13++;
        }
    }

    public static void b(int i11, int i12, String str, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i12 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i13 = 0;
        while (i13 < i12) {
            sb3.setLength(0);
            int iMin = Math.min(44, i12 - i13);
            StringBuilder sb4 = new StringBuilder("1");
            int i14 = i11 + i13;
            sb4.append(str.substring(i14, i14 + iMin));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i13 += iMin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00e6 A[EDGE_INSN: B:76:0x00e6->B:57:0x00e6 BREAK  A[LOOP:0: B:3:0x000e->B:93:0x000e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x000e A[SYNTHETIC] */
    public static int c(String str, int i11, int i12, StringBuilder sb2, int i13) {
        char cCharAt;
        StringBuilder sb3 = new StringBuilder(i12);
        int i14 = i13;
        int i15 = 0;
        while (true) {
            int i16 = i11 + i15;
            char cCharAt2 = str.charAt(i16);
            byte[] bArr = f21581c;
            byte[] bArr2 = f21582d;
            if (i14 == 0) {
                if (e(cCharAt2)) {
                    if (cCharAt2 == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (cCharAt2 - 'A'));
                    }
                } else if (d(cCharAt2)) {
                    sb3.append((char) 27);
                    i14 = 1;
                } else if (bArr[cCharAt2] != -1) {
                    sb3.append((char) 28);
                    i14 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) bArr2[cCharAt2]);
                }
                i15++;
                if (i15 >= i12) {
                    break;
                    break;
                }
            } else {
                if (i14 != 1) {
                    if (i14 == 2) {
                        byte b3 = bArr[cCharAt2];
                        if (b3 != -1) {
                            sb3.append((char) b3);
                        } else if (e(cCharAt2)) {
                            sb3.append((char) 28);
                            i14 = 0;
                        } else if (d(cCharAt2)) {
                            sb3.append((char) 27);
                            i14 = 1;
                        } else {
                            int i17 = i16 + 1;
                            if (i17 >= i12 || bArr2[str.charAt(i17)] == -1) {
                                sb3.append((char) 29);
                                sb3.append((char) bArr2[cCharAt2]);
                            } else {
                                sb3.append((char) 25);
                                i14 = 3;
                            }
                        }
                    } else if (bArr2[cCharAt2] != -1) {
                        sb3.append((char) bArr2[cCharAt2]);
                    } else {
                        sb3.append((char) 29);
                        i14 = 0;
                    }
                } else if (d(cCharAt2)) {
                    if (cCharAt2 == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (cCharAt2 - 'a'));
                    }
                } else if (e(cCharAt2)) {
                    sb3.append((char) 27);
                    sb3.append((char) (cCharAt2 - 'A'));
                } else if (bArr[cCharAt2] != -1) {
                    sb3.append((char) 28);
                    i14 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) bArr2[cCharAt2]);
                }
                i15++;
                if (i15 >= i12) {
                    break;
                }
            }
        }
        int length = sb3.length();
        char c11 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            if (i18 % 2 != 0) {
                cCharAt = (char) (sb3.charAt(i18) + (c11 * 30));
                sb2.append(cCharAt);
            } else {
                cCharAt = sb3.charAt(i18);
            }
            c11 = cCharAt;
        }
        if (length % 2 != 0) {
            sb2.append((char) ((c11 * 30) + 29));
        }
        return i14;
    }

    public static boolean d(char c11) {
        if (c11 != ' ') {
            return c11 >= 'a' && c11 <= 'z';
        }
        return true;
    }

    public static boolean e(char c11) {
        if (c11 != ' ') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }
}
