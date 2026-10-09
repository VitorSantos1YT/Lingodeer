package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzpv {
    static {
        if (zzps.zzx() && zzps.zzy()) {
            int i11 = zzks.zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i11, int i12) {
        int i13 = i12 - i11;
        byte b3 = bArr[i11 - 1];
        if (i13 == 0) {
            if (b3 <= -12) {
                return b3;
            }
            return -1;
        }
        if (i13 == 1) {
            byte b11 = bArr[i11];
            if (b3 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b3;
        }
        if (i13 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i11];
        byte b13 = bArr[i11 + 1];
        if (b3 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b3);
    }

    public static int zzb(String str, byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        char cCharAt;
        int length = str.length();
        int i16 = 0;
        while (true) {
            i13 = i11 + i12;
            if (i16 >= length || (i15 = i16 + i11) >= i13 || (cCharAt = str.charAt(i16)) >= 128) {
                break;
            }
            bArr[i15] = (byte) cCharAt;
            i16++;
        }
        if (i16 == length) {
            return i11 + length;
        }
        int i17 = i11 + i16;
        while (i16 < length) {
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
                    if (i17 > i13 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i14 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i14)))) {
                            throw new zzpu(i16, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                    }
                    int i18 = i16 + 1;
                    if (i18 != str.length()) {
                        char cCharAt3 = str.charAt(i18);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i19 = i17 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i17 += 4;
                            bArr[i19] = (byte) ((codePoint & 63) | 128);
                            i16 = i18;
                        } else {
                            i16 = i18;
                        }
                    }
                    throw new zzpu(i16 - 1, length);
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

    public static int zzc(String str) {
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
                int length2 = str.length();
                while (i12 < length2) {
                    char cCharAt2 = str.charAt(i12);
                    if (cCharAt2 < 2048) {
                        i11 += (127 - cCharAt2) >>> 31;
                    } else {
                        i11 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i12) < 65536) {
                                throw new zzpu(i12, length2);
                            }
                            i12++;
                        }
                    }
                    i12++;
                }
                i13 += i11;
                break;
            }
            i13 += (127 - cCharAt) >>> 31;
            i12++;
        }
        if (i13 >= length) {
            return i13;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i13) + 4294967296L));
    }

    public static String zzd(byte[] bArr, int i11, int i12) throws zznn {
        int i13;
        int length = bArr.length;
        if ((((length - i11) - i12) | i11 | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        int i14 = i11 + i12;
        char[] cArr = new char[i12];
        int i15 = 0;
        while (i11 < i14) {
            byte b3 = bArr[i11];
            if (!zzpt.zzd(b3)) {
                break;
            }
            i11++;
            cArr[i15] = (char) b3;
            i15++;
        }
        int i16 = i15;
        while (i11 < i14) {
            int i17 = i11 + 1;
            byte b11 = bArr[i11];
            if (zzpt.zzd(b11)) {
                cArr[i16] = (char) b11;
                i16++;
                i11 = i17;
                while (i11 < i14) {
                    byte b12 = bArr[i11];
                    if (!zzpt.zzd(b12)) {
                        break;
                    }
                    i11++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
            } else {
                if (b11 < -32) {
                    if (i17 >= i14) {
                        throw new zznn("Protocol message had invalid UTF-8.");
                    }
                    i13 = i16 + 1;
                    i11 += 2;
                    zzpt.zzc(b11, bArr[i17], cArr, i16);
                } else if (b11 < -16) {
                    if (i17 >= i14 - 1) {
                        throw new zznn("Protocol message had invalid UTF-8.");
                    }
                    i13 = i16 + 1;
                    int i18 = i11 + 2;
                    i11 += 3;
                    zzpt.zzb(b11, bArr[i17], bArr[i18], cArr, i16);
                } else {
                    if (i17 >= i14 - 2) {
                        throw new zznn("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i17];
                    int i19 = i11 + 3;
                    byte b14 = bArr[i11 + 2];
                    i11 += 4;
                    zzpt.zza(b11, b13, b14, bArr[i19], cArr, i16);
                    i16 += 2;
                }
                i16 = i13;
            }
        }
        return new String(cArr, 0, i16);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zze(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return true;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            int iZza = bArr[i11];
            if (iZza >= 0) {
                i11 = i13;
            } else if (iZza < -32) {
                if (i13 >= i12) {
                    if (iZza != 0) {
                        return false;
                    }
                    return true;
                }
                if (iZza < -62) {
                    return false;
                }
                i11 += 2;
                if (bArr[i13] > -65) {
                    return false;
                }
            } else if (iZza < -16) {
                if (i13 >= i12 - 1) {
                    iZza = zza(bArr, i13, i12);
                    if (iZza != 0) {
                        return false;
                    }
                    return true;
                }
                int i14 = i11 + 2;
                char c11 = bArr[i13];
                if (c11 > -65) {
                    return false;
                }
                if (iZza == -32 && c11 < -96) {
                    return false;
                }
                if (iZza == -19 && c11 >= -96) {
                    return false;
                }
                i11 += 3;
                if (bArr[i14] > -65) {
                    return false;
                }
            } else {
                if (i13 >= i12 - 2) {
                    iZza = zza(bArr, i13, i12);
                    if (iZza != 0) {
                        return false;
                    }
                    return true;
                }
                int i15 = i11 + 2;
                int i16 = bArr[i13];
                if (i16 > -65) {
                    return false;
                }
                if ((((i16 + 112) + (iZza << 28)) >> 30) != 0) {
                    return false;
                }
                int i17 = i11 + 3;
                if (bArr[i15] > -65) {
                    return false;
                }
                i11 += 4;
                if (bArr[i17] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
