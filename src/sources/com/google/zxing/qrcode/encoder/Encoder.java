package com.google.zxing.qrcode.encoder;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.EnumMap;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Encoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21599a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: com.google.zxing.qrcode.encoder.Encoder$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21600a;

        static {
            int[] iArr = new int[Mode.values().length];
            f21600a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21600a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21600a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21600a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private Encoder() {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:315:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:317:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:345:0x063f  */
    /* JADX WARN: Code duplicated, block: B:346:0x0642  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:390:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0077 A[EDGE_INSN: B:41:0x0077->B:45:0x0081 BREAK  A[LOOP:0: B:26:0x0054->B:38:0x006f]] */
    /* JADX WARN: Code duplicated, block: B:42:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x007c A[EDGE_INSN: B:43:0x007c->B:45:0x0081 BREAK  A[LOOP:0: B:26:0x0054->B:38:0x006f]] */
    /* JADX WARN: Code duplicated, block: B:44:0x007f A[EDGE_INSN: B:44:0x007f->B:45:0x0081 BREAK  A[LOOP:0: B:26:0x0054->B:38:0x006f]] */
    public static QRCode a(String str, ErrorCorrectionLevel errorCorrectionLevel, EnumMap enumMap) throws WriterException {
        Mode mode;
        int i11;
        int i12;
        Version versionA;
        int i13;
        byte[][] bArr;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        char c11;
        int i19;
        CharacterSetECI characterSetECIA;
        int i21;
        boolean z15;
        boolean z16;
        char cCharAt;
        int i22;
        EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
        boolean zContainsKey = enumMap.containsKey(encodeHintType);
        String string = zContainsKey ? enumMap.get(encodeHintType).toString() : "ISO-8859-1";
        boolean zEquals = "Shift_JIS".equals(string);
        int[] iArr = f21599a;
        if (!zEquals) {
            i21 = 0;
            z15 = false;
            z16 = false;
            while (true) {
                if (i21 >= str.length()) {
                    if (!z15) {
                        if (!z16) {
                            mode = Mode.BYTE;
                            break;
                        }
                        mode = Mode.NUMERIC;
                        break;
                    }
                    mode = Mode.ALPHANUMERIC;
                    break;
                }
                cCharAt = str.charAt(i21);
                if (cCharAt >= '0') {
                    if (cCharAt < '`') {
                        i22 = iArr[cCharAt];
                    } else {
                        i22 = -1;
                    }
                    if (i22 == -1) {
                        mode = Mode.BYTE;
                        break;
                    }
                    z15 = true;
                } else {
                    if (cCharAt < '`') {
                        i22 = iArr[cCharAt];
                    } else {
                        i22 = -1;
                    }
                    if (i22 == -1) {
                        mode = Mode.BYTE;
                        break;
                    }
                    z15 = true;
                }
                i21++;
            }
        } else {
            try {
                byte[] bytes = str.getBytes("Shift_JIS");
                int length = bytes.length;
                if (length % 2 != 0) {
                    i21 = 0;
                    z15 = false;
                    z16 = false;
                    while (true) {
                        if (i21 >= str.length()) {
                            if (!z15) {
                                if (!z16) {
                                    mode = Mode.BYTE;
                                    break;
                                }
                                mode = Mode.NUMERIC;
                                break;
                            }
                            mode = Mode.ALPHANUMERIC;
                            break;
                        }
                        cCharAt = str.charAt(i21);
                        if (cCharAt >= '0' || cCharAt > '9') {
                            if (cCharAt < '`') {
                                i22 = iArr[cCharAt];
                            } else {
                                i22 = -1;
                            }
                            if (i22 == -1) {
                                mode = Mode.BYTE;
                                break;
                            }
                            z15 = true;
                        } else {
                            z16 = true;
                        }
                        i21++;
                    }
                } else {
                    int i23 = 0;
                    while (true) {
                        if (i23 >= length) {
                            mode = Mode.KANJI;
                        } else {
                            int i24 = bytes[i23] & 255;
                            if ((i24 < 129 || i24 > 159) && (i24 < 224 || i24 > 235)) {
                                i21 = 0;
                                z15 = false;
                                z16 = false;
                                while (true) {
                                    if (i21 >= str.length()) {
                                        if (!z15) {
                                            if (!z16) {
                                                mode = Mode.BYTE;
                                                break;
                                            }
                                            mode = Mode.NUMERIC;
                                            break;
                                        }
                                        mode = Mode.ALPHANUMERIC;
                                        break;
                                    }
                                    cCharAt = str.charAt(i21);
                                    if (cCharAt >= '0') {
                                        if (cCharAt < '`') {
                                            i22 = iArr[cCharAt];
                                        } else {
                                            i22 = -1;
                                        }
                                        if (i22 == -1) {
                                            mode = Mode.BYTE;
                                            break;
                                        }
                                        z15 = true;
                                    } else {
                                        if (cCharAt < '`') {
                                            i22 = iArr[cCharAt];
                                        } else {
                                            i22 = -1;
                                        }
                                        if (i22 == -1) {
                                            mode = Mode.BYTE;
                                            break;
                                        }
                                        z15 = true;
                                    }
                                    i21++;
                                }
                            } else {
                                i23 += 2;
                            }
                        }
                    }
                }
            } catch (UnsupportedEncodingException unused) {
            }
        }
        BitArray bitArray = new BitArray();
        int i25 = 8;
        if (mode == Mode.BYTE && zContainsKey && (characterSetECIA = CharacterSetECI.a(string)) != null) {
            bitArray.c(Mode.ECI.a(), 4);
            bitArray.c(characterSetECIA.b(), 8);
        }
        EncodeHintType encodeHintType2 = EncodeHintType.GS1_FORMAT;
        if (enumMap.containsKey(encodeHintType2) && Boolean.valueOf(enumMap.get(encodeHintType2).toString()).booleanValue()) {
            bitArray.c(Mode.FNC1_FIRST_POSITION.a(), 4);
        }
        bitArray.c(mode.a(), 4);
        BitArray bitArray2 = new BitArray();
        int i26 = AnonymousClass1.f21600a[mode.ordinal()];
        int i27 = 10;
        char c12 = 7;
        if (i26 != 1) {
            i11 = 1;
            if (i26 == 2) {
                int length2 = str.length();
                int i28 = 0;
                while (i28 < length2) {
                    char cCharAt2 = str.charAt(i28);
                    int i29 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                    if (i29 == -1) {
                        throw new WriterException();
                    }
                    int i30 = i28 + 1;
                    if (i30 < length2) {
                        char cCharAt3 = str.charAt(i30);
                        int i31 = cCharAt3 < '`' ? iArr[cCharAt3] : -1;
                        if (i31 == -1) {
                            throw new WriterException();
                        }
                        bitArray2.c((i29 * 45) + i31, 11);
                        i28 += 2;
                    } else {
                        bitArray2.c(i29, 6);
                        i28 = i30;
                    }
                }
            } else if (i26 == 3) {
                try {
                    for (byte b3 : str.getBytes(string)) {
                        bitArray2.c(b3, 8);
                    }
                } catch (UnsupportedEncodingException e8) {
                    throw new WriterException(e8);
                }
            } else {
                if (i26 != 4) {
                    throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
                }
                try {
                    byte[] bytes2 = str.getBytes("Shift_JIS");
                    int length3 = bytes2.length;
                    for (int i32 = 0; i32 < length3; i32 += 2) {
                        int i33 = ((bytes2[i32] & 255) << 8) | (bytes2[i32 + 1] & 255);
                        int i34 = 33088;
                        if (i33 >= 33088 && i33 <= 40956) {
                            i19 = i33 - i34;
                        } else if (i33 < 57408 || i33 > 60351) {
                            i19 = -1;
                        } else {
                            i34 = 49472;
                            i19 = i33 - i34;
                        }
                        if (i19 == -1) {
                            throw new WriterException("Invalid byte sequence");
                        }
                        bitArray2.c(((i19 >> 8) * 192) + (i19 & 255), 13);
                    }
                } catch (UnsupportedEncodingException e10) {
                    throw new WriterException(e10);
                }
            }
        } else {
            i11 = 1;
            int length4 = str.length();
            int i35 = 0;
            while (i35 < length4) {
                int iCharAt = str.charAt(i35) - '0';
                int i36 = i35 + 2;
                if (i36 < length4) {
                    bitArray2.c(((str.charAt(i35 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i36) - '0'), i27);
                    i35 += 3;
                } else {
                    i35++;
                    if (i35 < length4) {
                        bitArray2.c((iCharAt * 10) + (str.charAt(i35) - '0'), 7);
                        i35 = i36;
                    } else {
                        bitArray2.c(iCharAt, 4);
                    }
                }
                i27 = 10;
            }
        }
        EncodeHintType encodeHintType3 = EncodeHintType.QR_VERSION;
        if (enumMap.containsKey(encodeHintType3)) {
            versionA = Version.a(Integer.parseInt(enumMap.get(encodeHintType3).toString()));
            int iB = mode.b(versionA) + bitArray.f21479b + bitArray2.f21479b;
            int i37 = versionA.f21589c;
            Version.ECBlocks eCBlocks = versionA.f21588b[errorCorrectionLevel.ordinal()];
            int i38 = eCBlocks.f21592a;
            Version.ECB[] ecbArr = eCBlocks.f21593b;
            int length5 = ecbArr.length;
            int i39 = 0;
            int i40 = 0;
            while (i39 < length5) {
                i40 += ecbArr[i39].f21590a;
                i39++;
                c12 = c12;
            }
            if ((i37 - (i40 * i38) >= (iB + 7) / 8 ? i11 : 0) == 0) {
                throw new WriterException("Data too big for requested version");
            }
            i12 = 8;
        } else {
            int iB2 = mode.b(Version.a(i11)) + bitArray.f21479b + bitArray2.f21479b;
            int i41 = i11;
            while (true) {
                int i42 = 40;
                if (i41 > 40) {
                    throw new WriterException("Data too big");
                }
                Version versionA2 = Version.a(i41);
                int i43 = versionA2.f21589c;
                Version.ECBlocks eCBlocks2 = versionA2.f21588b[errorCorrectionLevel.ordinal()];
                int i44 = eCBlocks2.f21592a;
                i12 = i25;
                int i45 = 0;
                for (Version.ECB ecb : eCBlocks2.f21593b) {
                    i45 += ecb.f21590a;
                }
                if (i43 - (i45 * i44) >= (iB2 + 7) / 8) {
                    int iB3 = mode.b(versionA2) + bitArray.f21479b + bitArray2.f21479b;
                    int i46 = i11;
                    while (true) {
                        if (i46 > i42) {
                            throw new WriterException("Data too big");
                        }
                        Version versionA3 = Version.a(i46);
                        int i47 = versionA3.f21589c;
                        Version.ECBlocks eCBlocks3 = versionA3.f21588b[errorCorrectionLevel.ordinal()];
                        int i48 = eCBlocks3.f21592a;
                        int i49 = 0;
                        for (Version.ECB ecb2 : eCBlocks3.f21593b) {
                            i49 += ecb2.f21590a;
                        }
                        if (i47 - (i49 * i48) >= (iB3 + 7) / 8) {
                            versionA = versionA3;
                            break;
                        }
                        i46++;
                        i42 = 40;
                        i12 = 8;
                    }
                } else {
                    i41++;
                    i25 = 8;
                }
            }
        }
        int i50 = versionA.f21589c;
        BitArray bitArray3 = new BitArray();
        int i51 = bitArray.f21479b;
        bitArray3.d(bitArray3.f21479b + i51);
        for (int i52 = 0; i52 < i51; i52++) {
            bitArray3.a(bitArray.f(i52));
        }
        int iG = mode == Mode.BYTE ? bitArray2.g() : str.length();
        int iB4 = mode.b(versionA);
        int i53 = i11 << iB4;
        if (iG >= i53) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(iG);
            sb2.append(" is bigger than ");
            sb2.append(i53 - 1);
            throw new WriterException(sb2.toString());
        }
        bitArray3.c(iG, iB4);
        int i54 = bitArray2.f21479b;
        bitArray3.d(bitArray3.f21479b + i54);
        for (int i55 = 0; i55 < i54; i55++) {
            bitArray3.a(bitArray2.f(i55));
        }
        Version.ECBlocks eCBlocks4 = versionA.f21588b[errorCorrectionLevel.ordinal()];
        int i56 = eCBlocks4.f21592a;
        Version.ECB[] ecbArr2 = eCBlocks4.f21593b;
        int i57 = 0;
        for (Version.ECB ecb3 : ecbArr2) {
            i57 += ecb3.f21590a;
        }
        int i58 = i50 - (i57 * i56);
        int i59 = i58 << 3;
        if (bitArray3.f21479b > i59) {
            throw new WriterException("data bits cannot fit in the QR Code" + bitArray3.f21479b + " > " + i59);
        }
        for (int i60 = 0; i60 < 4 && bitArray3.f21479b < i59; i60++) {
            bitArray3.a(false);
        }
        boolean z17 = false;
        int i61 = bitArray3.f21479b & 7;
        if (i61 > 0) {
            for (int i62 = i12; i61 < i62; i62 = 8) {
                bitArray3.a(z17);
                i61++;
                z17 = false;
            }
        }
        int iG2 = i58 - bitArray3.g();
        for (int i63 = 0; i63 < iG2; i63++) {
            bitArray3.c((i63 & 1) == 0 ? 236 : 17, 8);
        }
        if (bitArray3.f21479b != i59) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int i64 = 0;
        for (Version.ECB ecb4 : ecbArr2) {
            i64 += ecb4.f21590a;
        }
        if (bitArray3.g() != i58) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i64);
        int i65 = 0;
        int i66 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i65 < i64) {
            int i67 = i11;
            int[] iArr2 = new int[i67];
            int[] iArr3 = new int[i67];
            if (i65 >= i64) {
                throw new WriterException("Block ID too large");
            }
            int i68 = i50 % i64;
            int i69 = i64 - i68;
            int i70 = i50 / i64;
            int i71 = i58 / i64;
            int i72 = i71 + 1;
            int i73 = i70 - i71;
            int i74 = (i70 + 1) - i72;
            if (i73 != i74) {
                throw new WriterException("EC bytes mismatch");
            }
            if (i64 != i69 + i68) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i50 != ((i72 + i74) * i68) + ((i71 + i73) * i69)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i65 < i69) {
                c11 = 0;
                iArr2[0] = i71;
                iArr3[0] = i73;
            } else {
                c11 = 0;
                iArr2[0] = i72;
                iArr3[0] = i74;
            }
            int i75 = iArr2[c11];
            byte[] bArr2 = new byte[i75];
            int i76 = i66 << 3;
            int i77 = i65;
            int i78 = 0;
            while (i78 < i75) {
                int i79 = i78;
                int i80 = i64;
                int[] iArr4 = iArr3;
                int i81 = 0;
                for (int i82 = 0; i82 < 8; i82++) {
                    if (bitArray3.f(i76)) {
                        i81 |= 1 << (7 - i82);
                    }
                    i76++;
                }
                bArr2[i79] = (byte) i81;
                i78 = i79 + 1;
                i64 = i80;
                iArr3 = iArr4;
            }
            int i83 = i64;
            int i84 = iArr3[0];
            int[] iArr5 = new int[i75 + i84];
            for (int i85 = 0; i85 < i75; i85++) {
                iArr5[i85] = bArr2[i85] & 255;
            }
            new ReedSolomonEncoder(GenericGF.f21488k).a(iArr5, i84);
            byte[] bArr3 = new byte[i84];
            int i86 = 0;
            while (i86 < i84) {
                int[] iArr6 = iArr5;
                bArr3[i86] = (byte) iArr6[i75 + i86];
                i86++;
                iArr5 = iArr6;
            }
            arrayList.add(new BlockPair(bArr2, bArr3));
            iMax = Math.max(iMax, i75);
            iMax2 = Math.max(iMax2, i84);
            i66 += iArr2[0];
            i65 = i77 + 1;
            i64 = i83;
            i11 = 1;
        }
        if (i58 != i66) {
            throw new WriterException("Data bytes does not match offset");
        }
        BitArray bitArray4 = new BitArray();
        for (int i87 = 0; i87 < iMax; i87++) {
            int size = arrayList.size();
            int i88 = 0;
            while (i88 < size) {
                Object obj = arrayList.get(i88);
                i88++;
                byte[] bArr4 = ((BlockPair) obj).f21594a;
                if (i87 < bArr4.length) {
                    bitArray4.c(bArr4[i87], 8);
                }
            }
        }
        for (int i89 = 0; i89 < iMax2; i89++) {
            int size2 = arrayList.size();
            int i90 = 0;
            while (i90 < size2) {
                Object obj2 = arrayList.get(i90);
                i90++;
                byte[] bArr5 = ((BlockPair) obj2).f21595b;
                if (i89 < bArr5.length) {
                    bitArray4.c(bArr5[i89], 8);
                }
            }
        }
        if (i50 != bitArray4.g()) {
            StringBuilder sbI = c.i(i50, "Interleaving error: ", " and ");
            sbI.append(bitArray4.g());
            sbI.append(" differ.");
            throw new WriterException(sbI.toString());
        }
        QRCode qRCode = new QRCode();
        qRCode.f21606b = errorCorrectionLevel;
        qRCode.f21605a = mode;
        qRCode.f21607c = versionA;
        int i91 = (versionA.f21587a * 4) + 17;
        ByteMatrix byteMatrix = new ByteMatrix(i91, i91);
        int i92 = Integer.MAX_VALUE;
        int i93 = 0;
        int i94 = -1;
        while (i93 < 8) {
            MatrixUtil.a(bitArray4, errorCorrectionLevel, versionA, i93, byteMatrix);
            int iA = MaskUtil.a(byteMatrix, true) + MaskUtil.a(byteMatrix, false);
            int i95 = 0;
            int i96 = 0;
            while (true) {
                i13 = byteMatrix.f21598c;
                int i97 = i13 - 1;
                bArr = byteMatrix.f21596a;
                i14 = byteMatrix.f21597b;
                if (i95 >= i97) {
                    break;
                }
                byte[] bArr6 = bArr[i95];
                int i98 = 0;
                while (i98 < i14 - 1) {
                    byte b11 = bArr6[i98];
                    int i99 = i98 + 1;
                    int i100 = iA;
                    if (b11 == bArr6[i99]) {
                        byte[] bArr7 = bArr[i95 + 1];
                        if (b11 == bArr7[i98] && b11 == bArr7[i99]) {
                            i96++;
                        }
                    }
                    iA = i100;
                    i98 = i99;
                }
                i95++;
            }
            int i101 = (i96 * 3) + iA;
            int i102 = 0;
            int i103 = 0;
            while (i102 < i13) {
                int i104 = 0;
                while (i104 < i14) {
                    byte[] bArr8 = bArr[i102];
                    int i105 = i103;
                    int i106 = i104 + 6;
                    if (i106 < i14) {
                        i15 = i101;
                        if (bArr8[i104] == 1 && bArr8[i104 + 1] == 0 && bArr8[i104 + 2] == 1 && bArr8[i104 + 3] == 1 && bArr8[i104 + 4] == 1 && bArr8[i104 + 5] == 0 && bArr8[i106] == 1) {
                            int iMax3 = Math.max(i104 - 4, 0);
                            int iMin = Math.min(i104, bArr8.length);
                            while (true) {
                                if (iMax3 >= iMin) {
                                    z13 = true;
                                    break;
                                }
                                int i107 = iMax3;
                                int i108 = iMin;
                                if (bArr8[i107] == 1) {
                                    z13 = false;
                                    break;
                                }
                                iMax3 = i107 + 1;
                                iMin = i108;
                            }
                            if (z13) {
                                i16 = i93;
                            } else {
                                i16 = i93;
                                int iMax4 = Math.max(i104 + 7, 0);
                                int iMin2 = Math.min(i104 + 11, bArr8.length);
                                while (true) {
                                    if (iMax4 >= iMin2) {
                                        z14 = true;
                                        break;
                                    }
                                    int i109 = iMax4;
                                    if (bArr8[iMax4] == 1) {
                                        z14 = false;
                                        break;
                                    }
                                    iMax4 = i109 + 1;
                                }
                                if (z14) {
                                }
                                i17 = i102 + 6;
                                if (i17 < i13) {
                                    byte b12 = 1;
                                    if (bArr[i102][i104] != 1 && bArr[i102 + 1][i104] == 0 && bArr[i102 + 2][i104] == 1 && bArr[i102 + 3][i104] == 1 && bArr[i102 + 4][i104] == 1 && bArr[i102 + 5][i104] == 0 && bArr[i17][i104] == 1) {
                                        int iMax5 = Math.max(i102 - 4, 0);
                                        int iMin3 = Math.min(i102, bArr.length);
                                        while (true) {
                                            if (iMax5 >= iMin3) {
                                                i18 = i102;
                                                z11 = true;
                                                break;
                                            }
                                            i18 = i102;
                                            if (bArr[iMax5][i104] == b12) {
                                                z11 = false;
                                                break;
                                            }
                                            iMax5++;
                                            i102 = i18;
                                            b12 = 1;
                                        }
                                        if (z11) {
                                            i103++;
                                        } else {
                                            int iMax6 = Math.max(i18 + 7, 0);
                                            int iMin4 = Math.min(i18 + 11, bArr.length);
                                            while (true) {
                                                if (iMax6 >= iMin4) {
                                                    z12 = true;
                                                    break;
                                                }
                                                if (bArr[iMax6][i104] == 1) {
                                                    z12 = false;
                                                    break;
                                                }
                                                iMax6++;
                                            }
                                            if (z12) {
                                                i103++;
                                            }
                                        }
                                    } else {
                                        i18 = i102;
                                    }
                                } else {
                                    i18 = i102;
                                }
                                i104++;
                                i101 = i15;
                                i93 = i16;
                                i102 = i18;
                            }
                            i103 = i105 + 1;
                            i17 = i102 + 6;
                            if (i17 < i13) {
                                byte b13 = 1;
                                if (bArr[i102][i104] != 1) {
                                    i18 = i102;
                                } else {
                                    i18 = i102;
                                }
                            } else {
                                i18 = i102;
                            }
                            i104++;
                            i101 = i15;
                            i93 = i16;
                            i102 = i18;
                        }
                        i103 = i105;
                        i17 = i102 + 6;
                        if (i17 < i13) {
                            byte b14 = 1;
                            if (bArr[i102][i104] != 1) {
                                i18 = i102;
                            } else {
                                i18 = i102;
                            }
                        } else {
                            i18 = i102;
                        }
                        i104++;
                        i101 = i15;
                        i93 = i16;
                        i102 = i18;
                    } else {
                        i15 = i101;
                    }
                    i16 = i93;
                    i103 = i105;
                    i17 = i102 + 6;
                    if (i17 < i13) {
                        byte b15 = 1;
                        if (bArr[i102][i104] != 1) {
                            i18 = i102;
                        } else {
                            i18 = i102;
                        }
                    } else {
                        i18 = i102;
                    }
                    i104++;
                    i101 = i15;
                    i93 = i16;
                    i102 = i18;
                }
                i102++;
            }
            int i110 = i93;
            int i111 = (i103 * 40) + i101;
            int i112 = 0;
            for (int i113 = 0; i113 < i13; i113++) {
                byte[] bArr9 = bArr[i113];
                for (int i114 = 0; i114 < i14; i114++) {
                    int i115 = i112;
                    i112 = bArr9[i114] == 1 ? i115 + 1 : i115;
                }
            }
            int i116 = i13 * i14;
            int iAbs = (((Math.abs((i112 << 1) - i116) * 10) / i116) * 10) + i111;
            if (iAbs < i92) {
                i92 = iAbs;
                i94 = i110;
            }
            i93 = i110 + 1;
        }
        qRCode.f21608d = i94;
        MatrixUtil.a(bitArray4, errorCorrectionLevel, versionA, i94, byteMatrix);
        qRCode.f21609e = byteMatrix;
        return qRCode;
    }
}
