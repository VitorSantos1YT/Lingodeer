package c7;

import b0.s2;
import b7.v;
import com.google.common.collect.ImmutableList;
import com.google.common.math.DoubleMath;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import mf.sOm.txBUGYhC;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f6709a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f6710b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f6711c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f6712d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i11, int i12, boolean[] zArr) {
        int i13 = i12 - i11;
        b7.a.j(i13 >= 0);
        if (i13 == 0) {
            return i12;
        }
        if (zArr[0]) {
            a(zArr);
            return i11 - 3;
        }
        if (i13 > 1 && zArr[1] && bArr[i11] == 1) {
            a(zArr);
            return i11 - 2;
        }
        if (i13 > 2 && zArr[2] && bArr[i11] == 0 && bArr[i11 + 1] == 1) {
            a(zArr);
            return i11 - 1;
        }
        int i14 = i12 - 1;
        int i15 = i11 + 2;
        while (i15 < i14) {
            byte b3 = bArr[i15];
            if ((b3 & 254) == 0) {
                int i16 = i15 - 2;
                if (bArr[i16] == 0 && bArr[i15 - 1] == 0 && b3 == 1) {
                    a(zArr);
                    return i16;
                }
                i15 -= 2;
            }
            i15 += 3;
        }
        zArr[0] = i13 <= 2 ? !(i13 != 2 ? !(zArr[1] && bArr[i14] == 1) : !(zArr[2] && bArr[i12 + (-2)] == 0 && bArr[i14] == 1)) : bArr[i12 + (-3)] == 0 && bArr[i12 + (-2)] == 0 && bArr[i14] == 1;
        zArr[1] = i13 <= 1 ? zArr[2] && bArr[i14] == 0 : bArr[i12 + (-2)] == 0 && bArr[i14] == 0;
        zArr[2] = bArr[i14] == 0;
        return i12;
    }

    public static int d(y6.p pVar) {
        if (Objects.equals(pVar.f57291n, "video/avc")) {
            return 1;
        }
        return (Objects.equals(pVar.f57291n, "video/hevc") || d0.b(pVar.f57289k, "video/hevc")) ? 2 : 0;
    }

    public static j e(v vVar) {
        vVar.s();
        return new j(vVar.i(6), vVar.i(6), vVar.i(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static k f(v vVar, boolean z11, int i11, k kVar) {
        int[] iArr;
        int i12;
        boolean z12;
        int i13;
        int i14;
        boolean zH;
        int i15;
        int i16;
        int i17;
        int[] iArr2 = new int[6];
        if (!z11) {
            if (kVar != null) {
                int i18 = kVar.f6663a;
                zH = kVar.f6664b;
                i15 = kVar.f6665c;
                i16 = kVar.f6666d;
                iArr2 = kVar.f6667e;
                i12 = i18;
            } else {
                iArr = iArr2;
                i12 = 0;
                z12 = false;
                i13 = 0;
                i14 = 0;
            }
            int i19 = vVar.i(8);
            i17 = 0;
            for (int i21 = 0; i21 < i11; i21++) {
                if (vVar.h()) {
                    i17 += 88;
                }
                if (vVar.h()) {
                    i17 += 8;
                }
            }
            vVar.t(i17);
            if (i11 > 0) {
                vVar.t((8 - i11) * 2);
            }
            return new k(i12, z12, i13, i14, iArr, i19);
        }
        int i22 = vVar.i(2);
        zH = vVar.h();
        i15 = vVar.i(5);
        i16 = 0;
        for (int i23 = 0; i23 < 32; i23++) {
            if (vVar.h()) {
                i16 |= 1 << i23;
            }
        }
        for (int i24 = 0; i24 < 6; i24++) {
            iArr2[i24] = vVar.i(8);
        }
        i12 = i22;
        iArr = iArr2;
        z12 = zH;
        i13 = i15;
        i14 = i16;
        int i110 = vVar.i(8);
        i17 = 0;
        while (i21 < i11) {
            if (vVar.h()) {
                i17 += 88;
            }
            if (vVar.h()) {
                i17 += 8;
            }
        }
        vVar.t(i17);
        if (i11 > 0) {
            vVar.t((8 - i11) * 2);
        }
        return new k(i12, z12, i13, i14, iArr, i110);
    }

    public static s2 g(byte[] bArr, int i11, int i12) {
        byte b3;
        int i13 = i11 + 2;
        do {
            i12--;
            b3 = bArr[i12];
            if (b3 != 0) {
                break;
            }
        } while (i12 > i13);
        if (b3 == 0 || i12 <= i13) {
            return null;
        }
        v vVar = new v(bArr, i13, i12 + 1);
        while (vVar.d(16)) {
            int i14 = vVar.i(8);
            int i15 = 0;
            while (i14 == 255) {
                i15 += 255;
                i14 = vVar.i(8);
            }
            int i16 = i15 + i14;
            int i17 = vVar.i(8);
            int i18 = 0;
            while (i17 == 255) {
                i18 += 255;
                i17 = vVar.i(8);
            }
            int i19 = i18 + i17;
            if (i19 == 0 || !vVar.d(i19)) {
                return null;
            }
            if (i16 == 176) {
                int iM = vVar.m();
                boolean zH = vVar.h();
                int iM2 = zH ? vVar.m() : 0;
                int iM3 = vVar.m();
                int iM4 = -1;
                for (int i21 = 0; i21 <= iM3; i21++) {
                    iM4 = vVar.m();
                    vVar.m();
                    int i22 = vVar.i(6);
                    if (i22 == 63) {
                        return null;
                    }
                    vVar.i(i22 == 0 ? Math.max(0, iM - 30) : Math.max(0, (i22 + iM) - 31));
                    if (zH) {
                        int i23 = vVar.i(6);
                        if (i23 == 63) {
                            return null;
                        }
                        vVar.i(i23 == 0 ? Math.max(0, iM2 - 30) : Math.max(0, (i23 + iM2) - 31));
                    }
                    if (vVar.h()) {
                        vVar.t(10);
                    }
                }
                return new s2(iM4);
            }
            vVar.t(i19 * 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static m h(byte[] bArr, int i11, int i12, ob.i iVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int iM;
        int i17;
        int iM2;
        int i18;
        int i19;
        int iMax;
        int i21;
        int i22;
        int i23;
        int iF;
        int iG;
        int i24;
        ob.l lVar;
        ob.e eVar;
        j jVarE = e(new v(bArr, i11, i12));
        v vVar = new v(bArr, i11 + 2, i12);
        int i25 = 4;
        vVar.t(4);
        int i26 = vVar.i(3);
        int i27 = jVarE.f6661b;
        boolean z11 = i27 != 0 && i26 == 7;
        if (iVar != null) {
            ImmutableList immutableList = (ImmutableList) iVar.f44813b;
            if (immutableList.isEmpty()) {
                i13 = 0;
            } else {
                i13 = ((i) immutableList.get(Math.min(i27, immutableList.size() - 1))).f6658a;
            }
        } else {
            i13 = 0;
        }
        k kVarF = null;
        if (!z11) {
            vVar.s();
            kVarF = f(vVar, true, i26, null);
        } else if (iVar != null) {
            ob.c cVar = (ob.c) iVar.f44814c;
            int[] iArr = (int[]) cVar.f44800c;
            ImmutableList immutableList2 = (ImmutableList) cVar.f44799b;
            int i28 = iArr[i13];
            if (immutableList2.size() > i28) {
                kVarF = (k) immutableList2.get(i28);
            }
        }
        vVar.m();
        if (z11) {
            int i29 = vVar.h() ? vVar.i(8) : -1;
            if (iVar == null || (eVar = (ob.e) iVar.f44815d) == null) {
                iM = 0;
                iM2 = 0;
                i17 = 0;
                i19 = 0;
                i16 = 0;
                i18 = 0;
            } else {
                ImmutableList immutableList3 = (ImmutableList) eVar.f44804b;
                if (i29 == -1) {
                    i29 = ((int[]) eVar.f44805c)[i13];
                }
                if (i29 == -1 || immutableList3.size() <= i29) {
                    iM = 0;
                    iM2 = 0;
                    i17 = 0;
                    i19 = 0;
                    i16 = 0;
                    i18 = 0;
                } else {
                    l lVar2 = (l) immutableList3.get(i29);
                    int i30 = lVar2.f6669a;
                    i17 = lVar2.f6672d;
                    int i31 = lVar2.f6673e;
                    iM = lVar2.f6670b;
                    iM2 = lVar2.f6671c;
                    i16 = i31;
                    i18 = i16;
                    i19 = i17;
                }
            }
        } else {
            int iM3 = vVar.m();
            if (iM3 == 3) {
                vVar.s();
            }
            int iM4 = vVar.m();
            int iM5 = vVar.m();
            if (vVar.h()) {
                int iM6 = vVar.m();
                int iM7 = vVar.m();
                int iM8 = vVar.m();
                int iM9 = vVar.m();
                i14 = iM4 - ((iM6 + iM7) * ((iM3 == 1 || iM3 == 2) ? 2 : 1));
                i15 = iM5 - ((iM8 + iM9) * (iM3 == 1 ? 2 : 1));
            } else {
                i14 = iM4;
                i15 = iM5;
            }
            i16 = i15;
            iM = vVar.m();
            i17 = i14;
            iM2 = vVar.m();
            i18 = iM5;
            i19 = iM4;
        }
        int iM10 = vVar.m();
        if (z11) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i32 = vVar.h() ? 0 : i26; i32 <= i26; i32++) {
                vVar.m();
                iMax = Math.max(vVar.m(), iMax);
                vVar.m();
            }
        }
        vVar.m();
        vVar.m();
        vVar.m();
        vVar.m();
        vVar.m();
        vVar.m();
        if (vVar.h()) {
            int i33 = 6;
            if (z11 ? vVar.h() : false) {
                vVar.t(6);
            } else if (vVar.h()) {
                int i34 = 0;
                while (i34 < i25) {
                    int i35 = 0;
                    while (i35 < i33) {
                        if (vVar.h()) {
                            int iMin = Math.min(64, 1 << ((i34 << 1) + 4));
                            if (i34 > 1) {
                                vVar.n();
                            }
                            for (int i36 = 0; i36 < iMin; i36++) {
                                vVar.n();
                            }
                        } else {
                            vVar.m();
                        }
                        i35 += i34 == 3 ? 3 : 1;
                        i33 = 6;
                    }
                    i34++;
                    i25 = 4;
                    i33 = 6;
                }
            }
        }
        vVar.t(2);
        if (vVar.h()) {
            vVar.t(8);
            vVar.m();
            vVar.m();
            vVar.s();
        }
        int iM11 = vVar.m();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i37 = 0;
        int iM12 = -1;
        int i38 = -1;
        while (i37 < iM11) {
            if (i37 == 0 || !vVar.h()) {
                int iM13 = vVar.m();
                iM12 = vVar.m();
                int[] iArr3 = new int[iM13];
                int i39 = 0;
                while (i39 < iM13) {
                    iArr3[i39] = (i39 > 0 ? iArr3[i39 - 1] : 0) - (vVar.m() + 1);
                    vVar.s();
                    i39++;
                }
                int[] iArr4 = new int[iM12];
                int i40 = 0;
                while (i40 < iM12) {
                    iArr4[i40] = vVar.m() + 1 + (i40 > 0 ? iArr4[i40 - 1] : 0);
                    vVar.s();
                    i40++;
                }
                i38 = iM13;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i41 = i38 + iM12;
                int iM14 = (1 - ((vVar.h() ? 1 : 0) * 2)) * (vVar.m() + 1);
                int i42 = i41 + 1;
                boolean[] zArr = new boolean[i42];
                for (int i43 = 0; i43 <= i41; i43++) {
                    if (vVar.h()) {
                        zArr[i43] = true;
                    } else {
                        zArr[i43] = vVar.h();
                    }
                }
                int[] iArr5 = new int[i42];
                int[] iArr6 = new int[i42];
                int i44 = 0;
                for (int i45 = iM12 - 1; i45 >= 0; i45--) {
                    int i46 = iArrCopyOf[i45] + iM14;
                    if (i46 < 0 && zArr[i38 + i45]) {
                        iArr5[i44] = i46;
                        i44++;
                    }
                }
                if (iM14 < 0 && zArr[i41]) {
                    iArr5[i44] = iM14;
                    i44++;
                }
                int i47 = i44;
                int[] iArr7 = iArr2;
                for (int i48 = 0; i48 < i38; i48++) {
                    int i49 = iArr7[i48] + iM14;
                    if (i49 < 0 && zArr[i48]) {
                        iArr5[i47] = i49;
                        i47++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i47);
                int i50 = 0;
                for (int i51 = i38 - 1; i51 >= 0; i51--) {
                    int i52 = iArr7[i51] + iM14;
                    if (i52 > 0 && zArr[i51]) {
                        iArr6[i50] = i52;
                        i50++;
                    }
                }
                if (iM14 > 0 && zArr[i41]) {
                    iArr6[i50] = iM14;
                    i50++;
                }
                int i53 = i47;
                int i54 = i50;
                for (int i55 = 0; i55 < iM12; i55++) {
                    int i56 = iArrCopyOf[i55] + iM14;
                    if (i56 > 0 && zArr[i38 + i55]) {
                        iArr6[i54] = i56;
                        i54++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i54);
                iM12 = i54;
                i38 = i53;
                iArr2 = iArrCopyOf2;
            }
            i37++;
            iM11 = iM11;
            i13 = i13;
        }
        int i57 = i13;
        if (vVar.h()) {
            int iM15 = vVar.m();
            for (int i58 = 0; i58 < iM15; i58++) {
                vVar.t(iM10 + 5);
            }
        }
        vVar.t(2);
        float f5 = 1.0f;
        if (vVar.h()) {
            if (vVar.h()) {
                int i59 = vVar.i(8);
                if (i59 == 255) {
                    int i60 = vVar.i(16);
                    int i61 = vVar.i(16);
                    if (i60 != 0 && i61 != 0) {
                        f5 = i60 / i61;
                    }
                } else if (i59 < 17) {
                    f5 = f6710b[i59];
                } else {
                    defpackage.e.y(i59, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (vVar.h()) {
                vVar.s();
            }
            if (vVar.h()) {
                vVar.t(3);
                i24 = vVar.h() ? 1 : 2;
                if (vVar.h()) {
                    int i62 = vVar.i(8);
                    int i63 = vVar.i(8);
                    vVar.t(8);
                    iF = y6.g.f(i62);
                    iG = y6.g.g(i63);
                } else {
                    iF = -1;
                    iG = -1;
                }
            } else if (iVar == null || (lVar = (ob.l) iVar.f44816e) == null) {
                iF = -1;
                iG = -1;
                i24 = -1;
            } else {
                ImmutableList immutableList4 = (ImmutableList) lVar.f44822b;
                int i64 = ((int[]) lVar.f44823c)[i57];
                if (immutableList4.size() > i64) {
                    n nVar = (n) immutableList4.get(i64);
                    int i65 = nVar.f6686a;
                    int i66 = nVar.f6687b;
                    iG = nVar.f6688c;
                    iF = i65;
                    i24 = i66;
                } else {
                    iF = -1;
                    iG = -1;
                    i24 = -1;
                }
            }
            if (vVar.h()) {
                vVar.m();
                vVar.m();
            }
            vVar.s();
            if (vVar.h()) {
                i16 *= 2;
            }
            i21 = iF;
            i23 = iG;
            i22 = i24;
        } else {
            i21 = -1;
            i22 = -1;
            i23 = -1;
        }
        return new m(i26, kVarF, iM, iM2, i17, i16, i19, i18, f5, iMax, i21, i22, i23);
    }

    /* JADX WARN: Code duplicated, block: B:475:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    public static ob.i i(byte[] bArr, int i11, int i12) {
        int[] iArr;
        ob.l lVar;
        int i13;
        int i14;
        int i15;
        int i16;
        ImmutableList immutableList;
        boolean[][] zArr;
        int i17;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        boolean z11;
        int i18;
        boolean zH;
        int i19;
        int i21;
        int i22;
        boolean zH2;
        boolean zH3;
        int iM;
        int i23;
        int i24;
        int i25;
        boolean z12;
        boolean z13;
        v vVar = new v(bArr, i11, i12);
        e(vVar);
        vVar.t(4);
        boolean zH4 = vVar.h();
        boolean zH5 = vVar.h();
        int i26 = vVar.i(6);
        int i27 = i26 + 1;
        int i28 = vVar.i(3);
        vVar.t(17);
        k kVarF = f(vVar, true, i28, null);
        for (int i29 = vVar.h() ? 0 : i28; i29 <= i28; i29++) {
            vVar.m();
            vVar.m();
            vVar.m();
        }
        int i30 = vVar.i(6);
        int iM2 = vVar.m() + 1;
        int i31 = 6;
        ob.c cVar = new ob.c(ImmutableList.u(kVarF), new int[1]);
        boolean z14 = i27 >= 2 && iM2 >= 2;
        boolean z15 = zH4 && zH5;
        int i32 = i30 + 1;
        boolean z16 = i32 >= i27;
        if (!z14 || !z15 || !z16) {
            return new ob.i(null, cVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iM2, i32);
        int i33 = 1;
        int[] iArr5 = new int[iM2];
        int[] iArr6 = new int[iM2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i34 = 1; i34 < iM2; i34++) {
            int i35 = 0;
            for (int i36 = 0; i36 <= i30; i36++) {
                if (vVar.h()) {
                    iArr4[i34][i35] = i36;
                    iArr6[i34] = i36;
                    i35++;
                }
                iArr5[i34] = i35;
            }
        }
        if (vVar.h()) {
            vVar.t(64);
            if (vVar.h()) {
                vVar.m();
            }
            int iM3 = vVar.m();
            int i37 = 0;
            while (i37 < iM3) {
                vVar.m();
                if (i37 == 0 || vVar.h()) {
                    boolean zH6 = vVar.h();
                    boolean zH7 = vVar.h();
                    z13 = zH6;
                    z12 = zH7;
                    if (zH6 || zH7) {
                        zH = vVar.h();
                        if (zH) {
                            vVar.t(19);
                        }
                        vVar.t(8);
                        if (zH) {
                            vVar.t(4);
                        }
                        vVar.t(15);
                        i21 = zH6;
                        i19 = zH7;
                    }
                    i22 = 0;
                    while (i22 <= i28) {
                        zH2 = vVar.h();
                        if (!zH2) {
                            zH2 = vVar.h();
                        }
                        if (zH2) {
                            vVar.m();
                            zH3 = false;
                        } else {
                            zH3 = vVar.h();
                        }
                        if (zH3) {
                            iM = 0;
                        } else {
                            iM = vVar.m();
                        }
                        int[][] iArr7 = iArr4;
                        i23 = i21 + i19;
                        int[] iArr8 = iArr6;
                        i24 = 0;
                        while (i24 < i23) {
                            int i38 = i23;
                            for (i25 = 0; i25 <= iM; i25++) {
                                vVar.m();
                                vVar.m();
                                if (zH) {
                                    vVar.m();
                                    vVar.m();
                                }
                                vVar.s();
                            }
                            i24++;
                            i23 = i38;
                        }
                        i22++;
                        i37 = i37;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i37++;
                } else {
                    z13 = false;
                    z12 = false;
                }
                zH = false;
                i21 = z13;
                i19 = z12;
                i22 = 0;
                while (i22 <= i28) {
                    zH2 = vVar.h();
                    if (!zH2) {
                        zH2 = vVar.h();
                    }
                    if (zH2) {
                        vVar.m();
                        zH3 = false;
                    } else {
                        zH3 = vVar.h();
                    }
                    if (zH3) {
                        iM = vVar.m();
                    } else {
                        iM = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i23 = i21 + i19;
                    int[] iArr10 = iArr6;
                    i24 = 0;
                    while (i24 < i23) {
                        int i39 = i23;
                        while (i25 <= iM) {
                            vVar.m();
                            vVar.m();
                            if (zH) {
                                vVar.m();
                                vVar.m();
                            }
                            vVar.s();
                        }
                        i24++;
                        i23 = i39;
                    }
                    i22++;
                    i37 = i37;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i37++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!vVar.h()) {
            return new ob.i(null, cVar, null, null);
        }
        int i40 = vVar.f4035e;
        if (i40 > 0) {
            vVar.t(8 - i40);
        }
        k kVarF2 = f(vVar, false, i28, kVarF);
        boolean zH8 = vVar.h();
        boolean[] zArr3 = new boolean[16];
        int i41 = 0;
        for (int i42 = 0; i42 < 16; i42++) {
            boolean zH9 = vVar.h();
            zArr3[i42] = zH9;
            if (zH9) {
                i41++;
            }
        }
        if (i41 == 0 || !zArr3[1]) {
            return new ob.i(null, cVar, null, null);
        }
        int[] iArr13 = new int[i41];
        for (int i43 = 0; i43 < i41 - (zH8 ? 1 : 0); i43++) {
            iArr13[i43] = vVar.i(3);
        }
        int[] iArr14 = new int[i41 + 1];
        if (zH8) {
            int i44 = 1;
            while (i44 < i41) {
                int[] iArr15 = iArr14;
                for (int i45 = 0; i45 < i44; i45++) {
                    iArr15[i44] = iArr13[i45] + 1 + iArr15[i44];
                }
                i44++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i41] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i27, i41);
        int[] iArr17 = new int[i27];
        iArr17[0] = 0;
        boolean zH10 = vVar.h();
        int i46 = 1;
        while (i46 < i27) {
            if (zH10) {
                i18 = i46;
                iArr17[i18] = vVar.i(i31);
            } else {
                i18 = i46;
                iArr17[i18] = i18;
            }
            if (zH8) {
                int i47 = 0;
                while (i47 < i41) {
                    int i48 = i47 + 1;
                    iArr16[i18][i47] = (iArr17[i18] & ((1 << iArr[i48]) - 1)) >> iArr[i47];
                    i47 = i48;
                }
            } else {
                int i49 = 0;
                while (i49 < i41) {
                    int i50 = i49;
                    iArr16[i18][i50] = vVar.i(iArr13[i49] + 1);
                    i49 = i50 + 1;
                }
            }
            i46 = i18 + 1;
            i31 = 6;
        }
        int[] iArr18 = new int[i32];
        int i51 = 1;
        int i52 = 0;
        while (i52 < i27) {
            iArr18[iArr17[i52]] = -1;
            int[] iArr19 = iArr18;
            int i53 = 0;
            int i54 = 0;
            while (i53 < 16) {
                if (zArr3[i53]) {
                    if (i53 == i33) {
                        iArr19[iArr17[i52]] = iArr16[i52][i54];
                    }
                    i54++;
                }
                i53++;
                i33 = 1;
            }
            if (i52 > 0) {
                int i55 = 0;
                while (true) {
                    if (i55 >= i52) {
                        z11 = true;
                        break;
                    }
                    int i56 = i55;
                    if (iArr19[iArr17[i52]] == iArr19[iArr17[i55]]) {
                        z11 = false;
                        break;
                    }
                    i55 = i56 + 1;
                }
                if (z11) {
                    i51++;
                }
            }
            i52++;
            iArr18 = iArr19;
            i33 = 1;
        }
        int[] iArr20 = iArr18;
        int i57 = vVar.i(4);
        if (i51 < 2 || i57 == 0) {
            return new ob.i(null, cVar, null, null);
        }
        int[] iArr21 = new int[i51];
        for (int i58 = 0; i58 < i51; i58++) {
            iArr21[i58] = vVar.i(i57);
        }
        int[] iArr22 = new int[i32];
        for (int i59 = 0; i59 < i27; i59++) {
            iArr22[Math.min(iArr17[i59], i30)] = i59;
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i60 = 0;
        while (i60 <= i30) {
            int[] iArr23 = iArr22;
            int i61 = i51;
            int iMin = Math.min(iArr20[i60], i61 - 1);
            builder.h(new i(iArr23[i60], iMin >= 0 ? iArr21[iMin] : -1));
            i60++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i51 = i61;
        }
        int[] iArr24 = iArr17;
        ImmutableList immutableListJ = builder.j();
        if (((i) immutableListJ.get(0)).f6659b == -1) {
            return new ob.i(null, cVar, null, null);
        }
        int i62 = 1;
        while (true) {
            if (i62 > i30) {
                i62 = -1;
                break;
            }
            if (((i) immutableListJ.get(i62)).f6659b != -1) {
                break;
            }
            i62++;
        }
        if (i62 == -1) {
            return new ob.i(null, cVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i27, i27);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i27, i27);
        for (int i63 = 1; i63 < i27; i63++) {
            for (int i64 = 0; i64 < i63; i64++) {
                boolean[] zArr6 = zArr4[i63];
                boolean[] zArr7 = zArr5[i63];
                boolean zH11 = vVar.h();
                zArr7[i64] = zH11;
                zArr6[i64] = zH11;
            }
        }
        for (int i65 = 1; i65 < i27; i65++) {
            int i66 = 0;
            while (i66 < i26) {
                boolean[][] zArr8 = zArr4;
                for (int i67 = 0; i67 < i65; i67++) {
                    boolean[] zArr9 = zArr5[i65];
                    if (zArr9[i67] && zArr5[i67][i66]) {
                        zArr9[i66] = true;
                        break;
                    }
                }
                i66++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i32];
        for (int i68 = 0; i68 < i27; i68++) {
            int i69 = 0;
            for (int i70 = 0; i70 < i68; i70++) {
                i69 += zArr10[i68][i70] ? 1 : 0;
            }
            iArr25[iArr24[i68]] = i69;
        }
        int i71 = 0;
        for (int i72 = 0; i72 < i27; i72++) {
            if (iArr25[iArr24[i72]] == 0) {
                i71++;
            }
        }
        if (i71 > 1) {
            return new ob.i(null, cVar, null, null);
        }
        int[] iArr26 = new int[i27];
        int[] iArr27 = new int[iM2];
        if (vVar.h()) {
            int i73 = 0;
            while (i73 < i27) {
                int i74 = i73;
                iArr26[i74] = vVar.i(3);
                i73 = i74 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i27, i28);
        }
        int i75 = 0;
        while (i75 < iM2) {
            int i76 = i75;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i77 = 0; i77 < iArr5[i76]; i77++) {
                iMax = Math.max(iMax, iArr28[((i) immutableListJ.get(iArr11[i76][i77])).f6658a]);
            }
            iArr27[i76] = iMax + 1;
            i75 = i76 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (vVar.h()) {
            int i78 = 0;
            while (i78 < i26) {
                int i79 = i78 + 1;
                int i80 = i79;
                while (i80 < i27) {
                    if (zArr10[i80][i78]) {
                        vVar.t(3);
                    }
                    i80++;
                    i26 = i26;
                }
                i78 = i79;
            }
        }
        vVar.s();
        int iM4 = vVar.m() + 1;
        ImmutableList.Builder builder2 = new ImmutableList.Builder();
        builder2.h(kVarF);
        if (iM4 > 1) {
            builder2.h(kVarF2);
            for (int i81 = 2; i81 < iM4; i81++) {
                kVarF2 = f(vVar, vVar.h(), i28, kVarF2);
                builder2.h(kVarF2);
            }
        }
        ImmutableList immutableListJ2 = builder2.j();
        int iM5 = vVar.m() + iM2;
        if (iM5 > iM2) {
            return new ob.i(null, cVar, null, null);
        }
        int i82 = vVar.i(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM5, i32);
        int[] iArr29 = new int[iM5];
        int i83 = 0;
        int[] iArr30 = new int[iM5];
        int i84 = 0;
        while (i84 < iM2) {
            iArr29[i84] = i83;
            iArr30[i84] = iArr12[i84];
            if (i82 == 0) {
                i17 = i84;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i17], i83, iArr5[i17], true);
                iArr2[i17] = iArr5[i17];
            } else {
                i17 = i84;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (i82 == 1) {
                    int i85 = iArr12[i17];
                    for (int i86 = 0; i86 < iArr5[i17]; i86++) {
                        zArr2[i17][i86] = iArr11[i17][i86] == i85;
                    }
                    iArr2[i17] = 1;
                } else {
                    i83 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i84 = i17 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i83 = 0;
            i84 = i17 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i32];
        int i87 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i32;
        iArr34[i83] = iM5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i88 = 1;
        int i89 = 0;
        while (i88 < iM5) {
            if (i82 == i87) {
                for (int i90 = 0; i90 < iArr5[i88]; i90++) {
                    zArr14[i88][i90] = vVar.h();
                    int i91 = iArr31[i88];
                    boolean z17 = zArr14[i88][i90];
                    iArr31[i88] = i91 + (z17 ? 1 : 0);
                    if (z17) {
                        iArr30[i88] = iArr11[i88][i90];
                    }
                }
            }
            if (i89 == 0) {
                i16 = 0;
                if (iArr11[i88][0] == 0 && zArr14[i88][0]) {
                    for (int i92 = 1; i92 < iArr5[i88]; i92++) {
                        if (iArr11[i88][i92] == i62 && zArr14[i88][i62]) {
                            i89 = i88;
                        }
                    }
                }
            } else {
                i16 = 0;
            }
            int i93 = i16;
            while (i93 < iArr5[i88]) {
                if (iM4 > 1) {
                    zArr15[i88][i93] = zArr14[i88][i93];
                    immutableList = immutableListJ2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iC = DoubleMath.c(iM4);
                    if (!zArr[i88][i93]) {
                        int i94 = ((i) immutableListJ.get(iArr11[i88][i93])).f6658a;
                        int i95 = i16;
                        while (i95 < i93) {
                            int i96 = i95;
                            if (zArr12[i94][((i) immutableListJ.get(iArr11[i88][i96])).f6658a]) {
                                zArr[i88][i93] = true;
                                break;
                            }
                            i95 = i96 + 1;
                        }
                    }
                    if (zArr[i88][i93]) {
                        if (i89 <= 0 || i88 != i89) {
                            vVar.t(iC);
                        } else {
                            iArr33[i93] = vVar.i(iC);
                        }
                    }
                } else {
                    immutableList = immutableListJ2;
                    zArr = zArr15;
                }
                i93++;
                immutableListJ2 = immutableList;
                zArr15 = zArr;
            }
            ImmutableList immutableList2 = immutableListJ2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i88] == 1 && iArr25[iArr30[i88]] > 0) {
                vVar.s();
            }
            i88++;
            immutableListJ2 = immutableList2;
            zArr15 = zArr16;
            i87 = 2;
        }
        ImmutableList immutableList3 = immutableListJ2;
        boolean[][] zArr17 = zArr15;
        if (i89 == 0) {
            return new ob.i(null, cVar, null, null);
        }
        int iM6 = vVar.m();
        int i97 = iM6 + 1;
        ImmutableList.Builder builderL = ImmutableList.l(i97);
        int[] iArr35 = new int[i27];
        for (int i98 = 0; i98 < i97; i98++) {
            int i99 = vVar.i(16);
            int i100 = vVar.i(16);
            if (vVar.h()) {
                i13 = vVar.i(2);
                if (i13 == 3) {
                    vVar.s();
                }
                i14 = vVar.i(4);
                i15 = vVar.i(4);
            } else {
                i13 = 0;
                i14 = 0;
                i15 = 0;
            }
            if (vVar.h()) {
                int iM7 = vVar.m();
                int iM8 = vVar.m();
                int iM9 = vVar.m();
                int iM10 = vVar.m();
                i99 -= (iM7 + iM8) * ((i13 == 1 || i13 == 2) ? 2 : 1);
                i100 -= (iM9 + iM10) * (i13 == 1 ? 2 : 1);
            }
            builderL.h(new l(i13, i14, i15, i99, i100));
        }
        if (i97 <= 1 || !vVar.h()) {
            for (int i101 = 1; i101 < i27; i101++) {
                iArr35[i101] = Math.min(i101, iM6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iC2 = DoubleMath.c(i97);
            for (int i102 = 1; i102 < i27; i102++) {
                iArr35[i102] = vVar.i(iC2);
            }
        }
        ob.e eVar = new ob.e(builderL.j(), iArr35);
        vVar.t(2);
        for (int i103 = 1; i103 < i27; i103++) {
            if (iArr25[iArr24[i103]] == 0) {
                vVar.s();
            }
        }
        for (int i104 = 1; i104 < iM5; i104++) {
            boolean zH12 = vVar.h();
            int i105 = 0;
            while (i105 < iArr32[i104]) {
                if ((i105 <= 0 || !zH12) ? i105 == 0 : vVar.h()) {
                    for (int i106 = 0; i106 < iArr5[i104]; i106++) {
                        if (zArr17[i104][i106]) {
                            vVar.m();
                        }
                    }
                    vVar.m();
                    vVar.m();
                }
                i105++;
            }
        }
        int iM11 = vVar.m() + 2;
        if (vVar.h()) {
            vVar.t(iM11);
        } else {
            for (int i107 = 1; i107 < i27; i107++) {
                for (int i108 = 0; i108 < i107; i108++) {
                    if (zArr10[i107][i108]) {
                        vVar.t(iM11);
                    }
                }
            }
        }
        int iM12 = vVar.m();
        for (int i109 = 1; i109 <= iM12; i109++) {
            vVar.t(8);
        }
        if (vVar.h()) {
            int i110 = vVar.f4035e;
            if (i110 > 0) {
                vVar.t(8 - i110);
            }
            if (!vVar.h() ? vVar.h() : true) {
                vVar.s();
            }
            boolean zH13 = vVar.h();
            boolean zH14 = vVar.h();
            if (zH13 || zH14) {
                for (int i111 = 0; i111 < iM2; i111++) {
                    for (int i112 = 0; i112 < iArr32[i111]; i112++) {
                        boolean zH15 = zH13 ? vVar.h() : false;
                        boolean zH16 = zH14 ? vVar.h() : false;
                        if (zH15) {
                            vVar.t(32);
                        }
                        if (zH16) {
                            vVar.t(18);
                        }
                    }
                }
            }
            boolean zH17 = vVar.h();
            int i113 = zH17 ? vVar.i(4) + 1 : i27;
            ImmutableList.Builder builderL2 = ImmutableList.l(i113);
            int[] iArr36 = new int[i27];
            for (int i114 = 0; i114 < i113; i114++) {
                vVar.t(3);
                int i115 = vVar.h() ? 1 : 2;
                int iF = y6.g.f(vVar.i(8));
                int iG = y6.g.g(vVar.i(8));
                vVar.t(8);
                builderL2.h(new n(iF, i115, iG));
            }
            if (zH17 && i113 > 1) {
                for (int i116 = 0; i116 < i27; i116++) {
                    iArr36[i116] = vVar.i(4);
                }
            }
            lVar = new ob.l(builderL2.j(), iArr36);
        } else {
            lVar = null;
        }
        return new ob.i(immutableListJ, new ob.c(immutableList3, iArr33), eVar, lVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01af  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:121:0x0208  */
    /* JADX WARN: Code duplicated, block: B:124:0x0216  */
    /* JADX WARN: Code duplicated, block: B:127:0x0221  */
    /* JADX WARN: Code duplicated, block: B:130:0x022a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0231  */
    /* JADX WARN: Code duplicated, block: B:136:0x023d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0263  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    public static p j(byte[] bArr, int i11, int i12) {
        int iM;
        int iM2;
        int i13;
        boolean z11;
        int i14;
        int iM3;
        boolean z12;
        boolean zH;
        int i15;
        int i16;
        int i17;
        int iM4;
        int i18;
        float f5;
        int i19;
        int i21;
        int i22;
        float f11;
        int i23;
        int i24;
        int i25;
        boolean zH2;
        boolean zH3;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        v vVar = new v(bArr, i11 + 1, i12);
        int i31 = vVar.i(8);
        int i32 = vVar.i(8);
        int i33 = vVar.i(8);
        int iM5 = vVar.m();
        if (i31 == 100 || i31 == 110 || i31 == 122 || i31 == 244 || i31 == 44 || i31 == 83 || i31 == 86 || i31 == 118 || i31 == 128 || i31 == 138) {
            iM = vVar.m();
            boolean zH4 = iM == 3 ? vVar.h() : false;
            int iM6 = vVar.m();
            iM2 = vVar.m();
            vVar.s();
            if (vVar.h()) {
                int i34 = iM != 3 ? 8 : 12;
                i13 = 16;
                int i35 = 0;
                while (i35 < i34) {
                    if (vVar.h()) {
                        int i36 = i35 < 6 ? 16 : 64;
                        int iN = 8;
                        int i37 = 8;
                        for (int i38 = 0; i38 < i36; i38++) {
                            if (iN != 0) {
                                iN = ((vVar.n() + i37) + 256) % 256;
                            }
                            if (iN != 0) {
                                i37 = iN;
                            }
                        }
                    }
                    i35++;
                }
            } else {
                i13 = 16;
            }
            z11 = zH4;
            i14 = iM6;
        } else {
            iM = 1;
            i13 = 16;
            i14 = 0;
            z11 = false;
            iM2 = 0;
        }
        int iM7 = vVar.m() + 4;
        int iM8 = vVar.m();
        if (iM8 != 0) {
            if (iM8 == 1) {
                boolean zH5 = vVar.h();
                vVar.n();
                vVar.n();
                i31 = i31;
                long jM = vVar.m();
                iM8 = iM8;
                for (int i39 = 0; i39 < jM; i39++) {
                    vVar.m();
                }
                iM2 = iM2;
                z12 = zH5;
                iM3 = 0;
            } else {
                iM3 = 0;
            }
            vVar.m();
            vVar.s();
            int iM9 = vVar.m() + 1;
            int iM10 = vVar.m() + 1;
            zH = vVar.h();
            i15 = 2 - (zH ? 1 : 0);
            int i40 = iM10 * i15;
            if (!zH) {
                vVar.s();
            }
            vVar.s();
            i16 = iM9 * 16;
            i17 = i40 * 16;
            if (vVar.h()) {
                int iM11 = vVar.m();
                int iM12 = vVar.m();
                int iM13 = vVar.m();
                int iM14 = vVar.m();
                if (iM == 0) {
                    i29 = 1;
                } else {
                    if (iM == 3) {
                        i29 = 1;
                    } else {
                        i29 = 2;
                    }
                    if (iM == 1) {
                        i30 = 2;
                    } else {
                        i30 = 1;
                    }
                    i15 *= i30;
                }
                i16 -= (iM11 + iM12) * i29;
                i17 -= (iM13 + iM14) * i15;
            }
            int i41 = i17;
            int i42 = i16;
            int i43 = i31;
            iM4 = ((i43 != 44 || i43 == 86 || i43 == 100 || i43 == 110 || i43 == 122 || i43 == 244) && (i32 & 16) != 0) ? 0 : i13;
            i18 = -1;
            f5 = 1.0f;
            if (vVar.h()) {
                if (vVar.h()) {
                    i26 = vVar.i(8);
                    if (i26 == 255) {
                        int i44 = i13;
                        i27 = vVar.i(i44);
                        i28 = vVar.i(i44);
                        if (i27 != 0 && i28 != 0) {
                            f5 = i27 / i28;
                        }
                    } else if (i26 < 17) {
                        f5 = f6710b[i26];
                    } else {
                        defpackage.e.y(i26, "Unexpected aspect_ratio_idc value: ");
                    }
                }
                if (vVar.h()) {
                    vVar.s();
                }
                if (vVar.h()) {
                    vVar.t(3);
                    if (vVar.h()) {
                        i24 = 1;
                    } else {
                        i24 = 2;
                    }
                    if (vVar.h()) {
                        int i45 = vVar.i(8);
                        int i46 = vVar.i(8);
                        vVar.t(8);
                        int iF = y6.g.f(i45);
                        int iG = y6.g.g(i46);
                        i18 = iF;
                        i25 = iG;
                    } else {
                        i25 = -1;
                    }
                } else {
                    i24 = -1;
                    i25 = -1;
                }
                if (vVar.h()) {
                    vVar.m();
                    vVar.m();
                }
                int i47 = i24;
                if (vVar.h()) {
                    vVar.t(65);
                }
                zH2 = vVar.h();
                if (zH2) {
                    k(vVar);
                }
                zH3 = vVar.h();
                if (zH3) {
                    k(vVar);
                }
                if (zH2 || zH3) {
                    vVar.s();
                }
                vVar.s();
                if (vVar.h()) {
                    vVar.s();
                    vVar.m();
                    vVar.m();
                    vVar.m();
                    vVar.m();
                    iM4 = vVar.m();
                    vVar.m();
                }
                f11 = f5;
                i23 = i18;
                i21 = i47;
                i22 = i25;
                i19 = iM4;
            } else {
                i19 = iM4;
                i21 = -1;
                i22 = -1;
                f11 = 1.0f;
                i23 = -1;
            }
            return new p(i43, i32, i33, iM5, i42, i41, f11, i14, iM2, z11, zH, iM7, iM8, iM3, z12, i23, i21, i22, i19);
        }
        iM3 = vVar.m() + 4;
        z12 = false;
        vVar.m();
        vVar.s();
        int iM15 = vVar.m() + 1;
        int iM16 = vVar.m() + 1;
        zH = vVar.h();
        i15 = 2 - (zH ? 1 : 0);
        int i48 = iM16 * i15;
        if (!zH) {
            vVar.s();
        }
        vVar.s();
        i16 = iM15 * 16;
        i17 = i48 * 16;
        if (vVar.h()) {
            int iM17 = vVar.m();
            int iM18 = vVar.m();
            int iM19 = vVar.m();
            int iM110 = vVar.m();
            if (iM == 0) {
                i29 = 1;
            } else {
                if (iM == 3) {
                    i29 = 1;
                } else {
                    i29 = 2;
                }
                if (iM == 1) {
                    i30 = 2;
                } else {
                    i30 = 1;
                }
                i15 *= i30;
            }
            i16 -= (iM17 + iM18) * i29;
            i17 -= (iM19 + iM110) * i15;
        }
        int i49 = i17;
        int i410 = i16;
        int i411 = i31;
        if (i411 != 44) {
        }
        i18 = -1;
        f5 = 1.0f;
        if (vVar.h()) {
            if (vVar.h()) {
                i26 = vVar.i(8);
                if (i26 == 255) {
                    int i412 = i13;
                    i27 = vVar.i(i412);
                    i28 = vVar.i(i412);
                    if (i27 != 0) {
                        f5 = i27 / i28;
                    }
                } else if (i26 < 17) {
                    f5 = f6710b[i26];
                } else {
                    defpackage.e.y(i26, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (vVar.h()) {
                vVar.s();
            }
            if (vVar.h()) {
                vVar.t(3);
                if (vVar.h()) {
                    i24 = 1;
                } else {
                    i24 = 2;
                }
                if (vVar.h()) {
                    int i413 = vVar.i(8);
                    int i414 = vVar.i(8);
                    vVar.t(8);
                    int iF2 = y6.g.f(i413);
                    int iG2 = y6.g.g(i414);
                    i18 = iF2;
                    i25 = iG2;
                } else {
                    i25 = -1;
                }
            } else {
                i24 = -1;
                i25 = -1;
            }
            if (vVar.h()) {
                vVar.m();
                vVar.m();
            }
            int i415 = i24;
            if (vVar.h()) {
                vVar.t(65);
            }
            zH2 = vVar.h();
            if (zH2) {
                k(vVar);
            }
            zH3 = vVar.h();
            if (zH3) {
                k(vVar);
            }
            if (zH2) {
                vVar.s();
            } else {
                vVar.s();
            }
            vVar.s();
            if (vVar.h()) {
                vVar.s();
                vVar.m();
                vVar.m();
                vVar.m();
                vVar.m();
                iM4 = vVar.m();
                vVar.m();
            }
            f11 = f5;
            i23 = i18;
            i21 = i415;
            i22 = i25;
            i19 = iM4;
        } else {
            i19 = iM4;
            i21 = -1;
            i22 = -1;
            f11 = 1.0f;
            i23 = -1;
        }
        return new p(i411, i32, i33, iM5, i410, i49, f11, i14, iM2, z11, zH, iM7, iM8, iM3, z12, i23, i21, i22, i19);
    }

    public static void k(v vVar) {
        int iM = vVar.m() + 1;
        vVar.t(8);
        for (int i11 = 0; i11 < iM; i11++) {
            vVar.m();
            vVar.m();
            vVar.s();
        }
        vVar.t(20);
    }

    public static int l(byte[] bArr, int i11) {
        int i12;
        synchronized (f6711c) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < i11) {
                while (true) {
                    if (i13 >= i11 - 2) {
                        i13 = i11;
                        break;
                    }
                    try {
                        if (bArr[i13] == 0 && bArr[i13 + 1] == 0 && bArr[i13 + 2] == 3) {
                            break;
                        }
                        i13++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i13 < i11) {
                    int[] iArr = f6712d;
                    if (iArr.length <= i14) {
                        f6712d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f6712d[i14] = i13;
                    i13 += 3;
                    i14++;
                }
            }
            i12 = i11 - i14;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = f6712d[i17] - i16;
                System.arraycopy(bArr, i16, bArr, i15, i18);
                int i19 = i15 + i18;
                int i21 = i19 + 1;
                bArr[i19] = 0;
                i15 = i19 + 2;
                bArr[i21] = 0;
                i16 += i18 + 3;
            }
            System.arraycopy(bArr, i16, bArr, i15, i12 - i15);
        }
        return i12;
    }

    public static boolean c(byte[] bArr, int i11, y6.p pVar) {
        int i12;
        if (Objects.equals(pVar.f57291n, "video/avc")) {
            byte b3 = bArr[4];
            if (((b3 & 96) >> 5) == 0 && ((i12 = b3 & 31) == 1 || i12 == 9 || i12 == 14)) {
                return false;
            }
        } else if (Objects.equals(pVar.f57291n, txBUGYhC.JutLISKHufKAU)) {
            j jVarE = e(new v(bArr, 4, i11 + 4));
            int i13 = jVarE.f6660a;
            if (i13 == 35) {
                return false;
            }
            if (i13 <= 14 && i13 % 2 == 0 && jVarE.f6662c == pVar.E - 1) {
                return false;
            }
        }
        return true;
    }
}
