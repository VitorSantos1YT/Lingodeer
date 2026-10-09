package com.google.android.gms.internal.p002firebaseauthapi;

import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzanl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzanp f10230a = new zzanp();

    public static int a(String str) {
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
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i12) < 65536) {
                                    throw new zzano("Unpaired surrogate at index " + i12 + " of " + length2);
                                }
                                i12++;
                            }
                        }
                        i12++;
                    }
                    i13 += i11;
                    break;
                } catch (zzano unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i13 += (127 - cCharAt) >>> 31;
            i12++;
        }
        if (i13 >= length) {
            return i13;
        }
        throw new IllegalArgumentException(e.h(((long) i13) + 4294967296L, "UTF-8 length does not fit in int: "));
    }

    public static int b(String str, byte[] bArr, int i11, int i12) {
        int i13;
        int length;
        int i14;
        char cCharAt;
        f10230a.getClass();
        int length2 = str.length();
        int i15 = i11 + i12;
        int i16 = 0;
        while (i16 < length2 && (i14 = i16 + i11) < i15 && (cCharAt = str.charAt(i16)) < 128) {
            bArr[i14] = (byte) cCharAt;
            i16++;
        }
        if (i16 == length2) {
            return i11 + length2;
        }
        int i17 = i11 + i16;
        while (i16 < length2) {
            char cCharAt2 = str.charAt(i16);
            if (cCharAt2 < 128 && i17 < i15) {
                bArr[i17] = (byte) cCharAt2;
                i17++;
            } else if (cCharAt2 < 2048 && i17 <= i15 - 2) {
                int i18 = i17 + 1;
                bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                i17 += 2;
                bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i17 > i15 - 3) {
                    if (i17 <= i15 - 4) {
                        i16++;
                        if (i16 != str.length()) {
                            char cCharAt3 = str.charAt(i16);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i19 = i17 + 3;
                                bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i17 += 4;
                                bArr[i19] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        if (bytes.length - i11 > i12) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i11, bytes.length);
                        length = bytes.length;
                    } else {
                        if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i13 = i16 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                        if (bytes2.length - i11 > i12) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i11, bytes2.length);
                        length = bytes2.length;
                    }
                    return i11 + length;
                }
                bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i21 = i17 + 2;
                bArr[i17 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i17 += 3;
                bArr[i21] = (byte) ((cCharAt2 & '?') | 128);
            }
            i16++;
        }
        return i17;
    }

    public static String c(byte[] bArr, int i11, int i12) throws zzale {
        if (i12 == 0) {
            return BuildConfig.VERSION_NAME;
        }
        f10230a.getClass();
        if ((i11 | i12 | ((bArr.length - i11) - i12)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
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
                int i16 = i14 + 1;
                cArr[i14] = (char) b11;
                while (i15 < i13) {
                    byte b12 = bArr[i15];
                    if (b12 < 0) {
                        break;
                    }
                    i15++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
                i14 = i16;
                i11 = i15;
            } else if (b11 < -32) {
                if (i15 >= i13) {
                    throw zzale.c();
                }
                i11 += 2;
                byte b13 = bArr[i15];
                int i17 = i14 + 1;
                if (b11 < -62 || zzann.a(b13)) {
                    throw zzale.c();
                }
                cArr[i14] = (char) ((b13 & 63) | ((b11 & 31) << 6));
                i14 = i17;
            } else {
                if (b11 >= -16) {
                    if (i15 >= i13 - 2) {
                        throw zzale.c();
                    }
                    byte b14 = bArr[i15];
                    int i18 = i11 + 3;
                    byte b15 = bArr[i11 + 2];
                    i11 += 4;
                    byte b16 = bArr[i18];
                    int i19 = i14 + 1;
                    if (!zzann.a(b14)) {
                        if ((((b14 + 112) + (b11 << 28)) >> 30) == 0 && !zzann.a(b15) && !zzann.a(b16)) {
                            int i21 = ((b14 & 63) << 12) | ((b11 & 7) << 18) | ((b15 & 63) << 6) | (b16 & 63);
                            cArr[i14] = (char) ((i21 >>> 10) + 55232);
                            cArr[i19] = (char) ((i21 & 1023) + 56320);
                            i14 += 2;
                        }
                    }
                    throw zzale.c();
                }
                if (i15 >= i13 - 1) {
                    throw zzale.c();
                }
                int i22 = i11 + 2;
                byte b17 = bArr[i15];
                i11 += 3;
                byte b18 = bArr[i22];
                int i23 = i14 + 1;
                if (zzann.a(b17) || ((b11 == -32 && b17 < -96) || ((b11 == -19 && b17 >= -96) || zzann.a(b18)))) {
                    throw zzale.c();
                }
                cArr[i14] = (char) (((b17 & 63) << 6) | ((b11 & 15) << 12) | (b18 & 63));
                i14 = i23;
            }
        }
        return new String(cArr, 0, i14);
    }

    public static boolean d(byte[] bArr, int i11, int i12) {
        f10230a.getClass();
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
            } else if (b3 < -32) {
                if (i13 >= i12 || b3 < -62) {
                    return false;
                }
                i11 += 2;
                if (bArr[i13] > -65) {
                    return false;
                }
            } else if (b3 < -16) {
                if (i13 >= i12 - 1) {
                    return false;
                }
                int i14 = i11 + 2;
                byte b11 = bArr[i13];
                if (b11 > -65) {
                    return false;
                }
                if (b3 == -32 && b11 < -96) {
                    return false;
                }
                if (b3 == -19 && b11 >= -96) {
                    return false;
                }
                i11 += 3;
                if (bArr[i14] > -65) {
                    return false;
                }
            } else {
                if (i13 >= i12 - 2) {
                    return false;
                }
                int i15 = i11 + 2;
                byte b12 = bArr[i13];
                if (b12 > -65) {
                    return false;
                }
                if ((((b12 + 112) + (b3 << 28)) >> 30) != 0) {
                    return false;
                }
                int i16 = i11 + 3;
                if (bArr[i15] > -65) {
                    return false;
                }
                i11 += 4;
                if (bArr[i16] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
