package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import defpackage.e;
import hh.p0;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Encoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21464a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private Encoder() {
    }

    public static void a(BitMatrix bitMatrix, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13 += 2) {
            int i14 = i11 - i13;
            int i15 = i14;
            while (true) {
                int i16 = i11 + i13;
                if (i15 <= i16) {
                    bitMatrix.c(i15, i14);
                    bitMatrix.c(i15, i16);
                    bitMatrix.c(i14, i15);
                    bitMatrix.c(i16, i15);
                    i15++;
                }
            }
        }
        int i17 = i11 - i12;
        bitMatrix.c(i17, i17);
        int i18 = i17 + 1;
        bitMatrix.c(i18, i17);
        bitMatrix.c(i17, i18);
        int i19 = i11 + i12;
        bitMatrix.c(i19, i17);
        bitMatrix.c(i19, i18);
        bitMatrix.c(i19, i19 - 1);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    public static AztecCode b(byte[] bArr, int i11, int i12) {
        char c11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char c12;
        BitArray bitArrayD;
        BitArray bitArrayD2;
        int i18;
        boolean z11;
        int iAbs;
        BitArray bitArrayC;
        int i19;
        List<State> listSingletonList = Collections.singletonList(State.f21471e);
        int i21 = 0;
        while (true) {
            c11 = '\n';
            i13 = 5;
            i14 = 3;
            i15 = 2;
            i16 = 32;
            boolean z12 = true;
            if (i21 >= bArr.length) {
                break;
            }
            int i22 = i21 + 1;
            byte b3 = i22 < bArr.length ? bArr[i22] : (byte) 0;
            byte b11 = bArr[i21];
            if (b11 != 13) {
                if (b11 != 44) {
                    if (b11 != 46) {
                        if (b11 != 58 || b3 != 32) {
                            i13 = 0;
                        }
                    } else if (b3 == 32) {
                        i13 = 3;
                    } else {
                        i13 = 0;
                    }
                } else if (b3 == 32) {
                    i13 = 4;
                } else {
                    i13 = 0;
                }
            } else if (b3 == 10) {
                i13 = 2;
            } else {
                i13 = 0;
            }
            if (i13 > 0) {
                LinkedList linkedList = new LinkedList();
                for (State state : listSingletonList) {
                    State stateB = state.b(i21);
                    linkedList.add(stateB.d(4, i13));
                    if (state.f21472a != 4) {
                        linkedList.add(stateB.e(4, i13));
                    }
                    if (i13 == 3 || i13 == 4) {
                        linkedList.add(stateB.d(2, 16 - i13).d(2, 1));
                    }
                    if (state.f21474c > 0) {
                        linkedList.add(state.a(i21).a(i22));
                    }
                }
                listSingletonList = HighLevelEncoder.a(linkedList);
                i21 = i22;
            } else {
                LinkedList linkedList2 = new LinkedList();
                for (State state2 : listSingletonList) {
                    char c13 = (char) (bArr[i21] & 255);
                    int[][] iArr = HighLevelEncoder.f21467c;
                    int i23 = state2.f21472a;
                    boolean z13 = iArr[i23][c13] > 0 ? z12 : false;
                    int i24 = 0;
                    State stateB2 = null;
                    while (i24 <= 4) {
                        int i25 = iArr[i24][c13];
                        if (i25 > 0) {
                            if (stateB2 == null) {
                                stateB2 = state2.b(i21);
                            }
                            if (!z13 || i24 == i23 || i24 == 2) {
                                linkedList2.add(stateB2.d(i24, i25));
                            }
                            if (!z13 && HighLevelEncoder.f21468d[i23][i24] >= 0) {
                                linkedList2.add(stateB2.e(i24, i25));
                            }
                        } else {
                            z12 = z12;
                        }
                        i24++;
                        z12 = z12;
                    }
                    boolean z14 = z12;
                    if (state2.f21474c > 0 || iArr[i23][c13] == 0) {
                        linkedList2.add(state2.a(i21));
                    }
                    z12 = z14;
                }
                listSingletonList = HighLevelEncoder.a(linkedList2);
            }
            i21++;
        }
        State state3 = (State) Collections.min(listSingletonList, new HighLevelEncoder.AnonymousClass1());
        state3.getClass();
        LinkedList linkedList3 = new LinkedList();
        for (Token token = state3.b(bArr.length).f21473b; token != null; token = token.f21477a) {
            linkedList3.addFirst(token);
        }
        BitArray bitArray = new BitArray();
        Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            ((Token) it.next()).a(bitArray, bArr);
        }
        int i26 = bitArray.f21479b;
        int iD = e.D(i26, i11, 100, 11);
        int i27 = i26 + iD;
        int[] iArr2 = f21464a;
        if (i12 != 0) {
            z11 = i12 < 0;
            iAbs = Math.abs(i12);
            if (iAbs > (z11 ? 4 : 32)) {
                throw new IllegalArgumentException(p0.h(i12, "Illegal value ", " for layers"));
            }
            i17 = ((z11 ? 88 : 112) + (iAbs << 4)) * iAbs;
            i18 = iArr2[iAbs];
            int i28 = i17 - (i17 % i18);
            bitArrayD2 = d(bitArray, i18);
            int i29 = bitArrayD2.f21479b;
            if (iD + i29 > i28) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z11 && i29 > (i18 << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        } else {
            int i30 = 0;
            int i31 = 0;
            BitArray bitArray2 = null;
            while (true) {
                if (i30 > i16) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                boolean z15 = i30 <= i14;
                int i32 = z15 ? i30 + 1 : i30;
                i17 = ((z15 ? 88 : 112) + (i32 << 4)) * i32;
                if (i27 <= i17) {
                    if (bitArray2 == null || i31 != iArr2[i32]) {
                        int i33 = iArr2[i32];
                        i31 = i33;
                        bitArrayD = d(bitArray, i33);
                    } else {
                        bitArrayD = bitArray2;
                    }
                    int i34 = i17 - (i17 % i31);
                    if ((!z15 || bitArrayD.f21479b <= (i31 << 6)) && bitArrayD.f21479b + iD <= i34) {
                        bitArrayD2 = bitArrayD;
                        i18 = i31;
                        z11 = z15;
                        iAbs = i32;
                        break;
                    }
                    bitArray2 = bitArrayD;
                    c12 = '\n';
                } else {
                    c12 = c11;
                }
                i30++;
                c11 = c12;
                i15 = i15;
                i14 = 3;
                i16 = 32;
                i13 = i13;
            }
        }
        BitArray bitArrayC2 = c(bitArrayD2, i17, i18);
        int i35 = bitArrayD2.f21479b / i18;
        BitArray bitArray3 = new BitArray();
        if (z11) {
            bitArray3.c(iAbs - 1, i15);
            bitArray3.c(i35 - 1, 6);
            bitArrayC = c(bitArray3, 28, 4);
        } else {
            bitArray3.c(iAbs - 1, i13);
            bitArray3.c(i35 - 1, 11);
            bitArrayC = c(bitArray3, 40, 4);
        }
        int i36 = (z11 ? 11 : 14) + (iAbs << 2);
        int[] iArr3 = new int[i36];
        if (z11) {
            for (int i37 = 0; i37 < i36; i37++) {
                iArr3[i37] = i37;
            }
            i19 = i36;
        } else {
            int i38 = i36 / 2;
            i19 = (((i38 - 1) / 15) * i15) + i36 + 1;
            int i39 = i19 / 2;
            for (int i40 = 0; i40 < i38; i40++) {
                int i41 = (i40 / 15) + i40;
                iArr3[(i38 - i40) - 1] = (i39 - i41) - 1;
                iArr3[i38 + i40] = i41 + i39 + 1;
            }
        }
        BitMatrix bitMatrix = new BitMatrix(i19, i19);
        int i42 = 0;
        for (int i43 = 0; i43 < iAbs; i43++) {
            int i44 = ((iAbs - i43) << i15) + (z11 ? 9 : 12);
            for (int i45 = 0; i45 < i44; i45++) {
                int i46 = i45 << 1;
                int i47 = 0;
                while (i47 < i15) {
                    int i48 = i15;
                    if (bitArrayC2.f(i42 + i46 + i47)) {
                        int i49 = i43 << 1;
                        bitMatrix.c(iArr3[i49 + i47], iArr3[i49 + i45]);
                    }
                    if (bitArrayC2.f((i44 << 1) + i42 + i46 + i47)) {
                        int i50 = i43 << 1;
                        bitMatrix.c(iArr3[i50 + i45], iArr3[((i36 - 1) - i50) - i47]);
                    }
                    if (bitArrayC2.f((i44 << 2) + i42 + i46 + i47)) {
                        int i51 = (i36 - 1) - (i43 << 1);
                        bitMatrix.c(iArr3[i51 - i47], iArr3[i51 - i45]);
                    }
                    if (bitArrayC2.f((i44 * 6) + i42 + i46 + i47)) {
                        int i52 = i43 << 1;
                        bitMatrix.c(iArr3[((i36 - 1) - i52) - i45], iArr3[i52 + i47]);
                    }
                    i47++;
                    i15 = i48;
                }
            }
            i42 += i44 << 3;
        }
        int i53 = i19 / 2;
        if (z11) {
            for (int i54 = 0; i54 < 7; i54++) {
                int i55 = (i53 - 3) + i54;
                if (bitArrayC.f(i54)) {
                    bitMatrix.c(i55, i53 - 5);
                }
                if (bitArrayC.f(i54 + 7)) {
                    bitMatrix.c(i53 + 5, i55);
                }
                if (bitArrayC.f(20 - i54)) {
                    bitMatrix.c(i55, i53 + 5);
                }
                if (bitArrayC.f(27 - i54)) {
                    bitMatrix.c(i53 - 5, i55);
                }
            }
        } else {
            for (int i56 = 0; i56 < 10; i56++) {
                int i57 = (i56 / 5) + (i53 - 5) + i56;
                if (bitArrayC.f(i56)) {
                    bitMatrix.c(i57, i53 - 7);
                }
                if (bitArrayC.f(i56 + 10)) {
                    bitMatrix.c(i53 + 7, i57);
                }
                if (bitArrayC.f(29 - i56)) {
                    bitMatrix.c(i57, i53 + 7);
                }
                if (bitArrayC.f(39 - i56)) {
                    bitMatrix.c(i53 - 7, i57);
                }
            }
        }
        if (z11) {
            a(bitMatrix, i53, 5);
        } else {
            a(bitMatrix, i53, 7);
            int i58 = 0;
            int i59 = 0;
            while (i58 < (i36 / 2) - 1) {
                for (int i60 = i53 & 1; i60 < i19; i60 += 2) {
                    int i61 = i53 - i59;
                    bitMatrix.c(i61, i60);
                    int i62 = i53 + i59;
                    bitMatrix.c(i62, i60);
                    bitMatrix.c(i60, i61);
                    bitMatrix.c(i60, i62);
                }
                i58 += 15;
                i59 += 16;
            }
        }
        AztecCode aztecCode = new AztecCode();
        aztecCode.f21461a = bitMatrix;
        return aztecCode;
    }

    public static BitArray c(BitArray bitArray, int i11, int i12) {
        GenericGF genericGF;
        int i13 = bitArray.f21479b / i12;
        if (i12 == 4) {
            genericGF = GenericGF.f21487j;
        } else if (i12 == 6) {
            genericGF = GenericGF.f21486i;
        } else if (i12 == 8) {
            genericGF = GenericGF.f21489l;
        } else if (i12 == 10) {
            genericGF = GenericGF.f21485h;
        } else {
            if (i12 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i12)));
            }
            genericGF = GenericGF.f21484g;
        }
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(genericGF);
        int i14 = i11 / i12;
        int[] iArr = new int[i14];
        int i15 = bitArray.f21479b / i12;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i12; i18++) {
                i17 |= bitArray.f((i16 * i12) + i18) ? 1 << ((i12 - i18) - 1) : 0;
            }
            iArr[i16] = i17;
        }
        reedSolomonEncoder.a(iArr, i14 - i13);
        BitArray bitArray2 = new BitArray();
        bitArray2.c(0, i11 % i12);
        for (int i19 = 0; i19 < i14; i19++) {
            bitArray2.c(iArr[i19], i12);
        }
        return bitArray2;
    }

    public static BitArray d(BitArray bitArray, int i11) {
        BitArray bitArray2 = new BitArray();
        int i12 = bitArray.f21479b;
        int i13 = (1 << i11) - 2;
        int i14 = 0;
        while (i14 < i12) {
            int i15 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                int i17 = i14 + i16;
                if (i17 >= i12 || bitArray.f(i17)) {
                    i15 |= 1 << ((i11 - 1) - i16);
                }
            }
            int i18 = i15 & i13;
            if (i18 == i13) {
                bitArray2.c(i18, i11);
            } else {
                if (i18 == 0) {
                    bitArray2.c(i15 | 1, i11);
                } else {
                    bitArray2.c(i15, i11);
                }
                i14 += i11;
            }
            i14--;
            i14 += i11;
        }
        return bitArray2;
    }
}
