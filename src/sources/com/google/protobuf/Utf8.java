package com.google.protobuf;

import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class Utf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Processor f21424a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class DecodeUtil {
        private DecodeUtil() {
        }

        public static void a(byte b3, byte b11, byte b12, byte b13, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (!d(b11)) {
                if ((((b11 + 112) + (b3 << 28)) >> 30) == 0 && !d(b12) && !d(b13)) {
                    int i12 = ((b3 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                    cArr[i11] = (char) ((i12 >>> 10) + 55232);
                    cArr[i11 + 1] = (char) ((i12 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public static void b(byte b3, byte b11, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (b3 < -62 || d(b11)) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i11] = (char) (((b3 & 31) << 6) | (b11 & 63));
        }

        public static void c(byte b3, byte b11, byte b12, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (d(b11) || ((b3 == -32 && b11 < -96) || ((b3 == -19 && b11 >= -96) || d(b12)))) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i11] = (char) (((b3 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
        }

        public static boolean d(byte b3) {
            return b3 > -65;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Processor {
        public static String b(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException {
            if ((i11 | i12 | ((byteBuffer.limit() - i11) - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b3 = byteBuffer.get(i11);
                if (b3 < 0) {
                    break;
                }
                i11++;
                cArr[i14] = (char) b3;
                i14++;
            }
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte b11 = byteBuffer.get(i11);
                if (b11 >= 0) {
                    int i17 = i15 + 1;
                    cArr[i15] = (char) b11;
                    int i18 = i16;
                    while (i18 < i13) {
                        byte b12 = byteBuffer.get(i18);
                        if (b12 < 0) {
                            break;
                        }
                        i18++;
                        cArr[i17] = (char) b12;
                        i17++;
                    }
                    i15 = i17;
                    i11 = i18;
                } else if (b11 < -32) {
                    if (i16 >= i13) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i11 += 2;
                    DecodeUtil.b(b11, byteBuffer.get(i16), cArr, i15);
                    i15++;
                } else if (b11 < -16) {
                    if (i16 >= i13 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i19 = i11 + 2;
                    i11 += 3;
                    DecodeUtil.c(b11, byteBuffer.get(i16), byteBuffer.get(i19), cArr, i15);
                    i15++;
                } else {
                    if (i16 >= i13 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte b13 = byteBuffer.get(i16);
                    int i21 = i11 + 3;
                    byte b14 = byteBuffer.get(i11 + 2);
                    i11 += 4;
                    DecodeUtil.a(b11, b13, b14, byteBuffer.get(i21), cArr, i15);
                    i15 += 2;
                }
            }
            return new String(cArr, 0, i15);
        }

        public static int h(int i11, int i12, int i13, ByteBuffer byteBuffer) {
            byte b3;
            int i14;
            byte b11;
            int i15;
            int i16 = i12;
            if (i11 != 0) {
                if (i16 >= i13) {
                    return i11;
                }
                byte b12 = (byte) i11;
                if (b12 < -32) {
                    if (b12 < -62) {
                        return -1;
                    }
                    int i17 = i16 + 1;
                    if (byteBuffer.get(i16) > -65) {
                        return -1;
                    }
                    i16 = i17;
                } else if (b12 < -16) {
                    byte b13 = (byte) (~(i11 >> 8));
                    if (b13 == 0) {
                        i15 = i16 + 1;
                        b11 = byteBuffer.get(i16);
                        if (i15 >= i13) {
                            return Utf8.e(b12, b11);
                        }
                    } else {
                        b11 = b13;
                        i15 = i16;
                    }
                    if (b11 > -65) {
                        return -1;
                    }
                    if (b12 == -32 && b11 < -96) {
                        return -1;
                    }
                    if (b12 == -19 && b11 >= -96) {
                        return -1;
                    }
                    i16 = i15 + 1;
                    if (byteBuffer.get(i15) > -65) {
                        return -1;
                    }
                } else {
                    byte b14 = (byte) (~(i11 >> 8));
                    if (b14 == 0) {
                        i14 = i16 + 1;
                        b14 = byteBuffer.get(i16);
                        if (i14 >= i13) {
                            return Utf8.e(b12, b14);
                        }
                        b3 = 0;
                    } else {
                        b3 = (byte) (i11 >> 16);
                        i14 = i16;
                    }
                    if (b3 == 0) {
                        int i18 = i14 + 1;
                        byte b15 = byteBuffer.get(i14);
                        if (i18 >= i13) {
                            return Utf8.f(b12, b14, b15);
                        }
                        b3 = b15;
                        i14 = i18;
                    }
                    if (b14 > -65) {
                        return -1;
                    }
                    if ((((b14 + 112) + (b12 << 28)) >> 30) != 0 || b3 > -65) {
                        return -1;
                    }
                    i16 = i14 + 1;
                    if (byteBuffer.get(i14) > -65) {
                        return -1;
                    }
                }
            }
            Processor processor = Utf8.f21424a;
            int i19 = i13 - 7;
            int i21 = i16;
            while (i21 < i19 && (byteBuffer.getLong(i21) & (-9187201950435737472L)) == 0) {
                i21 += 8;
            }
            int i22 = (i21 - i16) + i16;
            while (i22 < i13) {
                int i23 = i22 + 1;
                byte b16 = byteBuffer.get(i22);
                if (b16 >= 0) {
                    i22 = i23;
                } else if (b16 < -32) {
                    if (i23 >= i13) {
                        return b16;
                    }
                    if (b16 < -62 || byteBuffer.get(i23) > -65) {
                        return -1;
                    }
                    i22 += 2;
                } else if (b16 < -16) {
                    if (i23 >= i13 - 1) {
                        return Utf8.b(b16, i23, i13 - i23, byteBuffer);
                    }
                    int i24 = i22 + 2;
                    byte b17 = byteBuffer.get(i23);
                    if (b17 > -65) {
                        return -1;
                    }
                    if (b16 == -32 && b17 < -96) {
                        return -1;
                    }
                    if ((b16 == -19 && b17 >= -96) || byteBuffer.get(i24) > -65) {
                        return -1;
                    }
                    i22 += 3;
                } else {
                    if (i23 >= i13 - 2) {
                        return Utf8.b(b16, i23, i13 - i23, byteBuffer);
                    }
                    int i25 = i22 + 2;
                    byte b18 = byteBuffer.get(i23);
                    if (b18 > -65) {
                        return -1;
                    }
                    if ((((b18 + 112) + (b16 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i26 = i22 + 3;
                    if (byteBuffer.get(i25) > -65) {
                        return -1;
                    }
                    i22 += 4;
                    if (byteBuffer.get(i26) > -65) {
                        return -1;
                    }
                }
            }
            return 0;
        }

        public abstract String a(byte[] bArr, int i11, int i12);

        public abstract String c(ByteBuffer byteBuffer, int i11, int i12);

        public abstract int d(String str, byte[] bArr, int i11, int i12);

        public final boolean e(byte[] bArr, int i11, int i12) {
            return g(0, bArr, i11, i12) == 0;
        }

        public final int f(int i11, int i12, int i13, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? i(i11, i12, i13, byteBuffer) : h(i11, i12, i13, byteBuffer);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return g(i11, byteBuffer.array(), i12 + iArrayOffset, iArrayOffset + i13);
        }

        public abstract int g(int i11, byte[] bArr, int i12, int i13);

        public abstract int i(int i11, int i12, int i13, ByteBuffer byteBuffer);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SafeProcessor extends Processor {
        @Override // com.google.protobuf.Utf8.Processor
        public final String a(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
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
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte b11 = bArr[i11];
                if (b11 >= 0) {
                    int i17 = i15 + 1;
                    cArr[i15] = (char) b11;
                    int i18 = i16;
                    while (i18 < i13) {
                        byte b12 = bArr[i18];
                        if (b12 < 0) {
                            break;
                        }
                        i18++;
                        cArr[i17] = (char) b12;
                        i17++;
                    }
                    i15 = i17;
                    i11 = i18;
                } else if (b11 < -32) {
                    if (i16 >= i13) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i11 += 2;
                    DecodeUtil.b(b11, bArr[i16], cArr, i15);
                    i15++;
                } else if (b11 < -16) {
                    if (i16 >= i13 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i19 = i11 + 2;
                    i11 += 3;
                    DecodeUtil.c(b11, bArr[i16], bArr[i19], cArr, i15);
                    i15++;
                } else {
                    if (i16 >= i13 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte b13 = bArr[i16];
                    int i21 = i11 + 3;
                    byte b14 = bArr[i11 + 2];
                    i11 += 4;
                    DecodeUtil.a(b11, b13, b14, bArr[i21], cArr, i15);
                    i15 += 2;
                }
            }
            return new String(cArr, 0, i15);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public final String c(ByteBuffer byteBuffer, int i11, int i12) {
            return Processor.b(byteBuffer, i11, i12);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public final int d(String str, byte[] bArr, int i11, int i12) {
            int i13;
            int i14;
            char cCharAt;
            int length = str.length();
            int i15 = i12 + i11;
            int i16 = 0;
            while (i16 < length && (i14 = i16 + i11) < i15 && (cCharAt = str.charAt(i16)) < 128) {
                bArr[i14] = (byte) cCharAt;
                i16++;
            }
            if (i16 == length) {
                return i11 + length;
            }
            int i17 = i11 + i16;
            while (i16 < length) {
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
                        if (i17 > i15 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i13 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                                throw new UnpairedSurrogateException(i16, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                        }
                        int i19 = i16 + 1;
                        if (i19 != str.length()) {
                            char cCharAt3 = str.charAt(i19);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i21 = i17 + 3;
                                bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i17 += 4;
                                bArr[i21] = (byte) ((codePoint & 63) | 128);
                                i16 = i19;
                            } else {
                                i16 = i19;
                            }
                        }
                        throw new UnpairedSurrogateException(i16 - 1, length);
                    }
                    bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i22 = i17 + 2;
                    bArr[i17 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i17 += 3;
                    bArr[i22] = (byte) ((cCharAt2 & '?') | 128);
                }
                i16++;
            }
            return i17;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if (r13[r14] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        
            if (r13[r14] > (-65)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
        
            if (r13[r14] > (-65)) goto L50;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int g(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.g(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.Utf8.Processor
        public final int i(int i11, int i12, int i13, ByteBuffer byteBuffer) {
            return Processor.h(i11, i12, i13, byteBuffer);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i11, int i12) {
            super(p.p(IMCc.fczymkAMpRLKV, i11, i12, " of "));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UnsafeProcessor extends Processor {
        public static int j(long j11, int i11, int i12) {
            if (i12 == 0) {
                Processor processor = Utf8.f21424a;
                if (i11 > -12) {
                    return -1;
                }
                return i11;
            }
            if (i12 == 1) {
                return Utf8.e(i11, UnsafeUtil.f21417c.f(j11));
            }
            if (i12 != 2) {
                throw new AssertionError();
            }
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f21417c;
            return Utf8.f(i11, memoryAccessor.f(j11), memoryAccessor.f(j11 + 1));
        }

        public static int k(long j11, int i11, byte[] bArr, int i12) {
            if (i12 == 0) {
                Processor processor = Utf8.f21424a;
                if (i11 > -12) {
                    return -1;
                }
                return i11;
            }
            if (i12 == 1) {
                return Utf8.e(i11, UnsafeUtil.h(j11, bArr));
            }
            if (i12 == 2) {
                return Utf8.f(i11, UnsafeUtil.h(j11, bArr), UnsafeUtil.h(j11 + 1, bArr));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.Utf8.Processor
        public final String a(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
            Charset charset = Internal.f21282a;
            String str = new String(bArr, i11, i12, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i11, i12 + i11))) {
                throw InvalidProtocolBufferException.c();
            }
            return str;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public final String c(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException {
            long j11;
            byte bF;
            byte bF2;
            if ((i11 | i12 | ((byteBuffer.limit() - i11) - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            long jB = UnsafeUtil.b(byteBuffer) + ((long) i11);
            long j12 = ((long) i12) + jB;
            char[] cArr = new char[i12];
            int i13 = 0;
            while (true) {
                j11 = 1;
                if (jB >= j12 || (bF2 = UnsafeUtil.f21417c.f(jB)) < 0) {
                    break;
                }
                jB++;
                cArr[i13] = (char) bF2;
                i13++;
            }
            int i14 = i13;
            while (jB < j12) {
                long j13 = jB + j11;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f21417c;
                byte bF3 = memoryAccessor.f(jB);
                if (bF3 >= 0) {
                    int i15 = i14 + 1;
                    cArr[i14] = (char) bF3;
                    while (j13 < j12 && (bF = UnsafeUtil.f21417c.f(j13)) >= 0) {
                        j13 += j11;
                        cArr[i15] = (char) bF;
                        i15++;
                    }
                    i14 = i15;
                    jB = j13;
                } else if (bF3 < -32) {
                    if (j13 >= j12) {
                        throw InvalidProtocolBufferException.c();
                    }
                    jB += 2;
                    DecodeUtil.b(bF3, memoryAccessor.f(j13), cArr, i14);
                    i14++;
                } else if (bF3 < -16) {
                    if (j13 >= j12 - j11) {
                        throw InvalidProtocolBufferException.c();
                    }
                    long j14 = 2 + jB;
                    jB += 3;
                    DecodeUtil.c(bF3, memoryAccessor.f(j13), memoryAccessor.f(j14), cArr, i14);
                    i14++;
                } else {
                    if (j13 >= j12 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte bF4 = memoryAccessor.f(j13);
                    long j15 = jB + 3;
                    byte bF5 = memoryAccessor.f(2 + jB);
                    jB += 4;
                    DecodeUtil.a(bF3, bF4, bF5, memoryAccessor.f(j15), cArr, i14);
                    i14 += 2;
                }
                j11 = 1;
            }
            return new String(cArr, 0, i14);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public final int d(String str, byte[] bArr, int i11, int i12) {
            long j11;
            long j12;
            long j13;
            int i13;
            char cCharAt;
            long j14 = i11;
            long j15 = ((long) i12) + j14;
            int length = str.length();
            if (length > i12 || bArr.length - i12 < i11) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i11 + i12));
            }
            int i14 = 0;
            while (true) {
                j11 = 1;
                if (i14 >= length || (cCharAt = str.charAt(i14)) >= 128) {
                    break;
                }
                UnsafeUtil.m(bArr, j14, (byte) cCharAt);
                i14++;
                j14 = 1 + j14;
            }
            if (i14 == length) {
                return (int) j14;
            }
            while (i14 < length) {
                char cCharAt2 = str.charAt(i14);
                if (cCharAt2 < 128 && j14 < j15) {
                    UnsafeUtil.m(bArr, j14, (byte) cCharAt2);
                    j13 = j15;
                    j12 = j11;
                    j14 += j11;
                } else if (cCharAt2 >= 2048 || j14 > j15 - 2) {
                    j12 = j11;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j14 > j15 - 3) {
                        j13 = j15;
                        if (j14 > j13 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i13 = i14 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                                throw new UnpairedSurrogateException(i14, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j14);
                        }
                        int i15 = i14 + 1;
                        if (i15 != length) {
                            char cCharAt3 = str.charAt(i15);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.m(bArr, j14, (byte) ((codePoint >>> 18) | 240));
                                UnsafeUtil.m(bArr, j14 + j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j16 = j14 + 3;
                                UnsafeUtil.m(bArr, j14 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j14 += 4;
                                UnsafeUtil.m(bArr, j16, (byte) ((codePoint & 63) | 128));
                                i14 = i15;
                            } else {
                                i14 = i15;
                            }
                        }
                        throw new UnpairedSurrogateException(i14 - 1, length);
                    }
                    UnsafeUtil.m(bArr, j14, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j17 = j14 + 2;
                    j13 = j15;
                    UnsafeUtil.m(bArr, j14 + j12, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j14 += 3;
                    UnsafeUtil.m(bArr, j17, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j12 = j11;
                    long j18 = j14 + j12;
                    UnsafeUtil.m(bArr, j14, (byte) ((cCharAt2 >>> 6) | 960));
                    j14 += 2;
                    UnsafeUtil.m(bArr, j18, (byte) ((cCharAt2 & '?') | 128));
                    j13 = j15;
                }
                i14++;
                j11 = j12;
                j15 = j13;
            }
            return (int) j14;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (com.google.protobuf.UnsafeUtil.h(r4, r23) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
        
            if (com.google.protobuf.UnsafeUtil.h(r4, r23) > (-65)) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
        
            if (com.google.protobuf.UnsafeUtil.h(r4, r23) > (-65)) goto L54;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int g(int r22, byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instruction units count: 445
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.g(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.Utf8.Processor
        public final int i(int i11, int i12, int i13, ByteBuffer byteBuffer) {
            long j11;
            byte b3;
            int i14;
            byte bF;
            long j12;
            if ((i12 | i13 | (byteBuffer.limit() - i13)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            long jB = UnsafeUtil.b(byteBuffer) + ((long) i12);
            long j13 = ((long) (i13 - i12)) + jB;
            if (i11 == 0) {
                j11 = 1;
                b3 = 0;
            } else {
                if (jB >= j13) {
                    return i11;
                }
                b3 = 0;
                byte b11 = (byte) i11;
                if (b11 < -32) {
                    if (b11 < -62) {
                        return -1;
                    }
                    j12 = jB + 1;
                    if (UnsafeUtil.f21417c.f(jB) > -65) {
                        return -1;
                    }
                } else if (b11 < -16) {
                    byte bF2 = (byte) (~(i11 >> 8));
                    if (bF2 == 0) {
                        long j14 = jB + 1;
                        bF2 = UnsafeUtil.f21417c.f(jB);
                        if (j14 >= j13) {
                            return Utf8.e(b11, bF2);
                        }
                        jB = j14;
                    }
                    if (bF2 > -65) {
                        return -1;
                    }
                    if (b11 == -32 && bF2 < -96) {
                        return -1;
                    }
                    if (b11 == -19 && bF2 >= -96) {
                        return -1;
                    }
                    j12 = jB + 1;
                    if (UnsafeUtil.f21417c.f(jB) > -65) {
                        return -1;
                    }
                } else {
                    j11 = 1;
                    byte b12 = (byte) (~(i11 >> 8));
                    if (b12 == 0) {
                        long j15 = jB + 1;
                        byte bF3 = UnsafeUtil.f21417c.f(jB);
                        if (j15 >= j13) {
                            return Utf8.e(b11, bF3);
                        }
                        jB = j15;
                        b12 = bF3;
                        bF = 0;
                    } else {
                        bF = (byte) (i11 >> 16);
                    }
                    if (bF == 0) {
                        long j16 = jB + 1;
                        bF = UnsafeUtil.f21417c.f(jB);
                        if (j16 >= j13) {
                            return Utf8.f(b11, b12, bF);
                        }
                        jB = j16;
                    }
                    if (b12 > -65) {
                        return -1;
                    }
                    if ((((b12 + 112) + (b11 << 28)) >> 30) != 0 || bF > -65) {
                        return -1;
                    }
                    long j17 = jB + 1;
                    if (UnsafeUtil.f21417c.f(jB) > -65) {
                        return -1;
                    }
                    jB = j17;
                }
                j11 = 1;
                jB = j12;
            }
            int i15 = (int) (j13 - jB);
            if (i15 >= 16) {
                int i16 = (int) ((-jB) & 7);
                int i17 = i16;
                long j18 = jB;
                while (true) {
                    if (i17 <= 0) {
                        int i18 = i15 - i16;
                        while (i18 >= 8 && (UnsafeUtil.f21417c.k(j18) & (-9187201950435737472L)) == 0) {
                            j18 += 8;
                            i18 -= 8;
                        }
                        i14 = i15 - i18;
                        break;
                    }
                    long j19 = j18 + j11;
                    if (UnsafeUtil.f21417c.f(j18) < 0) {
                        i14 = i16 - i17;
                        break;
                    }
                    i17--;
                    j18 = j19;
                }
            } else {
                i14 = b3;
            }
            long j21 = jB + ((long) i14);
            int i19 = i15 - i14;
            while (true) {
                byte bF4 = b3;
                while (i19 > 0) {
                    long j22 = j21 + j11;
                    bF4 = UnsafeUtil.f21417c.f(j21);
                    if (bF4 < 0) {
                        j21 = j22;
                        break;
                    }
                    i19--;
                    j21 = j22;
                }
                if (i19 == 0) {
                    return b3;
                }
                int i21 = i19 - 1;
                if (bF4 < -32) {
                    if (i21 == 0) {
                        return bF4;
                    }
                    i19 -= 2;
                    if (bF4 < -62) {
                        return -1;
                    }
                    long j23 = j21 + j11;
                    if (UnsafeUtil.f21417c.f(j21) > -65) {
                        return -1;
                    }
                    j21 = j23;
                } else if (bF4 < -16) {
                    if (i21 < 2) {
                        return j(j21, bF4, i21);
                    }
                    i19 -= 3;
                    long j24 = j21 + j11;
                    UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f21417c;
                    byte bF5 = memoryAccessor.f(j21);
                    if (bF5 > -65) {
                        return -1;
                    }
                    if (bF4 == -32 && bF5 < -96) {
                        return -1;
                    }
                    if (bF4 == -19 && bF5 >= -96) {
                        return -1;
                    }
                    j21 += 2;
                    if (memoryAccessor.f(j24) > -65) {
                        return -1;
                    }
                } else {
                    if (i21 < 3) {
                        return j(j21, bF4, i21);
                    }
                    i19 -= 4;
                    long j25 = j21 + j11;
                    UnsafeUtil.MemoryAccessor memoryAccessor2 = UnsafeUtil.f21417c;
                    byte bF6 = memoryAccessor2.f(j21);
                    if (bF6 > -65) {
                        return -1;
                    }
                    if ((((bF6 + 112) + (bF4 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    long j26 = 2 + j21;
                    if (memoryAccessor2.f(j25) > -65) {
                        return -1;
                    }
                    j21 += 3;
                    if (memoryAccessor2.f(j26) > -65) {
                        return -1;
                    }
                }
            }
        }
    }

    static {
        f21424a = (UnsafeUtil.f21419e && UnsafeUtil.f21418d && !Android.a()) ? new UnsafeProcessor() : new SafeProcessor();
    }

    private Utf8() {
    }

    public static int a(byte[] bArr, int i11, int i12) {
        byte b3 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 == 0) {
            if (b3 > -12) {
                return -1;
            }
            return b3;
        }
        if (i13 == 1) {
            return e(b3, bArr[i11]);
        }
        if (i13 == 2) {
            return f(b3, bArr[i11], bArr[i11 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(int i11, int i12, int i13, ByteBuffer byteBuffer) {
        if (i13 == 0) {
            if (i11 > -12) {
                return -1;
            }
            return i11;
        }
        if (i13 == 1) {
            return e(i11, byteBuffer.get(i12));
        }
        if (i13 == 2) {
            return f(i11, byteBuffer.get(i12), byteBuffer.get(i12 + 1));
        }
        throw new AssertionError();
    }

    public static String c(ByteBuffer byteBuffer, int i11, int i12) {
        Processor processor = f21424a;
        processor.getClass();
        if (byteBuffer.hasArray()) {
            return processor.a(byteBuffer.array(), byteBuffer.arrayOffset() + i11, i12);
        }
        return byteBuffer.isDirect() ? processor.c(byteBuffer, i11, i12) : Processor.b(byteBuffer, i11, i12);
    }

    public static int d(String str) {
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
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i12) < 65536) {
                                throw new UnpairedSurrogateException(i12, length2);
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

    public static int e(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    public static int f(int i11, int i12, int i13) {
        if (i11 > -12 || i12 > -65 || i13 > -65) {
            return -1;
        }
        return (i11 ^ (i12 << 8)) ^ (i13 << 16);
    }
}
