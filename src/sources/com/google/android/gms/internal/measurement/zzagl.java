package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzagl {
    static {
        int i11 = zzacf.f11197a;
    }

    public static boolean a(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return true;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                i11 = i13;
            } else {
                if (b3 < -32) {
                    if (i13 < i12 && b3 >= -62) {
                        i11 += 2;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return false;
                }
                if (b3 >= -16) {
                    if (i13 >= i12 - 2) {
                        return false;
                    }
                    int i14 = i11 + 2;
                    byte b11 = bArr[i13];
                    if (b11 <= -65) {
                        if ((((b11 + 112) + (b3 << 28)) >> 30) == 0) {
                            int i15 = i11 + 3;
                            if (bArr[i14] <= -65) {
                                i11 += 4;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i13 >= i12 - 1) {
                    return false;
                }
                int i16 = i11 + 2;
                byte b12 = bArr[i13];
                if (b12 > -65 || (b3 == -32 && b12 < -96)) {
                    return false;
                }
                if (b3 == -19 && b12 >= -96) {
                    return false;
                }
                i11 += 3;
                if (bArr[i16] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int b(String str) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length && str.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            if (cCharAt >= 2048) {
                try {
                    int length2 = str.length();
                    while (i12 < length2) {
                        char cCharAt2 = str.charAt(i12);
                        if (cCharAt2 < 2048) {
                            i11 += (127 - cCharAt2) >>> 31;
                        } else {
                            i11 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i12) < 65536) {
                                    throw new zzagk(zzacg.a(length2, i12, (byte) 32, "Unpaired surrogate at index ", " of "));
                                }
                                i12++;
                            }
                        }
                        i12++;
                    }
                    i13 += i11;
                    break;
                } catch (zzagk unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i13 += (127 - cCharAt) >>> 31;
            i12++;
        }
        if (i13 >= length) {
            return i13;
        }
        long j11 = ((long) i13) + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j11);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int c(String str, byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int length;
        int i15;
        char cCharAt;
        int length2 = str.length();
        int i16 = 0;
        while (true) {
            i13 = i11 + i12;
            if (i16 >= length2 || (i15 = i16 + i11) >= i13 || (cCharAt = str.charAt(i16)) >= 128) {
                break;
            }
            bArr[i15] = (byte) cCharAt;
            i16++;
        }
        if (i16 == length2) {
            return i11 + length2;
        }
        int i17 = i11 + i16;
        while (i16 < length2) {
            char cCharAt2 = str.charAt(i16);
            if (cCharAt2 < 128 && i17 < i13) {
                bArr[i17] = (byte) cCharAt2;
                i17++;
            } else if (cCharAt2 < 2048 && i17 <= i13 - 2) {
                bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i17 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i17 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i17 > i13 - 3) {
                    if (i17 <= i13 - 4) {
                        i16++;
                        if (i16 != str.length()) {
                            char cCharAt3 = str.charAt(i16);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int i18 = i17 + 3;
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i17 += 4;
                                bArr[i18] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes.length;
                        if (length - i11 > i12) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i11, length);
                    } else {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i14 = i16 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i14)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes2.length;
                        if (length - i11 > i12) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i11, length);
                    }
                    return i11 + length;
                }
                bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i17 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i17 += 3;
            }
            i16++;
        }
        return i17;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094 A[PHI: r4
      0x0094: PHI (r4v6 byte) = (r4v5 byte), (r4v9 byte) binds: [B:41:0x008f, B:43:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ac A[SYNTHETIC] */
    public static String d(byte[] bArr, int i11, int i12) throws zzaeh {
        if (i12 == 0) {
            return BuildConfig.VERSION_NAME;
        }
        int length = bArr.length;
        if ((((length - i11) - i12) | i11 | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        int i13 = i11 + i12;
        char[] cArr = new char[i12];
        int i14 = 0;
        while (i11 < i13) {
            byte b3 = bArr[i11];
            if (b3 < 0) {
                break;
            }
            i11++;
            cArr[i14] = (char) b3;
            i14++;
        }
        while (i11 < i13) {
            int i15 = i11 + 1;
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                cArr[i14] = (char) b11;
                i14++;
                i11 = i15;
                while (i11 < i13) {
                    byte b12 = bArr[i11];
                    if (b12 < 0) {
                        break;
                    }
                    i11++;
                    cArr[i14] = (char) b12;
                    i14++;
                }
            } else {
                if (b11 >= -32) {
                    if (b11 >= -16) {
                        if (i15 >= i13 - 2) {
                            throw new zzaeh("Protocol message had invalid UTF-8.");
                        }
                        byte b13 = bArr[i15];
                        int i16 = i11 + 3;
                        byte b14 = bArr[i11 + 2];
                        i11 += 4;
                        byte b15 = bArr[i16];
                        if (!zzagh.a(b13)) {
                            if ((((b13 + 112) + (b11 << 28)) >> 30) == 0 && !zzagh.a(b14) && !zzagh.a(b15)) {
                                int i17 = ((b13 & 63) << 12) | ((b11 & 7) << 18) | ((b14 & 63) << 6) | (b15 & 63);
                                cArr[i14] = (char) ((i17 >>> 10) + 55232);
                                cArr[i14 + 1] = (char) ((i17 & 1023) + 56320);
                                i14 += 2;
                            }
                        }
                        throw new zzaeh("Protocol message had invalid UTF-8.");
                    }
                    if (i15 >= i13 - 1) {
                        throw new zzaeh("Protocol message had invalid UTF-8.");
                    }
                    int i18 = i14 + 1;
                    int i19 = i11 + 2;
                    byte b16 = bArr[i15];
                    i11 += 3;
                    byte b17 = bArr[i19];
                    if (!zzagh.a(b16)) {
                        if (b11 != -32) {
                            if (b11 != -19) {
                                if (!zzagh.a(b17)) {
                                    cArr[i14] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                                    i14 = i18;
                                }
                            } else if (b16 < -96) {
                                b11 = -19;
                                if (!zzagh.a(b17)) {
                                    cArr[i14] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                                    i14 = i18;
                                }
                            }
                        } else if (b16 >= -96) {
                            b11 = -32;
                            if (b11 != -19) {
                                if (!zzagh.a(b17)) {
                                    cArr[i14] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                                    i14 = i18;
                                }
                            } else if (b16 < -96) {
                                b11 = -19;
                                if (!zzagh.a(b17)) {
                                    cArr[i14] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                                    i14 = i18;
                                }
                            }
                        }
                    }
                    throw new zzaeh("Protocol message had invalid UTF-8.");
                }
                if (i15 >= i13) {
                    throw new zzaeh("Protocol message had invalid UTF-8.");
                }
                int i21 = i14 + 1;
                i11 += 2;
                byte b18 = bArr[i15];
                if (b11 < -62 || zzagh.a(b18)) {
                    throw new zzaeh("Protocol message had invalid UTF-8.");
                }
                cArr[i14] = (char) ((b18 & 63) | ((b11 & 31) << 6));
                i14 = i21;
            }
        }
        return new String(cArr, 0, i14);
    }
}
