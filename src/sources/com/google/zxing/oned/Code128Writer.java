package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CType {
        private static final /* synthetic */ CType[] $VALUES;
        public static final CType FNC_1;
        public static final CType ONE_DIGIT;
        public static final CType TWO_DIGITS;
        public static final CType UNCODABLE;

        static {
            CType cType = new CType("UNCODABLE", 0);
            UNCODABLE = cType;
            CType cType2 = new CType("ONE_DIGIT", 1);
            ONE_DIGIT = cType2;
            CType cType3 = new CType("TWO_DIGITS", 2);
            TWO_DIGITS = cType3;
            CType cType4 = new CType("FNC_1", 3);
            FNC_1 = cType4;
            $VALUES = new CType[]{cType, cType2, cType3, cType4};
        }

        public static CType valueOf(String str) {
            return (CType) Enum.valueOf(CType.class, str);
        }

        public static CType[] values() {
            return (CType[]) $VALUES.clone();
        }
    }

    public static CType e(int i11, String str) {
        int length = str.length();
        if (i11 >= length) {
            return CType.UNCODABLE;
        }
        char cCharAt = str.charAt(i11);
        if (cCharAt == 241) {
            return CType.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return CType.UNCODABLE;
        }
        int i12 = i11 + 1;
        if (i12 >= length) {
            return CType.ONE_DIGIT;
        }
        char cCharAt2 = str.charAt(i12);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? CType.ONE_DIGIT : CType.TWO_DIGITS;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.a(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] c(String str) {
        int i11;
        int i12;
        CType cTypeE;
        char cCharAt;
        int i13;
        int iCharAt;
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt2 = str.charAt(i14);
            switch (cCharAt2) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt2 > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt2)));
                    }
                    break;
                    break;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[][] iArr = Code128Reader.f21536a;
            if (i16 >= length) {
                arrayList.add(iArr[i17 % 103]);
                arrayList.add(iArr[106]);
                int size = arrayList.size();
                int i19 = 0;
                int i21 = 0;
                while (i21 < size) {
                    Object obj = arrayList.get(i21);
                    i21++;
                    for (int i22 : (int[]) obj) {
                        i19 += i22;
                    }
                }
                boolean[] zArr = new boolean[i19];
                int size2 = arrayList.size();
                int iB = 0;
                int i23 = 0;
                while (i23 < size2) {
                    Object obj2 = arrayList.get(i23);
                    i23++;
                    iB += OneDimensionalCodeWriter.b(zArr, iB, (int[]) obj2, true);
                }
                return zArr;
            }
            CType cTypeE2 = e(i16, str);
            CType cType = CType.ONE_DIGIT;
            if (cTypeE2 == cType) {
                i12 = 100;
                i11 = 103;
            } else {
                i11 = 103;
                CType cType2 = CType.UNCODABLE;
                if (cTypeE2 != cType2) {
                    i12 = 99;
                    if (i18 != 99) {
                        if (i18 == 100) {
                            CType cType3 = CType.FNC_1;
                            if (cTypeE2 != cType3 && (cTypeE = e(i16 + 2, str)) != cType2 && cTypeE != cType) {
                                if (cTypeE != cType3) {
                                    int i24 = i16 + 4;
                                    while (true) {
                                        CType cTypeE3 = e(i24, str);
                                        if (cTypeE3 == CType.TWO_DIGITS) {
                                            i24 += 2;
                                        } else if (cTypeE3 != CType.ONE_DIGIT) {
                                            i12 = 99;
                                        }
                                    }
                                } else if (e(i16 + 3, str) == CType.TWO_DIGITS) {
                                    i12 = 99;
                                }
                            }
                            i12 = 100;
                        } else {
                            if (cTypeE2 == CType.FNC_1) {
                                cTypeE2 = e(i16 + 1, str);
                            }
                            if (cTypeE2 == CType.TWO_DIGITS) {
                                i12 = 99;
                            } else {
                                i12 = 100;
                            }
                        }
                    }
                } else if (i16 >= str.length() || ((cCharAt = str.charAt(i16)) >= ' ' && (i18 != 101 || cCharAt >= '`'))) {
                    i12 = 100;
                } else {
                    i12 = 101;
                }
            }
            if (i12 == i18) {
                switch (str.charAt(i16)) {
                    case 241:
                        iCharAt = 102;
                        break;
                    case 242:
                        iCharAt = 97;
                        break;
                    case 243:
                        iCharAt = 96;
                        break;
                    case 244:
                        iCharAt = i18 == 101 ? 101 : 100;
                        break;
                    default:
                        if (i18 == 100) {
                            iCharAt = str.charAt(i16) - ' ';
                        } else if (i18 != 101) {
                            iCharAt = Integer.parseInt(str.substring(i16, i16 + 2));
                            i16++;
                        } else {
                            char cCharAt3 = str.charAt(i16);
                            iCharAt = cCharAt3 - ' ';
                            if (iCharAt < 0) {
                                iCharAt = cCharAt3 + '@';
                            }
                        }
                        break;
                }
                i16++;
            } else {
                if (i18 != 0) {
                    i13 = i12;
                } else if (i12 != 100) {
                    i13 = i12 != 101 ? 105 : i11;
                } else {
                    i13 = 104;
                }
                i18 = i12;
                iCharAt = i13;
            }
            arrayList.add(iArr[iCharAt]);
            i17 += iCharAt * i15;
            if (i16 != 0) {
                i15++;
            }
        }
    }
}
