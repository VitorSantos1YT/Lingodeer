package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends ns.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1546c;

    public /* synthetic */ r1(int i11) {
        this.f1546c = i11;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    @Override // ns.o
    public final String r(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
        int i13;
        byte b3;
        int i14;
        byte b11;
        byte b12;
        byte b13;
        switch (this.f1546c) {
            case 0:
                if ((i11 | i12 | ((bArr.length - i11) - i12)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
                }
                int i15 = i11 + i12;
                char[] cArr = new char[i12];
                int i16 = 0;
                while (i11 < i15) {
                    byte b14 = bArr[i11];
                    if (b14 < 0) {
                        while (i11 < i15) {
                            i13 = i11 + 1;
                            b3 = bArr[i11];
                            if (b3 < 0) {
                                i14 = i16 + 1;
                                cArr[i16] = (char) b3;
                                while (i13 < i15) {
                                    b11 = bArr[i13];
                                    if (b11 >= 0) {
                                        i13++;
                                        cArr[i14] = (char) b11;
                                        i14++;
                                    } else {
                                        i16 = i14;
                                        i11 = i13;
                                    }
                                }
                                i16 = i14;
                                i11 = i13;
                            } else if (b3 < -32) {
                                if (i13 < i15) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                i11 += 2;
                                byte b15 = bArr[i13];
                                int i17 = i16 + 1;
                                if (b3 >= -62 || md.a.o(b15)) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                cArr[i16] = (char) ((b15 & 63) | ((b3 & 31) << 6));
                                i16 = i17;
                            } else {
                                if (b3 >= -16) {
                                    if (i13 < i15 - 2) {
                                        throw InvalidProtocolBufferException.a();
                                    }
                                    b13 = bArr[i13];
                                    int i18 = i11 + 3;
                                    byte b16 = bArr[i11 + 2];
                                    i11 += 4;
                                    byte b17 = bArr[i18];
                                    int i19 = i16 + 1;
                                    if (!md.a.o(b13)) {
                                        if ((((b13 + 112) + (b3 << 28)) >> 30) != 0 && !md.a.o(b16) && !md.a.o(b17)) {
                                            int i21 = ((b13 & 63) << 12) | ((b3 & 7) << 18) | ((b16 & 63) << 6) | (b17 & 63);
                                            cArr[i16] = (char) ((i21 >>> 10) + 55232);
                                            cArr[i19] = (char) ((i21 & 1023) + 56320);
                                            i16 += 2;
                                        }
                                    }
                                    throw InvalidProtocolBufferException.a();
                                }
                                if (i13 < i15 - 1) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                int i22 = i11 + 2;
                                b12 = bArr[i13];
                                i11 += 3;
                                byte b18 = bArr[i22];
                                int i23 = i16 + 1;
                                if (!md.a.o(b12) || ((b3 == -32 && b12 < -96) || ((b3 == -19 && b12 >= -96) || md.a.o(b18)))) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                cArr[i16] = (char) (((b12 & 63) << 6) | ((b3 & 15) << 12) | (b18 & 63));
                                i16 = i23;
                            }
                        }
                        return new String(cArr, 0, i16);
                    }
                    i11++;
                    cArr[i16] = (char) b14;
                    i16++;
                }
                while (i11 < i15) {
                    i13 = i11 + 1;
                    b3 = bArr[i11];
                    if (b3 < 0) {
                        if (b3 < -32) {
                            if (i13 < i15) {
                                throw InvalidProtocolBufferException.a();
                            }
                            i11 += 2;
                            byte b19 = bArr[i13];
                            int i110 = i16 + 1;
                            if (b3 >= -62) {
                            }
                            throw InvalidProtocolBufferException.a();
                        }
                        if (b3 >= -16) {
                            if (i13 < i15 - 1) {
                                throw InvalidProtocolBufferException.a();
                            }
                            int i24 = i11 + 2;
                            b12 = bArr[i13];
                            i11 += 3;
                            byte b110 = bArr[i24];
                            int i25 = i16 + 1;
                            if (md.a.o(b12)) {
                            }
                            throw InvalidProtocolBufferException.a();
                        }
                        if (i13 < i15 - 2) {
                            throw InvalidProtocolBufferException.a();
                        }
                        b13 = bArr[i13];
                        int i111 = i11 + 3;
                        byte b111 = bArr[i11 + 2];
                        i11 += 4;
                        byte b112 = bArr[i111];
                        int i112 = i16 + 1;
                        if (!md.a.o(b13)) {
                            if ((((b13 + 112) + (b3 << 28)) >> 30) != 0) {
                            }
                        }
                        throw InvalidProtocolBufferException.a();
                    }
                    i14 = i16 + 1;
                    cArr[i16] = (char) b3;
                    while (i13 < i15) {
                        b11 = bArr[i13];
                        if (b11 >= 0) {
                            i13++;
                            cArr[i14] = (char) b11;
                            i14++;
                        } else {
                            i16 = i14;
                            i11 = i13;
                        }
                    }
                    i16 = i14;
                    i11 = i13;
                }
                return new String(cArr, 0, i16);
            default:
                Charset charset = e0.f1463a;
                String str = new String(bArr, i11, i12, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i11, i12 + i11))) {
                    throw InvalidProtocolBufferException.a();
                }
                return str;
        }
    }

    @Override // ns.o
    public final int t(String str, byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        char cCharAt;
        long j11;
        char c11;
        long j12;
        long j13;
        char c12;
        int i15;
        char cCharAt2;
        switch (this.f1546c) {
            case 0:
                int length = str.length();
                int i16 = i12 + i11;
                int i17 = 0;
                while (i17 < length && (i14 = i17 + i11) < i16 && (cCharAt = str.charAt(i17)) < 128) {
                    bArr[i14] = (byte) cCharAt;
                    i17++;
                }
                if (i17 == length) {
                    return i11 + length;
                }
                int i18 = i11 + i17;
                while (i17 < length) {
                    char cCharAt3 = str.charAt(i17);
                    if (cCharAt3 < 128 && i18 < i16) {
                        bArr[i18] = (byte) cCharAt3;
                        i18++;
                    } else if (cCharAt3 < 2048 && i18 <= i16 - 2) {
                        int i19 = i18 + 1;
                        bArr[i18] = (byte) ((cCharAt3 >>> 6) | 960);
                        i18 += 2;
                        bArr[i19] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i18 > i16 - 3) {
                            if (i18 > i16 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i13 = i17 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i13)))) {
                                    throw new s1(i17, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i18);
                            }
                            int i21 = i17 + 1;
                            if (i21 != str.length()) {
                                char cCharAt4 = str.charAt(i21);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i18] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i18 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i22 = i18 + 3;
                                    bArr[i18 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i18 += 4;
                                    bArr[i22] = (byte) ((codePoint & 63) | 128);
                                    i17 = i21;
                                } else {
                                    i17 = i21;
                                }
                            }
                            throw new s1(i17 - 1, length);
                        }
                        bArr[i18] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i23 = i18 + 2;
                        bArr[i18 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i18 += 3;
                        bArr[i23] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i17++;
                }
                return i18;
            default:
                long j14 = i11;
                long j15 = ((long) i12) + j14;
                int length2 = str.length();
                if (length2 > i12 || bArr.length - i12 < i11) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i11 + i12));
                }
                int i24 = 0;
                while (true) {
                    j11 = 1;
                    c11 = 128;
                    if (i24 < length2 && (cCharAt2 = str.charAt(i24)) < 128) {
                        q1.j(bArr, j14, (byte) cCharAt2);
                        i24++;
                        j14 = 1 + j14;
                    }
                }
                if (i24 == length2) {
                    return (int) j14;
                }
                while (i24 < length2) {
                    char cCharAt5 = str.charAt(i24);
                    if (cCharAt5 < c11 && j14 < j15) {
                        q1.j(bArr, j14, (byte) cCharAt5);
                        c12 = c11;
                        j12 = j11;
                        j13 = j14 + j11;
                    } else if (cCharAt5 >= 2048 || j14 > j15 - 2) {
                        j12 = j11;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j14 > j15 - 3) {
                            long j16 = j14;
                            if (j16 > j15 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i15 = i24 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i15)))) {
                                    throw new s1(i24, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j16);
                            }
                            int i25 = i24 + 1;
                            if (i25 != length2) {
                                char cCharAt6 = str.charAt(i25);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    q1.j(bArr, j16, (byte) ((codePoint2 >>> 18) | 240));
                                    c12 = 128;
                                    q1.j(bArr, j16 + j12, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    q1.j(bArr, j16 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    q1.j(bArr, j16 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j13 = j16 + 4;
                                    i24 = i25;
                                } else {
                                    i24 = i25;
                                }
                            }
                            throw new s1(i24 - 1, length2);
                        }
                        q1.j(bArr, j14, (byte) ((cCharAt5 >>> '\f') | 480));
                        long j17 = j14;
                        q1.j(bArr, j14 + j12, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j13 = j17 + 3;
                        q1.j(bArr, j17 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c12 = 128;
                    } else {
                        j12 = j11;
                        q1.j(bArr, j14, (byte) ((cCharAt5 >>> 6) | 960));
                        q1.j(bArr, j14 + j12, (byte) ((cCharAt5 & '?') | c11));
                        j13 = j14 + 2;
                        c12 = c11;
                    }
                    i24++;
                    c11 = c12;
                    j14 = j13;
                    j11 = j12;
                }
                return (int) j14;
        }
    }
}
