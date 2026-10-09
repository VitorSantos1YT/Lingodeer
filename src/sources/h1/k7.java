package h1;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1.e f30545a = new g1.e(0.16f, 0.1f, 0.08f, 0.1f);

    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0111  */
    /* JADX WARN: Code duplicated, block: B:85:0x0115  */
    /* JADX WARN: Code duplicated, block: B:87:0x0118  */
    /* JADX WARN: Code duplicated, block: B:92:0x0173  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void a(fz.a aVar, t1.d dVar, z1.r rVar, fz.e eVar, fz.e eVar2, fz.e eVar3, g2.w0 w0Var, long j11, long j12, long j13, long j14, float f5, z3.r rVar2, l1.n nVar, int i11, int i12) {
        fz.a aVar2;
        int i13;
        z1.r rVar3;
        int i14;
        fz.e eVar4;
        int i15;
        int i16;
        int i17;
        fz.e eVar5;
        int i18;
        z1.r rVar4;
        fz.e eVar6;
        z1.r rVar5;
        fz.e eVar7;
        z3.r rVar6;
        int i19;
        float f11;
        g2.w0 w0Var2;
        long j15;
        long j16;
        long j17;
        long j18;
        l1.s sVar;
        l1.x1 x1VarT;
        int i21;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-2081346864);
        if ((i11 & 6) == 0) {
            aVar2 = aVar;
            i13 = (sVar2.h(aVar2) ? 4 : 2) | i11;
        } else {
            aVar2 = aVar;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.h(dVar) ? 32 : 16;
        }
        int i22 = i12 & 4;
        if (i22 == 0) {
            if ((i11 & 384) == 0) {
                rVar3 = rVar;
                i13 |= sVar2.f(rVar3) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    eVar4 = eVar;
                    if (sVar2.h(eVar4)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i13 | 24576;
                i17 = i12 & 32;
                if (i17 != 0) {
                    if ((196608 & i11) == 0) {
                        eVar5 = eVar2;
                        if (sVar2.h(eVar5)) {
                            i18 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i18 = 65536;
                        }
                        i16 |= i18;
                    }
                    if ((1572864 & i11) != 0) {
                        if (sVar2.h(eVar3)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i16 |= i21;
                    }
                    if ((12582912 & i11) == 0) {
                        i16 |= 4194304;
                    }
                    if ((100663296 & i11) == 0) {
                        i16 |= 33554432;
                    }
                    if ((805306368 & i11) == 0) {
                        i16 |= 268435456;
                    }
                    if ((306783379 & i16) == 306783378 || !sVar2.F()) {
                        sVar2.Y();
                        if ((i11 & 1) != 0 || sVar2.C()) {
                            if (i22 != 0) {
                                rVar4 = z1.o.f58481a;
                            } else {
                                rVar4 = rVar3;
                            }
                            if (i14 != 0) {
                                eVar4 = null;
                            }
                            if (i17 != 0) {
                                eVar5 = null;
                            }
                            float f12 = a.f29950a;
                            g2.w0 w0VarA = y7.a(k1.e.f37497d, sVar2);
                            long jD = v1.d(k1.e.f37496c, sVar2);
                            long jD2 = v1.d(k1.e.f37502i, sVar2);
                            int i23 = i16 & (-2143289345);
                            long jD3 = v1.d(k1.e.f37498e, sVar2);
                            long jD4 = v1.d(k1.e.f37500g, sVar2);
                            float f13 = a.f29950a;
                            z1.r rVar7 = rVar4;
                            eVar6 = eVar5;
                            rVar5 = rVar7;
                            eVar7 = eVar4;
                            rVar6 = new z3.r(7);
                            i19 = i23;
                            f11 = f13;
                            w0Var2 = w0VarA;
                            j15 = jD3;
                            j16 = jD;
                            j17 = jD2;
                            j18 = jD4;
                        } else {
                            sVar2.W();
                            w0Var2 = w0Var;
                            j17 = j12;
                            j15 = j13;
                            j18 = j14;
                            f11 = f5;
                            rVar6 = rVar2;
                            i19 = i16 & (-2143289345);
                            eVar7 = eVar4;
                            j16 = j11;
                            eVar6 = eVar5;
                            rVar5 = rVar3;
                        }
                        sVar2.q();
                        sVar = sVar2;
                        k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
                    } else {
                        sVar2.W();
                        w0Var2 = w0Var;
                        j17 = j12;
                        j15 = j13;
                        j18 = j14;
                        f11 = f5;
                        rVar6 = rVar2;
                        sVar = sVar2;
                        eVar6 = eVar5;
                        rVar5 = rVar3;
                        eVar7 = eVar4;
                        j16 = j11;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new i(aVar, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, i11, i12, 1);
                    }
                }
                i16 = 221184 | i13;
                eVar5 = eVar2;
                if ((1572864 & i11) != 0) {
                    if (sVar2.h(eVar3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i16 |= i21;
                }
                if ((12582912 & i11) == 0) {
                    i16 |= 4194304;
                }
                if ((100663296 & i11) == 0) {
                    i16 |= 33554432;
                }
                if ((805306368 & i11) == 0) {
                    i16 |= 268435456;
                }
                if ((306783379 & i16) == 306783378) {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar3;
                        }
                        if (i14 != 0) {
                            eVar4 = null;
                        }
                        if (i17 != 0) {
                            eVar5 = null;
                        }
                        float f14 = a.f29950a;
                        g2.w0 w0VarA2 = y7.a(k1.e.f37497d, sVar2);
                        long jD5 = v1.d(k1.e.f37496c, sVar2);
                        long jD6 = v1.d(k1.e.f37502i, sVar2);
                        int i24 = i16 & (-2143289345);
                        long jD7 = v1.d(k1.e.f37498e, sVar2);
                        long jD8 = v1.d(k1.e.f37500g, sVar2);
                        float f15 = a.f29950a;
                        z1.r rVar8 = rVar4;
                        eVar6 = eVar5;
                        rVar5 = rVar8;
                        eVar7 = eVar4;
                        rVar6 = new z3.r(7);
                        i19 = i24;
                        f11 = f15;
                        w0Var2 = w0VarA2;
                        j15 = jD7;
                        j16 = jD5;
                        j17 = jD6;
                        j18 = jD8;
                    } else {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar3;
                        }
                        if (i14 != 0) {
                            eVar4 = null;
                        }
                        if (i17 != 0) {
                            eVar5 = null;
                        }
                        float f16 = a.f29950a;
                        g2.w0 w0VarA3 = y7.a(k1.e.f37497d, sVar2);
                        long jD9 = v1.d(k1.e.f37496c, sVar2);
                        long jD10 = v1.d(k1.e.f37502i, sVar2);
                        int i25 = i16 & (-2143289345);
                        long jD11 = v1.d(k1.e.f37498e, sVar2);
                        long jD12 = v1.d(k1.e.f37500g, sVar2);
                        float f17 = a.f29950a;
                        z1.r rVar9 = rVar4;
                        eVar6 = eVar5;
                        rVar5 = rVar9;
                        eVar7 = eVar4;
                        rVar6 = new z3.r(7);
                        i19 = i25;
                        f11 = f17;
                        w0Var2 = w0VarA3;
                        j15 = jD11;
                        j16 = jD9;
                        j17 = jD10;
                        j18 = jD12;
                    }
                    sVar2.q();
                    sVar = sVar2;
                    k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
                } else {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar3;
                        }
                        if (i14 != 0) {
                            eVar4 = null;
                        }
                        if (i17 != 0) {
                            eVar5 = null;
                        }
                        float f18 = a.f29950a;
                        g2.w0 w0VarA4 = y7.a(k1.e.f37497d, sVar2);
                        long jD13 = v1.d(k1.e.f37496c, sVar2);
                        long jD14 = v1.d(k1.e.f37502i, sVar2);
                        int i26 = i16 & (-2143289345);
                        long jD15 = v1.d(k1.e.f37498e, sVar2);
                        long jD16 = v1.d(k1.e.f37500g, sVar2);
                        float f19 = a.f29950a;
                        z1.r rVar10 = rVar4;
                        eVar6 = eVar5;
                        rVar5 = rVar10;
                        eVar7 = eVar4;
                        rVar6 = new z3.r(7);
                        i19 = i26;
                        f11 = f19;
                        w0Var2 = w0VarA4;
                        j15 = jD15;
                        j16 = jD13;
                        j17 = jD14;
                        j18 = jD16;
                    } else {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar3;
                        }
                        if (i14 != 0) {
                            eVar4 = null;
                        }
                        if (i17 != 0) {
                            eVar5 = null;
                        }
                        float f110 = a.f29950a;
                        g2.w0 w0VarA5 = y7.a(k1.e.f37497d, sVar2);
                        long jD17 = v1.d(k1.e.f37496c, sVar2);
                        long jD18 = v1.d(k1.e.f37502i, sVar2);
                        int i27 = i16 & (-2143289345);
                        long jD19 = v1.d(k1.e.f37498e, sVar2);
                        long jD110 = v1.d(k1.e.f37500g, sVar2);
                        float f111 = a.f29950a;
                        z1.r rVar11 = rVar4;
                        eVar6 = eVar5;
                        rVar5 = rVar11;
                        eVar7 = eVar4;
                        rVar6 = new z3.r(7);
                        i19 = i27;
                        f11 = f111;
                        w0Var2 = w0VarA5;
                        j15 = jD19;
                        j16 = jD17;
                        j17 = jD18;
                        j18 = jD110;
                    }
                    sVar2.q();
                    sVar = sVar2;
                    k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new i(aVar, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, i11, i12, 1);
                }
            }
            i13 |= 3072;
            eVar4 = eVar;
            i16 = i13 | 24576;
            i17 = i12 & 32;
            if (i17 != 0) {
                if ((196608 & i11) == 0) {
                    eVar5 = eVar2;
                    if (sVar2.h(eVar5)) {
                        i18 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
                if ((1572864 & i11) != 0) {
                    if (sVar2.h(eVar3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i16 |= i21;
                }
                if ((12582912 & i11) == 0) {
                    i16 |= 4194304;
                }
                if ((100663296 & i11) == 0) {
                    i16 |= 33554432;
                }
                if ((805306368 & i11) == 0) {
                    i16 |= 268435456;
                }
                if ((306783379 & i16) == 306783378) {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar3;
                        }
                        if (i14 != 0) {
                            eVar4 = null;
                        }
                        if (i17 != 0) {
                            eVar5 = null;
                        }
                        float f112 = a.f29950a;
                        g2.w0 w0VarA6 = y7.a(k1.e.f37497d, sVar2);
                        long jD111 = v1.d(k1.e.f37496c, sVar2);
                        long jD112 = v1.d(k1.e.f37502i, sVar2);
                        int i28 = i16 & (-2143289345);
                        long jD113 = v1.d(k1.e.f37498e, sVar2);
                        long jD114 = v1.d(k1.e.f37500g, sVar2);
                        float f113 = a.f29950a;
                        z1.r rVar12 = rVar4;
                        eVar6 = eVar5;
                        rVar5 = rVar12;
                        eVar7 = eVar4;
                        rVar6 = new z3.r(7);
                        i19 = i28;
                        f11 = f113;
                        w0Var2 = w0VarA6;
                        j15 = jD113;
                        j16 = jD111;
                        j17 = jD112;
                        j18 = jD114;
                    } else {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar3;
                        }
                        if (i14 != 0) {
                            eVar4 = null;
                        }
                        if (i17 != 0) {
                            eVar5 = null;
                        }
                        float f114 = a.f29950a;
                        g2.w0 w0VarA7 = y7.a(k1.e.f37497d, sVar2);
                        long jD115 = v1.d(k1.e.f37496c, sVar2);
                        long jD116 = v1.d(k1.e.f37502i, sVar2);
                        int i29 = i16 & (-2143289345);
                        long jD117 = v1.d(k1.e.f37498e, sVar2);
                        long jD118 = v1.d(k1.e.f37500g, sVar2);
                        float f115 = a.f29950a;
                        z1.r rVar13 = rVar4;
                        eVar6 = eVar5;
                        rVar5 = rVar13;
                        eVar7 = eVar4;
                        rVar6 = new z3.r(7);
                        i19 = i29;
                        f11 = f115;
                        w0Var2 = w0VarA7;
                        j15 = jD117;
                        j16 = jD115;
                        j17 = jD116;
                        j18 = jD118;
                    }
                    sVar2.q();
                    sVar = sVar2;
                    k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
                } else {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar3;
                        }
                        if (i14 != 0) {
                            eVar4 = null;
                        }
                        if (i17 != 0) {
                            eVar5 = null;
                        }
                        float f116 = a.f29950a;
                        g2.w0 w0VarA8 = y7.a(k1.e.f37497d, sVar2);
                        long jD119 = v1.d(k1.e.f37496c, sVar2);
                        long jD1110 = v1.d(k1.e.f37502i, sVar2);
                        int i210 = i16 & (-2143289345);
                        long jD1111 = v1.d(k1.e.f37498e, sVar2);
                        long jD1112 = v1.d(k1.e.f37500g, sVar2);
                        float f117 = a.f29950a;
                        z1.r rVar14 = rVar4;
                        eVar6 = eVar5;
                        rVar5 = rVar14;
                        eVar7 = eVar4;
                        rVar6 = new z3.r(7);
                        i19 = i210;
                        f11 = f117;
                        w0Var2 = w0VarA8;
                        j15 = jD1111;
                        j16 = jD119;
                        j17 = jD1110;
                        j18 = jD1112;
                    } else {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar3;
                        }
                        if (i14 != 0) {
                            eVar4 = null;
                        }
                        if (i17 != 0) {
                            eVar5 = null;
                        }
                        float f118 = a.f29950a;
                        g2.w0 w0VarA9 = y7.a(k1.e.f37497d, sVar2);
                        long jD1113 = v1.d(k1.e.f37496c, sVar2);
                        long jD1114 = v1.d(k1.e.f37502i, sVar2);
                        int i211 = i16 & (-2143289345);
                        long jD1115 = v1.d(k1.e.f37498e, sVar2);
                        long jD1116 = v1.d(k1.e.f37500g, sVar2);
                        float f119 = a.f29950a;
                        z1.r rVar15 = rVar4;
                        eVar6 = eVar5;
                        rVar5 = rVar15;
                        eVar7 = eVar4;
                        rVar6 = new z3.r(7);
                        i19 = i211;
                        f11 = f119;
                        w0Var2 = w0VarA9;
                        j15 = jD1115;
                        j16 = jD1113;
                        j17 = jD1114;
                        j18 = jD1116;
                    }
                    sVar2.q();
                    sVar = sVar2;
                    k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new i(aVar, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, i11, i12, 1);
                }
            }
            i16 = 221184 | i13;
            eVar5 = eVar2;
            if ((1572864 & i11) != 0) {
                if (sVar2.h(eVar3)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i16 |= i21;
            }
            if ((12582912 & i11) == 0) {
                i16 |= 4194304;
            }
            if ((100663296 & i11) == 0) {
                i16 |= 33554432;
            }
            if ((805306368 & i11) == 0) {
                i16 |= 268435456;
            }
            if ((306783379 & i16) == 306783378) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar3;
                    }
                    if (i14 != 0) {
                        eVar4 = null;
                    }
                    if (i17 != 0) {
                        eVar5 = null;
                    }
                    float f1110 = a.f29950a;
                    g2.w0 w0VarA10 = y7.a(k1.e.f37497d, sVar2);
                    long jD1117 = v1.d(k1.e.f37496c, sVar2);
                    long jD1118 = v1.d(k1.e.f37502i, sVar2);
                    int i212 = i16 & (-2143289345);
                    long jD1119 = v1.d(k1.e.f37498e, sVar2);
                    long jD11110 = v1.d(k1.e.f37500g, sVar2);
                    float f1111 = a.f29950a;
                    z1.r rVar16 = rVar4;
                    eVar6 = eVar5;
                    rVar5 = rVar16;
                    eVar7 = eVar4;
                    rVar6 = new z3.r(7);
                    i19 = i212;
                    f11 = f1111;
                    w0Var2 = w0VarA10;
                    j15 = jD1119;
                    j16 = jD1117;
                    j17 = jD1118;
                    j18 = jD11110;
                } else {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar3;
                    }
                    if (i14 != 0) {
                        eVar4 = null;
                    }
                    if (i17 != 0) {
                        eVar5 = null;
                    }
                    float f1112 = a.f29950a;
                    g2.w0 w0VarA11 = y7.a(k1.e.f37497d, sVar2);
                    long jD11111 = v1.d(k1.e.f37496c, sVar2);
                    long jD11112 = v1.d(k1.e.f37502i, sVar2);
                    int i213 = i16 & (-2143289345);
                    long jD11113 = v1.d(k1.e.f37498e, sVar2);
                    long jD11114 = v1.d(k1.e.f37500g, sVar2);
                    float f1113 = a.f29950a;
                    z1.r rVar17 = rVar4;
                    eVar6 = eVar5;
                    rVar5 = rVar17;
                    eVar7 = eVar4;
                    rVar6 = new z3.r(7);
                    i19 = i213;
                    f11 = f1113;
                    w0Var2 = w0VarA11;
                    j15 = jD11113;
                    j16 = jD11111;
                    j17 = jD11112;
                    j18 = jD11114;
                }
                sVar2.q();
                sVar = sVar2;
                k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar3;
                    }
                    if (i14 != 0) {
                        eVar4 = null;
                    }
                    if (i17 != 0) {
                        eVar5 = null;
                    }
                    float f1114 = a.f29950a;
                    g2.w0 w0VarA12 = y7.a(k1.e.f37497d, sVar2);
                    long jD11115 = v1.d(k1.e.f37496c, sVar2);
                    long jD11116 = v1.d(k1.e.f37502i, sVar2);
                    int i214 = i16 & (-2143289345);
                    long jD11117 = v1.d(k1.e.f37498e, sVar2);
                    long jD11118 = v1.d(k1.e.f37500g, sVar2);
                    float f1115 = a.f29950a;
                    z1.r rVar18 = rVar4;
                    eVar6 = eVar5;
                    rVar5 = rVar18;
                    eVar7 = eVar4;
                    rVar6 = new z3.r(7);
                    i19 = i214;
                    f11 = f1115;
                    w0Var2 = w0VarA12;
                    j15 = jD11117;
                    j16 = jD11115;
                    j17 = jD11116;
                    j18 = jD11118;
                } else {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar3;
                    }
                    if (i14 != 0) {
                        eVar4 = null;
                    }
                    if (i17 != 0) {
                        eVar5 = null;
                    }
                    float f1116 = a.f29950a;
                    g2.w0 w0VarA13 = y7.a(k1.e.f37497d, sVar2);
                    long jD11119 = v1.d(k1.e.f37496c, sVar2);
                    long jD111110 = v1.d(k1.e.f37502i, sVar2);
                    int i215 = i16 & (-2143289345);
                    long jD111111 = v1.d(k1.e.f37498e, sVar2);
                    long jD111112 = v1.d(k1.e.f37500g, sVar2);
                    float f1117 = a.f29950a;
                    z1.r rVar19 = rVar4;
                    eVar6 = eVar5;
                    rVar5 = rVar19;
                    eVar7 = eVar4;
                    rVar6 = new z3.r(7);
                    i19 = i215;
                    f11 = f1117;
                    w0Var2 = w0VarA13;
                    j15 = jD111111;
                    j16 = jD11119;
                    j17 = jD111110;
                    j18 = jD111112;
                }
                sVar2.q();
                sVar = sVar2;
                k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new i(aVar, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, i11, i12, 1);
            }
        }
        i13 |= 384;
        rVar3 = rVar;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                eVar4 = eVar;
                if (sVar2.h(eVar4)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i13 | 24576;
            i17 = i12 & 32;
            if (i17 != 0) {
                if ((196608 & i11) == 0) {
                    eVar5 = eVar2;
                    if (sVar2.h(eVar5)) {
                        i18 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
                if ((1572864 & i11) != 0) {
                    if (sVar2.h(eVar3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i16 |= i21;
                }
                if ((12582912 & i11) == 0) {
                    i16 |= 4194304;
                }
                if ((100663296 & i11) == 0) {
                    i16 |= 33554432;
                }
                if ((805306368 & i11) == 0) {
                    i16 |= 268435456;
                }
                if ((306783379 & i16) == 306783378) {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar3;
                        }
                        if (i14 != 0) {
                            eVar4 = null;
                        }
                        if (i17 != 0) {
                            eVar5 = null;
                        }
                        float f1118 = a.f29950a;
                        g2.w0 w0VarA14 = y7.a(k1.e.f37497d, sVar2);
                        long jD111113 = v1.d(k1.e.f37496c, sVar2);
                        long jD111114 = v1.d(k1.e.f37502i, sVar2);
                        int i216 = i16 & (-2143289345);
                        long jD111115 = v1.d(k1.e.f37498e, sVar2);
                        long jD111116 = v1.d(k1.e.f37500g, sVar2);
                        float f1119 = a.f29950a;
                        z1.r rVar110 = rVar4;
                        eVar6 = eVar5;
                        rVar5 = rVar110;
                        eVar7 = eVar4;
                        rVar6 = new z3.r(7);
                        i19 = i216;
                        f11 = f1119;
                        w0Var2 = w0VarA14;
                        j15 = jD111115;
                        j16 = jD111113;
                        j17 = jD111114;
                        j18 = jD111116;
                    } else {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar3;
                        }
                        if (i14 != 0) {
                            eVar4 = null;
                        }
                        if (i17 != 0) {
                            eVar5 = null;
                        }
                        float f11110 = a.f29950a;
                        g2.w0 w0VarA15 = y7.a(k1.e.f37497d, sVar2);
                        long jD111117 = v1.d(k1.e.f37496c, sVar2);
                        long jD111118 = v1.d(k1.e.f37502i, sVar2);
                        int i217 = i16 & (-2143289345);
                        long jD111119 = v1.d(k1.e.f37498e, sVar2);
                        long jD1111110 = v1.d(k1.e.f37500g, sVar2);
                        float f11111 = a.f29950a;
                        z1.r rVar111 = rVar4;
                        eVar6 = eVar5;
                        rVar5 = rVar111;
                        eVar7 = eVar4;
                        rVar6 = new z3.r(7);
                        i19 = i217;
                        f11 = f11111;
                        w0Var2 = w0VarA15;
                        j15 = jD111119;
                        j16 = jD111117;
                        j17 = jD111118;
                        j18 = jD1111110;
                    }
                    sVar2.q();
                    sVar = sVar2;
                    k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
                } else {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar3;
                        }
                        if (i14 != 0) {
                            eVar4 = null;
                        }
                        if (i17 != 0) {
                            eVar5 = null;
                        }
                        float f11112 = a.f29950a;
                        g2.w0 w0VarA16 = y7.a(k1.e.f37497d, sVar2);
                        long jD1111111 = v1.d(k1.e.f37496c, sVar2);
                        long jD1111112 = v1.d(k1.e.f37502i, sVar2);
                        int i218 = i16 & (-2143289345);
                        long jD1111113 = v1.d(k1.e.f37498e, sVar2);
                        long jD1111114 = v1.d(k1.e.f37500g, sVar2);
                        float f11113 = a.f29950a;
                        z1.r rVar112 = rVar4;
                        eVar6 = eVar5;
                        rVar5 = rVar112;
                        eVar7 = eVar4;
                        rVar6 = new z3.r(7);
                        i19 = i218;
                        f11 = f11113;
                        w0Var2 = w0VarA16;
                        j15 = jD1111113;
                        j16 = jD1111111;
                        j17 = jD1111112;
                        j18 = jD1111114;
                    } else {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar3;
                        }
                        if (i14 != 0) {
                            eVar4 = null;
                        }
                        if (i17 != 0) {
                            eVar5 = null;
                        }
                        float f11114 = a.f29950a;
                        g2.w0 w0VarA17 = y7.a(k1.e.f37497d, sVar2);
                        long jD1111115 = v1.d(k1.e.f37496c, sVar2);
                        long jD1111116 = v1.d(k1.e.f37502i, sVar2);
                        int i219 = i16 & (-2143289345);
                        long jD1111117 = v1.d(k1.e.f37498e, sVar2);
                        long jD1111118 = v1.d(k1.e.f37500g, sVar2);
                        float f11115 = a.f29950a;
                        z1.r rVar113 = rVar4;
                        eVar6 = eVar5;
                        rVar5 = rVar113;
                        eVar7 = eVar4;
                        rVar6 = new z3.r(7);
                        i19 = i219;
                        f11 = f11115;
                        w0Var2 = w0VarA17;
                        j15 = jD1111117;
                        j16 = jD1111115;
                        j17 = jD1111116;
                        j18 = jD1111118;
                    }
                    sVar2.q();
                    sVar = sVar2;
                    k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new i(aVar, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, i11, i12, 1);
                }
            }
            i16 = 221184 | i13;
            eVar5 = eVar2;
            if ((1572864 & i11) != 0) {
                if (sVar2.h(eVar3)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i16 |= i21;
            }
            if ((12582912 & i11) == 0) {
                i16 |= 4194304;
            }
            if ((100663296 & i11) == 0) {
                i16 |= 33554432;
            }
            if ((805306368 & i11) == 0) {
                i16 |= 268435456;
            }
            if ((306783379 & i16) == 306783378) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar3;
                    }
                    if (i14 != 0) {
                        eVar4 = null;
                    }
                    if (i17 != 0) {
                        eVar5 = null;
                    }
                    float f11116 = a.f29950a;
                    g2.w0 w0VarA18 = y7.a(k1.e.f37497d, sVar2);
                    long jD1111119 = v1.d(k1.e.f37496c, sVar2);
                    long jD11111110 = v1.d(k1.e.f37502i, sVar2);
                    int i2110 = i16 & (-2143289345);
                    long jD11111111 = v1.d(k1.e.f37498e, sVar2);
                    long jD11111112 = v1.d(k1.e.f37500g, sVar2);
                    float f11117 = a.f29950a;
                    z1.r rVar114 = rVar4;
                    eVar6 = eVar5;
                    rVar5 = rVar114;
                    eVar7 = eVar4;
                    rVar6 = new z3.r(7);
                    i19 = i2110;
                    f11 = f11117;
                    w0Var2 = w0VarA18;
                    j15 = jD11111111;
                    j16 = jD1111119;
                    j17 = jD11111110;
                    j18 = jD11111112;
                } else {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar3;
                    }
                    if (i14 != 0) {
                        eVar4 = null;
                    }
                    if (i17 != 0) {
                        eVar5 = null;
                    }
                    float f11118 = a.f29950a;
                    g2.w0 w0VarA19 = y7.a(k1.e.f37497d, sVar2);
                    long jD11111113 = v1.d(k1.e.f37496c, sVar2);
                    long jD11111114 = v1.d(k1.e.f37502i, sVar2);
                    int i2111 = i16 & (-2143289345);
                    long jD11111115 = v1.d(k1.e.f37498e, sVar2);
                    long jD11111116 = v1.d(k1.e.f37500g, sVar2);
                    float f11119 = a.f29950a;
                    z1.r rVar115 = rVar4;
                    eVar6 = eVar5;
                    rVar5 = rVar115;
                    eVar7 = eVar4;
                    rVar6 = new z3.r(7);
                    i19 = i2111;
                    f11 = f11119;
                    w0Var2 = w0VarA19;
                    j15 = jD11111115;
                    j16 = jD11111113;
                    j17 = jD11111114;
                    j18 = jD11111116;
                }
                sVar2.q();
                sVar = sVar2;
                k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar3;
                    }
                    if (i14 != 0) {
                        eVar4 = null;
                    }
                    if (i17 != 0) {
                        eVar5 = null;
                    }
                    float f111110 = a.f29950a;
                    g2.w0 w0VarA110 = y7.a(k1.e.f37497d, sVar2);
                    long jD11111117 = v1.d(k1.e.f37496c, sVar2);
                    long jD11111118 = v1.d(k1.e.f37502i, sVar2);
                    int i2112 = i16 & (-2143289345);
                    long jD11111119 = v1.d(k1.e.f37498e, sVar2);
                    long jD111111110 = v1.d(k1.e.f37500g, sVar2);
                    float f111111 = a.f29950a;
                    z1.r rVar116 = rVar4;
                    eVar6 = eVar5;
                    rVar5 = rVar116;
                    eVar7 = eVar4;
                    rVar6 = new z3.r(7);
                    i19 = i2112;
                    f11 = f111111;
                    w0Var2 = w0VarA110;
                    j15 = jD11111119;
                    j16 = jD11111117;
                    j17 = jD11111118;
                    j18 = jD111111110;
                } else {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar3;
                    }
                    if (i14 != 0) {
                        eVar4 = null;
                    }
                    if (i17 != 0) {
                        eVar5 = null;
                    }
                    float f111112 = a.f29950a;
                    g2.w0 w0VarA111 = y7.a(k1.e.f37497d, sVar2);
                    long jD111111111 = v1.d(k1.e.f37496c, sVar2);
                    long jD111111112 = v1.d(k1.e.f37502i, sVar2);
                    int i2113 = i16 & (-2143289345);
                    long jD111111113 = v1.d(k1.e.f37498e, sVar2);
                    long jD111111114 = v1.d(k1.e.f37500g, sVar2);
                    float f111113 = a.f29950a;
                    z1.r rVar117 = rVar4;
                    eVar6 = eVar5;
                    rVar5 = rVar117;
                    eVar7 = eVar4;
                    rVar6 = new z3.r(7);
                    i19 = i2113;
                    f11 = f111113;
                    w0Var2 = w0VarA111;
                    j15 = jD111111113;
                    j16 = jD111111111;
                    j17 = jD111111112;
                    j18 = jD111111114;
                }
                sVar2.q();
                sVar = sVar2;
                k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new i(aVar, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, i11, i12, 1);
            }
        }
        i13 |= 3072;
        eVar4 = eVar;
        i16 = i13 | 24576;
        i17 = i12 & 32;
        if (i17 != 0) {
            if ((196608 & i11) == 0) {
                eVar5 = eVar2;
                if (sVar2.h(eVar5)) {
                    i18 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i18 = 65536;
                }
                i16 |= i18;
            }
            if ((1572864 & i11) != 0) {
                if (sVar2.h(eVar3)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i16 |= i21;
            }
            if ((12582912 & i11) == 0) {
                i16 |= 4194304;
            }
            if ((100663296 & i11) == 0) {
                i16 |= 33554432;
            }
            if ((805306368 & i11) == 0) {
                i16 |= 268435456;
            }
            if ((306783379 & i16) == 306783378) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar3;
                    }
                    if (i14 != 0) {
                        eVar4 = null;
                    }
                    if (i17 != 0) {
                        eVar5 = null;
                    }
                    float f111114 = a.f29950a;
                    g2.w0 w0VarA112 = y7.a(k1.e.f37497d, sVar2);
                    long jD111111115 = v1.d(k1.e.f37496c, sVar2);
                    long jD111111116 = v1.d(k1.e.f37502i, sVar2);
                    int i2114 = i16 & (-2143289345);
                    long jD111111117 = v1.d(k1.e.f37498e, sVar2);
                    long jD111111118 = v1.d(k1.e.f37500g, sVar2);
                    float f111115 = a.f29950a;
                    z1.r rVar118 = rVar4;
                    eVar6 = eVar5;
                    rVar5 = rVar118;
                    eVar7 = eVar4;
                    rVar6 = new z3.r(7);
                    i19 = i2114;
                    f11 = f111115;
                    w0Var2 = w0VarA112;
                    j15 = jD111111117;
                    j16 = jD111111115;
                    j17 = jD111111116;
                    j18 = jD111111118;
                } else {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar3;
                    }
                    if (i14 != 0) {
                        eVar4 = null;
                    }
                    if (i17 != 0) {
                        eVar5 = null;
                    }
                    float f111116 = a.f29950a;
                    g2.w0 w0VarA113 = y7.a(k1.e.f37497d, sVar2);
                    long jD111111119 = v1.d(k1.e.f37496c, sVar2);
                    long jD1111111110 = v1.d(k1.e.f37502i, sVar2);
                    int i2115 = i16 & (-2143289345);
                    long jD1111111111 = v1.d(k1.e.f37498e, sVar2);
                    long jD1111111112 = v1.d(k1.e.f37500g, sVar2);
                    float f111117 = a.f29950a;
                    z1.r rVar119 = rVar4;
                    eVar6 = eVar5;
                    rVar5 = rVar119;
                    eVar7 = eVar4;
                    rVar6 = new z3.r(7);
                    i19 = i2115;
                    f11 = f111117;
                    w0Var2 = w0VarA113;
                    j15 = jD1111111111;
                    j16 = jD111111119;
                    j17 = jD1111111110;
                    j18 = jD1111111112;
                }
                sVar2.q();
                sVar = sVar2;
                k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar3;
                    }
                    if (i14 != 0) {
                        eVar4 = null;
                    }
                    if (i17 != 0) {
                        eVar5 = null;
                    }
                    float f111118 = a.f29950a;
                    g2.w0 w0VarA114 = y7.a(k1.e.f37497d, sVar2);
                    long jD1111111113 = v1.d(k1.e.f37496c, sVar2);
                    long jD1111111114 = v1.d(k1.e.f37502i, sVar2);
                    int i2116 = i16 & (-2143289345);
                    long jD1111111115 = v1.d(k1.e.f37498e, sVar2);
                    long jD1111111116 = v1.d(k1.e.f37500g, sVar2);
                    float f111119 = a.f29950a;
                    z1.r rVar1110 = rVar4;
                    eVar6 = eVar5;
                    rVar5 = rVar1110;
                    eVar7 = eVar4;
                    rVar6 = new z3.r(7);
                    i19 = i2116;
                    f11 = f111119;
                    w0Var2 = w0VarA114;
                    j15 = jD1111111115;
                    j16 = jD1111111113;
                    j17 = jD1111111114;
                    j18 = jD1111111116;
                } else {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar3;
                    }
                    if (i14 != 0) {
                        eVar4 = null;
                    }
                    if (i17 != 0) {
                        eVar5 = null;
                    }
                    float f1111110 = a.f29950a;
                    g2.w0 w0VarA115 = y7.a(k1.e.f37497d, sVar2);
                    long jD1111111117 = v1.d(k1.e.f37496c, sVar2);
                    long jD1111111118 = v1.d(k1.e.f37502i, sVar2);
                    int i2117 = i16 & (-2143289345);
                    long jD1111111119 = v1.d(k1.e.f37498e, sVar2);
                    long jD11111111110 = v1.d(k1.e.f37500g, sVar2);
                    float f1111111 = a.f29950a;
                    z1.r rVar1111 = rVar4;
                    eVar6 = eVar5;
                    rVar5 = rVar1111;
                    eVar7 = eVar4;
                    rVar6 = new z3.r(7);
                    i19 = i2117;
                    f11 = f1111111;
                    w0Var2 = w0VarA115;
                    j15 = jD1111111119;
                    j16 = jD1111111117;
                    j17 = jD1111111118;
                    j18 = jD11111111110;
                }
                sVar2.q();
                sVar = sVar2;
                k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new i(aVar, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, i11, i12, 1);
            }
        }
        i16 = 221184 | i13;
        eVar5 = eVar2;
        if ((1572864 & i11) != 0) {
            if (sVar2.h(eVar3)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i16 |= i21;
        }
        if ((12582912 & i11) == 0) {
            i16 |= 4194304;
        }
        if ((100663296 & i11) == 0) {
            i16 |= 33554432;
        }
        if ((805306368 & i11) == 0) {
            i16 |= 268435456;
        }
        if ((306783379 & i16) == 306783378) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar3;
                }
                if (i14 != 0) {
                    eVar4 = null;
                }
                if (i17 != 0) {
                    eVar5 = null;
                }
                float f1111112 = a.f29950a;
                g2.w0 w0VarA116 = y7.a(k1.e.f37497d, sVar2);
                long jD11111111111 = v1.d(k1.e.f37496c, sVar2);
                long jD11111111112 = v1.d(k1.e.f37502i, sVar2);
                int i2118 = i16 & (-2143289345);
                long jD11111111113 = v1.d(k1.e.f37498e, sVar2);
                long jD11111111114 = v1.d(k1.e.f37500g, sVar2);
                float f1111113 = a.f29950a;
                z1.r rVar1112 = rVar4;
                eVar6 = eVar5;
                rVar5 = rVar1112;
                eVar7 = eVar4;
                rVar6 = new z3.r(7);
                i19 = i2118;
                f11 = f1111113;
                w0Var2 = w0VarA116;
                j15 = jD11111111113;
                j16 = jD11111111111;
                j17 = jD11111111112;
                j18 = jD11111111114;
            } else {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar3;
                }
                if (i14 != 0) {
                    eVar4 = null;
                }
                if (i17 != 0) {
                    eVar5 = null;
                }
                float f1111114 = a.f29950a;
                g2.w0 w0VarA117 = y7.a(k1.e.f37497d, sVar2);
                long jD11111111115 = v1.d(k1.e.f37496c, sVar2);
                long jD11111111116 = v1.d(k1.e.f37502i, sVar2);
                int i2119 = i16 & (-2143289345);
                long jD11111111117 = v1.d(k1.e.f37498e, sVar2);
                long jD11111111118 = v1.d(k1.e.f37500g, sVar2);
                float f1111115 = a.f29950a;
                z1.r rVar1113 = rVar4;
                eVar6 = eVar5;
                rVar5 = rVar1113;
                eVar7 = eVar4;
                rVar6 = new z3.r(7);
                i19 = i2119;
                f11 = f1111115;
                w0Var2 = w0VarA117;
                j15 = jD11111111117;
                j16 = jD11111111115;
                j17 = jD11111111116;
                j18 = jD11111111118;
            }
            sVar2.q();
            sVar = sVar2;
            k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
        } else {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar3;
                }
                if (i14 != 0) {
                    eVar4 = null;
                }
                if (i17 != 0) {
                    eVar5 = null;
                }
                float f1111116 = a.f29950a;
                g2.w0 w0VarA118 = y7.a(k1.e.f37497d, sVar2);
                long jD11111111119 = v1.d(k1.e.f37496c, sVar2);
                long jD111111111110 = v1.d(k1.e.f37502i, sVar2);
                int i21110 = i16 & (-2143289345);
                long jD111111111111 = v1.d(k1.e.f37498e, sVar2);
                long jD111111111112 = v1.d(k1.e.f37500g, sVar2);
                float f1111117 = a.f29950a;
                z1.r rVar1114 = rVar4;
                eVar6 = eVar5;
                rVar5 = rVar1114;
                eVar7 = eVar4;
                rVar6 = new z3.r(7);
                i19 = i21110;
                f11 = f1111117;
                w0Var2 = w0VarA118;
                j15 = jD111111111111;
                j16 = jD11111111119;
                j17 = jD111111111110;
                j18 = jD111111111112;
            } else {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar3;
                }
                if (i14 != 0) {
                    eVar4 = null;
                }
                if (i17 != 0) {
                    eVar5 = null;
                }
                float f1111118 = a.f29950a;
                g2.w0 w0VarA119 = y7.a(k1.e.f37497d, sVar2);
                long jD111111111113 = v1.d(k1.e.f37496c, sVar2);
                long jD111111111114 = v1.d(k1.e.f37502i, sVar2);
                int i21111 = i16 & (-2143289345);
                long jD111111111115 = v1.d(k1.e.f37498e, sVar2);
                long jD111111111116 = v1.d(k1.e.f37500g, sVar2);
                float f1111119 = a.f29950a;
                z1.r rVar1115 = rVar4;
                eVar6 = eVar5;
                rVar5 = rVar1115;
                eVar7 = eVar4;
                rVar6 = new z3.r(7);
                i19 = i21111;
                f11 = f1111119;
                w0Var2 = w0VarA119;
                j15 = jD111111111115;
                j16 = jD111111111113;
                j17 = jD111111111114;
                j18 = jD111111111116;
            }
            sVar2.q();
            sVar = sVar2;
            k.c(aVar2, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, sVar, i19 & 2147483646, 3456);
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i(aVar, dVar, rVar5, eVar7, eVar6, eVar3, w0Var2, j16, j17, j15, j18, f11, rVar6, i11, i12, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0112  */
    /* JADX WARN: Code duplicated, block: B:105:0x0124  */
    /* JADX WARN: Code duplicated, block: B:109:0x013a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:123:0x0164 A[PHI: r1 r4 r7 r8 r9 r13 r15
      0x0164: PHI (r1v42 int) = (r1v21 int), (r1v44 int), (r1v45 int) binds: [B:140:0x01a8, B:121:0x0161, B:122:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r4v7 z1.r) = (r4v3 z1.r), (r4v2 z1.r), (r4v2 z1.r) binds: [B:140:0x01a8, B:121:0x0161, B:122:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r7v25 boolean) = (r7v3 boolean), (r7v2 boolean), (r7v2 boolean) binds: [B:140:0x01a8, B:121:0x0161, B:122:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r8v16 g2.w0) = (r8v7 g2.w0), (r8v6 g2.w0), (r8v6 g2.w0) binds: [B:140:0x01a8, B:121:0x0161, B:122:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r9v17 h1.i0) = (r9v3 h1.i0), (r9v2 h1.i0), (r9v2 h1.i0) binds: [B:140:0x01a8, B:121:0x0161, B:122:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r13v8 h1.n0) = (r13v4 h1.n0), (r13v3 h1.n0), (r13v3 h1.n0) binds: [B:140:0x01a8, B:121:0x0161, B:122:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r15v8 d0.v) = (r15v4 d0.v), (r15v3 d0.v), (r15v3 d0.v) binds: [B:140:0x01a8, B:121:0x0161, B:122:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x016d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0172  */
    /* JADX WARN: Code duplicated, block: B:131:0x0178  */
    /* JADX WARN: Code duplicated, block: B:134:0x0187  */
    /* JADX WARN: Code duplicated, block: B:137:0x019c  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:144:0x01be  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:153:0x01da  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:160:0x0201  */
    /* JADX WARN: Code duplicated, block: B:163:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:166:0x021d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0236  */
    /* JADX WARN: Code duplicated, block: B:170:0x0239  */
    /* JADX WARN: Code duplicated, block: B:172:0x023d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0240  */
    /* JADX WARN: Code duplicated, block: B:175:0x0244  */
    /* JADX WARN: Code duplicated, block: B:176:0x0247  */
    /* JADX WARN: Code duplicated, block: B:178:0x024b  */
    /* JADX WARN: Code duplicated, block: B:179:0x024e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0256  */
    /* JADX WARN: Code duplicated, block: B:183:0x026b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0284  */
    /* JADX WARN: Code duplicated, block: B:188:0x028a  */
    /* JADX WARN: Code duplicated, block: B:194:0x029b  */
    /* JADX WARN: Code duplicated, block: B:196:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:202:0x02b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:209:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:211:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:215:0x0340  */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:98:0x0109  */
    public static final void b(fz.a aVar, z1.r rVar, boolean z11, g2.w0 w0Var, i0 i0Var, n0 n0Var, d0.v vVar, j0.t1 t1Var, fz.f fVar, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        int i14;
        boolean z12;
        int i15;
        g2.w0 w0VarA;
        i0 i0VarC;
        n0 n0VarB;
        int i16;
        d0.v vVar2;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        boolean z13;
        j0.t1 t1Var2;
        int i24;
        boolean z14;
        Object objQ;
        l1.g gVar;
        h0.i iVar;
        long j11;
        long j12;
        int i25;
        Object objQ2;
        x1.p pVar;
        boolean zF;
        Object objQ3;
        h0.h hVar;
        float f5;
        Object objQ4;
        b0.d dVar;
        boolean zH;
        Object objQ5;
        boolean z15;
        n0 n0Var2;
        b0.n nVar2;
        float f11;
        l1.s sVar;
        n0 n0Var3;
        j0.t1 t1Var3;
        z1.r rVar3;
        g2.w0 w0Var2;
        d0.v vVar3;
        boolean z16;
        i0 i0Var2;
        l1.x1 x1VarT;
        int i26;
        int i27;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(650121315);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.h(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i28 = i12 & 2;
        if (i28 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar2.f(rVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 384) == 0) {
                    z12 = z11;
                    if (sVar2.g(z12)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i11 & 3072) == 0) {
                    if ((i12 & 8) == 0) {
                        w0VarA = w0Var;
                        int i29 = sVar2.f(w0VarA) ? 2048 : 1024;
                        i13 |= i29;
                    } else {
                        w0VarA = w0Var;
                    }
                    i13 |= i29;
                } else {
                    w0VarA = w0Var;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        i0VarC = i0Var;
                        if (sVar2.f(i0VarC)) {
                            i27 = 16384;
                        }
                        i13 |= i27;
                    } else {
                        i0VarC = i0Var;
                    }
                    i27 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    i13 |= i27;
                } else {
                    i0VarC = i0Var;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        n0VarB = n0Var;
                        int i30 = sVar2.f(n0VarB) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
                        i13 |= i30;
                    } else {
                        n0VarB = n0Var;
                    }
                    i13 |= i30;
                } else {
                    n0VarB = n0Var;
                }
                i16 = i12 & 64;
                if (i16 != 0) {
                    if ((1572864 & i11) == 0) {
                        vVar2 = vVar;
                        if (sVar2.f(vVar2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 128;
                    if (i18 != 0) {
                        i13 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (sVar2.f(t1Var)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                    i21 = i13;
                    if ((i12 & 256) != 0) {
                        i21 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (sVar2.f(null)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i21 |= i22;
                    }
                    if ((i11 & 805306368) == 0) {
                        if (sVar2.h(fVar)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i21 |= i26;
                    }
                    i23 = i21;
                    if ((i23 & 306783379) == 306783378 || !sVar2.F()) {
                        sVar2.Y();
                        z13 = true;
                        if ((i11 & 1) != 0 || sVar2.C()) {
                            if (i28 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 8) != 0) {
                                j0.v1 v1Var = j0.f30447a;
                                i23 &= -7169;
                                w0VarA = y7.a(k1.l.f37604c, sVar2);
                            }
                            if ((i12 & 16) != 0) {
                                j0.v1 v1Var2 = j0.f30447a;
                                i23 &= -57345;
                                i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                            }
                            if ((i12 & 32) != 0) {
                                i23 &= -458753;
                                n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                            }
                            if (i16 != 0) {
                                vVar2 = null;
                            }
                            if (i18 != 0) {
                                t1Var2 = j0.f30447a;
                            }
                            i24 = i23;
                            z14 = z12;
                            d0.v vVar4 = vVar2;
                            g2.w0 w0Var3 = w0VarA;
                            sVar2.q();
                            sVar2.d0(-239156623);
                            objQ = sVar2.Q();
                            gVar = l1.m.f39353a;
                            if (objQ == gVar) {
                                objQ = com.google.android.material.datepicker.d.f(sVar2);
                            }
                            iVar = (h0.i) objQ;
                            sVar2.p(false);
                            if (z14) {
                                j11 = i0VarC.f30386a;
                            } else {
                                j11 = i0VarC.f30388c;
                            }
                            j0.t1 t1Var4 = t1Var2;
                            if (z14) {
                                j12 = i0VarC.f30387b;
                            } else {
                                j12 = i0VarC.f30389d;
                            }
                            long j13 = j12;
                            sVar2.d0(-239150048);
                            if (n0VarB == null) {
                                iVar = iVar;
                                i0VarC = i0VarC;
                                n0Var2 = n0VarB;
                                z15 = z14;
                                nVar2 = null;
                            } else {
                                i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                                objQ2 = sVar2.Q();
                                if (objQ2 == gVar) {
                                    objQ2 = new x1.p();
                                    sVar2.o0(objQ2);
                                }
                                pVar = (x1.p) objQ2;
                                zF = sVar2.f(iVar);
                                objQ3 = sVar2.Q();
                                if (zF || objQ3 == gVar) {
                                    objQ3 = new l0(iVar, pVar, null, 0);
                                    sVar2.o0(objQ3);
                                }
                                l1.t.f((fz.e) objQ3, iVar, sVar2);
                                hVar = (h0.h) ry.m.A0(pVar);
                                if (!z14) {
                                    f5 = n0VarB.f30715e;
                                } else if (hVar instanceof h0.k) {
                                    f5 = n0VarB.f30712b;
                                } else if (hVar instanceof h0.f) {
                                    f5 = n0VarB.f30714d;
                                } else if (hVar instanceof h0.d) {
                                    f5 = n0VarB.f30713c;
                                } else {
                                    f5 = n0VarB.f30711a;
                                }
                                objQ4 = sVar2.Q();
                                if (objQ4 == gVar) {
                                    objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                                    sVar2.o0(objQ4);
                                }
                                dVar = (b0.d) objQ4;
                                v3.f fVar2 = new v3.f(f5);
                                boolean zH2 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                                if ((((i25 & 896) ^ 384) > 256 || !sVar2.f(n0VarB)) && (i25 & 384) != 256) {
                                }
                                zH = zH2 | z13 | sVar2.h(hVar);
                                objQ5 = sVar2.Q();
                                if (!zH || objQ5 == gVar) {
                                    n0 n0Var4 = n0VarB;
                                    z15 = z14;
                                    objQ5 = new m0(dVar, f5, z15, n0Var4, hVar, null, 0);
                                    n0Var2 = n0Var4;
                                    sVar2.o0(objQ5);
                                } else {
                                    n0Var2 = n0VarB;
                                    z15 = z14;
                                }
                                l1.t.f((fz.e) objQ5, fVar2, sVar2);
                                nVar2 = dVar.f3472c;
                            }
                            sVar2.p(false);
                            if (nVar2 != null) {
                                f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                            } else {
                                f11 = 0;
                            }
                            sVar = sVar2;
                            boolean z17 = z15;
                            i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z17, w0Var3, j11, j13, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar4, iVar, t1.e.d(956488494, new p0(j13, t1Var4, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                            n0Var3 = n0Var2;
                            t1Var3 = t1Var4;
                            rVar3 = rVar2;
                            w0Var2 = w0Var3;
                            vVar3 = vVar4;
                            z16 = z17;
                            i0Var2 = i0VarC;
                        } else {
                            sVar2.W();
                            if ((i12 & 8) != 0) {
                                i23 &= -7169;
                            }
                            if ((i12 & 16) != 0) {
                                i23 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                i23 &= -458753;
                            }
                        }
                        t1Var2 = t1Var;
                        i24 = i23;
                        z14 = z12;
                        d0.v vVar5 = vVar2;
                        g2.w0 w0Var4 = w0VarA;
                        sVar2.q();
                        sVar2.d0(-239156623);
                        objQ = sVar2.Q();
                        gVar = l1.m.f39353a;
                        if (objQ == gVar) {
                            objQ = com.google.android.material.datepicker.d.f(sVar2);
                        }
                        iVar = (h0.i) objQ;
                        sVar2.p(false);
                        if (z14) {
                            j11 = i0VarC.f30386a;
                        } else {
                            j11 = i0VarC.f30388c;
                        }
                        j0.t1 t1Var5 = t1Var2;
                        if (z14) {
                            j12 = i0VarC.f30387b;
                        } else {
                            j12 = i0VarC.f30389d;
                        }
                        long j14 = j12;
                        sVar2.d0(-239150048);
                        if (n0VarB == null) {
                            iVar = iVar;
                            i0VarC = i0VarC;
                            n0Var2 = n0VarB;
                            z15 = z14;
                            nVar2 = null;
                        } else {
                            i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                            objQ2 = sVar2.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new x1.p();
                                sVar2.o0(objQ2);
                            }
                            pVar = (x1.p) objQ2;
                            zF = sVar2.f(iVar);
                            objQ3 = sVar2.Q();
                            if (zF) {
                                objQ3 = new l0(iVar, pVar, null, 0);
                                sVar2.o0(objQ3);
                            } else {
                                objQ3 = new l0(iVar, pVar, null, 0);
                                sVar2.o0(objQ3);
                            }
                            l1.t.f((fz.e) objQ3, iVar, sVar2);
                            hVar = (h0.h) ry.m.A0(pVar);
                            if (!z14) {
                                f5 = n0VarB.f30715e;
                            } else if (hVar instanceof h0.k) {
                                f5 = n0VarB.f30712b;
                            } else if (hVar instanceof h0.f) {
                                f5 = n0VarB.f30714d;
                            } else if (hVar instanceof h0.d) {
                                f5 = n0VarB.f30713c;
                            } else {
                                f5 = n0VarB.f30711a;
                            }
                            objQ4 = sVar2.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                                sVar2.o0(objQ4);
                            }
                            dVar = (b0.d) objQ4;
                            v3.f fVar3 = new v3.f(f5);
                            boolean zH3 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                            z13 = ((i25 & 896) ^ 384) > 256 ? false : false;
                            zH = zH3 | z13 | sVar2.h(hVar);
                            objQ5 = sVar2.Q();
                            if (zH) {
                                n0 n0Var5 = n0VarB;
                                z15 = z14;
                                objQ5 = new m0(dVar, f5, z15, n0Var5, hVar, null, 0);
                                n0Var2 = n0Var5;
                                sVar2.o0(objQ5);
                            } else {
                                n0 n0Var6 = n0VarB;
                                z15 = z14;
                                objQ5 = new m0(dVar, f5, z15, n0Var6, hVar, null, 0);
                                n0Var2 = n0Var6;
                                sVar2.o0(objQ5);
                            }
                            l1.t.f((fz.e) objQ5, fVar3, sVar2);
                            nVar2 = dVar.f3472c;
                        }
                        sVar2.p(false);
                        if (nVar2 != null) {
                            f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                        } else {
                            f11 = 0;
                        }
                        sVar = sVar2;
                        boolean z18 = z15;
                        i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z18, w0Var4, j11, j14, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar5, iVar, t1.e.d(956488494, new p0(j14, t1Var5, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                        n0Var3 = n0Var2;
                        t1Var3 = t1Var5;
                        rVar3 = rVar2;
                        w0Var2 = w0Var4;
                        vVar3 = vVar5;
                        z16 = z18;
                        i0Var2 = i0VarC;
                    } else {
                        sVar2.W();
                        sVar = sVar2;
                        rVar3 = rVar2;
                        z16 = z12;
                        w0Var2 = w0VarA;
                        i0Var2 = i0VarC;
                        n0Var3 = n0VarB;
                        vVar3 = vVar2;
                        t1Var3 = t1Var;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new q0(aVar, rVar3, z16, w0Var2, i0Var2, n0Var3, vVar3, t1Var3, fVar, i11, i12);
                    }
                }
                i13 |= 1572864;
                vVar2 = vVar;
                i18 = i12 & 128;
                if (i18 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (sVar2.f(t1Var)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                i21 = i13;
                if ((i12 & 256) != 0) {
                    i21 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (sVar2.f(null)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i21 |= i22;
                }
                if ((i11 & 805306368) == 0) {
                    if (sVar2.h(fVar)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i21 |= i26;
                }
                i23 = i21;
                if ((i23 & 306783379) == 306783378) {
                    sVar2.Y();
                    z13 = true;
                    if ((i11 & 1) != 0) {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var3 = j0.f30447a;
                            i23 &= -7169;
                            w0VarA = y7.a(k1.l.f37604c, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var4 = j0.f30447a;
                            i23 &= -57345;
                            i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                        }
                        if ((i12 & 32) != 0) {
                            i23 &= -458753;
                            n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                        }
                        if (i16 != 0) {
                            vVar2 = null;
                        }
                        if (i18 != 0) {
                            t1Var2 = j0.f30447a;
                        } else {
                            t1Var2 = t1Var;
                        }
                    } else {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var5 = j0.f30447a;
                            i23 &= -7169;
                            w0VarA = y7.a(k1.l.f37604c, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var6 = j0.f30447a;
                            i23 &= -57345;
                            i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                        }
                        if ((i12 & 32) != 0) {
                            i23 &= -458753;
                            n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                        }
                        if (i16 != 0) {
                            vVar2 = null;
                        }
                        if (i18 != 0) {
                            t1Var2 = j0.f30447a;
                        } else {
                            t1Var2 = t1Var;
                        }
                    }
                    i24 = i23;
                    z14 = z12;
                    d0.v vVar6 = vVar2;
                    g2.w0 w0Var5 = w0VarA;
                    sVar2.q();
                    sVar2.d0(-239156623);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objQ = com.google.android.material.datepicker.d.f(sVar2);
                    }
                    iVar = (h0.i) objQ;
                    sVar2.p(false);
                    if (z14) {
                        j11 = i0VarC.f30386a;
                    } else {
                        j11 = i0VarC.f30388c;
                    }
                    j0.t1 t1Var6 = t1Var2;
                    if (z14) {
                        j12 = i0VarC.f30387b;
                    } else {
                        j12 = i0VarC.f30389d;
                    }
                    long j15 = j12;
                    sVar2.d0(-239150048);
                    if (n0VarB == null) {
                        iVar = iVar;
                        i0VarC = i0VarC;
                        n0Var2 = n0VarB;
                        z15 = z14;
                        nVar2 = null;
                    } else {
                        i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                        objQ2 = sVar2.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new x1.p();
                            sVar2.o0(objQ2);
                        }
                        pVar = (x1.p) objQ2;
                        zF = sVar2.f(iVar);
                        objQ3 = sVar2.Q();
                        if (zF) {
                            objQ3 = new l0(iVar, pVar, null, 0);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = new l0(iVar, pVar, null, 0);
                            sVar2.o0(objQ3);
                        }
                        l1.t.f((fz.e) objQ3, iVar, sVar2);
                        hVar = (h0.h) ry.m.A0(pVar);
                        if (!z14) {
                            f5 = n0VarB.f30715e;
                        } else if (hVar instanceof h0.k) {
                            f5 = n0VarB.f30712b;
                        } else if (hVar instanceof h0.f) {
                            f5 = n0VarB.f30714d;
                        } else if (hVar instanceof h0.d) {
                            f5 = n0VarB.f30713c;
                        } else {
                            f5 = n0VarB.f30711a;
                        }
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                            sVar2.o0(objQ4);
                        }
                        dVar = (b0.d) objQ4;
                        v3.f fVar4 = new v3.f(f5);
                        boolean zH4 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                        if (((i25 & 896) ^ 384) > 256) {
                        }
                        zH = zH4 | z13 | sVar2.h(hVar);
                        objQ5 = sVar2.Q();
                        if (zH) {
                            n0 n0Var7 = n0VarB;
                            z15 = z14;
                            objQ5 = new m0(dVar, f5, z15, n0Var7, hVar, null, 0);
                            n0Var2 = n0Var7;
                            sVar2.o0(objQ5);
                        } else {
                            n0 n0Var8 = n0VarB;
                            z15 = z14;
                            objQ5 = new m0(dVar, f5, z15, n0Var8, hVar, null, 0);
                            n0Var2 = n0Var8;
                            sVar2.o0(objQ5);
                        }
                        l1.t.f((fz.e) objQ5, fVar4, sVar2);
                        nVar2 = dVar.f3472c;
                    }
                    sVar2.p(false);
                    if (nVar2 != null) {
                        f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                    } else {
                        f11 = 0;
                    }
                    sVar = sVar2;
                    boolean z19 = z15;
                    i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z19, w0Var5, j11, j15, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar6, iVar, t1.e.d(956488494, new p0(j15, t1Var6, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                    n0Var3 = n0Var2;
                    t1Var3 = t1Var6;
                    rVar3 = rVar2;
                    w0Var2 = w0Var5;
                    vVar3 = vVar6;
                    z16 = z19;
                    i0Var2 = i0VarC;
                } else {
                    sVar2.Y();
                    z13 = true;
                    if ((i11 & 1) != 0) {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var7 = j0.f30447a;
                            i23 &= -7169;
                            w0VarA = y7.a(k1.l.f37604c, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var8 = j0.f30447a;
                            i23 &= -57345;
                            i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                        }
                        if ((i12 & 32) != 0) {
                            i23 &= -458753;
                            n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                        }
                        if (i16 != 0) {
                            vVar2 = null;
                        }
                        if (i18 != 0) {
                            t1Var2 = j0.f30447a;
                        } else {
                            t1Var2 = t1Var;
                        }
                    } else {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var9 = j0.f30447a;
                            i23 &= -7169;
                            w0VarA = y7.a(k1.l.f37604c, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var10 = j0.f30447a;
                            i23 &= -57345;
                            i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                        }
                        if ((i12 & 32) != 0) {
                            i23 &= -458753;
                            n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                        }
                        if (i16 != 0) {
                            vVar2 = null;
                        }
                        if (i18 != 0) {
                            t1Var2 = j0.f30447a;
                        } else {
                            t1Var2 = t1Var;
                        }
                    }
                    i24 = i23;
                    z14 = z12;
                    d0.v vVar7 = vVar2;
                    g2.w0 w0Var6 = w0VarA;
                    sVar2.q();
                    sVar2.d0(-239156623);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objQ = com.google.android.material.datepicker.d.f(sVar2);
                    }
                    iVar = (h0.i) objQ;
                    sVar2.p(false);
                    if (z14) {
                        j11 = i0VarC.f30386a;
                    } else {
                        j11 = i0VarC.f30388c;
                    }
                    j0.t1 t1Var7 = t1Var2;
                    if (z14) {
                        j12 = i0VarC.f30387b;
                    } else {
                        j12 = i0VarC.f30389d;
                    }
                    long j16 = j12;
                    sVar2.d0(-239150048);
                    if (n0VarB == null) {
                        iVar = iVar;
                        i0VarC = i0VarC;
                        n0Var2 = n0VarB;
                        z15 = z14;
                        nVar2 = null;
                    } else {
                        i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                        objQ2 = sVar2.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new x1.p();
                            sVar2.o0(objQ2);
                        }
                        pVar = (x1.p) objQ2;
                        zF = sVar2.f(iVar);
                        objQ3 = sVar2.Q();
                        if (zF) {
                            objQ3 = new l0(iVar, pVar, null, 0);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = new l0(iVar, pVar, null, 0);
                            sVar2.o0(objQ3);
                        }
                        l1.t.f((fz.e) objQ3, iVar, sVar2);
                        hVar = (h0.h) ry.m.A0(pVar);
                        if (!z14) {
                            f5 = n0VarB.f30715e;
                        } else if (hVar instanceof h0.k) {
                            f5 = n0VarB.f30712b;
                        } else if (hVar instanceof h0.f) {
                            f5 = n0VarB.f30714d;
                        } else if (hVar instanceof h0.d) {
                            f5 = n0VarB.f30713c;
                        } else {
                            f5 = n0VarB.f30711a;
                        }
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                            sVar2.o0(objQ4);
                        }
                        dVar = (b0.d) objQ4;
                        v3.f fVar5 = new v3.f(f5);
                        boolean zH5 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                        if (((i25 & 896) ^ 384) > 256) {
                        }
                        zH = zH5 | z13 | sVar2.h(hVar);
                        objQ5 = sVar2.Q();
                        if (zH) {
                            n0 n0Var9 = n0VarB;
                            z15 = z14;
                            objQ5 = new m0(dVar, f5, z15, n0Var9, hVar, null, 0);
                            n0Var2 = n0Var9;
                            sVar2.o0(objQ5);
                        } else {
                            n0 n0Var10 = n0VarB;
                            z15 = z14;
                            objQ5 = new m0(dVar, f5, z15, n0Var10, hVar, null, 0);
                            n0Var2 = n0Var10;
                            sVar2.o0(objQ5);
                        }
                        l1.t.f((fz.e) objQ5, fVar5, sVar2);
                        nVar2 = dVar.f3472c;
                    }
                    sVar2.p(false);
                    if (nVar2 != null) {
                        f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                    } else {
                        f11 = 0;
                    }
                    sVar = sVar2;
                    boolean z110 = z15;
                    i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z110, w0Var6, j11, j16, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar7, iVar, t1.e.d(956488494, new p0(j16, t1Var7, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                    n0Var3 = n0Var2;
                    t1Var3 = t1Var7;
                    rVar3 = rVar2;
                    w0Var2 = w0Var6;
                    vVar3 = vVar7;
                    z16 = z110;
                    i0Var2 = i0VarC;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new q0(aVar, rVar3, z16, w0Var2, i0Var2, n0Var3, vVar3, t1Var3, fVar, i11, i12);
                }
            }
            i13 |= 384;
            z12 = z11;
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    w0VarA = w0Var;
                    if (sVar2.f(w0VarA)) {
                    }
                    i13 |= i29;
                } else {
                    w0VarA = w0Var;
                }
                i13 |= i29;
            } else {
                w0VarA = w0Var;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    i0VarC = i0Var;
                    if (sVar2.f(i0VarC)) {
                        i27 = 16384;
                    }
                    i13 |= i27;
                } else {
                    i0VarC = i0Var;
                }
                i27 = OSSConstants.DEFAULT_BUFFER_SIZE;
                i13 |= i27;
            } else {
                i0VarC = i0Var;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    n0VarB = n0Var;
                    if (sVar2.f(n0VarB)) {
                    }
                    i13 |= i30;
                } else {
                    n0VarB = n0Var;
                }
                i13 |= i30;
            } else {
                n0VarB = n0Var;
            }
            i16 = i12 & 64;
            if (i16 != 0) {
                if ((1572864 & i11) == 0) {
                    vVar2 = vVar;
                    if (sVar2.f(vVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 128;
                if (i18 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (sVar2.f(t1Var)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                i21 = i13;
                if ((i12 & 256) != 0) {
                    i21 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (sVar2.f(null)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i21 |= i22;
                }
                if ((i11 & 805306368) == 0) {
                    if (sVar2.h(fVar)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i21 |= i26;
                }
                i23 = i21;
                if ((i23 & 306783379) == 306783378) {
                    sVar2.Y();
                    z13 = true;
                    if ((i11 & 1) != 0) {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var11 = j0.f30447a;
                            i23 &= -7169;
                            w0VarA = y7.a(k1.l.f37604c, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var12 = j0.f30447a;
                            i23 &= -57345;
                            i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                        }
                        if ((i12 & 32) != 0) {
                            i23 &= -458753;
                            n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                        }
                        if (i16 != 0) {
                            vVar2 = null;
                        }
                        if (i18 != 0) {
                            t1Var2 = j0.f30447a;
                        } else {
                            t1Var2 = t1Var;
                        }
                    } else {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var13 = j0.f30447a;
                            i23 &= -7169;
                            w0VarA = y7.a(k1.l.f37604c, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var14 = j0.f30447a;
                            i23 &= -57345;
                            i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                        }
                        if ((i12 & 32) != 0) {
                            i23 &= -458753;
                            n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                        }
                        if (i16 != 0) {
                            vVar2 = null;
                        }
                        if (i18 != 0) {
                            t1Var2 = j0.f30447a;
                        } else {
                            t1Var2 = t1Var;
                        }
                    }
                    i24 = i23;
                    z14 = z12;
                    d0.v vVar8 = vVar2;
                    g2.w0 w0Var7 = w0VarA;
                    sVar2.q();
                    sVar2.d0(-239156623);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objQ = com.google.android.material.datepicker.d.f(sVar2);
                    }
                    iVar = (h0.i) objQ;
                    sVar2.p(false);
                    if (z14) {
                        j11 = i0VarC.f30386a;
                    } else {
                        j11 = i0VarC.f30388c;
                    }
                    j0.t1 t1Var8 = t1Var2;
                    if (z14) {
                        j12 = i0VarC.f30387b;
                    } else {
                        j12 = i0VarC.f30389d;
                    }
                    long j17 = j12;
                    sVar2.d0(-239150048);
                    if (n0VarB == null) {
                        iVar = iVar;
                        i0VarC = i0VarC;
                        n0Var2 = n0VarB;
                        z15 = z14;
                        nVar2 = null;
                    } else {
                        i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                        objQ2 = sVar2.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new x1.p();
                            sVar2.o0(objQ2);
                        }
                        pVar = (x1.p) objQ2;
                        zF = sVar2.f(iVar);
                        objQ3 = sVar2.Q();
                        if (zF) {
                            objQ3 = new l0(iVar, pVar, null, 0);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = new l0(iVar, pVar, null, 0);
                            sVar2.o0(objQ3);
                        }
                        l1.t.f((fz.e) objQ3, iVar, sVar2);
                        hVar = (h0.h) ry.m.A0(pVar);
                        if (!z14) {
                            f5 = n0VarB.f30715e;
                        } else if (hVar instanceof h0.k) {
                            f5 = n0VarB.f30712b;
                        } else if (hVar instanceof h0.f) {
                            f5 = n0VarB.f30714d;
                        } else if (hVar instanceof h0.d) {
                            f5 = n0VarB.f30713c;
                        } else {
                            f5 = n0VarB.f30711a;
                        }
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                            sVar2.o0(objQ4);
                        }
                        dVar = (b0.d) objQ4;
                        v3.f fVar6 = new v3.f(f5);
                        boolean zH6 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                        if (((i25 & 896) ^ 384) > 256) {
                        }
                        zH = zH6 | z13 | sVar2.h(hVar);
                        objQ5 = sVar2.Q();
                        if (zH) {
                            n0 n0Var11 = n0VarB;
                            z15 = z14;
                            objQ5 = new m0(dVar, f5, z15, n0Var11, hVar, null, 0);
                            n0Var2 = n0Var11;
                            sVar2.o0(objQ5);
                        } else {
                            n0 n0Var12 = n0VarB;
                            z15 = z14;
                            objQ5 = new m0(dVar, f5, z15, n0Var12, hVar, null, 0);
                            n0Var2 = n0Var12;
                            sVar2.o0(objQ5);
                        }
                        l1.t.f((fz.e) objQ5, fVar6, sVar2);
                        nVar2 = dVar.f3472c;
                    }
                    sVar2.p(false);
                    if (nVar2 != null) {
                        f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                    } else {
                        f11 = 0;
                    }
                    sVar = sVar2;
                    boolean z111 = z15;
                    i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z111, w0Var7, j11, j17, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar8, iVar, t1.e.d(956488494, new p0(j17, t1Var8, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                    n0Var3 = n0Var2;
                    t1Var3 = t1Var8;
                    rVar3 = rVar2;
                    w0Var2 = w0Var7;
                    vVar3 = vVar8;
                    z16 = z111;
                    i0Var2 = i0VarC;
                } else {
                    sVar2.Y();
                    z13 = true;
                    if ((i11 & 1) != 0) {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var15 = j0.f30447a;
                            i23 &= -7169;
                            w0VarA = y7.a(k1.l.f37604c, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var16 = j0.f30447a;
                            i23 &= -57345;
                            i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                        }
                        if ((i12 & 32) != 0) {
                            i23 &= -458753;
                            n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                        }
                        if (i16 != 0) {
                            vVar2 = null;
                        }
                        if (i18 != 0) {
                            t1Var2 = j0.f30447a;
                        } else {
                            t1Var2 = t1Var;
                        }
                    } else {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var17 = j0.f30447a;
                            i23 &= -7169;
                            w0VarA = y7.a(k1.l.f37604c, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var18 = j0.f30447a;
                            i23 &= -57345;
                            i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                        }
                        if ((i12 & 32) != 0) {
                            i23 &= -458753;
                            n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                        }
                        if (i16 != 0) {
                            vVar2 = null;
                        }
                        if (i18 != 0) {
                            t1Var2 = j0.f30447a;
                        } else {
                            t1Var2 = t1Var;
                        }
                    }
                    i24 = i23;
                    z14 = z12;
                    d0.v vVar9 = vVar2;
                    g2.w0 w0Var8 = w0VarA;
                    sVar2.q();
                    sVar2.d0(-239156623);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objQ = com.google.android.material.datepicker.d.f(sVar2);
                    }
                    iVar = (h0.i) objQ;
                    sVar2.p(false);
                    if (z14) {
                        j11 = i0VarC.f30386a;
                    } else {
                        j11 = i0VarC.f30388c;
                    }
                    j0.t1 t1Var9 = t1Var2;
                    if (z14) {
                        j12 = i0VarC.f30387b;
                    } else {
                        j12 = i0VarC.f30389d;
                    }
                    long j18 = j12;
                    sVar2.d0(-239150048);
                    if (n0VarB == null) {
                        iVar = iVar;
                        i0VarC = i0VarC;
                        n0Var2 = n0VarB;
                        z15 = z14;
                        nVar2 = null;
                    } else {
                        i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                        objQ2 = sVar2.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new x1.p();
                            sVar2.o0(objQ2);
                        }
                        pVar = (x1.p) objQ2;
                        zF = sVar2.f(iVar);
                        objQ3 = sVar2.Q();
                        if (zF) {
                            objQ3 = new l0(iVar, pVar, null, 0);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = new l0(iVar, pVar, null, 0);
                            sVar2.o0(objQ3);
                        }
                        l1.t.f((fz.e) objQ3, iVar, sVar2);
                        hVar = (h0.h) ry.m.A0(pVar);
                        if (!z14) {
                            f5 = n0VarB.f30715e;
                        } else if (hVar instanceof h0.k) {
                            f5 = n0VarB.f30712b;
                        } else if (hVar instanceof h0.f) {
                            f5 = n0VarB.f30714d;
                        } else if (hVar instanceof h0.d) {
                            f5 = n0VarB.f30713c;
                        } else {
                            f5 = n0VarB.f30711a;
                        }
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                            sVar2.o0(objQ4);
                        }
                        dVar = (b0.d) objQ4;
                        v3.f fVar7 = new v3.f(f5);
                        boolean zH7 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                        if (((i25 & 896) ^ 384) > 256) {
                        }
                        zH = zH7 | z13 | sVar2.h(hVar);
                        objQ5 = sVar2.Q();
                        if (zH) {
                            n0 n0Var13 = n0VarB;
                            z15 = z14;
                            objQ5 = new m0(dVar, f5, z15, n0Var13, hVar, null, 0);
                            n0Var2 = n0Var13;
                            sVar2.o0(objQ5);
                        } else {
                            n0 n0Var14 = n0VarB;
                            z15 = z14;
                            objQ5 = new m0(dVar, f5, z15, n0Var14, hVar, null, 0);
                            n0Var2 = n0Var14;
                            sVar2.o0(objQ5);
                        }
                        l1.t.f((fz.e) objQ5, fVar7, sVar2);
                        nVar2 = dVar.f3472c;
                    }
                    sVar2.p(false);
                    if (nVar2 != null) {
                        f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                    } else {
                        f11 = 0;
                    }
                    sVar = sVar2;
                    boolean z112 = z15;
                    i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z112, w0Var8, j11, j18, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar9, iVar, t1.e.d(956488494, new p0(j18, t1Var9, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                    n0Var3 = n0Var2;
                    t1Var3 = t1Var9;
                    rVar3 = rVar2;
                    w0Var2 = w0Var8;
                    vVar3 = vVar9;
                    z16 = z112;
                    i0Var2 = i0VarC;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new q0(aVar, rVar3, z16, w0Var2, i0Var2, n0Var3, vVar3, t1Var3, fVar, i11, i12);
                }
            }
            i13 |= 1572864;
            vVar2 = vVar;
            i18 = i12 & 128;
            if (i18 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (sVar2.f(t1Var)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            i21 = i13;
            if ((i12 & 256) != 0) {
                i21 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (sVar2.f(null)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i21 |= i22;
            }
            if ((i11 & 805306368) == 0) {
                if (sVar2.h(fVar)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i21 |= i26;
            }
            i23 = i21;
            if ((i23 & 306783379) == 306783378) {
                sVar2.Y();
                z13 = true;
                if ((i11 & 1) != 0) {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var19 = j0.f30447a;
                        i23 &= -7169;
                        w0VarA = y7.a(k1.l.f37604c, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var110 = j0.f30447a;
                        i23 &= -57345;
                        i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 32) != 0) {
                        i23 &= -458753;
                        n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                    }
                    if (i16 != 0) {
                        vVar2 = null;
                    }
                    if (i18 != 0) {
                        t1Var2 = j0.f30447a;
                    } else {
                        t1Var2 = t1Var;
                    }
                } else {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var111 = j0.f30447a;
                        i23 &= -7169;
                        w0VarA = y7.a(k1.l.f37604c, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var112 = j0.f30447a;
                        i23 &= -57345;
                        i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 32) != 0) {
                        i23 &= -458753;
                        n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                    }
                    if (i16 != 0) {
                        vVar2 = null;
                    }
                    if (i18 != 0) {
                        t1Var2 = j0.f30447a;
                    } else {
                        t1Var2 = t1Var;
                    }
                }
                i24 = i23;
                z14 = z12;
                d0.v vVar10 = vVar2;
                g2.w0 w0Var9 = w0VarA;
                sVar2.q();
                sVar2.d0(-239156623);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = com.google.android.material.datepicker.d.f(sVar2);
                }
                iVar = (h0.i) objQ;
                sVar2.p(false);
                if (z14) {
                    j11 = i0VarC.f30386a;
                } else {
                    j11 = i0VarC.f30388c;
                }
                j0.t1 t1Var10 = t1Var2;
                if (z14) {
                    j12 = i0VarC.f30387b;
                } else {
                    j12 = i0VarC.f30389d;
                }
                long j19 = j12;
                sVar2.d0(-239150048);
                if (n0VarB == null) {
                    iVar = iVar;
                    i0VarC = i0VarC;
                    n0Var2 = n0VarB;
                    z15 = z14;
                    nVar2 = null;
                } else {
                    i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                    objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new x1.p();
                        sVar2.o0(objQ2);
                    }
                    pVar = (x1.p) objQ2;
                    zF = sVar2.f(iVar);
                    objQ3 = sVar2.Q();
                    if (zF) {
                        objQ3 = new l0(iVar, pVar, null, 0);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = new l0(iVar, pVar, null, 0);
                        sVar2.o0(objQ3);
                    }
                    l1.t.f((fz.e) objQ3, iVar, sVar2);
                    hVar = (h0.h) ry.m.A0(pVar);
                    if (!z14) {
                        f5 = n0VarB.f30715e;
                    } else if (hVar instanceof h0.k) {
                        f5 = n0VarB.f30712b;
                    } else if (hVar instanceof h0.f) {
                        f5 = n0VarB.f30714d;
                    } else if (hVar instanceof h0.d) {
                        f5 = n0VarB.f30713c;
                    } else {
                        f5 = n0VarB.f30711a;
                    }
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                        sVar2.o0(objQ4);
                    }
                    dVar = (b0.d) objQ4;
                    v3.f fVar8 = new v3.f(f5);
                    boolean zH8 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                    if (((i25 & 896) ^ 384) > 256) {
                    }
                    zH = zH8 | z13 | sVar2.h(hVar);
                    objQ5 = sVar2.Q();
                    if (zH) {
                        n0 n0Var15 = n0VarB;
                        z15 = z14;
                        objQ5 = new m0(dVar, f5, z15, n0Var15, hVar, null, 0);
                        n0Var2 = n0Var15;
                        sVar2.o0(objQ5);
                    } else {
                        n0 n0Var16 = n0VarB;
                        z15 = z14;
                        objQ5 = new m0(dVar, f5, z15, n0Var16, hVar, null, 0);
                        n0Var2 = n0Var16;
                        sVar2.o0(objQ5);
                    }
                    l1.t.f((fz.e) objQ5, fVar8, sVar2);
                    nVar2 = dVar.f3472c;
                }
                sVar2.p(false);
                if (nVar2 != null) {
                    f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                } else {
                    f11 = 0;
                }
                sVar = sVar2;
                boolean z113 = z15;
                i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z113, w0Var9, j11, j19, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar10, iVar, t1.e.d(956488494, new p0(j19, t1Var10, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                n0Var3 = n0Var2;
                t1Var3 = t1Var10;
                rVar3 = rVar2;
                w0Var2 = w0Var9;
                vVar3 = vVar10;
                z16 = z113;
                i0Var2 = i0VarC;
            } else {
                sVar2.Y();
                z13 = true;
                if ((i11 & 1) != 0) {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var113 = j0.f30447a;
                        i23 &= -7169;
                        w0VarA = y7.a(k1.l.f37604c, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var114 = j0.f30447a;
                        i23 &= -57345;
                        i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 32) != 0) {
                        i23 &= -458753;
                        n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                    }
                    if (i16 != 0) {
                        vVar2 = null;
                    }
                    if (i18 != 0) {
                        t1Var2 = j0.f30447a;
                    } else {
                        t1Var2 = t1Var;
                    }
                } else {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var115 = j0.f30447a;
                        i23 &= -7169;
                        w0VarA = y7.a(k1.l.f37604c, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var116 = j0.f30447a;
                        i23 &= -57345;
                        i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 32) != 0) {
                        i23 &= -458753;
                        n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                    }
                    if (i16 != 0) {
                        vVar2 = null;
                    }
                    if (i18 != 0) {
                        t1Var2 = j0.f30447a;
                    } else {
                        t1Var2 = t1Var;
                    }
                }
                i24 = i23;
                z14 = z12;
                d0.v vVar11 = vVar2;
                g2.w0 w0Var10 = w0VarA;
                sVar2.q();
                sVar2.d0(-239156623);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = com.google.android.material.datepicker.d.f(sVar2);
                }
                iVar = (h0.i) objQ;
                sVar2.p(false);
                if (z14) {
                    j11 = i0VarC.f30386a;
                } else {
                    j11 = i0VarC.f30388c;
                }
                j0.t1 t1Var11 = t1Var2;
                if (z14) {
                    j12 = i0VarC.f30387b;
                } else {
                    j12 = i0VarC.f30389d;
                }
                long j110 = j12;
                sVar2.d0(-239150048);
                if (n0VarB == null) {
                    iVar = iVar;
                    i0VarC = i0VarC;
                    n0Var2 = n0VarB;
                    z15 = z14;
                    nVar2 = null;
                } else {
                    i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                    objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new x1.p();
                        sVar2.o0(objQ2);
                    }
                    pVar = (x1.p) objQ2;
                    zF = sVar2.f(iVar);
                    objQ3 = sVar2.Q();
                    if (zF) {
                        objQ3 = new l0(iVar, pVar, null, 0);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = new l0(iVar, pVar, null, 0);
                        sVar2.o0(objQ3);
                    }
                    l1.t.f((fz.e) objQ3, iVar, sVar2);
                    hVar = (h0.h) ry.m.A0(pVar);
                    if (!z14) {
                        f5 = n0VarB.f30715e;
                    } else if (hVar instanceof h0.k) {
                        f5 = n0VarB.f30712b;
                    } else if (hVar instanceof h0.f) {
                        f5 = n0VarB.f30714d;
                    } else if (hVar instanceof h0.d) {
                        f5 = n0VarB.f30713c;
                    } else {
                        f5 = n0VarB.f30711a;
                    }
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                        sVar2.o0(objQ4);
                    }
                    dVar = (b0.d) objQ4;
                    v3.f fVar9 = new v3.f(f5);
                    boolean zH9 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                    if (((i25 & 896) ^ 384) > 256) {
                    }
                    zH = zH9 | z13 | sVar2.h(hVar);
                    objQ5 = sVar2.Q();
                    if (zH) {
                        n0 n0Var17 = n0VarB;
                        z15 = z14;
                        objQ5 = new m0(dVar, f5, z15, n0Var17, hVar, null, 0);
                        n0Var2 = n0Var17;
                        sVar2.o0(objQ5);
                    } else {
                        n0 n0Var18 = n0VarB;
                        z15 = z14;
                        objQ5 = new m0(dVar, f5, z15, n0Var18, hVar, null, 0);
                        n0Var2 = n0Var18;
                        sVar2.o0(objQ5);
                    }
                    l1.t.f((fz.e) objQ5, fVar9, sVar2);
                    nVar2 = dVar.f3472c;
                }
                sVar2.p(false);
                if (nVar2 != null) {
                    f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                } else {
                    f11 = 0;
                }
                sVar = sVar2;
                boolean z114 = z15;
                i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z114, w0Var10, j11, j110, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar11, iVar, t1.e.d(956488494, new p0(j110, t1Var11, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                n0Var3 = n0Var2;
                t1Var3 = t1Var11;
                rVar3 = rVar2;
                w0Var2 = w0Var10;
                vVar3 = vVar11;
                z16 = z114;
                i0Var2 = i0VarC;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new q0(aVar, rVar3, z16, w0Var2, i0Var2, n0Var3, vVar3, t1Var3, fVar, i11, i12);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 384) == 0) {
                z12 = z11;
                if (sVar2.g(z12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    w0VarA = w0Var;
                    if (sVar2.f(w0VarA)) {
                    }
                    i13 |= i29;
                } else {
                    w0VarA = w0Var;
                }
                i13 |= i29;
            } else {
                w0VarA = w0Var;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    i0VarC = i0Var;
                    if (sVar2.f(i0VarC)) {
                        i27 = 16384;
                    }
                    i13 |= i27;
                } else {
                    i0VarC = i0Var;
                }
                i27 = OSSConstants.DEFAULT_BUFFER_SIZE;
                i13 |= i27;
            } else {
                i0VarC = i0Var;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    n0VarB = n0Var;
                    if (sVar2.f(n0VarB)) {
                    }
                    i13 |= i30;
                } else {
                    n0VarB = n0Var;
                }
                i13 |= i30;
            } else {
                n0VarB = n0Var;
            }
            i16 = i12 & 64;
            if (i16 != 0) {
                if ((1572864 & i11) == 0) {
                    vVar2 = vVar;
                    if (sVar2.f(vVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 128;
                if (i18 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (sVar2.f(t1Var)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                i21 = i13;
                if ((i12 & 256) != 0) {
                    i21 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (sVar2.f(null)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i21 |= i22;
                }
                if ((i11 & 805306368) == 0) {
                    if (sVar2.h(fVar)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i21 |= i26;
                }
                i23 = i21;
                if ((i23 & 306783379) == 306783378) {
                    sVar2.Y();
                    z13 = true;
                    if ((i11 & 1) != 0) {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var117 = j0.f30447a;
                            i23 &= -7169;
                            w0VarA = y7.a(k1.l.f37604c, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var118 = j0.f30447a;
                            i23 &= -57345;
                            i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                        }
                        if ((i12 & 32) != 0) {
                            i23 &= -458753;
                            n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                        }
                        if (i16 != 0) {
                            vVar2 = null;
                        }
                        if (i18 != 0) {
                            t1Var2 = j0.f30447a;
                        } else {
                            t1Var2 = t1Var;
                        }
                    } else {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var119 = j0.f30447a;
                            i23 &= -7169;
                            w0VarA = y7.a(k1.l.f37604c, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var1110 = j0.f30447a;
                            i23 &= -57345;
                            i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                        }
                        if ((i12 & 32) != 0) {
                            i23 &= -458753;
                            n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                        }
                        if (i16 != 0) {
                            vVar2 = null;
                        }
                        if (i18 != 0) {
                            t1Var2 = j0.f30447a;
                        } else {
                            t1Var2 = t1Var;
                        }
                    }
                    i24 = i23;
                    z14 = z12;
                    d0.v vVar12 = vVar2;
                    g2.w0 w0Var11 = w0VarA;
                    sVar2.q();
                    sVar2.d0(-239156623);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objQ = com.google.android.material.datepicker.d.f(sVar2);
                    }
                    iVar = (h0.i) objQ;
                    sVar2.p(false);
                    if (z14) {
                        j11 = i0VarC.f30386a;
                    } else {
                        j11 = i0VarC.f30388c;
                    }
                    j0.t1 t1Var12 = t1Var2;
                    if (z14) {
                        j12 = i0VarC.f30387b;
                    } else {
                        j12 = i0VarC.f30389d;
                    }
                    long j111 = j12;
                    sVar2.d0(-239150048);
                    if (n0VarB == null) {
                        iVar = iVar;
                        i0VarC = i0VarC;
                        n0Var2 = n0VarB;
                        z15 = z14;
                        nVar2 = null;
                    } else {
                        i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                        objQ2 = sVar2.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new x1.p();
                            sVar2.o0(objQ2);
                        }
                        pVar = (x1.p) objQ2;
                        zF = sVar2.f(iVar);
                        objQ3 = sVar2.Q();
                        if (zF) {
                            objQ3 = new l0(iVar, pVar, null, 0);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = new l0(iVar, pVar, null, 0);
                            sVar2.o0(objQ3);
                        }
                        l1.t.f((fz.e) objQ3, iVar, sVar2);
                        hVar = (h0.h) ry.m.A0(pVar);
                        if (!z14) {
                            f5 = n0VarB.f30715e;
                        } else if (hVar instanceof h0.k) {
                            f5 = n0VarB.f30712b;
                        } else if (hVar instanceof h0.f) {
                            f5 = n0VarB.f30714d;
                        } else if (hVar instanceof h0.d) {
                            f5 = n0VarB.f30713c;
                        } else {
                            f5 = n0VarB.f30711a;
                        }
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                            sVar2.o0(objQ4);
                        }
                        dVar = (b0.d) objQ4;
                        v3.f fVar10 = new v3.f(f5);
                        boolean zH10 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                        if (((i25 & 896) ^ 384) > 256) {
                        }
                        zH = zH10 | z13 | sVar2.h(hVar);
                        objQ5 = sVar2.Q();
                        if (zH) {
                            n0 n0Var19 = n0VarB;
                            z15 = z14;
                            objQ5 = new m0(dVar, f5, z15, n0Var19, hVar, null, 0);
                            n0Var2 = n0Var19;
                            sVar2.o0(objQ5);
                        } else {
                            n0 n0Var110 = n0VarB;
                            z15 = z14;
                            objQ5 = new m0(dVar, f5, z15, n0Var110, hVar, null, 0);
                            n0Var2 = n0Var110;
                            sVar2.o0(objQ5);
                        }
                        l1.t.f((fz.e) objQ5, fVar10, sVar2);
                        nVar2 = dVar.f3472c;
                    }
                    sVar2.p(false);
                    if (nVar2 != null) {
                        f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                    } else {
                        f11 = 0;
                    }
                    sVar = sVar2;
                    boolean z115 = z15;
                    i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z115, w0Var11, j11, j111, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar12, iVar, t1.e.d(956488494, new p0(j111, t1Var12, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                    n0Var3 = n0Var2;
                    t1Var3 = t1Var12;
                    rVar3 = rVar2;
                    w0Var2 = w0Var11;
                    vVar3 = vVar12;
                    z16 = z115;
                    i0Var2 = i0VarC;
                } else {
                    sVar2.Y();
                    z13 = true;
                    if ((i11 & 1) != 0) {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var1111 = j0.f30447a;
                            i23 &= -7169;
                            w0VarA = y7.a(k1.l.f37604c, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var1112 = j0.f30447a;
                            i23 &= -57345;
                            i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                        }
                        if ((i12 & 32) != 0) {
                            i23 &= -458753;
                            n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                        }
                        if (i16 != 0) {
                            vVar2 = null;
                        }
                        if (i18 != 0) {
                            t1Var2 = j0.f30447a;
                        } else {
                            t1Var2 = t1Var;
                        }
                    } else {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var1113 = j0.f30447a;
                            i23 &= -7169;
                            w0VarA = y7.a(k1.l.f37604c, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var1114 = j0.f30447a;
                            i23 &= -57345;
                            i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                        }
                        if ((i12 & 32) != 0) {
                            i23 &= -458753;
                            n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                        }
                        if (i16 != 0) {
                            vVar2 = null;
                        }
                        if (i18 != 0) {
                            t1Var2 = j0.f30447a;
                        } else {
                            t1Var2 = t1Var;
                        }
                    }
                    i24 = i23;
                    z14 = z12;
                    d0.v vVar13 = vVar2;
                    g2.w0 w0Var12 = w0VarA;
                    sVar2.q();
                    sVar2.d0(-239156623);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objQ = com.google.android.material.datepicker.d.f(sVar2);
                    }
                    iVar = (h0.i) objQ;
                    sVar2.p(false);
                    if (z14) {
                        j11 = i0VarC.f30386a;
                    } else {
                        j11 = i0VarC.f30388c;
                    }
                    j0.t1 t1Var13 = t1Var2;
                    if (z14) {
                        j12 = i0VarC.f30387b;
                    } else {
                        j12 = i0VarC.f30389d;
                    }
                    long j112 = j12;
                    sVar2.d0(-239150048);
                    if (n0VarB == null) {
                        iVar = iVar;
                        i0VarC = i0VarC;
                        n0Var2 = n0VarB;
                        z15 = z14;
                        nVar2 = null;
                    } else {
                        i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                        objQ2 = sVar2.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new x1.p();
                            sVar2.o0(objQ2);
                        }
                        pVar = (x1.p) objQ2;
                        zF = sVar2.f(iVar);
                        objQ3 = sVar2.Q();
                        if (zF) {
                            objQ3 = new l0(iVar, pVar, null, 0);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = new l0(iVar, pVar, null, 0);
                            sVar2.o0(objQ3);
                        }
                        l1.t.f((fz.e) objQ3, iVar, sVar2);
                        hVar = (h0.h) ry.m.A0(pVar);
                        if (!z14) {
                            f5 = n0VarB.f30715e;
                        } else if (hVar instanceof h0.k) {
                            f5 = n0VarB.f30712b;
                        } else if (hVar instanceof h0.f) {
                            f5 = n0VarB.f30714d;
                        } else if (hVar instanceof h0.d) {
                            f5 = n0VarB.f30713c;
                        } else {
                            f5 = n0VarB.f30711a;
                        }
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                            sVar2.o0(objQ4);
                        }
                        dVar = (b0.d) objQ4;
                        v3.f fVar11 = new v3.f(f5);
                        boolean zH11 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                        if (((i25 & 896) ^ 384) > 256) {
                        }
                        zH = zH11 | z13 | sVar2.h(hVar);
                        objQ5 = sVar2.Q();
                        if (zH) {
                            n0 n0Var111 = n0VarB;
                            z15 = z14;
                            objQ5 = new m0(dVar, f5, z15, n0Var111, hVar, null, 0);
                            n0Var2 = n0Var111;
                            sVar2.o0(objQ5);
                        } else {
                            n0 n0Var112 = n0VarB;
                            z15 = z14;
                            objQ5 = new m0(dVar, f5, z15, n0Var112, hVar, null, 0);
                            n0Var2 = n0Var112;
                            sVar2.o0(objQ5);
                        }
                        l1.t.f((fz.e) objQ5, fVar11, sVar2);
                        nVar2 = dVar.f3472c;
                    }
                    sVar2.p(false);
                    if (nVar2 != null) {
                        f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                    } else {
                        f11 = 0;
                    }
                    sVar = sVar2;
                    boolean z116 = z15;
                    i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z116, w0Var12, j11, j112, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar13, iVar, t1.e.d(956488494, new p0(j112, t1Var13, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                    n0Var3 = n0Var2;
                    t1Var3 = t1Var13;
                    rVar3 = rVar2;
                    w0Var2 = w0Var12;
                    vVar3 = vVar13;
                    z16 = z116;
                    i0Var2 = i0VarC;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new q0(aVar, rVar3, z16, w0Var2, i0Var2, n0Var3, vVar3, t1Var3, fVar, i11, i12);
                }
            }
            i13 |= 1572864;
            vVar2 = vVar;
            i18 = i12 & 128;
            if (i18 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (sVar2.f(t1Var)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            i21 = i13;
            if ((i12 & 256) != 0) {
                i21 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (sVar2.f(null)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i21 |= i22;
            }
            if ((i11 & 805306368) == 0) {
                if (sVar2.h(fVar)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i21 |= i26;
            }
            i23 = i21;
            if ((i23 & 306783379) == 306783378) {
                sVar2.Y();
                z13 = true;
                if ((i11 & 1) != 0) {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var1115 = j0.f30447a;
                        i23 &= -7169;
                        w0VarA = y7.a(k1.l.f37604c, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var1116 = j0.f30447a;
                        i23 &= -57345;
                        i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 32) != 0) {
                        i23 &= -458753;
                        n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                    }
                    if (i16 != 0) {
                        vVar2 = null;
                    }
                    if (i18 != 0) {
                        t1Var2 = j0.f30447a;
                    } else {
                        t1Var2 = t1Var;
                    }
                } else {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var1117 = j0.f30447a;
                        i23 &= -7169;
                        w0VarA = y7.a(k1.l.f37604c, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var1118 = j0.f30447a;
                        i23 &= -57345;
                        i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 32) != 0) {
                        i23 &= -458753;
                        n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                    }
                    if (i16 != 0) {
                        vVar2 = null;
                    }
                    if (i18 != 0) {
                        t1Var2 = j0.f30447a;
                    } else {
                        t1Var2 = t1Var;
                    }
                }
                i24 = i23;
                z14 = z12;
                d0.v vVar14 = vVar2;
                g2.w0 w0Var13 = w0VarA;
                sVar2.q();
                sVar2.d0(-239156623);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = com.google.android.material.datepicker.d.f(sVar2);
                }
                iVar = (h0.i) objQ;
                sVar2.p(false);
                if (z14) {
                    j11 = i0VarC.f30386a;
                } else {
                    j11 = i0VarC.f30388c;
                }
                j0.t1 t1Var14 = t1Var2;
                if (z14) {
                    j12 = i0VarC.f30387b;
                } else {
                    j12 = i0VarC.f30389d;
                }
                long j113 = j12;
                sVar2.d0(-239150048);
                if (n0VarB == null) {
                    iVar = iVar;
                    i0VarC = i0VarC;
                    n0Var2 = n0VarB;
                    z15 = z14;
                    nVar2 = null;
                } else {
                    i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                    objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new x1.p();
                        sVar2.o0(objQ2);
                    }
                    pVar = (x1.p) objQ2;
                    zF = sVar2.f(iVar);
                    objQ3 = sVar2.Q();
                    if (zF) {
                        objQ3 = new l0(iVar, pVar, null, 0);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = new l0(iVar, pVar, null, 0);
                        sVar2.o0(objQ3);
                    }
                    l1.t.f((fz.e) objQ3, iVar, sVar2);
                    hVar = (h0.h) ry.m.A0(pVar);
                    if (!z14) {
                        f5 = n0VarB.f30715e;
                    } else if (hVar instanceof h0.k) {
                        f5 = n0VarB.f30712b;
                    } else if (hVar instanceof h0.f) {
                        f5 = n0VarB.f30714d;
                    } else if (hVar instanceof h0.d) {
                        f5 = n0VarB.f30713c;
                    } else {
                        f5 = n0VarB.f30711a;
                    }
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                        sVar2.o0(objQ4);
                    }
                    dVar = (b0.d) objQ4;
                    v3.f fVar12 = new v3.f(f5);
                    boolean zH12 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                    if (((i25 & 896) ^ 384) > 256) {
                    }
                    zH = zH12 | z13 | sVar2.h(hVar);
                    objQ5 = sVar2.Q();
                    if (zH) {
                        n0 n0Var113 = n0VarB;
                        z15 = z14;
                        objQ5 = new m0(dVar, f5, z15, n0Var113, hVar, null, 0);
                        n0Var2 = n0Var113;
                        sVar2.o0(objQ5);
                    } else {
                        n0 n0Var114 = n0VarB;
                        z15 = z14;
                        objQ5 = new m0(dVar, f5, z15, n0Var114, hVar, null, 0);
                        n0Var2 = n0Var114;
                        sVar2.o0(objQ5);
                    }
                    l1.t.f((fz.e) objQ5, fVar12, sVar2);
                    nVar2 = dVar.f3472c;
                }
                sVar2.p(false);
                if (nVar2 != null) {
                    f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                } else {
                    f11 = 0;
                }
                sVar = sVar2;
                boolean z117 = z15;
                i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z117, w0Var13, j11, j113, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar14, iVar, t1.e.d(956488494, new p0(j113, t1Var14, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                n0Var3 = n0Var2;
                t1Var3 = t1Var14;
                rVar3 = rVar2;
                w0Var2 = w0Var13;
                vVar3 = vVar14;
                z16 = z117;
                i0Var2 = i0VarC;
            } else {
                sVar2.Y();
                z13 = true;
                if ((i11 & 1) != 0) {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var1119 = j0.f30447a;
                        i23 &= -7169;
                        w0VarA = y7.a(k1.l.f37604c, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var11110 = j0.f30447a;
                        i23 &= -57345;
                        i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 32) != 0) {
                        i23 &= -458753;
                        n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                    }
                    if (i16 != 0) {
                        vVar2 = null;
                    }
                    if (i18 != 0) {
                        t1Var2 = j0.f30447a;
                    } else {
                        t1Var2 = t1Var;
                    }
                } else {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var11111 = j0.f30447a;
                        i23 &= -7169;
                        w0VarA = y7.a(k1.l.f37604c, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var11112 = j0.f30447a;
                        i23 &= -57345;
                        i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 32) != 0) {
                        i23 &= -458753;
                        n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                    }
                    if (i16 != 0) {
                        vVar2 = null;
                    }
                    if (i18 != 0) {
                        t1Var2 = j0.f30447a;
                    } else {
                        t1Var2 = t1Var;
                    }
                }
                i24 = i23;
                z14 = z12;
                d0.v vVar15 = vVar2;
                g2.w0 w0Var14 = w0VarA;
                sVar2.q();
                sVar2.d0(-239156623);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = com.google.android.material.datepicker.d.f(sVar2);
                }
                iVar = (h0.i) objQ;
                sVar2.p(false);
                if (z14) {
                    j11 = i0VarC.f30386a;
                } else {
                    j11 = i0VarC.f30388c;
                }
                j0.t1 t1Var15 = t1Var2;
                if (z14) {
                    j12 = i0VarC.f30387b;
                } else {
                    j12 = i0VarC.f30389d;
                }
                long j114 = j12;
                sVar2.d0(-239150048);
                if (n0VarB == null) {
                    iVar = iVar;
                    i0VarC = i0VarC;
                    n0Var2 = n0VarB;
                    z15 = z14;
                    nVar2 = null;
                } else {
                    i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                    objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new x1.p();
                        sVar2.o0(objQ2);
                    }
                    pVar = (x1.p) objQ2;
                    zF = sVar2.f(iVar);
                    objQ3 = sVar2.Q();
                    if (zF) {
                        objQ3 = new l0(iVar, pVar, null, 0);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = new l0(iVar, pVar, null, 0);
                        sVar2.o0(objQ3);
                    }
                    l1.t.f((fz.e) objQ3, iVar, sVar2);
                    hVar = (h0.h) ry.m.A0(pVar);
                    if (!z14) {
                        f5 = n0VarB.f30715e;
                    } else if (hVar instanceof h0.k) {
                        f5 = n0VarB.f30712b;
                    } else if (hVar instanceof h0.f) {
                        f5 = n0VarB.f30714d;
                    } else if (hVar instanceof h0.d) {
                        f5 = n0VarB.f30713c;
                    } else {
                        f5 = n0VarB.f30711a;
                    }
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                        sVar2.o0(objQ4);
                    }
                    dVar = (b0.d) objQ4;
                    v3.f fVar13 = new v3.f(f5);
                    boolean zH13 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                    if (((i25 & 896) ^ 384) > 256) {
                    }
                    zH = zH13 | z13 | sVar2.h(hVar);
                    objQ5 = sVar2.Q();
                    if (zH) {
                        n0 n0Var115 = n0VarB;
                        z15 = z14;
                        objQ5 = new m0(dVar, f5, z15, n0Var115, hVar, null, 0);
                        n0Var2 = n0Var115;
                        sVar2.o0(objQ5);
                    } else {
                        n0 n0Var116 = n0VarB;
                        z15 = z14;
                        objQ5 = new m0(dVar, f5, z15, n0Var116, hVar, null, 0);
                        n0Var2 = n0Var116;
                        sVar2.o0(objQ5);
                    }
                    l1.t.f((fz.e) objQ5, fVar13, sVar2);
                    nVar2 = dVar.f3472c;
                }
                sVar2.p(false);
                if (nVar2 != null) {
                    f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                } else {
                    f11 = 0;
                }
                sVar = sVar2;
                boolean z118 = z15;
                i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z118, w0Var14, j11, j114, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar15, iVar, t1.e.d(956488494, new p0(j114, t1Var15, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                n0Var3 = n0Var2;
                t1Var3 = t1Var15;
                rVar3 = rVar2;
                w0Var2 = w0Var14;
                vVar3 = vVar15;
                z16 = z118;
                i0Var2 = i0VarC;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new q0(aVar, rVar3, z16, w0Var2, i0Var2, n0Var3, vVar3, t1Var3, fVar, i11, i12);
            }
        }
        i13 |= 384;
        z12 = z11;
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                w0VarA = w0Var;
                if (sVar2.f(w0VarA)) {
                }
                i13 |= i29;
            } else {
                w0VarA = w0Var;
            }
            i13 |= i29;
        } else {
            w0VarA = w0Var;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                i0VarC = i0Var;
                if (sVar2.f(i0VarC)) {
                    i27 = 16384;
                }
                i13 |= i27;
            } else {
                i0VarC = i0Var;
            }
            i27 = OSSConstants.DEFAULT_BUFFER_SIZE;
            i13 |= i27;
        } else {
            i0VarC = i0Var;
        }
        if ((196608 & i11) == 0) {
            if ((i12 & 32) == 0) {
                n0VarB = n0Var;
                if (sVar2.f(n0VarB)) {
                }
                i13 |= i30;
            } else {
                n0VarB = n0Var;
            }
            i13 |= i30;
        } else {
            n0VarB = n0Var;
        }
        i16 = i12 & 64;
        if (i16 != 0) {
            if ((1572864 & i11) == 0) {
                vVar2 = vVar;
                if (sVar2.f(vVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i13 |= i17;
            }
            i18 = i12 & 128;
            if (i18 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (sVar2.f(t1Var)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            i21 = i13;
            if ((i12 & 256) != 0) {
                i21 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (sVar2.f(null)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i21 |= i22;
            }
            if ((i11 & 805306368) == 0) {
                if (sVar2.h(fVar)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i21 |= i26;
            }
            i23 = i21;
            if ((i23 & 306783379) == 306783378) {
                sVar2.Y();
                z13 = true;
                if ((i11 & 1) != 0) {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var11113 = j0.f30447a;
                        i23 &= -7169;
                        w0VarA = y7.a(k1.l.f37604c, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var11114 = j0.f30447a;
                        i23 &= -57345;
                        i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 32) != 0) {
                        i23 &= -458753;
                        n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                    }
                    if (i16 != 0) {
                        vVar2 = null;
                    }
                    if (i18 != 0) {
                        t1Var2 = j0.f30447a;
                    } else {
                        t1Var2 = t1Var;
                    }
                } else {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var11115 = j0.f30447a;
                        i23 &= -7169;
                        w0VarA = y7.a(k1.l.f37604c, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var11116 = j0.f30447a;
                        i23 &= -57345;
                        i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 32) != 0) {
                        i23 &= -458753;
                        n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                    }
                    if (i16 != 0) {
                        vVar2 = null;
                    }
                    if (i18 != 0) {
                        t1Var2 = j0.f30447a;
                    } else {
                        t1Var2 = t1Var;
                    }
                }
                i24 = i23;
                z14 = z12;
                d0.v vVar16 = vVar2;
                g2.w0 w0Var15 = w0VarA;
                sVar2.q();
                sVar2.d0(-239156623);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = com.google.android.material.datepicker.d.f(sVar2);
                }
                iVar = (h0.i) objQ;
                sVar2.p(false);
                if (z14) {
                    j11 = i0VarC.f30386a;
                } else {
                    j11 = i0VarC.f30388c;
                }
                j0.t1 t1Var16 = t1Var2;
                if (z14) {
                    j12 = i0VarC.f30387b;
                } else {
                    j12 = i0VarC.f30389d;
                }
                long j115 = j12;
                sVar2.d0(-239150048);
                if (n0VarB == null) {
                    iVar = iVar;
                    i0VarC = i0VarC;
                    n0Var2 = n0VarB;
                    z15 = z14;
                    nVar2 = null;
                } else {
                    i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                    objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new x1.p();
                        sVar2.o0(objQ2);
                    }
                    pVar = (x1.p) objQ2;
                    zF = sVar2.f(iVar);
                    objQ3 = sVar2.Q();
                    if (zF) {
                        objQ3 = new l0(iVar, pVar, null, 0);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = new l0(iVar, pVar, null, 0);
                        sVar2.o0(objQ3);
                    }
                    l1.t.f((fz.e) objQ3, iVar, sVar2);
                    hVar = (h0.h) ry.m.A0(pVar);
                    if (!z14) {
                        f5 = n0VarB.f30715e;
                    } else if (hVar instanceof h0.k) {
                        f5 = n0VarB.f30712b;
                    } else if (hVar instanceof h0.f) {
                        f5 = n0VarB.f30714d;
                    } else if (hVar instanceof h0.d) {
                        f5 = n0VarB.f30713c;
                    } else {
                        f5 = n0VarB.f30711a;
                    }
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                        sVar2.o0(objQ4);
                    }
                    dVar = (b0.d) objQ4;
                    v3.f fVar14 = new v3.f(f5);
                    boolean zH14 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                    if (((i25 & 896) ^ 384) > 256) {
                    }
                    zH = zH14 | z13 | sVar2.h(hVar);
                    objQ5 = sVar2.Q();
                    if (zH) {
                        n0 n0Var117 = n0VarB;
                        z15 = z14;
                        objQ5 = new m0(dVar, f5, z15, n0Var117, hVar, null, 0);
                        n0Var2 = n0Var117;
                        sVar2.o0(objQ5);
                    } else {
                        n0 n0Var118 = n0VarB;
                        z15 = z14;
                        objQ5 = new m0(dVar, f5, z15, n0Var118, hVar, null, 0);
                        n0Var2 = n0Var118;
                        sVar2.o0(objQ5);
                    }
                    l1.t.f((fz.e) objQ5, fVar14, sVar2);
                    nVar2 = dVar.f3472c;
                }
                sVar2.p(false);
                if (nVar2 != null) {
                    f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                } else {
                    f11 = 0;
                }
                sVar = sVar2;
                boolean z119 = z15;
                i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z119, w0Var15, j11, j115, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar16, iVar, t1.e.d(956488494, new p0(j115, t1Var16, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                n0Var3 = n0Var2;
                t1Var3 = t1Var16;
                rVar3 = rVar2;
                w0Var2 = w0Var15;
                vVar3 = vVar16;
                z16 = z119;
                i0Var2 = i0VarC;
            } else {
                sVar2.Y();
                z13 = true;
                if ((i11 & 1) != 0) {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var11117 = j0.f30447a;
                        i23 &= -7169;
                        w0VarA = y7.a(k1.l.f37604c, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var11118 = j0.f30447a;
                        i23 &= -57345;
                        i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 32) != 0) {
                        i23 &= -458753;
                        n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                    }
                    if (i16 != 0) {
                        vVar2 = null;
                    }
                    if (i18 != 0) {
                        t1Var2 = j0.f30447a;
                    } else {
                        t1Var2 = t1Var;
                    }
                } else {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var11119 = j0.f30447a;
                        i23 &= -7169;
                        w0VarA = y7.a(k1.l.f37604c, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var111110 = j0.f30447a;
                        i23 &= -57345;
                        i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 32) != 0) {
                        i23 &= -458753;
                        n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                    }
                    if (i16 != 0) {
                        vVar2 = null;
                    }
                    if (i18 != 0) {
                        t1Var2 = j0.f30447a;
                    } else {
                        t1Var2 = t1Var;
                    }
                }
                i24 = i23;
                z14 = z12;
                d0.v vVar17 = vVar2;
                g2.w0 w0Var16 = w0VarA;
                sVar2.q();
                sVar2.d0(-239156623);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = com.google.android.material.datepicker.d.f(sVar2);
                }
                iVar = (h0.i) objQ;
                sVar2.p(false);
                if (z14) {
                    j11 = i0VarC.f30386a;
                } else {
                    j11 = i0VarC.f30388c;
                }
                j0.t1 t1Var17 = t1Var2;
                if (z14) {
                    j12 = i0VarC.f30387b;
                } else {
                    j12 = i0VarC.f30389d;
                }
                long j116 = j12;
                sVar2.d0(-239150048);
                if (n0VarB == null) {
                    iVar = iVar;
                    i0VarC = i0VarC;
                    n0Var2 = n0VarB;
                    z15 = z14;
                    nVar2 = null;
                } else {
                    i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                    objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new x1.p();
                        sVar2.o0(objQ2);
                    }
                    pVar = (x1.p) objQ2;
                    zF = sVar2.f(iVar);
                    objQ3 = sVar2.Q();
                    if (zF) {
                        objQ3 = new l0(iVar, pVar, null, 0);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = new l0(iVar, pVar, null, 0);
                        sVar2.o0(objQ3);
                    }
                    l1.t.f((fz.e) objQ3, iVar, sVar2);
                    hVar = (h0.h) ry.m.A0(pVar);
                    if (!z14) {
                        f5 = n0VarB.f30715e;
                    } else if (hVar instanceof h0.k) {
                        f5 = n0VarB.f30712b;
                    } else if (hVar instanceof h0.f) {
                        f5 = n0VarB.f30714d;
                    } else if (hVar instanceof h0.d) {
                        f5 = n0VarB.f30713c;
                    } else {
                        f5 = n0VarB.f30711a;
                    }
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                        sVar2.o0(objQ4);
                    }
                    dVar = (b0.d) objQ4;
                    v3.f fVar15 = new v3.f(f5);
                    boolean zH15 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                    if (((i25 & 896) ^ 384) > 256) {
                    }
                    zH = zH15 | z13 | sVar2.h(hVar);
                    objQ5 = sVar2.Q();
                    if (zH) {
                        n0 n0Var119 = n0VarB;
                        z15 = z14;
                        objQ5 = new m0(dVar, f5, z15, n0Var119, hVar, null, 0);
                        n0Var2 = n0Var119;
                        sVar2.o0(objQ5);
                    } else {
                        n0 n0Var1110 = n0VarB;
                        z15 = z14;
                        objQ5 = new m0(dVar, f5, z15, n0Var1110, hVar, null, 0);
                        n0Var2 = n0Var1110;
                        sVar2.o0(objQ5);
                    }
                    l1.t.f((fz.e) objQ5, fVar15, sVar2);
                    nVar2 = dVar.f3472c;
                }
                sVar2.p(false);
                if (nVar2 != null) {
                    f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
                } else {
                    f11 = 0;
                }
                sVar = sVar2;
                boolean z1110 = z15;
                i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z1110, w0Var16, j11, j116, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar17, iVar, t1.e.d(956488494, new p0(j116, t1Var17, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                n0Var3 = n0Var2;
                t1Var3 = t1Var17;
                rVar3 = rVar2;
                w0Var2 = w0Var16;
                vVar3 = vVar17;
                z16 = z1110;
                i0Var2 = i0VarC;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new q0(aVar, rVar3, z16, w0Var2, i0Var2, n0Var3, vVar3, t1Var3, fVar, i11, i12);
            }
        }
        i13 |= 1572864;
        vVar2 = vVar;
        i18 = i12 & 128;
        if (i18 != 0) {
            i13 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            if (sVar2.f(t1Var)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i13 |= i19;
        }
        i21 = i13;
        if ((i12 & 256) != 0) {
            i21 |= 100663296;
        } else if ((i11 & 100663296) == 0) {
            if (sVar2.f(null)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i21 |= i22;
        }
        if ((i11 & 805306368) == 0) {
            if (sVar2.h(fVar)) {
                i26 = 536870912;
            } else {
                i26 = 268435456;
            }
            i21 |= i26;
        }
        i23 = i21;
        if ((i23 & 306783379) == 306783378) {
            sVar2.Y();
            z13 = true;
            if ((i11 & 1) != 0) {
                if (i28 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if ((i12 & 8) != 0) {
                    j0.v1 v1Var111111 = j0.f30447a;
                    i23 &= -7169;
                    w0VarA = y7.a(k1.l.f37604c, sVar2);
                }
                if ((i12 & 16) != 0) {
                    j0.v1 v1Var111112 = j0.f30447a;
                    i23 &= -57345;
                    i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                }
                if ((i12 & 32) != 0) {
                    i23 &= -458753;
                    n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                }
                if (i16 != 0) {
                    vVar2 = null;
                }
                if (i18 != 0) {
                    t1Var2 = j0.f30447a;
                } else {
                    t1Var2 = t1Var;
                }
            } else {
                if (i28 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if ((i12 & 8) != 0) {
                    j0.v1 v1Var111113 = j0.f30447a;
                    i23 &= -7169;
                    w0VarA = y7.a(k1.l.f37604c, sVar2);
                }
                if ((i12 & 16) != 0) {
                    j0.v1 v1Var111114 = j0.f30447a;
                    i23 &= -57345;
                    i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                }
                if ((i12 & 32) != 0) {
                    i23 &= -458753;
                    n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                }
                if (i16 != 0) {
                    vVar2 = null;
                }
                if (i18 != 0) {
                    t1Var2 = j0.f30447a;
                } else {
                    t1Var2 = t1Var;
                }
            }
            i24 = i23;
            z14 = z12;
            d0.v vVar18 = vVar2;
            g2.w0 w0Var17 = w0VarA;
            sVar2.q();
            sVar2.d0(-239156623);
            objQ = sVar2.Q();
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = com.google.android.material.datepicker.d.f(sVar2);
            }
            iVar = (h0.i) objQ;
            sVar2.p(false);
            if (z14) {
                j11 = i0VarC.f30386a;
            } else {
                j11 = i0VarC.f30388c;
            }
            j0.t1 t1Var18 = t1Var2;
            if (z14) {
                j12 = i0VarC.f30387b;
            } else {
                j12 = i0VarC.f30389d;
            }
            long j117 = j12;
            sVar2.d0(-239150048);
            if (n0VarB == null) {
                iVar = iVar;
                i0VarC = i0VarC;
                n0Var2 = n0VarB;
                z15 = z14;
                nVar2 = null;
            } else {
                i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                objQ2 = sVar2.Q();
                if (objQ2 == gVar) {
                    objQ2 = new x1.p();
                    sVar2.o0(objQ2);
                }
                pVar = (x1.p) objQ2;
                zF = sVar2.f(iVar);
                objQ3 = sVar2.Q();
                if (zF) {
                    objQ3 = new l0(iVar, pVar, null, 0);
                    sVar2.o0(objQ3);
                } else {
                    objQ3 = new l0(iVar, pVar, null, 0);
                    sVar2.o0(objQ3);
                }
                l1.t.f((fz.e) objQ3, iVar, sVar2);
                hVar = (h0.h) ry.m.A0(pVar);
                if (!z14) {
                    f5 = n0VarB.f30715e;
                } else if (hVar instanceof h0.k) {
                    f5 = n0VarB.f30712b;
                } else if (hVar instanceof h0.f) {
                    f5 = n0VarB.f30714d;
                } else if (hVar instanceof h0.d) {
                    f5 = n0VarB.f30713c;
                } else {
                    f5 = n0VarB.f30711a;
                }
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                    sVar2.o0(objQ4);
                }
                dVar = (b0.d) objQ4;
                v3.f fVar16 = new v3.f(f5);
                boolean zH16 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                if (((i25 & 896) ^ 384) > 256) {
                }
                zH = zH16 | z13 | sVar2.h(hVar);
                objQ5 = sVar2.Q();
                if (zH) {
                    n0 n0Var1111 = n0VarB;
                    z15 = z14;
                    objQ5 = new m0(dVar, f5, z15, n0Var1111, hVar, null, 0);
                    n0Var2 = n0Var1111;
                    sVar2.o0(objQ5);
                } else {
                    n0 n0Var1112 = n0VarB;
                    z15 = z14;
                    objQ5 = new m0(dVar, f5, z15, n0Var1112, hVar, null, 0);
                    n0Var2 = n0Var1112;
                    sVar2.o0(objQ5);
                }
                l1.t.f((fz.e) objQ5, fVar16, sVar2);
                nVar2 = dVar.f3472c;
            }
            sVar2.p(false);
            if (nVar2 != null) {
                f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
            } else {
                f11 = 0;
            }
            sVar = sVar2;
            boolean z1111 = z15;
            i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z1111, w0Var17, j11, j117, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar18, iVar, t1.e.d(956488494, new p0(j117, t1Var18, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
            n0Var3 = n0Var2;
            t1Var3 = t1Var18;
            rVar3 = rVar2;
            w0Var2 = w0Var17;
            vVar3 = vVar18;
            z16 = z1111;
            i0Var2 = i0VarC;
        } else {
            sVar2.Y();
            z13 = true;
            if ((i11 & 1) != 0) {
                if (i28 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if ((i12 & 8) != 0) {
                    j0.v1 v1Var111115 = j0.f30447a;
                    i23 &= -7169;
                    w0VarA = y7.a(k1.l.f37604c, sVar2);
                }
                if ((i12 & 16) != 0) {
                    j0.v1 v1Var111116 = j0.f30447a;
                    i23 &= -57345;
                    i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                }
                if ((i12 & 32) != 0) {
                    i23 &= -458753;
                    n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                }
                if (i16 != 0) {
                    vVar2 = null;
                }
                if (i18 != 0) {
                    t1Var2 = j0.f30447a;
                } else {
                    t1Var2 = t1Var;
                }
            } else {
                if (i28 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if ((i12 & 8) != 0) {
                    j0.v1 v1Var111117 = j0.f30447a;
                    i23 &= -7169;
                    w0VarA = y7.a(k1.l.f37604c, sVar2);
                }
                if ((i12 & 16) != 0) {
                    j0.v1 v1Var111118 = j0.f30447a;
                    i23 &= -57345;
                    i0VarC = j0.c((s1) sVar2.j(v1.f31180a));
                }
                if ((i12 & 32) != 0) {
                    i23 &= -458753;
                    n0VarB = j0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 31);
                }
                if (i16 != 0) {
                    vVar2 = null;
                }
                if (i18 != 0) {
                    t1Var2 = j0.f30447a;
                } else {
                    t1Var2 = t1Var;
                }
            }
            i24 = i23;
            z14 = z12;
            d0.v vVar19 = vVar2;
            g2.w0 w0Var18 = w0VarA;
            sVar2.q();
            sVar2.d0(-239156623);
            objQ = sVar2.Q();
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = com.google.android.material.datepicker.d.f(sVar2);
            }
            iVar = (h0.i) objQ;
            sVar2.p(false);
            if (z14) {
                j11 = i0VarC.f30386a;
            } else {
                j11 = i0VarC.f30388c;
            }
            j0.t1 t1Var19 = t1Var2;
            if (z14) {
                j12 = i0VarC.f30387b;
            } else {
                j12 = i0VarC.f30389d;
            }
            long j118 = j12;
            sVar2.d0(-239150048);
            if (n0VarB == null) {
                iVar = iVar;
                i0VarC = i0VarC;
                n0Var2 = n0VarB;
                z15 = z14;
                nVar2 = null;
            } else {
                i25 = ((i24 >> 6) & 14) | ((i24 >> 9) & 896);
                objQ2 = sVar2.Q();
                if (objQ2 == gVar) {
                    objQ2 = new x1.p();
                    sVar2.o0(objQ2);
                }
                pVar = (x1.p) objQ2;
                zF = sVar2.f(iVar);
                objQ3 = sVar2.Q();
                if (zF) {
                    objQ3 = new l0(iVar, pVar, null, 0);
                    sVar2.o0(objQ3);
                } else {
                    objQ3 = new l0(iVar, pVar, null, 0);
                    sVar2.o0(objQ3);
                }
                l1.t.f((fz.e) objQ3, iVar, sVar2);
                hVar = (h0.h) ry.m.A0(pVar);
                if (!z14) {
                    f5 = n0VarB.f30715e;
                } else if (hVar instanceof h0.k) {
                    f5 = n0VarB.f30712b;
                } else if (hVar instanceof h0.f) {
                    f5 = n0VarB.f30714d;
                } else if (hVar instanceof h0.d) {
                    f5 = n0VarB.f30713c;
                } else {
                    f5 = n0VarB.f30711a;
                }
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
                    sVar2.o0(objQ4);
                }
                dVar = (b0.d) objQ4;
                v3.f fVar17 = new v3.f(f5);
                boolean zH17 = sVar2.h(dVar) | sVar2.c(f5) | ((((i25 & 14) ^ 6) <= 4 && sVar2.g(z14)) || (i25 & 6) == 4);
                if (((i25 & 896) ^ 384) > 256) {
                }
                zH = zH17 | z13 | sVar2.h(hVar);
                objQ5 = sVar2.Q();
                if (zH) {
                    n0 n0Var1113 = n0VarB;
                    z15 = z14;
                    objQ5 = new m0(dVar, f5, z15, n0Var1113, hVar, null, 0);
                    n0Var2 = n0Var1113;
                    sVar2.o0(objQ5);
                } else {
                    n0 n0Var1114 = n0VarB;
                    z15 = z14;
                    objQ5 = new m0(dVar, f5, z15, n0Var1114, hVar, null, 0);
                    n0Var2 = n0Var1114;
                    sVar2.o0(objQ5);
                }
                l1.t.f((fz.e) objQ5, fVar17, sVar2);
                nVar2 = dVar.f3472c;
            }
            sVar2.p(false);
            if (nVar2 != null) {
                f11 = ((v3.f) nVar2.f3614b.getValue()).f53489a;
            } else {
                f11 = 0;
            }
            sVar = sVar2;
            boolean z1112 = z15;
            i9.c(aVar, g3.r.b(rVar2, false, o0.f30765b), z1112, w0Var18, j11, j118, CropImageView.DEFAULT_ASPECT_RATIO, f11, vVar19, iVar, t1.e.d(956488494, new p0(j118, t1Var19, fVar, 0), sVar2), sVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
            n0Var3 = n0Var2;
            t1Var3 = t1Var19;
            rVar3 = rVar2;
            w0Var2 = w0Var18;
            vVar3 = vVar19;
            z16 = z1112;
            i0Var2 = i0VarC;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q0(aVar, rVar3, z16, w0Var2, i0Var2, n0Var3, vVar3, t1Var3, fVar, i11, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x012e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0130  */
    /* JADX WARN: Code duplicated, block: B:115:0x0135  */
    /* JADX WARN: Code duplicated, block: B:116:0x013e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0143  */
    /* JADX WARN: Code duplicated, block: B:122:0x014e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0159  */
    /* JADX WARN: Code duplicated, block: B:128:0x016f  */
    /* JADX WARN: Code duplicated, block: B:131:0x017b  */
    /* JADX WARN: Code duplicated, block: B:133:0x017f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0184  */
    /* JADX WARN: Code duplicated, block: B:137:0x0189  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00db  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    public static final void c(fz.a aVar, z1.r rVar, boolean z11, g2.w0 w0Var, t0 t0Var, u0 u0Var, d0.v vVar, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        boolean z12;
        g2.w0 w0Var2;
        t0 t0VarO;
        u0 u0Var2;
        int i14;
        d0.v vVar2;
        int i15;
        int i16;
        boolean z13;
        g2.w0 w0VarA;
        u0 u0VarQ;
        g2.w0 w0Var3;
        d0.v vVar3;
        boolean z14;
        u0 u0Var3;
        Object objQ;
        long j11;
        long j12;
        d0.v vVar4;
        l1.s sVar;
        u0 u0Var4;
        l1.x1 x1VarT;
        int i17;
        u0 u0Var5;
        int i18;
        u0 u0Var6;
        u0 u0Var7;
        int i19;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-2024281376);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.h(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.f(rVar) ? 32 : 16;
        }
        int i21 = i12 & 4;
        if (i21 == 0) {
            if ((i11 & 384) == 0) {
                z12 = z11;
                i13 |= sVar2.g(z12) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    w0Var2 = w0Var;
                    int i22 = sVar2.f(w0Var2) ? 2048 : 1024;
                    i13 |= i22;
                } else {
                    w0Var2 = w0Var;
                }
                i13 |= i22;
            } else {
                w0Var2 = w0Var;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    t0VarO = t0Var;
                    if (sVar2.f(t0VarO)) {
                        i19 = 16384;
                    }
                    i13 |= i19;
                } else {
                    t0VarO = t0Var;
                }
                i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                i13 |= i19;
            } else {
                t0VarO = t0Var;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    u0Var7 = u0Var;
                    if (sVar2.f(u0Var7)) {
                        u0Var5 = u0Var7;
                        i18 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        u0Var6 = u0Var7;
                    }
                    i13 |= i18;
                    u0Var2 = u0Var6;
                } else {
                    u0Var5 = u0Var;
                }
                u0Var5 = u0Var7;
                i18 = 65536;
                u0Var6 = u0Var5;
                i13 |= i18;
                u0Var2 = u0Var6;
            } else {
                u0Var2 = u0Var;
            }
            i14 = i12 & 64;
            if (i14 != 0) {
                if ((1572864 & i11) == 0) {
                    vVar2 = vVar;
                    if (sVar2.f(vVar2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i13 |= i15;
                }
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (sVar2.f(null)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i13 |= i16;
                }
                if ((100663296 & i11) == 0) {
                    if (sVar2.h(dVar)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i13 |= i17;
                }
                if ((38347923 & i13) == 38347922 || !sVar2.F()) {
                    sVar2.Y();
                    if ((i11 & 1) != 0 || sVar2.C()) {
                        if (i21 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.m.f37615c, sVar2);
                            i13 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            t0VarO = o(sVar2);
                        }
                        u0VarQ = u0Var2;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                        }
                        if (i14 != 0) {
                            vVar2 = null;
                        }
                        w0Var3 = w0VarA;
                        vVar3 = vVar2;
                        z14 = z13;
                        u0Var3 = u0VarQ;
                    } else {
                        sVar2.W();
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                        }
                        w0Var3 = w0Var2;
                        vVar3 = vVar2;
                        z14 = z12;
                        u0Var3 = u0Var2;
                    }
                    sVar2.q();
                    sVar2.d0(1976524431);
                    objQ = sVar2.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = com.google.android.material.datepicker.d.f(sVar2);
                    }
                    h0.i iVar = (h0.i) objQ;
                    sVar2.p(false);
                    if (z14) {
                        j11 = t0VarO.f31084a;
                    } else {
                        j11 = t0VarO.f31086c;
                    }
                    long j13 = j11;
                    if (z14) {
                        j12 = t0VarO.f31085b;
                    } else {
                        j12 = t0VarO.f31087d;
                    }
                    l1.s sVar3 = sVar2;
                    i9.c(aVar, rVar, z14, w0Var3, j13, j12, CropImageView.DEFAULT_ASPECT_RATIO, ((v3.f) u0Var3.a(z14, iVar, sVar2, ((i13 >> 6) & 14) | ((i13 >> 9) & 896)).getValue()).f53489a, vVar3, iVar, t1.e.d(776921067, new f(dVar, 2, (byte) 0), sVar2), sVar3, (i13 & 8190) | ((i13 << 6) & 234881024), 64);
                    z12 = z14;
                    w0Var2 = w0Var3;
                    vVar4 = vVar3;
                    u0Var4 = u0Var3;
                    sVar = sVar3;
                } else {
                    sVar2.W();
                    sVar = sVar2;
                    vVar4 = vVar2;
                    u0Var4 = u0Var2;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new w0(aVar, rVar, z12, w0Var2, t0VarO, u0Var4, vVar4, dVar, i11, i12, 0);
                }
            }
            i13 |= 1572864;
            vVar2 = vVar;
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (sVar2.f(null)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i13 |= i16;
            }
            if ((100663296 & i11) == 0) {
                if (sVar2.h(dVar)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i13 |= i17;
            }
            if ((38347923 & i13) == 38347922) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.m.f37615c, sVar2);
                        i13 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        t0VarO = o(sVar2);
                    }
                    u0VarQ = u0Var2;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                    if (i14 != 0) {
                        vVar2 = null;
                    }
                    w0Var3 = w0VarA;
                    vVar3 = vVar2;
                    z14 = z13;
                    u0Var3 = u0VarQ;
                } else {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.m.f37615c, sVar2);
                        i13 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        t0VarO = o(sVar2);
                    }
                    u0VarQ = u0Var2;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                    if (i14 != 0) {
                        vVar2 = null;
                    }
                    w0Var3 = w0VarA;
                    vVar3 = vVar2;
                    z14 = z13;
                    u0Var3 = u0VarQ;
                }
                sVar2.q();
                sVar2.d0(1976524431);
                objQ = sVar2.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = com.google.android.material.datepicker.d.f(sVar2);
                }
                h0.i iVar2 = (h0.i) objQ;
                sVar2.p(false);
                if (z14) {
                    j11 = t0VarO.f31084a;
                } else {
                    j11 = t0VarO.f31086c;
                }
                long j14 = j11;
                if (z14) {
                    j12 = t0VarO.f31085b;
                } else {
                    j12 = t0VarO.f31087d;
                }
                l1.s sVar4 = sVar2;
                i9.c(aVar, rVar, z14, w0Var3, j14, j12, CropImageView.DEFAULT_ASPECT_RATIO, ((v3.f) u0Var3.a(z14, iVar2, sVar2, ((i13 >> 6) & 14) | ((i13 >> 9) & 896)).getValue()).f53489a, vVar3, iVar2, t1.e.d(776921067, new f(dVar, 2, (byte) 0), sVar2), sVar4, (i13 & 8190) | ((i13 << 6) & 234881024), 64);
                z12 = z14;
                w0Var2 = w0Var3;
                vVar4 = vVar3;
                u0Var4 = u0Var3;
                sVar = sVar4;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.m.f37615c, sVar2);
                        i13 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        t0VarO = o(sVar2);
                    }
                    u0VarQ = u0Var2;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                    if (i14 != 0) {
                        vVar2 = null;
                    }
                    w0Var3 = w0VarA;
                    vVar3 = vVar2;
                    z14 = z13;
                    u0Var3 = u0VarQ;
                } else {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.m.f37615c, sVar2);
                        i13 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        t0VarO = o(sVar2);
                    }
                    u0VarQ = u0Var2;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                    if (i14 != 0) {
                        vVar2 = null;
                    }
                    w0Var3 = w0VarA;
                    vVar3 = vVar2;
                    z14 = z13;
                    u0Var3 = u0VarQ;
                }
                sVar2.q();
                sVar2.d0(1976524431);
                objQ = sVar2.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = com.google.android.material.datepicker.d.f(sVar2);
                }
                h0.i iVar3 = (h0.i) objQ;
                sVar2.p(false);
                if (z14) {
                    j11 = t0VarO.f31084a;
                } else {
                    j11 = t0VarO.f31086c;
                }
                long j15 = j11;
                if (z14) {
                    j12 = t0VarO.f31085b;
                } else {
                    j12 = t0VarO.f31087d;
                }
                l1.s sVar5 = sVar2;
                i9.c(aVar, rVar, z14, w0Var3, j15, j12, CropImageView.DEFAULT_ASPECT_RATIO, ((v3.f) u0Var3.a(z14, iVar3, sVar2, ((i13 >> 6) & 14) | ((i13 >> 9) & 896)).getValue()).f53489a, vVar3, iVar3, t1.e.d(776921067, new f(dVar, 2, (byte) 0), sVar2), sVar5, (i13 & 8190) | ((i13 << 6) & 234881024), 64);
                z12 = z14;
                w0Var2 = w0Var3;
                vVar4 = vVar3;
                u0Var4 = u0Var3;
                sVar = sVar5;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new w0(aVar, rVar, z12, w0Var2, t0VarO, u0Var4, vVar4, dVar, i11, i12, 0);
            }
        }
        i13 |= 384;
        z12 = z11;
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                w0Var2 = w0Var;
                if (sVar2.f(w0Var2)) {
                }
                i13 |= i22;
            } else {
                w0Var2 = w0Var;
            }
            i13 |= i22;
        } else {
            w0Var2 = w0Var;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                t0VarO = t0Var;
                if (sVar2.f(t0VarO)) {
                    i19 = 16384;
                }
                i13 |= i19;
            } else {
                t0VarO = t0Var;
            }
            i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
            i13 |= i19;
        } else {
            t0VarO = t0Var;
        }
        if ((196608 & i11) == 0) {
            if ((i12 & 32) == 0) {
                u0Var7 = u0Var;
                if (sVar2.f(u0Var7)) {
                    u0Var5 = u0Var7;
                    i18 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    u0Var6 = u0Var7;
                }
                i13 |= i18;
                u0Var2 = u0Var6;
            } else {
                u0Var5 = u0Var;
            }
            u0Var5 = u0Var7;
            i18 = 65536;
            u0Var6 = u0Var5;
            i13 |= i18;
            u0Var2 = u0Var6;
        } else {
            u0Var2 = u0Var;
        }
        i14 = i12 & 64;
        if (i14 != 0) {
            if ((1572864 & i11) == 0) {
                vVar2 = vVar;
                if (sVar2.f(vVar2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i13 |= i15;
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (sVar2.f(null)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i13 |= i16;
            }
            if ((100663296 & i11) == 0) {
                if (sVar2.h(dVar)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i13 |= i17;
            }
            if ((38347923 & i13) == 38347922) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.m.f37615c, sVar2);
                        i13 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        t0VarO = o(sVar2);
                    }
                    u0VarQ = u0Var2;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                    if (i14 != 0) {
                        vVar2 = null;
                    }
                    w0Var3 = w0VarA;
                    vVar3 = vVar2;
                    z14 = z13;
                    u0Var3 = u0VarQ;
                } else {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.m.f37615c, sVar2);
                        i13 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        t0VarO = o(sVar2);
                    }
                    u0VarQ = u0Var2;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                    if (i14 != 0) {
                        vVar2 = null;
                    }
                    w0Var3 = w0VarA;
                    vVar3 = vVar2;
                    z14 = z13;
                    u0Var3 = u0VarQ;
                }
                sVar2.q();
                sVar2.d0(1976524431);
                objQ = sVar2.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = com.google.android.material.datepicker.d.f(sVar2);
                }
                h0.i iVar4 = (h0.i) objQ;
                sVar2.p(false);
                if (z14) {
                    j11 = t0VarO.f31084a;
                } else {
                    j11 = t0VarO.f31086c;
                }
                long j16 = j11;
                if (z14) {
                    j12 = t0VarO.f31085b;
                } else {
                    j12 = t0VarO.f31087d;
                }
                l1.s sVar6 = sVar2;
                i9.c(aVar, rVar, z14, w0Var3, j16, j12, CropImageView.DEFAULT_ASPECT_RATIO, ((v3.f) u0Var3.a(z14, iVar4, sVar2, ((i13 >> 6) & 14) | ((i13 >> 9) & 896)).getValue()).f53489a, vVar3, iVar4, t1.e.d(776921067, new f(dVar, 2, (byte) 0), sVar2), sVar6, (i13 & 8190) | ((i13 << 6) & 234881024), 64);
                z12 = z14;
                w0Var2 = w0Var3;
                vVar4 = vVar3;
                u0Var4 = u0Var3;
                sVar = sVar6;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.m.f37615c, sVar2);
                        i13 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        t0VarO = o(sVar2);
                    }
                    u0VarQ = u0Var2;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                    if (i14 != 0) {
                        vVar2 = null;
                    }
                    w0Var3 = w0VarA;
                    vVar3 = vVar2;
                    z14 = z13;
                    u0Var3 = u0VarQ;
                } else {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.m.f37615c, sVar2);
                        i13 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        t0VarO = o(sVar2);
                    }
                    u0VarQ = u0Var2;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                    if (i14 != 0) {
                        vVar2 = null;
                    }
                    w0Var3 = w0VarA;
                    vVar3 = vVar2;
                    z14 = z13;
                    u0Var3 = u0VarQ;
                }
                sVar2.q();
                sVar2.d0(1976524431);
                objQ = sVar2.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = com.google.android.material.datepicker.d.f(sVar2);
                }
                h0.i iVar5 = (h0.i) objQ;
                sVar2.p(false);
                if (z14) {
                    j11 = t0VarO.f31084a;
                } else {
                    j11 = t0VarO.f31086c;
                }
                long j17 = j11;
                if (z14) {
                    j12 = t0VarO.f31085b;
                } else {
                    j12 = t0VarO.f31087d;
                }
                l1.s sVar7 = sVar2;
                i9.c(aVar, rVar, z14, w0Var3, j17, j12, CropImageView.DEFAULT_ASPECT_RATIO, ((v3.f) u0Var3.a(z14, iVar5, sVar2, ((i13 >> 6) & 14) | ((i13 >> 9) & 896)).getValue()).f53489a, vVar3, iVar5, t1.e.d(776921067, new f(dVar, 2, (byte) 0), sVar2), sVar7, (i13 & 8190) | ((i13 << 6) & 234881024), 64);
                z12 = z14;
                w0Var2 = w0Var3;
                vVar4 = vVar3;
                u0Var4 = u0Var3;
                sVar = sVar7;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new w0(aVar, rVar, z12, w0Var2, t0VarO, u0Var4, vVar4, dVar, i11, i12, 0);
            }
        }
        i13 |= 1572864;
        vVar2 = vVar;
        if ((i12 & 128) != 0) {
            i13 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            if (sVar2.f(null)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i13 |= i16;
        }
        if ((100663296 & i11) == 0) {
            if (sVar2.h(dVar)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i13 |= i17;
        }
        if ((38347923 & i13) == 38347922) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    w0VarA = y7.a(k1.m.f37615c, sVar2);
                    i13 &= -7169;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    t0VarO = o(sVar2);
                }
                u0VarQ = u0Var2;
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                if (i14 != 0) {
                    vVar2 = null;
                }
                w0Var3 = w0VarA;
                vVar3 = vVar2;
                z14 = z13;
                u0Var3 = u0VarQ;
            } else {
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    w0VarA = y7.a(k1.m.f37615c, sVar2);
                    i13 &= -7169;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    t0VarO = o(sVar2);
                }
                u0VarQ = u0Var2;
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                if (i14 != 0) {
                    vVar2 = null;
                }
                w0Var3 = w0VarA;
                vVar3 = vVar2;
                z14 = z13;
                u0Var3 = u0VarQ;
            }
            sVar2.q();
            sVar2.d0(1976524431);
            objQ = sVar2.Q();
            if (objQ == l1.m.f39353a) {
                objQ = com.google.android.material.datepicker.d.f(sVar2);
            }
            h0.i iVar6 = (h0.i) objQ;
            sVar2.p(false);
            if (z14) {
                j11 = t0VarO.f31084a;
            } else {
                j11 = t0VarO.f31086c;
            }
            long j18 = j11;
            if (z14) {
                j12 = t0VarO.f31085b;
            } else {
                j12 = t0VarO.f31087d;
            }
            l1.s sVar8 = sVar2;
            i9.c(aVar, rVar, z14, w0Var3, j18, j12, CropImageView.DEFAULT_ASPECT_RATIO, ((v3.f) u0Var3.a(z14, iVar6, sVar2, ((i13 >> 6) & 14) | ((i13 >> 9) & 896)).getValue()).f53489a, vVar3, iVar6, t1.e.d(776921067, new f(dVar, 2, (byte) 0), sVar2), sVar8, (i13 & 8190) | ((i13 << 6) & 234881024), 64);
            z12 = z14;
            w0Var2 = w0Var3;
            vVar4 = vVar3;
            u0Var4 = u0Var3;
            sVar = sVar8;
        } else {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    w0VarA = y7.a(k1.m.f37615c, sVar2);
                    i13 &= -7169;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    t0VarO = o(sVar2);
                }
                u0VarQ = u0Var2;
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                if (i14 != 0) {
                    vVar2 = null;
                }
                w0Var3 = w0VarA;
                vVar3 = vVar2;
                z14 = z13;
                u0Var3 = u0VarQ;
            } else {
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    w0VarA = y7.a(k1.m.f37615c, sVar2);
                    i13 &= -7169;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    t0VarO = o(sVar2);
                }
                u0VarQ = u0Var2;
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                if (i14 != 0) {
                    vVar2 = null;
                }
                w0Var3 = w0VarA;
                vVar3 = vVar2;
                z14 = z13;
                u0Var3 = u0VarQ;
            }
            sVar2.q();
            sVar2.d0(1976524431);
            objQ = sVar2.Q();
            if (objQ == l1.m.f39353a) {
                objQ = com.google.android.material.datepicker.d.f(sVar2);
            }
            h0.i iVar7 = (h0.i) objQ;
            sVar2.p(false);
            if (z14) {
                j11 = t0VarO.f31084a;
            } else {
                j11 = t0VarO.f31086c;
            }
            long j19 = j11;
            if (z14) {
                j12 = t0VarO.f31085b;
            } else {
                j12 = t0VarO.f31087d;
            }
            l1.s sVar9 = sVar2;
            i9.c(aVar, rVar, z14, w0Var3, j19, j12, CropImageView.DEFAULT_ASPECT_RATIO, ((v3.f) u0Var3.a(z14, iVar7, sVar2, ((i13 >> 6) & 14) | ((i13 >> 9) & 896)).getValue()).f53489a, vVar3, iVar7, t1.e.d(776921067, new f(dVar, 2, (byte) 0), sVar2), sVar9, (i13 & 8190) | ((i13 << 6) & 234881024), 64);
            z12 = z14;
            w0Var2 = w0Var3;
            vVar4 = vVar3;
            u0Var4 = u0Var3;
            sVar = sVar9;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w0(aVar, rVar, z12, w0Var2, t0VarO, u0Var4, vVar4, dVar, i11, i12, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0178  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0114  */
    public static final void d(z1.r rVar, g2.w0 w0Var, t0 t0Var, u0 u0Var, d0.v vVar, t1.d dVar, l1.n nVar, int i11, int i12) {
        z1.r rVar2;
        int i13;
        g2.w0 w0Var2;
        t0 t0Var2;
        u0 u0VarQ;
        d0.v vVar2;
        z1.r rVar3;
        g2.w0 w0VarA;
        t0 t0VarO;
        z1.r rVar4;
        u0 u0Var2;
        g2.w0 w0Var3;
        d0.v vVar3;
        l1.s sVar;
        t0 t0Var3;
        g2.w0 w0Var4;
        d0.v vVar4;
        u0 u0Var3;
        z1.r rVar5;
        l1.x1 x1VarT;
        int i14;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1179621553);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            rVar2 = rVar;
        } else if ((i11 & 6) == 0) {
            rVar2 = rVar;
            i13 = (sVar2.f(rVar2) ? 4 : 2) | i11;
        } else {
            rVar2 = rVar;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                w0Var2 = w0Var;
                int i16 = sVar2.f(w0Var2) ? 32 : 16;
                i13 |= i16;
            } else {
                w0Var2 = w0Var;
            }
            i13 |= i16;
        } else {
            w0Var2 = w0Var;
        }
        if ((i11 & 384) == 0) {
            if ((i12 & 4) == 0) {
                t0Var2 = t0Var;
                int i17 = sVar2.f(t0Var2) ? 256 : 128;
                i13 |= i17;
            } else {
                t0Var2 = t0Var;
            }
            i13 |= i17;
        } else {
            t0Var2 = t0Var;
        }
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                u0VarQ = u0Var;
                int i18 = sVar2.f(u0VarQ) ? 2048 : 1024;
                i13 |= i18;
            } else {
                u0VarQ = u0Var;
            }
            i13 |= i18;
        } else {
            u0VarQ = u0Var;
        }
        int i19 = i12 & 16;
        if (i19 == 0) {
            if ((i11 & 24576) == 0) {
                vVar2 = vVar;
                i13 |= sVar2.f(vVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            if ((196608 & i11) == 0) {
                if (sVar2.h(dVar)) {
                    i14 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i14 = 65536;
                }
                i13 |= i14;
            }
            if ((74899 & i13) == 74898 || !sVar2.F()) {
                sVar2.Y();
                if ((i11 & 1) != 0 || sVar2.C()) {
                    if (i15 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 2) != 0) {
                        w0VarA = y7.a(k1.m.f37615c, sVar2);
                        i13 &= -113;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        t0VarO = o(sVar2);
                        i13 &= -897;
                    } else {
                        t0VarO = t0Var2;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                    if (i19 != 0) {
                        u0 u0Var4 = u0VarQ;
                        rVar4 = rVar3;
                        u0Var2 = u0Var4;
                        w0Var3 = w0VarA;
                        vVar3 = null;
                    } else {
                        u0 u0Var5 = u0VarQ;
                        rVar4 = rVar3;
                        u0Var2 = u0Var5;
                        w0Var3 = w0VarA;
                        vVar3 = vVar2;
                    }
                } else {
                    sVar2.W();
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    w0Var3 = w0Var2;
                    t0VarO = t0Var2;
                    u0Var2 = u0VarQ;
                    vVar3 = vVar2;
                    rVar4 = rVar2;
                }
                sVar2.q();
                sVar = sVar2;
                i9.a(rVar4, w0Var3, t0VarO.f31084a, t0VarO.f31085b, CropImageView.DEFAULT_ASPECT_RATIO, ((v3.f) u0Var2.a(true, null, sVar2, ((i13 >> 3) & 896) | 54).getValue()).f53489a, vVar3, t1.e.d(664103990, new f(dVar, 1, (byte) 0), sVar2), sVar, (i13 & 14) | 12582912 | (i13 & 112) | ((i13 << 6) & 3670016), 16);
                t0Var3 = t0VarO;
                w0Var4 = w0Var3;
                vVar4 = vVar3;
                u0Var3 = u0Var2;
                rVar5 = rVar4;
            } else {
                sVar2.W();
                sVar = sVar2;
                rVar5 = rVar2;
                w0Var4 = w0Var2;
                t0Var3 = t0Var2;
                u0Var3 = u0VarQ;
                vVar4 = vVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new v0(rVar5, w0Var4, t0Var3, u0Var3, vVar4, dVar, i11, i12, 0);
            }
        }
        i13 |= 24576;
        vVar2 = vVar;
        if ((196608 & i11) == 0) {
            if (sVar2.h(dVar)) {
                i14 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i14 = 65536;
            }
            i13 |= i14;
        }
        if ((74899 & i13) == 74898) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i15 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i12 & 2) != 0) {
                    w0VarA = y7.a(k1.m.f37615c, sVar2);
                    i13 &= -113;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 4) != 0) {
                    t0VarO = o(sVar2);
                    i13 &= -897;
                } else {
                    t0VarO = t0Var2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                if (i19 != 0) {
                    u0 u0Var6 = u0VarQ;
                    rVar4 = rVar3;
                    u0Var2 = u0Var6;
                    w0Var3 = w0VarA;
                    vVar3 = null;
                } else {
                    u0 u0Var7 = u0VarQ;
                    rVar4 = rVar3;
                    u0Var2 = u0Var7;
                    w0Var3 = w0VarA;
                    vVar3 = vVar2;
                }
            } else {
                if (i15 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i12 & 2) != 0) {
                    w0VarA = y7.a(k1.m.f37615c, sVar2);
                    i13 &= -113;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 4) != 0) {
                    t0VarO = o(sVar2);
                    i13 &= -897;
                } else {
                    t0VarO = t0Var2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                if (i19 != 0) {
                    u0 u0Var8 = u0VarQ;
                    rVar4 = rVar3;
                    u0Var2 = u0Var8;
                    w0Var3 = w0VarA;
                    vVar3 = null;
                } else {
                    u0 u0Var9 = u0VarQ;
                    rVar4 = rVar3;
                    u0Var2 = u0Var9;
                    w0Var3 = w0VarA;
                    vVar3 = vVar2;
                }
            }
            sVar2.q();
            sVar = sVar2;
            i9.a(rVar4, w0Var3, t0VarO.f31084a, t0VarO.f31085b, CropImageView.DEFAULT_ASPECT_RATIO, ((v3.f) u0Var2.a(true, null, sVar2, ((i13 >> 3) & 896) | 54).getValue()).f53489a, vVar3, t1.e.d(664103990, new f(dVar, 1, (byte) 0), sVar2), sVar, (i13 & 14) | 12582912 | (i13 & 112) | ((i13 << 6) & 3670016), 16);
            t0Var3 = t0VarO;
            w0Var4 = w0Var3;
            vVar4 = vVar3;
            u0Var3 = u0Var2;
            rVar5 = rVar4;
        } else {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i15 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i12 & 2) != 0) {
                    w0VarA = y7.a(k1.m.f37615c, sVar2);
                    i13 &= -113;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 4) != 0) {
                    t0VarO = o(sVar2);
                    i13 &= -897;
                } else {
                    t0VarO = t0Var2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                if (i19 != 0) {
                    u0 u0Var10 = u0VarQ;
                    rVar4 = rVar3;
                    u0Var2 = u0Var10;
                    w0Var3 = w0VarA;
                    vVar3 = null;
                } else {
                    u0 u0Var11 = u0VarQ;
                    rVar4 = rVar3;
                    u0Var2 = u0Var11;
                    w0Var3 = w0VarA;
                    vVar3 = vVar2;
                }
            } else {
                if (i15 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i12 & 2) != 0) {
                    w0VarA = y7.a(k1.m.f37615c, sVar2);
                    i13 &= -113;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 4) != 0) {
                    t0VarO = o(sVar2);
                    i13 &= -897;
                } else {
                    t0VarO = t0Var2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    u0VarQ = q(63, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                if (i19 != 0) {
                    u0 u0Var12 = u0VarQ;
                    rVar4 = rVar3;
                    u0Var2 = u0Var12;
                    w0Var3 = w0VarA;
                    vVar3 = null;
                } else {
                    u0 u0Var13 = u0VarQ;
                    rVar4 = rVar3;
                    u0Var2 = u0Var13;
                    w0Var3 = w0VarA;
                    vVar3 = vVar2;
                }
            }
            sVar2.q();
            sVar = sVar2;
            i9.a(rVar4, w0Var3, t0VarO.f31084a, t0VarO.f31085b, CropImageView.DEFAULT_ASPECT_RATIO, ((v3.f) u0Var2.a(true, null, sVar2, ((i13 >> 3) & 896) | 54).getValue()).f53489a, vVar3, t1.e.d(664103990, new f(dVar, 1, (byte) 0), sVar2), sVar, (i13 & 14) | 12582912 | (i13 & 112) | ((i13 << 6) & 3670016), 16);
            t0Var3 = t0VarO;
            w0Var4 = w0Var3;
            vVar4 = vVar3;
            u0Var3 = u0Var2;
            rVar5 = rVar4;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v0(rVar5, w0Var4, t0Var3, u0Var3, vVar4, dVar, i11, i12, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public static final void e(z1.r rVar, float f5, long j11, l1.n nVar, int i11, int i12) {
        float f11;
        long jD;
        int i13;
        float f12;
        int i14;
        z1.r rVar2;
        float density;
        float f13;
        z1.r rVar3;
        long j12;
        l1.x1 x1VarT;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1562471785);
        int i15 = i11 | 6;
        int i16 = i12 & 2;
        if (i16 == 0) {
            if ((i11 & 48) == 0) {
                f11 = f5;
                i15 |= sVar.c(f11) ? 32 : 16;
            }
            if ((i12 & 4) == 0) {
                jD = j11;
                i13 = sVar.e(jD) ? 256 : 128;
                if (((i15 | i13) & 147) == 146 || !sVar.F()) {
                    sVar.Y();
                    if ((i11 & 1) != 0 || sVar.C()) {
                        if (i16 != 0) {
                            f12 = y3.f31340a;
                        } else {
                            f12 = f11;
                        }
                        i14 = i12 & 4;
                        rVar2 = z1.o.f58481a;
                        if (i14 != 0) {
                            float f14 = y3.f31340a;
                            jD = v1.d(k1.f.f37509a, sVar);
                        }
                    } else {
                        sVar.W();
                        f12 = f11;
                        rVar2 = rVar;
                    }
                    sVar.q();
                    sVar.d0(-433645095);
                    if (v3.f.b(f12, CropImageView.DEFAULT_ASPECT_RATIO)) {
                        density = 1.0f / ((v3.c) sVar.j(z2.g1.f58547h)).getDensity();
                    } else {
                        density = f12;
                    }
                    sVar.p(false);
                    j0.o.a(d0.n.h(j0.e2.g(j0.e2.e(rVar2, 1.0f), density), jD, g2.f0.f28556b), sVar, 0);
                    f13 = f12;
                    rVar3 = rVar2;
                } else {
                    sVar.W();
                    rVar3 = rVar;
                    f13 = f11;
                }
                j12 = jD;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new z3(rVar3, f13, j12, i11, i12, 0);
                }
            }
            jD = j11;
            if (((i15 | i13) & 147) == 146) {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        f12 = y3.f31340a;
                    } else {
                        f12 = f11;
                    }
                    i14 = i12 & 4;
                    rVar2 = z1.o.f58481a;
                    if (i14 != 0) {
                        float f15 = y3.f31340a;
                        jD = v1.d(k1.f.f37509a, sVar);
                    }
                } else {
                    if (i16 != 0) {
                        f12 = y3.f31340a;
                    } else {
                        f12 = f11;
                    }
                    i14 = i12 & 4;
                    rVar2 = z1.o.f58481a;
                    if (i14 != 0) {
                        float f16 = y3.f31340a;
                        jD = v1.d(k1.f.f37509a, sVar);
                    }
                }
                sVar.q();
                sVar.d0(-433645095);
                if (v3.f.b(f12, CropImageView.DEFAULT_ASPECT_RATIO)) {
                    density = 1.0f / ((v3.c) sVar.j(z2.g1.f58547h)).getDensity();
                } else {
                    density = f12;
                }
                sVar.p(false);
                j0.o.a(d0.n.h(j0.e2.g(j0.e2.e(rVar2, 1.0f), density), jD, g2.f0.f28556b), sVar, 0);
                f13 = f12;
                rVar3 = rVar2;
            } else {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        f12 = y3.f31340a;
                    } else {
                        f12 = f11;
                    }
                    i14 = i12 & 4;
                    rVar2 = z1.o.f58481a;
                    if (i14 != 0) {
                        float f17 = y3.f31340a;
                        jD = v1.d(k1.f.f37509a, sVar);
                    }
                } else {
                    if (i16 != 0) {
                        f12 = y3.f31340a;
                    } else {
                        f12 = f11;
                    }
                    i14 = i12 & 4;
                    rVar2 = z1.o.f58481a;
                    if (i14 != 0) {
                        float f18 = y3.f31340a;
                        jD = v1.d(k1.f.f37509a, sVar);
                    }
                }
                sVar.q();
                sVar.d0(-433645095);
                if (v3.f.b(f12, CropImageView.DEFAULT_ASPECT_RATIO)) {
                    density = 1.0f / ((v3.c) sVar.j(z2.g1.f58547h)).getDensity();
                } else {
                    density = f12;
                }
                sVar.p(false);
                j0.o.a(d0.n.h(j0.e2.g(j0.e2.e(rVar2, 1.0f), density), jD, g2.f0.f28556b), sVar, 0);
                f13 = f12;
                rVar3 = rVar2;
            }
            j12 = jD;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new z3(rVar3, f13, j12, i11, i12, 0);
            }
        }
        i15 = i11 | 54;
        f11 = f5;
        if ((i12 & 4) == 0) {
            jD = j11;
            if (sVar.e(jD)) {
            }
            if (((i15 | i13) & 147) == 146) {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        f12 = y3.f31340a;
                    } else {
                        f12 = f11;
                    }
                    i14 = i12 & 4;
                    rVar2 = z1.o.f58481a;
                    if (i14 != 0) {
                        float f19 = y3.f31340a;
                        jD = v1.d(k1.f.f37509a, sVar);
                    }
                } else {
                    if (i16 != 0) {
                        f12 = y3.f31340a;
                    } else {
                        f12 = f11;
                    }
                    i14 = i12 & 4;
                    rVar2 = z1.o.f58481a;
                    if (i14 != 0) {
                        float f110 = y3.f31340a;
                        jD = v1.d(k1.f.f37509a, sVar);
                    }
                }
                sVar.q();
                sVar.d0(-433645095);
                if (v3.f.b(f12, CropImageView.DEFAULT_ASPECT_RATIO)) {
                    density = 1.0f / ((v3.c) sVar.j(z2.g1.f58547h)).getDensity();
                } else {
                    density = f12;
                }
                sVar.p(false);
                j0.o.a(d0.n.h(j0.e2.g(j0.e2.e(rVar2, 1.0f), density), jD, g2.f0.f28556b), sVar, 0);
                f13 = f12;
                rVar3 = rVar2;
            } else {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        f12 = y3.f31340a;
                    } else {
                        f12 = f11;
                    }
                    i14 = i12 & 4;
                    rVar2 = z1.o.f58481a;
                    if (i14 != 0) {
                        float f111 = y3.f31340a;
                        jD = v1.d(k1.f.f37509a, sVar);
                    }
                } else {
                    if (i16 != 0) {
                        f12 = y3.f31340a;
                    } else {
                        f12 = f11;
                    }
                    i14 = i12 & 4;
                    rVar2 = z1.o.f58481a;
                    if (i14 != 0) {
                        float f112 = y3.f31340a;
                        jD = v1.d(k1.f.f37509a, sVar);
                    }
                }
                sVar.q();
                sVar.d0(-433645095);
                if (v3.f.b(f12, CropImageView.DEFAULT_ASPECT_RATIO)) {
                    density = 1.0f / ((v3.c) sVar.j(z2.g1.f58547h)).getDensity();
                } else {
                    density = f12;
                }
                sVar.p(false);
                j0.o.a(d0.n.h(j0.e2.g(j0.e2.e(rVar2, 1.0f), density), jD, g2.f0.f28556b), sVar, 0);
                f13 = f12;
                rVar3 = rVar2;
            }
            j12 = jD;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new z3(rVar3, f13, j12, i11, i12, 0);
            }
        }
        jD = j11;
        if (((i15 | i13) & 147) == 146) {
            sVar.Y();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    f12 = y3.f31340a;
                } else {
                    f12 = f11;
                }
                i14 = i12 & 4;
                rVar2 = z1.o.f58481a;
                if (i14 != 0) {
                    float f113 = y3.f31340a;
                    jD = v1.d(k1.f.f37509a, sVar);
                }
            } else {
                if (i16 != 0) {
                    f12 = y3.f31340a;
                } else {
                    f12 = f11;
                }
                i14 = i12 & 4;
                rVar2 = z1.o.f58481a;
                if (i14 != 0) {
                    float f114 = y3.f31340a;
                    jD = v1.d(k1.f.f37509a, sVar);
                }
            }
            sVar.q();
            sVar.d0(-433645095);
            if (v3.f.b(f12, CropImageView.DEFAULT_ASPECT_RATIO)) {
                density = 1.0f / ((v3.c) sVar.j(z2.g1.f58547h)).getDensity();
            } else {
                density = f12;
            }
            sVar.p(false);
            j0.o.a(d0.n.h(j0.e2.g(j0.e2.e(rVar2, 1.0f), density), jD, g2.f0.f28556b), sVar, 0);
            f13 = f12;
            rVar3 = rVar2;
        } else {
            sVar.Y();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    f12 = y3.f31340a;
                } else {
                    f12 = f11;
                }
                i14 = i12 & 4;
                rVar2 = z1.o.f58481a;
                if (i14 != 0) {
                    float f115 = y3.f31340a;
                    jD = v1.d(k1.f.f37509a, sVar);
                }
            } else {
                if (i16 != 0) {
                    f12 = y3.f31340a;
                } else {
                    f12 = f11;
                }
                i14 = i12 & 4;
                rVar2 = z1.o.f58481a;
                if (i14 != 0) {
                    float f116 = y3.f31340a;
                    jD = v1.d(k1.f.f37509a, sVar);
                }
            }
            sVar.q();
            sVar.d0(-433645095);
            if (v3.f.b(f12, CropImageView.DEFAULT_ASPECT_RATIO)) {
                density = 1.0f / ((v3.c) sVar.j(z2.g1.f58547h)).getDensity();
            } else {
                density = f12;
            }
            sVar.p(false);
            j0.o.a(d0.n.h(j0.e2.g(j0.e2.e(rVar2, 1.0f), density), jD, g2.f0.f28556b), sVar, 0);
            f13 = f12;
            rVar3 = rVar2;
        }
        j12 = jD;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z3(rVar3, f13, j12, i11, i12, 0);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void f(u8 u8Var, z1.r rVar, l1.n nVar, int i11) {
        u8 u8Var2;
        t1.d dVar = e2.f30192a;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1316639904);
        int i12 = (i11 & 6) == 0 ? (sVar.f(u8Var) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
            u8Var2 = u8Var;
        } else {
            Object objQ = sVar.Q();
            Object obj = objQ;
            if (objQ == l1.m.f39353a) {
                e4 e4Var = new e4();
                e4Var.f30194a = new Object();
                e4Var.f30195b = new ArrayList();
                sVar.o0(e4Var);
                obj = e4Var;
            }
            e4 e4Var2 = (e4) obj;
            sVar.d0(-1256811491);
            Object obj2 = e4Var2.f30194a;
            ArrayList arrayList = e4Var2.f30195b;
            if (!kotlin.jvm.internal.m.a(u8Var, obj2)) {
                e4Var2.f30194a = u8Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList2.add((u8) ((d4) arrayList.get(i13)).f30137a);
                }
                ArrayList arrayListC1 = ry.m.c1(arrayList2);
                if (!arrayListC1.contains(u8Var)) {
                    arrayListC1.add(u8Var);
                }
                arrayList.clear();
                ArrayList arrayList3 = new ArrayList(arrayListC1.size());
                int size2 = arrayListC1.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    Object obj3 = arrayListC1.get(i14);
                    if (obj3 != null) {
                        arrayList3.add(obj3);
                    }
                }
                int size3 = arrayList3.size();
                int i15 = 0;
                while (i15 < size3) {
                    u8 u8Var3 = (u8) arrayList3.get(i15);
                    u8 u8Var4 = u8Var;
                    arrayList.add(new d4(u8Var3, t1.e.d(-1654683077, new a0.k(u8Var3, u8Var4, arrayListC1, e4Var2, 1), sVar)));
                    i15++;
                    u8Var = u8Var4;
                }
            }
            u8Var2 = u8Var;
            sVar.p(false);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            l1.x1 x1VarB = sVar.B();
            if (x1VarB == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            x1VarB.f39500b |= 1;
            e4Var2.f30196c = x1VarB;
            sVar.d0(1748085441);
            int size4 = arrayList.size();
            for (int i16 = 0; i16 < size4; i16++) {
                d4 d4Var = (d4) arrayList.get(i16);
                u8 u8Var5 = (u8) d4Var.f30137a;
                t1.d dVar2 = d4Var.f30138b;
                sVar.a0(1201076541, u8Var5);
                dVar2.invoke(t1.e.d(-1135367807, new s8(u8Var5, 0), sVar), sVar, 6);
                sVar.p(false);
            }
            sVar.p(false);
            sVar.p(true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u2(u8Var2, rVar, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    public static final void g(z1.r rVar, float f5, long j11, l1.n nVar, int i11, int i12) {
        int i13;
        long jD;
        int i14;
        boolean z11;
        boolean z12;
        Object objQ;
        long j12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(75144485);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.c(f5) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= ((i12 & 4) == 0 && sVar.e(j11)) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && sVar.F()) {
            sVar.W();
            j12 = j11;
        } else {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                if (i15 != 0) {
                    rVar = z1.o.f58481a;
                }
                if (i16 != 0) {
                    f5 = y3.f31340a;
                }
                if ((i12 & 4) != 0) {
                    float f11 = y3.f31340a;
                    jD = v1.d(k1.f.f37509a, sVar);
                    i13 &= -897;
                }
                sVar.q();
                z1.r rVarG = j0.e2.g(j0.e2.e(rVar, 1.0f), f5);
                i14 = 0;
                boolean z13 = true;
                if ((i13 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((((i13 & 896) ^ 384) > 256 || !sVar.e(jD)) && (i13 & 384) != 256) {
                }
                z12 = z11 | z13;
                objQ = sVar.Q();
                if (z12 || objQ == l1.m.f39353a) {
                    objQ = new a4(f5, i14, jD);
                    sVar.o0(objQ);
                }
                d0.n.b(0, (fz.c) objQ, sVar, rVarG);
                j12 = jD;
            } else {
                sVar.W();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
            }
            jD = j11;
            sVar.q();
            z1.r rVarG2 = j0.e2.g(j0.e2.e(rVar, 1.0f), f5);
            i14 = 0;
            boolean z14 = true;
            if ((i13 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z14 = ((i13 & 896) ^ 384) > 256 ? false : false;
            z12 = z11 | z14;
            objQ = sVar.Q();
            if (z12) {
                objQ = new a4(f5, i14, jD);
                sVar.o0(objQ);
            } else {
                objQ = new a4(f5, i14, jD);
                sVar.o0(objQ);
            }
            d0.n.b(0, (fz.c) objQ, sVar, rVarG2);
            j12 = jD;
        }
        z1.r rVar2 = rVar;
        float f12 = f5;
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z3(rVar2, f12, j12, i11, i12, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x0104  */
    /* JADX WARN: Code duplicated, block: B:78:0x0109  */
    /* JADX WARN: Code duplicated, block: B:80:0x0124  */
    /* JADX WARN: Code duplicated, block: B:84:0x0144  */
    /* JADX WARN: Code duplicated, block: B:85:0x0147  */
    /* JADX WARN: Code duplicated, block: B:88:0x0192  */
    /* JADX WARN: Code duplicated, block: B:89:0x0196  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c4  */
    public static final void h(fz.a aVar, z1.r rVar, boolean z11, o4 o4Var, fz.e eVar, l1.n nVar, int i11, int i12) {
        fz.a aVar2;
        int i13;
        z1.r rVar2;
        int i14;
        boolean z12;
        int i15;
        o4 o4Var2;
        int i16;
        z1.r rVar3;
        long j11;
        s1 s1Var;
        o4 o4Var3;
        o4 o4VarA;
        o4 o4Var4;
        boolean z13;
        long j12;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        long j13;
        z1.r rVar4;
        boolean z14;
        o4 o4Var5;
        l1.x1 x1VarT;
        int i17;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1142896114);
        if ((i11 & 6) == 0) {
            aVar2 = aVar;
            i13 = (sVar.h(aVar2) ? 4 : 2) | i11;
        } else {
            aVar2 = aVar;
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 384) == 0) {
                    z12 = z11;
                    if (sVar.g(z12)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i11 & 3072) == 0) {
                    if ((i12 & 8) == 0) {
                        o4Var2 = o4Var;
                        int i19 = sVar.f(o4Var2) ? 2048 : 1024;
                        i13 |= i19;
                    } else {
                        o4Var2 = o4Var;
                    }
                    i13 |= i19;
                } else {
                    o4Var2 = o4Var;
                }
                i16 = i13 | 24576;
                if ((196608 & i11) == 0) {
                    if (sVar.h(eVar)) {
                        i17 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i17 = 65536;
                    }
                    i16 |= i17;
                }
                if ((74899 & i16) == 74898 || !sVar.F()) {
                    sVar.Y();
                    if ((i11 & 1) != 0 || sVar.C()) {
                        if (i18 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 8) != 0) {
                            sVar.d0(-1519621781);
                            j11 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                            s1Var = (s1) sVar.j(v1.f31180a);
                            o4Var3 = s1Var.U;
                            if (o4Var3 == null) {
                                long j14 = g2.x.f28621h;
                                o4Var3 = new o4(j14, j11, j14, g2.x.c(j11, 0.38f));
                                s1Var.U = o4Var3;
                            }
                            int i21 = i16;
                            if (g2.x.d(o4Var3.f30785b, j11)) {
                                sVar.p(false);
                                o4VarA = o4Var3;
                            } else {
                                o4VarA = o4Var3.a(o4Var3.f30784a, j11, o4Var3.f30786c, g2.x.c(j11, 0.38f));
                                sVar.p(false);
                            }
                            i16 = i21 & (-7169);
                            o4Var2 = o4VarA;
                        }
                        rVar2 = rVar3;
                    } else {
                        sVar.W();
                        if ((i12 & 8) != 0) {
                            i16 &= -7169;
                        }
                    }
                    o4Var4 = o4Var2;
                    z13 = z12;
                    sVar.q();
                    l1.c3 c3Var = s4.f31053a;
                    z1.r rVarI = rVar2.i(c5.f30080a);
                    float f5 = k1.p.f37685c;
                    z1.r rVarB = d2.h.b(j0.e2.n(rVarI, f5), y7.a(k1.p.f37684b, sVar));
                    if (z13) {
                        j12 = o4Var4.f30784a;
                    } else {
                        j12 = o4Var4.f30786c;
                    }
                    z1.r rVarN = d0.n.n(d0.n.h(rVarB, j12, g2.f0.f28556b), null, l7.a(false, f5 / 2, 0L, sVar, 54, 4), z13, new g3.k(0), aVar2, 8);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarN);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    if (z13) {
                        j13 = o4Var4.f30785b;
                    } else {
                        j13 = o4Var4.f30787d;
                    }
                    l1.t.a(h2.f30320a.a(new g2.x(j13)), eVar, sVar, ((i16 >> 12) & 112) | 8);
                    sVar.p(true);
                    rVar4 = rVar2;
                    z14 = z13;
                    o4Var5 = o4Var4;
                } else {
                    sVar.W();
                    rVar4 = rVar2;
                    z14 = z12;
                    o4Var5 = o4Var2;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new c1(aVar, rVar4, z14, o4Var5, eVar, i11, i12);
                }
            }
            i13 |= 384;
            z12 = z11;
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    o4Var2 = o4Var;
                    if (sVar.f(o4Var2)) {
                    }
                    i13 |= i19;
                } else {
                    o4Var2 = o4Var;
                }
                i13 |= i19;
            } else {
                o4Var2 = o4Var;
            }
            i16 = i13 | 24576;
            if ((196608 & i11) == 0) {
                if (sVar.h(eVar)) {
                    i17 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i17 = 65536;
                }
                i16 |= i17;
            }
            if ((74899 & i16) == 74898) {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        sVar.d0(-1519621781);
                        j11 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                        s1Var = (s1) sVar.j(v1.f31180a);
                        o4Var3 = s1Var.U;
                        if (o4Var3 == null) {
                            long j15 = g2.x.f28621h;
                            o4Var3 = new o4(j15, j11, j15, g2.x.c(j11, 0.38f));
                            s1Var.U = o4Var3;
                        }
                        int i22 = i16;
                        if (g2.x.d(o4Var3.f30785b, j11)) {
                            sVar.p(false);
                            o4VarA = o4Var3;
                        } else {
                            o4VarA = o4Var3.a(o4Var3.f30784a, j11, o4Var3.f30786c, g2.x.c(j11, 0.38f));
                            sVar.p(false);
                        }
                        i16 = i22 & (-7169);
                        o4Var2 = o4VarA;
                    }
                    rVar2 = rVar3;
                } else {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        sVar.d0(-1519621781);
                        j11 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                        s1Var = (s1) sVar.j(v1.f31180a);
                        o4Var3 = s1Var.U;
                        if (o4Var3 == null) {
                            long j16 = g2.x.f28621h;
                            o4Var3 = new o4(j16, j11, j16, g2.x.c(j11, 0.38f));
                            s1Var.U = o4Var3;
                        }
                        int i23 = i16;
                        if (g2.x.d(o4Var3.f30785b, j11)) {
                            sVar.p(false);
                            o4VarA = o4Var3;
                        } else {
                            o4VarA = o4Var3.a(o4Var3.f30784a, j11, o4Var3.f30786c, g2.x.c(j11, 0.38f));
                            sVar.p(false);
                        }
                        i16 = i23 & (-7169);
                        o4Var2 = o4VarA;
                    }
                    rVar2 = rVar3;
                }
                o4Var4 = o4Var2;
                z13 = z12;
                sVar.q();
                l1.c3 c3Var2 = s4.f31053a;
                z1.r rVarI2 = rVar2.i(c5.f30080a);
                float f11 = k1.p.f37685c;
                z1.r rVarB2 = d2.h.b(j0.e2.n(rVarI2, f11), y7.a(k1.p.f37684b, sVar));
                if (z13) {
                    j12 = o4Var4.f30784a;
                } else {
                    j12 = o4Var4.f30786c;
                }
                z1.r rVarN2 = d0.n.n(d0.n.h(rVarB2, j12, g2.f0.f28556b), null, l7.a(false, f11 / 2, 0L, sVar, 54, 4), z13, new g3.k(0), aVar2, 8);
                w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarN2);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD2, sVar);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar);
                if (z13) {
                    j13 = o4Var4.f30785b;
                } else {
                    j13 = o4Var4.f30787d;
                }
                l1.t.a(h2.f30320a.a(new g2.x(j13)), eVar, sVar, ((i16 >> 12) & 112) | 8);
                sVar.p(true);
                rVar4 = rVar2;
                z14 = z13;
                o4Var5 = o4Var4;
            } else {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        sVar.d0(-1519621781);
                        j11 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                        s1Var = (s1) sVar.j(v1.f31180a);
                        o4Var3 = s1Var.U;
                        if (o4Var3 == null) {
                            long j17 = g2.x.f28621h;
                            o4Var3 = new o4(j17, j11, j17, g2.x.c(j11, 0.38f));
                            s1Var.U = o4Var3;
                        }
                        int i24 = i16;
                        if (g2.x.d(o4Var3.f30785b, j11)) {
                            sVar.p(false);
                            o4VarA = o4Var3;
                        } else {
                            o4VarA = o4Var3.a(o4Var3.f30784a, j11, o4Var3.f30786c, g2.x.c(j11, 0.38f));
                            sVar.p(false);
                        }
                        i16 = i24 & (-7169);
                        o4Var2 = o4VarA;
                    }
                    rVar2 = rVar3;
                } else {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        sVar.d0(-1519621781);
                        j11 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                        s1Var = (s1) sVar.j(v1.f31180a);
                        o4Var3 = s1Var.U;
                        if (o4Var3 == null) {
                            long j18 = g2.x.f28621h;
                            o4Var3 = new o4(j18, j11, j18, g2.x.c(j11, 0.38f));
                            s1Var.U = o4Var3;
                        }
                        int i25 = i16;
                        if (g2.x.d(o4Var3.f30785b, j11)) {
                            sVar.p(false);
                            o4VarA = o4Var3;
                        } else {
                            o4VarA = o4Var3.a(o4Var3.f30784a, j11, o4Var3.f30786c, g2.x.c(j11, 0.38f));
                            sVar.p(false);
                        }
                        i16 = i25 & (-7169);
                        o4Var2 = o4VarA;
                    }
                    rVar2 = rVar3;
                }
                o4Var4 = o4Var2;
                z13 = z12;
                sVar.q();
                l1.c3 c3Var3 = s4.f31053a;
                z1.r rVarI3 = rVar2.i(c5.f30080a);
                float f12 = k1.p.f37685c;
                z1.r rVarB3 = d2.h.b(j0.e2.n(rVarI3, f12), y7.a(k1.p.f37684b, sVar));
                if (z13) {
                    j12 = o4Var4.f30784a;
                } else {
                    j12 = o4Var4.f30786c;
                }
                z1.r rVarN3 = d0.n.n(d0.n.h(rVarB3, j12, g2.f0.f28556b), null, l7.a(false, f12 / 2, 0L, sVar, 54, 4), z13, new g3.k(0), aVar2, 8);
                w2.q0 q0VarD3 = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, rVarN3);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD3, sVar);
                l1.t.J(y2.j.f56916e, q1VarL3, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC3, sVar);
                if (z13) {
                    j13 = o4Var4.f30785b;
                } else {
                    j13 = o4Var4.f30787d;
                }
                l1.t.a(h2.f30320a.a(new g2.x(j13)), eVar, sVar, ((i16 >> 12) & 112) | 8);
                sVar.p(true);
                rVar4 = rVar2;
                z14 = z13;
                o4Var5 = o4Var4;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new c1(aVar, rVar4, z14, o4Var5, eVar, i11, i12);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 384) == 0) {
                z12 = z11;
                if (sVar.g(z12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    o4Var2 = o4Var;
                    if (sVar.f(o4Var2)) {
                    }
                    i13 |= i19;
                } else {
                    o4Var2 = o4Var;
                }
                i13 |= i19;
            } else {
                o4Var2 = o4Var;
            }
            i16 = i13 | 24576;
            if ((196608 & i11) == 0) {
                if (sVar.h(eVar)) {
                    i17 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i17 = 65536;
                }
                i16 |= i17;
            }
            if ((74899 & i16) == 74898) {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        sVar.d0(-1519621781);
                        j11 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                        s1Var = (s1) sVar.j(v1.f31180a);
                        o4Var3 = s1Var.U;
                        if (o4Var3 == null) {
                            long j19 = g2.x.f28621h;
                            o4Var3 = new o4(j19, j11, j19, g2.x.c(j11, 0.38f));
                            s1Var.U = o4Var3;
                        }
                        int i26 = i16;
                        if (g2.x.d(o4Var3.f30785b, j11)) {
                            sVar.p(false);
                            o4VarA = o4Var3;
                        } else {
                            o4VarA = o4Var3.a(o4Var3.f30784a, j11, o4Var3.f30786c, g2.x.c(j11, 0.38f));
                            sVar.p(false);
                        }
                        i16 = i26 & (-7169);
                        o4Var2 = o4VarA;
                    }
                    rVar2 = rVar3;
                } else {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        sVar.d0(-1519621781);
                        j11 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                        s1Var = (s1) sVar.j(v1.f31180a);
                        o4Var3 = s1Var.U;
                        if (o4Var3 == null) {
                            long j110 = g2.x.f28621h;
                            o4Var3 = new o4(j110, j11, j110, g2.x.c(j11, 0.38f));
                            s1Var.U = o4Var3;
                        }
                        int i27 = i16;
                        if (g2.x.d(o4Var3.f30785b, j11)) {
                            sVar.p(false);
                            o4VarA = o4Var3;
                        } else {
                            o4VarA = o4Var3.a(o4Var3.f30784a, j11, o4Var3.f30786c, g2.x.c(j11, 0.38f));
                            sVar.p(false);
                        }
                        i16 = i27 & (-7169);
                        o4Var2 = o4VarA;
                    }
                    rVar2 = rVar3;
                }
                o4Var4 = o4Var2;
                z13 = z12;
                sVar.q();
                l1.c3 c3Var4 = s4.f31053a;
                z1.r rVarI4 = rVar2.i(c5.f30080a);
                float f13 = k1.p.f37685c;
                z1.r rVarB4 = d2.h.b(j0.e2.n(rVarI4, f13), y7.a(k1.p.f37684b, sVar));
                if (z13) {
                    j12 = o4Var4.f30784a;
                } else {
                    j12 = o4Var4.f30786c;
                }
                z1.r rVarN4 = d0.n.n(d0.n.h(rVarB4, j12, g2.f0.f28556b), null, l7.a(false, f13 / 2, 0L, sVar, 54, 4), z13, new g3.k(0), aVar2, 8);
                w2.q0 q0VarD4 = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL4 = sVar.l();
                z1.r rVarC4 = z1.a.c(sVar, rVarN4);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD4, sVar);
                l1.t.J(y2.j.f56916e, q1VarL4, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC4, sVar);
                if (z13) {
                    j13 = o4Var4.f30785b;
                } else {
                    j13 = o4Var4.f30787d;
                }
                l1.t.a(h2.f30320a.a(new g2.x(j13)), eVar, sVar, ((i16 >> 12) & 112) | 8);
                sVar.p(true);
                rVar4 = rVar2;
                z14 = z13;
                o4Var5 = o4Var4;
            } else {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        sVar.d0(-1519621781);
                        j11 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                        s1Var = (s1) sVar.j(v1.f31180a);
                        o4Var3 = s1Var.U;
                        if (o4Var3 == null) {
                            long j111 = g2.x.f28621h;
                            o4Var3 = new o4(j111, j11, j111, g2.x.c(j11, 0.38f));
                            s1Var.U = o4Var3;
                        }
                        int i28 = i16;
                        if (g2.x.d(o4Var3.f30785b, j11)) {
                            sVar.p(false);
                            o4VarA = o4Var3;
                        } else {
                            o4VarA = o4Var3.a(o4Var3.f30784a, j11, o4Var3.f30786c, g2.x.c(j11, 0.38f));
                            sVar.p(false);
                        }
                        i16 = i28 & (-7169);
                        o4Var2 = o4VarA;
                    }
                    rVar2 = rVar3;
                } else {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 8) != 0) {
                        sVar.d0(-1519621781);
                        j11 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                        s1Var = (s1) sVar.j(v1.f31180a);
                        o4Var3 = s1Var.U;
                        if (o4Var3 == null) {
                            long j112 = g2.x.f28621h;
                            o4Var3 = new o4(j112, j11, j112, g2.x.c(j11, 0.38f));
                            s1Var.U = o4Var3;
                        }
                        int i29 = i16;
                        if (g2.x.d(o4Var3.f30785b, j11)) {
                            sVar.p(false);
                            o4VarA = o4Var3;
                        } else {
                            o4VarA = o4Var3.a(o4Var3.f30784a, j11, o4Var3.f30786c, g2.x.c(j11, 0.38f));
                            sVar.p(false);
                        }
                        i16 = i29 & (-7169);
                        o4Var2 = o4VarA;
                    }
                    rVar2 = rVar3;
                }
                o4Var4 = o4Var2;
                z13 = z12;
                sVar.q();
                l1.c3 c3Var5 = s4.f31053a;
                z1.r rVarI5 = rVar2.i(c5.f30080a);
                float f14 = k1.p.f37685c;
                z1.r rVarB5 = d2.h.b(j0.e2.n(rVarI5, f14), y7.a(k1.p.f37684b, sVar));
                if (z13) {
                    j12 = o4Var4.f30784a;
                } else {
                    j12 = o4Var4.f30786c;
                }
                z1.r rVarN5 = d0.n.n(d0.n.h(rVarB5, j12, g2.f0.f28556b), null, l7.a(false, f14 / 2, 0L, sVar, 54, 4), z13, new g3.k(0), aVar2, 8);
                w2.q0 q0VarD5 = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL5 = sVar.l();
                z1.r rVarC5 = z1.a.c(sVar, rVarN5);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD5, sVar);
                l1.t.J(y2.j.f56916e, q1VarL5, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC5, sVar);
                if (z13) {
                    j13 = o4Var4.f30785b;
                } else {
                    j13 = o4Var4.f30787d;
                }
                l1.t.a(h2.f30320a.a(new g2.x(j13)), eVar, sVar, ((i16 >> 12) & 112) | 8);
                sVar.p(true);
                rVar4 = rVar2;
                z14 = z13;
                o4Var5 = o4Var4;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new c1(aVar, rVar4, z14, o4Var5, eVar, i11, i12);
            }
        }
        i13 |= 384;
        z12 = z11;
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                o4Var2 = o4Var;
                if (sVar.f(o4Var2)) {
                }
                i13 |= i19;
            } else {
                o4Var2 = o4Var;
            }
            i13 |= i19;
        } else {
            o4Var2 = o4Var;
        }
        i16 = i13 | 24576;
        if ((196608 & i11) == 0) {
            if (sVar.h(eVar)) {
                i17 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i17 = 65536;
            }
            i16 |= i17;
        }
        if ((74899 & i16) == 74898) {
            sVar.Y();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if ((i12 & 8) != 0) {
                    sVar.d0(-1519621781);
                    j11 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                    s1Var = (s1) sVar.j(v1.f31180a);
                    o4Var3 = s1Var.U;
                    if (o4Var3 == null) {
                        long j113 = g2.x.f28621h;
                        o4Var3 = new o4(j113, j11, j113, g2.x.c(j11, 0.38f));
                        s1Var.U = o4Var3;
                    }
                    int i210 = i16;
                    if (g2.x.d(o4Var3.f30785b, j11)) {
                        sVar.p(false);
                        o4VarA = o4Var3;
                    } else {
                        o4VarA = o4Var3.a(o4Var3.f30784a, j11, o4Var3.f30786c, g2.x.c(j11, 0.38f));
                        sVar.p(false);
                    }
                    i16 = i210 & (-7169);
                    o4Var2 = o4VarA;
                }
                rVar2 = rVar3;
            } else {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if ((i12 & 8) != 0) {
                    sVar.d0(-1519621781);
                    j11 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                    s1Var = (s1) sVar.j(v1.f31180a);
                    o4Var3 = s1Var.U;
                    if (o4Var3 == null) {
                        long j114 = g2.x.f28621h;
                        o4Var3 = new o4(j114, j11, j114, g2.x.c(j11, 0.38f));
                        s1Var.U = o4Var3;
                    }
                    int i211 = i16;
                    if (g2.x.d(o4Var3.f30785b, j11)) {
                        sVar.p(false);
                        o4VarA = o4Var3;
                    } else {
                        o4VarA = o4Var3.a(o4Var3.f30784a, j11, o4Var3.f30786c, g2.x.c(j11, 0.38f));
                        sVar.p(false);
                    }
                    i16 = i211 & (-7169);
                    o4Var2 = o4VarA;
                }
                rVar2 = rVar3;
            }
            o4Var4 = o4Var2;
            z13 = z12;
            sVar.q();
            l1.c3 c3Var6 = s4.f31053a;
            z1.r rVarI6 = rVar2.i(c5.f30080a);
            float f15 = k1.p.f37685c;
            z1.r rVarB6 = d2.h.b(j0.e2.n(rVarI6, f15), y7.a(k1.p.f37684b, sVar));
            if (z13) {
                j12 = o4Var4.f30784a;
            } else {
                j12 = o4Var4.f30786c;
            }
            z1.r rVarN6 = d0.n.n(d0.n.h(rVarB6, j12, g2.f0.f28556b), null, l7.a(false, f15 / 2, 0L, sVar, 54, 4), z13, new g3.k(0), aVar2, 8);
            w2.q0 q0VarD6 = j0.o.d(z1.c.f58467e, false);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL6 = sVar.l();
            z1.r rVarC6 = z1.a.c(sVar, rVarN6);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD6, sVar);
            l1.t.J(y2.j.f56916e, q1VarL6, sVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC6, sVar);
            if (z13) {
                j13 = o4Var4.f30785b;
            } else {
                j13 = o4Var4.f30787d;
            }
            l1.t.a(h2.f30320a.a(new g2.x(j13)), eVar, sVar, ((i16 >> 12) & 112) | 8);
            sVar.p(true);
            rVar4 = rVar2;
            z14 = z13;
            o4Var5 = o4Var4;
        } else {
            sVar.Y();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if ((i12 & 8) != 0) {
                    sVar.d0(-1519621781);
                    j11 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                    s1Var = (s1) sVar.j(v1.f31180a);
                    o4Var3 = s1Var.U;
                    if (o4Var3 == null) {
                        long j115 = g2.x.f28621h;
                        o4Var3 = new o4(j115, j11, j115, g2.x.c(j11, 0.38f));
                        s1Var.U = o4Var3;
                    }
                    int i212 = i16;
                    if (g2.x.d(o4Var3.f30785b, j11)) {
                        sVar.p(false);
                        o4VarA = o4Var3;
                    } else {
                        o4VarA = o4Var3.a(o4Var3.f30784a, j11, o4Var3.f30786c, g2.x.c(j11, 0.38f));
                        sVar.p(false);
                    }
                    i16 = i212 & (-7169);
                    o4Var2 = o4VarA;
                }
                rVar2 = rVar3;
            } else {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if ((i12 & 8) != 0) {
                    sVar.d0(-1519621781);
                    j11 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                    s1Var = (s1) sVar.j(v1.f31180a);
                    o4Var3 = s1Var.U;
                    if (o4Var3 == null) {
                        long j116 = g2.x.f28621h;
                        o4Var3 = new o4(j116, j11, j116, g2.x.c(j11, 0.38f));
                        s1Var.U = o4Var3;
                    }
                    int i213 = i16;
                    if (g2.x.d(o4Var3.f30785b, j11)) {
                        sVar.p(false);
                        o4VarA = o4Var3;
                    } else {
                        o4VarA = o4Var3.a(o4Var3.f30784a, j11, o4Var3.f30786c, g2.x.c(j11, 0.38f));
                        sVar.p(false);
                    }
                    i16 = i213 & (-7169);
                    o4Var2 = o4VarA;
                }
                rVar2 = rVar3;
            }
            o4Var4 = o4Var2;
            z13 = z12;
            sVar.q();
            l1.c3 c3Var7 = s4.f31053a;
            z1.r rVarI7 = rVar2.i(c5.f30080a);
            float f16 = k1.p.f37685c;
            z1.r rVarB7 = d2.h.b(j0.e2.n(rVarI7, f16), y7.a(k1.p.f37684b, sVar));
            if (z13) {
                j12 = o4Var4.f30784a;
            } else {
                j12 = o4Var4.f30786c;
            }
            z1.r rVarN7 = d0.n.n(d0.n.h(rVarB7, j12, g2.f0.f28556b), null, l7.a(false, f16 / 2, 0L, sVar, 54, 4), z13, new g3.k(0), aVar2, 8);
            w2.q0 q0VarD7 = j0.o.d(z1.c.f58467e, false);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL7 = sVar.l();
            z1.r rVarC7 = z1.a.c(sVar, rVarN7);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD7, sVar);
            l1.t.J(y2.j.f56916e, q1VarL7, sVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC7, sVar);
            if (z13) {
                j13 = o4Var4.f30785b;
            } else {
                j13 = o4Var4.f30787d;
            }
            l1.t.a(h2.f30320a.a(new g2.x(j13)), eVar, sVar, ((i16 >> 12) & 112) | 8);
            sVar.p(true);
            rVar4 = rVar2;
            z14 = z13;
            o4Var5 = o4Var4;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c1(aVar, rVar4, z14, o4Var5, eVar, i11, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0120  */
    /* JADX WARN: Code duplicated, block: B:103:0x0122  */
    /* JADX WARN: Code duplicated, block: B:106:0x0127  */
    /* JADX WARN: Code duplicated, block: B:107:0x0132  */
    /* JADX WARN: Code duplicated, block: B:110:0x0137  */
    /* JADX WARN: Code duplicated, block: B:113:0x014c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0153  */
    /* JADX WARN: Code duplicated, block: B:116:0x0169  */
    /* JADX WARN: Code duplicated, block: B:118:0x0189  */
    /* JADX WARN: Code duplicated, block: B:120:0x018d  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    public static final void i(fz.a aVar, z1.r rVar, boolean z11, g2.w0 w0Var, i0 i0Var, d0.v vVar, j0.t1 t1Var, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        boolean z12;
        g2.w0 w0Var2;
        i0 i0VarD;
        int i14;
        d0.v vVarA;
        int i15;
        j0.t1 t1Var2;
        int i16;
        int i17;
        t1.d dVar2;
        boolean z13;
        g2.w0 w0VarA;
        g2.w0 w0Var3;
        i0 i0Var2;
        d0.v vVar2;
        j0.t1 t1Var3;
        long jC;
        l1.s sVar;
        j0.t1 t1Var4;
        l1.x1 x1VarT;
        int i18;
        int i19;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1694808287);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.h(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.f(rVar) ? 32 : 16;
        }
        int i21 = i12 & 4;
        if (i21 == 0) {
            if ((i11 & 384) == 0) {
                z12 = z11;
                i13 |= sVar2.g(z12) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    w0Var2 = w0Var;
                    int i22 = sVar2.f(w0Var2) ? 2048 : 1024;
                    i13 |= i22;
                } else {
                    w0Var2 = w0Var;
                }
                i13 |= i22;
            } else {
                w0Var2 = w0Var;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    i0VarD = i0Var;
                    if (sVar2.f(i0VarD)) {
                        i19 = 16384;
                    }
                    i13 |= i19;
                } else {
                    i0VarD = i0Var;
                }
                i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                i13 |= i19;
            } else {
                i0VarD = i0Var;
            }
            i14 = i13 | 196608;
            if ((1572864 & i11) == 0) {
                if ((i12 & 64) == 0) {
                    vVarA = vVar;
                    int i23 = sVar2.f(vVarA) ? 1048576 : 524288;
                    i14 |= i23;
                } else {
                    vVarA = vVar;
                }
                i14 |= i23;
            } else {
                vVarA = vVar;
            }
            i15 = i12 & 128;
            if (i15 != 0) {
                if ((12582912 & i11) == 0) {
                    t1Var2 = t1Var;
                    if (sVar2.f(t1Var2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i14 |= i16;
                }
                i17 = i14 | 100663296;
                if ((805306368 & i11) == 0) {
                    dVar2 = dVar;
                    if (sVar2.h(dVar2)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i17 |= i18;
                } else {
                    dVar2 = dVar;
                }
                if ((306783379 & i17) == 306783378 || !sVar2.F()) {
                    sVar2.Y();
                    if ((i11 & 1) != 0 || sVar2.C()) {
                        if (i21 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var = j0.f30447a;
                            w0VarA = y7.a(k1.u.f37766a, sVar2);
                            i17 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var2 = j0.f30447a;
                            i17 &= -57345;
                            i0VarD = j0.d((s1) sVar2.j(v1.f31180a));
                        }
                        if ((i12 & 64) != 0) {
                            j0.v1 v1Var3 = j0.f30447a;
                            float f5 = k1.u.f37770e;
                            if (z13) {
                                sVar2.d0(-855870548);
                                long jD = v1.d(k1.u.f37769d, sVar2);
                                sVar2.p(false);
                                jC = jD;
                            } else {
                                sVar2.d0(-855783004);
                                jC = g2.x.c(v1.d(k1.u.f37769d, sVar2), 0.12f);
                                sVar2.p(false);
                            }
                            i17 &= -3670017;
                            vVarA = d0.n.a(jC, f5);
                        } else {
                            i15 = i15;
                        }
                        if (i15 != 0) {
                            t1Var2 = j0.f30447a;
                        }
                        w0Var3 = w0VarA;
                        i0Var2 = i0VarD;
                        vVar2 = vVarA;
                        t1Var3 = t1Var2;
                        z12 = z13;
                    } else {
                        sVar2.W();
                        if ((i12 & 8) != 0) {
                            i17 &= -7169;
                        }
                        if ((i12 & 16) != 0) {
                            i17 &= -57345;
                        }
                        if ((i12 & 64) != 0) {
                            i17 &= -3670017;
                        }
                        w0Var3 = w0Var2;
                        i0Var2 = i0VarD;
                        vVar2 = vVarA;
                        t1Var3 = t1Var2;
                    }
                    sVar2.q();
                    sVar = sVar2;
                    b(aVar, rVar, z12, w0Var3, i0Var2, null, vVar2, t1Var3, dVar2, sVar, i17 & 2147483646, 0);
                    w0Var2 = w0Var3;
                    i0VarD = i0Var2;
                    vVarA = vVar2;
                    t1Var4 = t1Var3;
                } else {
                    sVar2.W();
                    sVar = sVar2;
                    t1Var4 = t1Var2;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new r0(aVar, rVar, z12, w0Var2, i0VarD, vVarA, t1Var4, dVar, i11, i12, 0);
                }
            }
            i14 |= 12582912;
            t1Var2 = t1Var;
            i17 = i14 | 100663296;
            if ((805306368 & i11) == 0) {
                dVar2 = dVar;
                if (sVar2.h(dVar2)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i17 |= i18;
            } else {
                dVar2 = dVar;
            }
            if ((306783379 & i17) == 306783378) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var4 = j0.f30447a;
                        w0VarA = y7.a(k1.u.f37766a, sVar2);
                        i17 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var5 = j0.f30447a;
                        i17 &= -57345;
                        i0VarD = j0.d((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 64) != 0) {
                        j0.v1 v1Var6 = j0.f30447a;
                        float f11 = k1.u.f37770e;
                        if (z13) {
                            sVar2.d0(-855870548);
                            long jD2 = v1.d(k1.u.f37769d, sVar2);
                            sVar2.p(false);
                            jC = jD2;
                        } else {
                            sVar2.d0(-855783004);
                            jC = g2.x.c(v1.d(k1.u.f37769d, sVar2), 0.12f);
                            sVar2.p(false);
                        }
                        i17 &= -3670017;
                        vVarA = d0.n.a(jC, f11);
                    } else {
                        i15 = i15;
                    }
                    if (i15 != 0) {
                        t1Var2 = j0.f30447a;
                    }
                    w0Var3 = w0VarA;
                    i0Var2 = i0VarD;
                    vVar2 = vVarA;
                    t1Var3 = t1Var2;
                    z12 = z13;
                } else {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var7 = j0.f30447a;
                        w0VarA = y7.a(k1.u.f37766a, sVar2);
                        i17 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var8 = j0.f30447a;
                        i17 &= -57345;
                        i0VarD = j0.d((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 64) != 0) {
                        j0.v1 v1Var9 = j0.f30447a;
                        float f12 = k1.u.f37770e;
                        if (z13) {
                            sVar2.d0(-855870548);
                            long jD3 = v1.d(k1.u.f37769d, sVar2);
                            sVar2.p(false);
                            jC = jD3;
                        } else {
                            sVar2.d0(-855783004);
                            jC = g2.x.c(v1.d(k1.u.f37769d, sVar2), 0.12f);
                            sVar2.p(false);
                        }
                        i17 &= -3670017;
                        vVarA = d0.n.a(jC, f12);
                    } else {
                        i15 = i15;
                    }
                    if (i15 != 0) {
                        t1Var2 = j0.f30447a;
                    }
                    w0Var3 = w0VarA;
                    i0Var2 = i0VarD;
                    vVar2 = vVarA;
                    t1Var3 = t1Var2;
                    z12 = z13;
                }
                sVar2.q();
                sVar = sVar2;
                b(aVar, rVar, z12, w0Var3, i0Var2, null, vVar2, t1Var3, dVar2, sVar, i17 & 2147483646, 0);
                w0Var2 = w0Var3;
                i0VarD = i0Var2;
                vVarA = vVar2;
                t1Var4 = t1Var3;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var10 = j0.f30447a;
                        w0VarA = y7.a(k1.u.f37766a, sVar2);
                        i17 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var11 = j0.f30447a;
                        i17 &= -57345;
                        i0VarD = j0.d((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 64) != 0) {
                        j0.v1 v1Var12 = j0.f30447a;
                        float f13 = k1.u.f37770e;
                        if (z13) {
                            sVar2.d0(-855870548);
                            long jD4 = v1.d(k1.u.f37769d, sVar2);
                            sVar2.p(false);
                            jC = jD4;
                        } else {
                            sVar2.d0(-855783004);
                            jC = g2.x.c(v1.d(k1.u.f37769d, sVar2), 0.12f);
                            sVar2.p(false);
                        }
                        i17 &= -3670017;
                        vVarA = d0.n.a(jC, f13);
                    } else {
                        i15 = i15;
                    }
                    if (i15 != 0) {
                        t1Var2 = j0.f30447a;
                    }
                    w0Var3 = w0VarA;
                    i0Var2 = i0VarD;
                    vVar2 = vVarA;
                    t1Var3 = t1Var2;
                    z12 = z13;
                } else {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var13 = j0.f30447a;
                        w0VarA = y7.a(k1.u.f37766a, sVar2);
                        i17 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var14 = j0.f30447a;
                        i17 &= -57345;
                        i0VarD = j0.d((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 64) != 0) {
                        j0.v1 v1Var15 = j0.f30447a;
                        float f14 = k1.u.f37770e;
                        if (z13) {
                            sVar2.d0(-855870548);
                            long jD5 = v1.d(k1.u.f37769d, sVar2);
                            sVar2.p(false);
                            jC = jD5;
                        } else {
                            sVar2.d0(-855783004);
                            jC = g2.x.c(v1.d(k1.u.f37769d, sVar2), 0.12f);
                            sVar2.p(false);
                        }
                        i17 &= -3670017;
                        vVarA = d0.n.a(jC, f14);
                    } else {
                        i15 = i15;
                    }
                    if (i15 != 0) {
                        t1Var2 = j0.f30447a;
                    }
                    w0Var3 = w0VarA;
                    i0Var2 = i0VarD;
                    vVar2 = vVarA;
                    t1Var3 = t1Var2;
                    z12 = z13;
                }
                sVar2.q();
                sVar = sVar2;
                b(aVar, rVar, z12, w0Var3, i0Var2, null, vVar2, t1Var3, dVar2, sVar, i17 & 2147483646, 0);
                w0Var2 = w0Var3;
                i0VarD = i0Var2;
                vVarA = vVar2;
                t1Var4 = t1Var3;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new r0(aVar, rVar, z12, w0Var2, i0VarD, vVarA, t1Var4, dVar, i11, i12, 0);
            }
        }
        i13 |= 384;
        z12 = z11;
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                w0Var2 = w0Var;
                if (sVar2.f(w0Var2)) {
                }
                i13 |= i22;
            } else {
                w0Var2 = w0Var;
            }
            i13 |= i22;
        } else {
            w0Var2 = w0Var;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                i0VarD = i0Var;
                if (sVar2.f(i0VarD)) {
                    i19 = 16384;
                }
                i13 |= i19;
            } else {
                i0VarD = i0Var;
            }
            i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
            i13 |= i19;
        } else {
            i0VarD = i0Var;
        }
        i14 = i13 | 196608;
        if ((1572864 & i11) == 0) {
            if ((i12 & 64) == 0) {
                vVarA = vVar;
                if (sVar2.f(vVarA)) {
                }
                i14 |= i23;
            } else {
                vVarA = vVar;
            }
            i14 |= i23;
        } else {
            vVarA = vVar;
        }
        i15 = i12 & 128;
        if (i15 != 0) {
            if ((12582912 & i11) == 0) {
                t1Var2 = t1Var;
                if (sVar2.f(t1Var2)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i14 |= i16;
            }
            i17 = i14 | 100663296;
            if ((805306368 & i11) == 0) {
                dVar2 = dVar;
                if (sVar2.h(dVar2)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i17 |= i18;
            } else {
                dVar2 = dVar;
            }
            if ((306783379 & i17) == 306783378) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var16 = j0.f30447a;
                        w0VarA = y7.a(k1.u.f37766a, sVar2);
                        i17 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var17 = j0.f30447a;
                        i17 &= -57345;
                        i0VarD = j0.d((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 64) != 0) {
                        j0.v1 v1Var18 = j0.f30447a;
                        float f15 = k1.u.f37770e;
                        if (z13) {
                            sVar2.d0(-855870548);
                            long jD6 = v1.d(k1.u.f37769d, sVar2);
                            sVar2.p(false);
                            jC = jD6;
                        } else {
                            sVar2.d0(-855783004);
                            jC = g2.x.c(v1.d(k1.u.f37769d, sVar2), 0.12f);
                            sVar2.p(false);
                        }
                        i17 &= -3670017;
                        vVarA = d0.n.a(jC, f15);
                    } else {
                        i15 = i15;
                    }
                    if (i15 != 0) {
                        t1Var2 = j0.f30447a;
                    }
                    w0Var3 = w0VarA;
                    i0Var2 = i0VarD;
                    vVar2 = vVarA;
                    t1Var3 = t1Var2;
                    z12 = z13;
                } else {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var19 = j0.f30447a;
                        w0VarA = y7.a(k1.u.f37766a, sVar2);
                        i17 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var110 = j0.f30447a;
                        i17 &= -57345;
                        i0VarD = j0.d((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 64) != 0) {
                        j0.v1 v1Var111 = j0.f30447a;
                        float f16 = k1.u.f37770e;
                        if (z13) {
                            sVar2.d0(-855870548);
                            long jD7 = v1.d(k1.u.f37769d, sVar2);
                            sVar2.p(false);
                            jC = jD7;
                        } else {
                            sVar2.d0(-855783004);
                            jC = g2.x.c(v1.d(k1.u.f37769d, sVar2), 0.12f);
                            sVar2.p(false);
                        }
                        i17 &= -3670017;
                        vVarA = d0.n.a(jC, f16);
                    } else {
                        i15 = i15;
                    }
                    if (i15 != 0) {
                        t1Var2 = j0.f30447a;
                    }
                    w0Var3 = w0VarA;
                    i0Var2 = i0VarD;
                    vVar2 = vVarA;
                    t1Var3 = t1Var2;
                    z12 = z13;
                }
                sVar2.q();
                sVar = sVar2;
                b(aVar, rVar, z12, w0Var3, i0Var2, null, vVar2, t1Var3, dVar2, sVar, i17 & 2147483646, 0);
                w0Var2 = w0Var3;
                i0VarD = i0Var2;
                vVarA = vVar2;
                t1Var4 = t1Var3;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var112 = j0.f30447a;
                        w0VarA = y7.a(k1.u.f37766a, sVar2);
                        i17 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var113 = j0.f30447a;
                        i17 &= -57345;
                        i0VarD = j0.d((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 64) != 0) {
                        j0.v1 v1Var114 = j0.f30447a;
                        float f17 = k1.u.f37770e;
                        if (z13) {
                            sVar2.d0(-855870548);
                            long jD8 = v1.d(k1.u.f37769d, sVar2);
                            sVar2.p(false);
                            jC = jD8;
                        } else {
                            sVar2.d0(-855783004);
                            jC = g2.x.c(v1.d(k1.u.f37769d, sVar2), 0.12f);
                            sVar2.p(false);
                        }
                        i17 &= -3670017;
                        vVarA = d0.n.a(jC, f17);
                    } else {
                        i15 = i15;
                    }
                    if (i15 != 0) {
                        t1Var2 = j0.f30447a;
                    }
                    w0Var3 = w0VarA;
                    i0Var2 = i0VarD;
                    vVar2 = vVarA;
                    t1Var3 = t1Var2;
                    z12 = z13;
                } else {
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var115 = j0.f30447a;
                        w0VarA = y7.a(k1.u.f37766a, sVar2);
                        i17 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var116 = j0.f30447a;
                        i17 &= -57345;
                        i0VarD = j0.d((s1) sVar2.j(v1.f31180a));
                    }
                    if ((i12 & 64) != 0) {
                        j0.v1 v1Var117 = j0.f30447a;
                        float f18 = k1.u.f37770e;
                        if (z13) {
                            sVar2.d0(-855870548);
                            long jD9 = v1.d(k1.u.f37769d, sVar2);
                            sVar2.p(false);
                            jC = jD9;
                        } else {
                            sVar2.d0(-855783004);
                            jC = g2.x.c(v1.d(k1.u.f37769d, sVar2), 0.12f);
                            sVar2.p(false);
                        }
                        i17 &= -3670017;
                        vVarA = d0.n.a(jC, f18);
                    } else {
                        i15 = i15;
                    }
                    if (i15 != 0) {
                        t1Var2 = j0.f30447a;
                    }
                    w0Var3 = w0VarA;
                    i0Var2 = i0VarD;
                    vVar2 = vVarA;
                    t1Var3 = t1Var2;
                    z12 = z13;
                }
                sVar2.q();
                sVar = sVar2;
                b(aVar, rVar, z12, w0Var3, i0Var2, null, vVar2, t1Var3, dVar2, sVar, i17 & 2147483646, 0);
                w0Var2 = w0Var3;
                i0VarD = i0Var2;
                vVarA = vVar2;
                t1Var4 = t1Var3;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new r0(aVar, rVar, z12, w0Var2, i0VarD, vVarA, t1Var4, dVar, i11, i12, 0);
            }
        }
        i14 |= 12582912;
        t1Var2 = t1Var;
        i17 = i14 | 100663296;
        if ((805306368 & i11) == 0) {
            dVar2 = dVar;
            if (sVar2.h(dVar2)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i17 |= i18;
        } else {
            dVar2 = dVar;
        }
        if ((306783379 & i17) == 306783378) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    j0.v1 v1Var118 = j0.f30447a;
                    w0VarA = y7.a(k1.u.f37766a, sVar2);
                    i17 &= -7169;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 16) != 0) {
                    j0.v1 v1Var119 = j0.f30447a;
                    i17 &= -57345;
                    i0VarD = j0.d((s1) sVar2.j(v1.f31180a));
                }
                if ((i12 & 64) != 0) {
                    j0.v1 v1Var1110 = j0.f30447a;
                    float f19 = k1.u.f37770e;
                    if (z13) {
                        sVar2.d0(-855870548);
                        long jD10 = v1.d(k1.u.f37769d, sVar2);
                        sVar2.p(false);
                        jC = jD10;
                    } else {
                        sVar2.d0(-855783004);
                        jC = g2.x.c(v1.d(k1.u.f37769d, sVar2), 0.12f);
                        sVar2.p(false);
                    }
                    i17 &= -3670017;
                    vVarA = d0.n.a(jC, f19);
                } else {
                    i15 = i15;
                }
                if (i15 != 0) {
                    t1Var2 = j0.f30447a;
                }
                w0Var3 = w0VarA;
                i0Var2 = i0VarD;
                vVar2 = vVarA;
                t1Var3 = t1Var2;
                z12 = z13;
            } else {
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    j0.v1 v1Var1111 = j0.f30447a;
                    w0VarA = y7.a(k1.u.f37766a, sVar2);
                    i17 &= -7169;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 16) != 0) {
                    j0.v1 v1Var1112 = j0.f30447a;
                    i17 &= -57345;
                    i0VarD = j0.d((s1) sVar2.j(v1.f31180a));
                }
                if ((i12 & 64) != 0) {
                    j0.v1 v1Var1113 = j0.f30447a;
                    float f110 = k1.u.f37770e;
                    if (z13) {
                        sVar2.d0(-855870548);
                        long jD11 = v1.d(k1.u.f37769d, sVar2);
                        sVar2.p(false);
                        jC = jD11;
                    } else {
                        sVar2.d0(-855783004);
                        jC = g2.x.c(v1.d(k1.u.f37769d, sVar2), 0.12f);
                        sVar2.p(false);
                    }
                    i17 &= -3670017;
                    vVarA = d0.n.a(jC, f110);
                } else {
                    i15 = i15;
                }
                if (i15 != 0) {
                    t1Var2 = j0.f30447a;
                }
                w0Var3 = w0VarA;
                i0Var2 = i0VarD;
                vVar2 = vVarA;
                t1Var3 = t1Var2;
                z12 = z13;
            }
            sVar2.q();
            sVar = sVar2;
            b(aVar, rVar, z12, w0Var3, i0Var2, null, vVar2, t1Var3, dVar2, sVar, i17 & 2147483646, 0);
            w0Var2 = w0Var3;
            i0VarD = i0Var2;
            vVarA = vVar2;
            t1Var4 = t1Var3;
        } else {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    j0.v1 v1Var1114 = j0.f30447a;
                    w0VarA = y7.a(k1.u.f37766a, sVar2);
                    i17 &= -7169;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 16) != 0) {
                    j0.v1 v1Var1115 = j0.f30447a;
                    i17 &= -57345;
                    i0VarD = j0.d((s1) sVar2.j(v1.f31180a));
                }
                if ((i12 & 64) != 0) {
                    j0.v1 v1Var1116 = j0.f30447a;
                    float f111 = k1.u.f37770e;
                    if (z13) {
                        sVar2.d0(-855870548);
                        long jD12 = v1.d(k1.u.f37769d, sVar2);
                        sVar2.p(false);
                        jC = jD12;
                    } else {
                        sVar2.d0(-855783004);
                        jC = g2.x.c(v1.d(k1.u.f37769d, sVar2), 0.12f);
                        sVar2.p(false);
                    }
                    i17 &= -3670017;
                    vVarA = d0.n.a(jC, f111);
                } else {
                    i15 = i15;
                }
                if (i15 != 0) {
                    t1Var2 = j0.f30447a;
                }
                w0Var3 = w0VarA;
                i0Var2 = i0VarD;
                vVar2 = vVarA;
                t1Var3 = t1Var2;
                z12 = z13;
            } else {
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    j0.v1 v1Var1117 = j0.f30447a;
                    w0VarA = y7.a(k1.u.f37766a, sVar2);
                    i17 &= -7169;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 16) != 0) {
                    j0.v1 v1Var1118 = j0.f30447a;
                    i17 &= -57345;
                    i0VarD = j0.d((s1) sVar2.j(v1.f31180a));
                }
                if ((i12 & 64) != 0) {
                    j0.v1 v1Var1119 = j0.f30447a;
                    float f112 = k1.u.f37770e;
                    if (z13) {
                        sVar2.d0(-855870548);
                        long jD13 = v1.d(k1.u.f37769d, sVar2);
                        sVar2.p(false);
                        jC = jD13;
                    } else {
                        sVar2.d0(-855783004);
                        jC = g2.x.c(v1.d(k1.u.f37769d, sVar2), 0.12f);
                        sVar2.p(false);
                    }
                    i17 &= -3670017;
                    vVarA = d0.n.a(jC, f112);
                } else {
                    i15 = i15;
                }
                if (i15 != 0) {
                    t1Var2 = j0.f30447a;
                }
                w0Var3 = w0VarA;
                i0Var2 = i0VarD;
                vVar2 = vVarA;
                t1Var3 = t1Var2;
                z12 = z13;
            }
            sVar2.q();
            sVar = sVar2;
            b(aVar, rVar, z12, w0Var3, i0Var2, null, vVar2, t1Var3, dVar2, sVar, i17 & 2147483646, 0);
            w0Var2 = w0Var3;
            i0VarD = i0Var2;
            vVarA = vVar2;
            t1Var4 = t1Var3;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new r0(aVar, rVar, z12, w0Var2, i0VarD, vVarA, t1Var4, dVar, i11, i12, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:76:0x0120  */
    /* JADX WARN: Code duplicated, block: B:78:0x0125  */
    /* JADX WARN: Code duplicated, block: B:81:0x013e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0146  */
    /* JADX WARN: Code duplicated, block: B:87:0x016b  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void j(fz.a aVar, z1.r rVar, boolean z11, g2.w0 w0Var, t0 t0Var, u0 u0Var, d0.v vVar, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        g2.w0 w0Var2;
        t0 t0Var2;
        int i14;
        d0.v vVarX;
        int i15;
        int i16;
        z1.r rVar3;
        g2.w0 w0VarA;
        t0 t0Var3;
        int i17;
        int i18;
        boolean z12;
        d0.v vVar2;
        u0 u0Var2;
        s1 s1Var;
        t0 t0Var4;
        z1.r rVar4;
        boolean z13;
        u0 u0Var3;
        d0.v vVar3;
        g2.w0 w0Var3;
        t0 t0Var5;
        l1.x1 x1VarT;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-727137250);
        if ((i11 & 6) == 0) {
            i13 = i11 | (sVar.h(aVar) ? 4 : 2);
        } else {
            i13 = i11;
        }
        int i19 = i12 & 2;
        if (i19 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 32 : 16;
            }
            int i21 = i13 | 384;
            if ((i12 & 8) == 0) {
                w0Var2 = w0Var;
                int i22 = sVar.f(w0Var2) ? 2048 : 1024;
                int i23 = i21 | i22;
                if ((i12 & 16) == 0) {
                    t0Var2 = t0Var;
                    if (sVar.f(t0Var2)) {
                        i14 = 16384;
                    }
                    int i24 = i23 | i14 | 65536;
                    if ((i12 & 64) == 0) {
                        vVarX = vVar;
                        int i25 = sVar.f(vVarX) ? 1048576 : 524288;
                        i15 = i24 | i25 | 12582912;
                        if ((38347923 & i15) == 38347922 || !sVar.F()) {
                            sVar.Y();
                            i16 = -458753;
                            if ((i11 & 1) != 0 || sVar.C()) {
                                if (i19 != 0) {
                                    rVar3 = z1.o.f58481a;
                                } else {
                                    rVar3 = rVar2;
                                }
                                if ((i12 & 8) != 0) {
                                    w0VarA = y7.a(k1.v.f37773c, sVar);
                                    i15 &= -7169;
                                } else {
                                    w0VarA = w0Var2;
                                }
                                if ((i12 & 16) != 0) {
                                    s1Var = (s1) sVar.j(v1.f31180a);
                                    t0Var4 = s1Var.O;
                                    if (t0Var4 == null) {
                                        k1.c cVar = k1.v.f37771a;
                                        t0Var3 = new t0(v1.c(s1Var, cVar), v1.a(s1Var, v1.c(s1Var, cVar)), v1.c(s1Var, cVar), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar)), 0.38f));
                                        s1Var.O = t0Var3;
                                    } else {
                                        t0Var3 = t0Var4;
                                    }
                                    i15 &= -57345;
                                } else {
                                    i16 = -458753;
                                    t0Var3 = t0Var2;
                                }
                                float f5 = k1.v.f37772b;
                                u0 u0Var4 = new u0(f5, f5, f5, f5, k1.v.f37775e, k1.v.f37774d);
                                i17 = i15 & i16;
                                if ((i12 & 64) != 0) {
                                    i18 = i15 & (-4128769);
                                    vVarX = x(sVar, 0);
                                } else {
                                    i18 = i17;
                                }
                                w0Var2 = w0VarA;
                                z12 = true;
                                vVar2 = vVarX;
                                t0Var2 = t0Var3;
                                u0Var2 = u0Var4;
                            } else {
                                sVar.W();
                                if ((i12 & 8) != 0) {
                                    i15 &= -7169;
                                }
                                if ((i12 & 16) != 0) {
                                    i15 &= -57345;
                                }
                                int i26 = i15 & (-458753);
                                if ((i12 & 64) != 0) {
                                    i26 = i15 & (-4128769);
                                }
                                i18 = i26;
                                rVar3 = rVar2;
                                vVar2 = vVarX;
                                z12 = z11;
                                u0Var2 = u0Var;
                            }
                            sVar.q();
                            c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                            rVar4 = rVar3;
                            z13 = z12;
                            u0Var3 = u0Var2;
                            vVar3 = vVar2;
                        } else {
                            sVar.W();
                            z13 = z11;
                            u0Var3 = u0Var;
                            rVar4 = rVar2;
                            vVar3 = vVarX;
                        }
                        w0Var3 = w0Var2;
                        t0Var5 = t0Var2;
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
                        }
                    }
                    vVarX = vVar;
                    i15 = i24 | i25 | 12582912;
                    if ((38347923 & i15) == 38347922) {
                        sVar.Y();
                        i16 = -458753;
                        if ((i11 & 1) != 0) {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar2 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar2), v1.a(s1Var, v1.c(s1Var, cVar2)), v1.c(s1Var, cVar2), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar2)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f11 = k1.v.f37772b;
                            u0 u0Var5 = new u0(f11, f11, f11, f11, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var5;
                        } else {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar3 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar3), v1.a(s1Var, v1.c(s1Var, cVar3)), v1.c(s1Var, cVar3), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar3)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f12 = k1.v.f37772b;
                            u0 u0Var6 = new u0(f12, f12, f12, f12, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var6;
                        }
                        sVar.q();
                        c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                        rVar4 = rVar3;
                        z13 = z12;
                        u0Var3 = u0Var2;
                        vVar3 = vVar2;
                    } else {
                        sVar.Y();
                        i16 = -458753;
                        if ((i11 & 1) != 0) {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar4 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar4), v1.a(s1Var, v1.c(s1Var, cVar4)), v1.c(s1Var, cVar4), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar4)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f13 = k1.v.f37772b;
                            u0 u0Var7 = new u0(f13, f13, f13, f13, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var7;
                        } else {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar5 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar5), v1.a(s1Var, v1.c(s1Var, cVar5)), v1.c(s1Var, cVar5), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar5)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f14 = k1.v.f37772b;
                            u0 u0Var8 = new u0(f14, f14, f14, f14, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var8;
                        }
                        sVar.q();
                        c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                        rVar4 = rVar3;
                        z13 = z12;
                        u0Var3 = u0Var2;
                        vVar3 = vVar2;
                    }
                    w0Var3 = w0Var2;
                    t0Var5 = t0Var2;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
                    }
                }
                t0Var2 = t0Var;
                i14 = OSSConstants.DEFAULT_BUFFER_SIZE;
                int i27 = i23 | i14 | 65536;
                if ((i12 & 64) == 0) {
                    vVarX = vVar;
                    if (sVar.f(vVarX)) {
                    }
                    i15 = i27 | i25 | 12582912;
                    if ((38347923 & i15) == 38347922) {
                        sVar.Y();
                        i16 = -458753;
                        if ((i11 & 1) != 0) {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar6 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar6), v1.a(s1Var, v1.c(s1Var, cVar6)), v1.c(s1Var, cVar6), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar6)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f15 = k1.v.f37772b;
                            u0 u0Var9 = new u0(f15, f15, f15, f15, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var9;
                        } else {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar7 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar7), v1.a(s1Var, v1.c(s1Var, cVar7)), v1.c(s1Var, cVar7), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar7)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f16 = k1.v.f37772b;
                            u0 u0Var10 = new u0(f16, f16, f16, f16, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var10;
                        }
                        sVar.q();
                        c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                        rVar4 = rVar3;
                        z13 = z12;
                        u0Var3 = u0Var2;
                        vVar3 = vVar2;
                    } else {
                        sVar.Y();
                        i16 = -458753;
                        if ((i11 & 1) != 0) {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar8 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar8), v1.a(s1Var, v1.c(s1Var, cVar8)), v1.c(s1Var, cVar8), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar8)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f17 = k1.v.f37772b;
                            u0 u0Var11 = new u0(f17, f17, f17, f17, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var11;
                        } else {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar9 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar9), v1.a(s1Var, v1.c(s1Var, cVar9)), v1.c(s1Var, cVar9), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar9)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f18 = k1.v.f37772b;
                            u0 u0Var12 = new u0(f18, f18, f18, f18, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var12;
                        }
                        sVar.q();
                        c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                        rVar4 = rVar3;
                        z13 = z12;
                        u0Var3 = u0Var2;
                        vVar3 = vVar2;
                    }
                    w0Var3 = w0Var2;
                    t0Var5 = t0Var2;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
                    }
                }
                vVarX = vVar;
                i15 = i27 | i25 | 12582912;
                if ((38347923 & i15) == 38347922) {
                    sVar.Y();
                    i16 = -458753;
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar10 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar10), v1.a(s1Var, v1.c(s1Var, cVar10)), v1.c(s1Var, cVar10), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar10)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f19 = k1.v.f37772b;
                        u0 u0Var13 = new u0(f19, f19, f19, f19, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var13;
                    } else {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar11 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar11), v1.a(s1Var, v1.c(s1Var, cVar11)), v1.c(s1Var, cVar11), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar11)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f110 = k1.v.f37772b;
                        u0 u0Var14 = new u0(f110, f110, f110, f110, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var14;
                    }
                    sVar.q();
                    c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                    rVar4 = rVar3;
                    z13 = z12;
                    u0Var3 = u0Var2;
                    vVar3 = vVar2;
                } else {
                    sVar.Y();
                    i16 = -458753;
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar12 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar12), v1.a(s1Var, v1.c(s1Var, cVar12)), v1.c(s1Var, cVar12), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar12)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f111 = k1.v.f37772b;
                        u0 u0Var15 = new u0(f111, f111, f111, f111, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var15;
                    } else {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar13 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar13), v1.a(s1Var, v1.c(s1Var, cVar13)), v1.c(s1Var, cVar13), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar13)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f112 = k1.v.f37772b;
                        u0 u0Var16 = new u0(f112, f112, f112, f112, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var16;
                    }
                    sVar.q();
                    c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                    rVar4 = rVar3;
                    z13 = z12;
                    u0Var3 = u0Var2;
                    vVar3 = vVar2;
                }
                w0Var3 = w0Var2;
                t0Var5 = t0Var2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
                }
            }
            w0Var2 = w0Var;
            int i28 = i21 | i22;
            if ((i12 & 16) == 0) {
                t0Var2 = t0Var;
                if (sVar.f(t0Var2)) {
                    i14 = 16384;
                }
                int i29 = i28 | i14 | 65536;
                if ((i12 & 64) == 0) {
                    vVarX = vVar;
                    if (sVar.f(vVarX)) {
                    }
                    i15 = i29 | i25 | 12582912;
                    if ((38347923 & i15) == 38347922) {
                        sVar.Y();
                        i16 = -458753;
                        if ((i11 & 1) != 0) {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar14 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar14), v1.a(s1Var, v1.c(s1Var, cVar14)), v1.c(s1Var, cVar14), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar14)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f113 = k1.v.f37772b;
                            u0 u0Var17 = new u0(f113, f113, f113, f113, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var17;
                        } else {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar15 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar15), v1.a(s1Var, v1.c(s1Var, cVar15)), v1.c(s1Var, cVar15), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar15)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f114 = k1.v.f37772b;
                            u0 u0Var18 = new u0(f114, f114, f114, f114, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var18;
                        }
                        sVar.q();
                        c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                        rVar4 = rVar3;
                        z13 = z12;
                        u0Var3 = u0Var2;
                        vVar3 = vVar2;
                    } else {
                        sVar.Y();
                        i16 = -458753;
                        if ((i11 & 1) != 0) {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar16 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar16), v1.a(s1Var, v1.c(s1Var, cVar16)), v1.c(s1Var, cVar16), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar16)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f115 = k1.v.f37772b;
                            u0 u0Var19 = new u0(f115, f115, f115, f115, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var19;
                        } else {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar17 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar17), v1.a(s1Var, v1.c(s1Var, cVar17)), v1.c(s1Var, cVar17), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar17)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f116 = k1.v.f37772b;
                            u0 u0Var110 = new u0(f116, f116, f116, f116, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var110;
                        }
                        sVar.q();
                        c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                        rVar4 = rVar3;
                        z13 = z12;
                        u0Var3 = u0Var2;
                        vVar3 = vVar2;
                    }
                    w0Var3 = w0Var2;
                    t0Var5 = t0Var2;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
                    }
                }
                vVarX = vVar;
                i15 = i29 | i25 | 12582912;
                if ((38347923 & i15) == 38347922) {
                    sVar.Y();
                    i16 = -458753;
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar18 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar18), v1.a(s1Var, v1.c(s1Var, cVar18)), v1.c(s1Var, cVar18), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar18)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f117 = k1.v.f37772b;
                        u0 u0Var111 = new u0(f117, f117, f117, f117, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var111;
                    } else {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar19 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar19), v1.a(s1Var, v1.c(s1Var, cVar19)), v1.c(s1Var, cVar19), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar19)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f118 = k1.v.f37772b;
                        u0 u0Var112 = new u0(f118, f118, f118, f118, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var112;
                    }
                    sVar.q();
                    c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                    rVar4 = rVar3;
                    z13 = z12;
                    u0Var3 = u0Var2;
                    vVar3 = vVar2;
                } else {
                    sVar.Y();
                    i16 = -458753;
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar110 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar110), v1.a(s1Var, v1.c(s1Var, cVar110)), v1.c(s1Var, cVar110), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar110)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f119 = k1.v.f37772b;
                        u0 u0Var113 = new u0(f119, f119, f119, f119, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var113;
                    } else {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar111 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar111), v1.a(s1Var, v1.c(s1Var, cVar111)), v1.c(s1Var, cVar111), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar111)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f1110 = k1.v.f37772b;
                        u0 u0Var114 = new u0(f1110, f1110, f1110, f1110, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var114;
                    }
                    sVar.q();
                    c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                    rVar4 = rVar3;
                    z13 = z12;
                    u0Var3 = u0Var2;
                    vVar3 = vVar2;
                }
                w0Var3 = w0Var2;
                t0Var5 = t0Var2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
                }
            }
            t0Var2 = t0Var;
            i14 = OSSConstants.DEFAULT_BUFFER_SIZE;
            int i210 = i28 | i14 | 65536;
            if ((i12 & 64) == 0) {
                vVarX = vVar;
                if (sVar.f(vVarX)) {
                }
                i15 = i210 | i25 | 12582912;
                if ((38347923 & i15) == 38347922) {
                    sVar.Y();
                    i16 = -458753;
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar112 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar112), v1.a(s1Var, v1.c(s1Var, cVar112)), v1.c(s1Var, cVar112), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar112)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f1111 = k1.v.f37772b;
                        u0 u0Var115 = new u0(f1111, f1111, f1111, f1111, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var115;
                    } else {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar113 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar113), v1.a(s1Var, v1.c(s1Var, cVar113)), v1.c(s1Var, cVar113), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar113)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f1112 = k1.v.f37772b;
                        u0 u0Var116 = new u0(f1112, f1112, f1112, f1112, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var116;
                    }
                    sVar.q();
                    c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                    rVar4 = rVar3;
                    z13 = z12;
                    u0Var3 = u0Var2;
                    vVar3 = vVar2;
                } else {
                    sVar.Y();
                    i16 = -458753;
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar114 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar114), v1.a(s1Var, v1.c(s1Var, cVar114)), v1.c(s1Var, cVar114), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar114)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f1113 = k1.v.f37772b;
                        u0 u0Var117 = new u0(f1113, f1113, f1113, f1113, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var117;
                    } else {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar115 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar115), v1.a(s1Var, v1.c(s1Var, cVar115)), v1.c(s1Var, cVar115), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar115)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f1114 = k1.v.f37772b;
                        u0 u0Var118 = new u0(f1114, f1114, f1114, f1114, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var118;
                    }
                    sVar.q();
                    c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                    rVar4 = rVar3;
                    z13 = z12;
                    u0Var3 = u0Var2;
                    vVar3 = vVar2;
                }
                w0Var3 = w0Var2;
                t0Var5 = t0Var2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
                }
            }
            vVarX = vVar;
            i15 = i210 | i25 | 12582912;
            if ((38347923 & i15) == 38347922) {
                sVar.Y();
                i16 = -458753;
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar116 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar116), v1.a(s1Var, v1.c(s1Var, cVar116)), v1.c(s1Var, cVar116), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar116)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f1115 = k1.v.f37772b;
                    u0 u0Var119 = new u0(f1115, f1115, f1115, f1115, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var119;
                } else {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar117 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar117), v1.a(s1Var, v1.c(s1Var, cVar117)), v1.c(s1Var, cVar117), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar117)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f1116 = k1.v.f37772b;
                    u0 u0Var1110 = new u0(f1116, f1116, f1116, f1116, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var1110;
                }
                sVar.q();
                c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                rVar4 = rVar3;
                z13 = z12;
                u0Var3 = u0Var2;
                vVar3 = vVar2;
            } else {
                sVar.Y();
                i16 = -458753;
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar118 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar118), v1.a(s1Var, v1.c(s1Var, cVar118)), v1.c(s1Var, cVar118), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar118)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f1117 = k1.v.f37772b;
                    u0 u0Var1111 = new u0(f1117, f1117, f1117, f1117, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var1111;
                } else {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar119 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar119), v1.a(s1Var, v1.c(s1Var, cVar119)), v1.c(s1Var, cVar119), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar119)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f1118 = k1.v.f37772b;
                    u0 u0Var1112 = new u0(f1118, f1118, f1118, f1118, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var1112;
                }
                sVar.q();
                c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                rVar4 = rVar3;
                z13 = z12;
                u0Var3 = u0Var2;
                vVar3 = vVar2;
            }
            w0Var3 = w0Var2;
            t0Var5 = t0Var2;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        int i211 = i13 | 384;
        if ((i12 & 8) == 0) {
            w0Var2 = w0Var;
            if (sVar.f(w0Var2)) {
            }
            int i212 = i211 | i22;
            if ((i12 & 16) == 0) {
                t0Var2 = t0Var;
                if (sVar.f(t0Var2)) {
                    i14 = 16384;
                }
                int i213 = i212 | i14 | 65536;
                if ((i12 & 64) == 0) {
                    vVarX = vVar;
                    if (sVar.f(vVarX)) {
                    }
                    i15 = i213 | i25 | 12582912;
                    if ((38347923 & i15) == 38347922) {
                        sVar.Y();
                        i16 = -458753;
                        if ((i11 & 1) != 0) {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar1110 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar1110), v1.a(s1Var, v1.c(s1Var, cVar1110)), v1.c(s1Var, cVar1110), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar1110)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f1119 = k1.v.f37772b;
                            u0 u0Var1113 = new u0(f1119, f1119, f1119, f1119, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var1113;
                        } else {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar1111 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar1111), v1.a(s1Var, v1.c(s1Var, cVar1111)), v1.c(s1Var, cVar1111), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar1111)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f11110 = k1.v.f37772b;
                            u0 u0Var1114 = new u0(f11110, f11110, f11110, f11110, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var1114;
                        }
                        sVar.q();
                        c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                        rVar4 = rVar3;
                        z13 = z12;
                        u0Var3 = u0Var2;
                        vVar3 = vVar2;
                    } else {
                        sVar.Y();
                        i16 = -458753;
                        if ((i11 & 1) != 0) {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar1112 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar1112), v1.a(s1Var, v1.c(s1Var, cVar1112)), v1.c(s1Var, cVar1112), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar1112)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f11111 = k1.v.f37772b;
                            u0 u0Var1115 = new u0(f11111, f11111, f11111, f11111, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var1115;
                        } else {
                            if (i19 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if ((i12 & 8) != 0) {
                                w0VarA = y7.a(k1.v.f37773c, sVar);
                                i15 &= -7169;
                            } else {
                                w0VarA = w0Var2;
                            }
                            if ((i12 & 16) != 0) {
                                s1Var = (s1) sVar.j(v1.f31180a);
                                t0Var4 = s1Var.O;
                                if (t0Var4 == null) {
                                    k1.c cVar1113 = k1.v.f37771a;
                                    t0Var3 = new t0(v1.c(s1Var, cVar1113), v1.a(s1Var, v1.c(s1Var, cVar1113)), v1.c(s1Var, cVar1113), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar1113)), 0.38f));
                                    s1Var.O = t0Var3;
                                } else {
                                    t0Var3 = t0Var4;
                                }
                                i15 &= -57345;
                            } else {
                                i16 = -458753;
                                t0Var3 = t0Var2;
                            }
                            float f11112 = k1.v.f37772b;
                            u0 u0Var1116 = new u0(f11112, f11112, f11112, f11112, k1.v.f37775e, k1.v.f37774d);
                            i17 = i15 & i16;
                            if ((i12 & 64) != 0) {
                                i18 = i15 & (-4128769);
                                vVarX = x(sVar, 0);
                            } else {
                                i18 = i17;
                            }
                            w0Var2 = w0VarA;
                            z12 = true;
                            vVar2 = vVarX;
                            t0Var2 = t0Var3;
                            u0Var2 = u0Var1116;
                        }
                        sVar.q();
                        c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                        rVar4 = rVar3;
                        z13 = z12;
                        u0Var3 = u0Var2;
                        vVar3 = vVar2;
                    }
                    w0Var3 = w0Var2;
                    t0Var5 = t0Var2;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
                    }
                }
                vVarX = vVar;
                i15 = i213 | i25 | 12582912;
                if ((38347923 & i15) == 38347922) {
                    sVar.Y();
                    i16 = -458753;
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar1114 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar1114), v1.a(s1Var, v1.c(s1Var, cVar1114)), v1.c(s1Var, cVar1114), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar1114)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f11113 = k1.v.f37772b;
                        u0 u0Var1117 = new u0(f11113, f11113, f11113, f11113, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var1117;
                    } else {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar1115 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar1115), v1.a(s1Var, v1.c(s1Var, cVar1115)), v1.c(s1Var, cVar1115), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar1115)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f11114 = k1.v.f37772b;
                        u0 u0Var1118 = new u0(f11114, f11114, f11114, f11114, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var1118;
                    }
                    sVar.q();
                    c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                    rVar4 = rVar3;
                    z13 = z12;
                    u0Var3 = u0Var2;
                    vVar3 = vVar2;
                } else {
                    sVar.Y();
                    i16 = -458753;
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar1116 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar1116), v1.a(s1Var, v1.c(s1Var, cVar1116)), v1.c(s1Var, cVar1116), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar1116)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f11115 = k1.v.f37772b;
                        u0 u0Var1119 = new u0(f11115, f11115, f11115, f11115, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var1119;
                    } else {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar1117 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar1117), v1.a(s1Var, v1.c(s1Var, cVar1117)), v1.c(s1Var, cVar1117), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar1117)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f11116 = k1.v.f37772b;
                        u0 u0Var11110 = new u0(f11116, f11116, f11116, f11116, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var11110;
                    }
                    sVar.q();
                    c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                    rVar4 = rVar3;
                    z13 = z12;
                    u0Var3 = u0Var2;
                    vVar3 = vVar2;
                }
                w0Var3 = w0Var2;
                t0Var5 = t0Var2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
                }
            }
            t0Var2 = t0Var;
            i14 = OSSConstants.DEFAULT_BUFFER_SIZE;
            int i214 = i212 | i14 | 65536;
            if ((i12 & 64) == 0) {
                vVarX = vVar;
                if (sVar.f(vVarX)) {
                }
                i15 = i214 | i25 | 12582912;
                if ((38347923 & i15) == 38347922) {
                    sVar.Y();
                    i16 = -458753;
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar1118 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar1118), v1.a(s1Var, v1.c(s1Var, cVar1118)), v1.c(s1Var, cVar1118), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar1118)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f11117 = k1.v.f37772b;
                        u0 u0Var11111 = new u0(f11117, f11117, f11117, f11117, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var11111;
                    } else {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar1119 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar1119), v1.a(s1Var, v1.c(s1Var, cVar1119)), v1.c(s1Var, cVar1119), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar1119)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f11118 = k1.v.f37772b;
                        u0 u0Var11112 = new u0(f11118, f11118, f11118, f11118, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var11112;
                    }
                    sVar.q();
                    c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                    rVar4 = rVar3;
                    z13 = z12;
                    u0Var3 = u0Var2;
                    vVar3 = vVar2;
                } else {
                    sVar.Y();
                    i16 = -458753;
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar11110 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar11110), v1.a(s1Var, v1.c(s1Var, cVar11110)), v1.c(s1Var, cVar11110), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar11110)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f11119 = k1.v.f37772b;
                        u0 u0Var11113 = new u0(f11119, f11119, f11119, f11119, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var11113;
                    } else {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar11111 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar11111), v1.a(s1Var, v1.c(s1Var, cVar11111)), v1.c(s1Var, cVar11111), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar11111)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f111110 = k1.v.f37772b;
                        u0 u0Var11114 = new u0(f111110, f111110, f111110, f111110, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var11114;
                    }
                    sVar.q();
                    c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                    rVar4 = rVar3;
                    z13 = z12;
                    u0Var3 = u0Var2;
                    vVar3 = vVar2;
                }
                w0Var3 = w0Var2;
                t0Var5 = t0Var2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
                }
            }
            vVarX = vVar;
            i15 = i214 | i25 | 12582912;
            if ((38347923 & i15) == 38347922) {
                sVar.Y();
                i16 = -458753;
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar11112 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar11112), v1.a(s1Var, v1.c(s1Var, cVar11112)), v1.c(s1Var, cVar11112), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar11112)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f111111 = k1.v.f37772b;
                    u0 u0Var11115 = new u0(f111111, f111111, f111111, f111111, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var11115;
                } else {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar11113 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar11113), v1.a(s1Var, v1.c(s1Var, cVar11113)), v1.c(s1Var, cVar11113), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar11113)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f111112 = k1.v.f37772b;
                    u0 u0Var11116 = new u0(f111112, f111112, f111112, f111112, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var11116;
                }
                sVar.q();
                c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                rVar4 = rVar3;
                z13 = z12;
                u0Var3 = u0Var2;
                vVar3 = vVar2;
            } else {
                sVar.Y();
                i16 = -458753;
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar11114 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar11114), v1.a(s1Var, v1.c(s1Var, cVar11114)), v1.c(s1Var, cVar11114), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar11114)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f111113 = k1.v.f37772b;
                    u0 u0Var11117 = new u0(f111113, f111113, f111113, f111113, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var11117;
                } else {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar11115 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar11115), v1.a(s1Var, v1.c(s1Var, cVar11115)), v1.c(s1Var, cVar11115), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar11115)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f111114 = k1.v.f37772b;
                    u0 u0Var11118 = new u0(f111114, f111114, f111114, f111114, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var11118;
                }
                sVar.q();
                c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                rVar4 = rVar3;
                z13 = z12;
                u0Var3 = u0Var2;
                vVar3 = vVar2;
            }
            w0Var3 = w0Var2;
            t0Var5 = t0Var2;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
            }
        }
        w0Var2 = w0Var;
        int i215 = i211 | i22;
        if ((i12 & 16) == 0) {
            t0Var2 = t0Var;
            if (sVar.f(t0Var2)) {
                i14 = 16384;
            }
            int i216 = i215 | i14 | 65536;
            if ((i12 & 64) == 0) {
                vVarX = vVar;
                if (sVar.f(vVarX)) {
                }
                i15 = i216 | i25 | 12582912;
                if ((38347923 & i15) == 38347922) {
                    sVar.Y();
                    i16 = -458753;
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar11116 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar11116), v1.a(s1Var, v1.c(s1Var, cVar11116)), v1.c(s1Var, cVar11116), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar11116)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f111115 = k1.v.f37772b;
                        u0 u0Var11119 = new u0(f111115, f111115, f111115, f111115, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var11119;
                    } else {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar11117 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar11117), v1.a(s1Var, v1.c(s1Var, cVar11117)), v1.c(s1Var, cVar11117), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar11117)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f111116 = k1.v.f37772b;
                        u0 u0Var111110 = new u0(f111116, f111116, f111116, f111116, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var111110;
                    }
                    sVar.q();
                    c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                    rVar4 = rVar3;
                    z13 = z12;
                    u0Var3 = u0Var2;
                    vVar3 = vVar2;
                } else {
                    sVar.Y();
                    i16 = -458753;
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar11118 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar11118), v1.a(s1Var, v1.c(s1Var, cVar11118)), v1.c(s1Var, cVar11118), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar11118)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f111117 = k1.v.f37772b;
                        u0 u0Var111111 = new u0(f111117, f111117, f111117, f111117, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var111111;
                    } else {
                        if (i19 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i12 & 8) != 0) {
                            w0VarA = y7.a(k1.v.f37773c, sVar);
                            i15 &= -7169;
                        } else {
                            w0VarA = w0Var2;
                        }
                        if ((i12 & 16) != 0) {
                            s1Var = (s1) sVar.j(v1.f31180a);
                            t0Var4 = s1Var.O;
                            if (t0Var4 == null) {
                                k1.c cVar11119 = k1.v.f37771a;
                                t0Var3 = new t0(v1.c(s1Var, cVar11119), v1.a(s1Var, v1.c(s1Var, cVar11119)), v1.c(s1Var, cVar11119), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar11119)), 0.38f));
                                s1Var.O = t0Var3;
                            } else {
                                t0Var3 = t0Var4;
                            }
                            i15 &= -57345;
                        } else {
                            i16 = -458753;
                            t0Var3 = t0Var2;
                        }
                        float f111118 = k1.v.f37772b;
                        u0 u0Var111112 = new u0(f111118, f111118, f111118, f111118, k1.v.f37775e, k1.v.f37774d);
                        i17 = i15 & i16;
                        if ((i12 & 64) != 0) {
                            i18 = i15 & (-4128769);
                            vVarX = x(sVar, 0);
                        } else {
                            i18 = i17;
                        }
                        w0Var2 = w0VarA;
                        z12 = true;
                        vVar2 = vVarX;
                        t0Var2 = t0Var3;
                        u0Var2 = u0Var111112;
                    }
                    sVar.q();
                    c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                    rVar4 = rVar3;
                    z13 = z12;
                    u0Var3 = u0Var2;
                    vVar3 = vVar2;
                }
                w0Var3 = w0Var2;
                t0Var5 = t0Var2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
                }
            }
            vVarX = vVar;
            i15 = i216 | i25 | 12582912;
            if ((38347923 & i15) == 38347922) {
                sVar.Y();
                i16 = -458753;
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar111110 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar111110), v1.a(s1Var, v1.c(s1Var, cVar111110)), v1.c(s1Var, cVar111110), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar111110)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f111119 = k1.v.f37772b;
                    u0 u0Var111113 = new u0(f111119, f111119, f111119, f111119, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var111113;
                } else {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar111111 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar111111), v1.a(s1Var, v1.c(s1Var, cVar111111)), v1.c(s1Var, cVar111111), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar111111)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f1111110 = k1.v.f37772b;
                    u0 u0Var111114 = new u0(f1111110, f1111110, f1111110, f1111110, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var111114;
                }
                sVar.q();
                c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                rVar4 = rVar3;
                z13 = z12;
                u0Var3 = u0Var2;
                vVar3 = vVar2;
            } else {
                sVar.Y();
                i16 = -458753;
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar111112 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar111112), v1.a(s1Var, v1.c(s1Var, cVar111112)), v1.c(s1Var, cVar111112), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar111112)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f1111111 = k1.v.f37772b;
                    u0 u0Var111115 = new u0(f1111111, f1111111, f1111111, f1111111, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var111115;
                } else {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar111113 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar111113), v1.a(s1Var, v1.c(s1Var, cVar111113)), v1.c(s1Var, cVar111113), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar111113)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f1111112 = k1.v.f37772b;
                    u0 u0Var111116 = new u0(f1111112, f1111112, f1111112, f1111112, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var111116;
                }
                sVar.q();
                c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                rVar4 = rVar3;
                z13 = z12;
                u0Var3 = u0Var2;
                vVar3 = vVar2;
            }
            w0Var3 = w0Var2;
            t0Var5 = t0Var2;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
            }
        }
        t0Var2 = t0Var;
        i14 = OSSConstants.DEFAULT_BUFFER_SIZE;
        int i217 = i215 | i14 | 65536;
        if ((i12 & 64) == 0) {
            vVarX = vVar;
            if (sVar.f(vVarX)) {
            }
            i15 = i217 | i25 | 12582912;
            if ((38347923 & i15) == 38347922) {
                sVar.Y();
                i16 = -458753;
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar111114 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar111114), v1.a(s1Var, v1.c(s1Var, cVar111114)), v1.c(s1Var, cVar111114), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar111114)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f1111113 = k1.v.f37772b;
                    u0 u0Var111117 = new u0(f1111113, f1111113, f1111113, f1111113, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var111117;
                } else {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar111115 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar111115), v1.a(s1Var, v1.c(s1Var, cVar111115)), v1.c(s1Var, cVar111115), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar111115)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f1111114 = k1.v.f37772b;
                    u0 u0Var111118 = new u0(f1111114, f1111114, f1111114, f1111114, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var111118;
                }
                sVar.q();
                c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                rVar4 = rVar3;
                z13 = z12;
                u0Var3 = u0Var2;
                vVar3 = vVar2;
            } else {
                sVar.Y();
                i16 = -458753;
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar111116 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar111116), v1.a(s1Var, v1.c(s1Var, cVar111116)), v1.c(s1Var, cVar111116), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar111116)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f1111115 = k1.v.f37772b;
                    u0 u0Var111119 = new u0(f1111115, f1111115, f1111115, f1111115, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var111119;
                } else {
                    if (i19 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        w0VarA = y7.a(k1.v.f37773c, sVar);
                        i15 &= -7169;
                    } else {
                        w0VarA = w0Var2;
                    }
                    if ((i12 & 16) != 0) {
                        s1Var = (s1) sVar.j(v1.f31180a);
                        t0Var4 = s1Var.O;
                        if (t0Var4 == null) {
                            k1.c cVar111117 = k1.v.f37771a;
                            t0Var3 = new t0(v1.c(s1Var, cVar111117), v1.a(s1Var, v1.c(s1Var, cVar111117)), v1.c(s1Var, cVar111117), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar111117)), 0.38f));
                            s1Var.O = t0Var3;
                        } else {
                            t0Var3 = t0Var4;
                        }
                        i15 &= -57345;
                    } else {
                        i16 = -458753;
                        t0Var3 = t0Var2;
                    }
                    float f1111116 = k1.v.f37772b;
                    u0 u0Var1111110 = new u0(f1111116, f1111116, f1111116, f1111116, k1.v.f37775e, k1.v.f37774d);
                    i17 = i15 & i16;
                    if ((i12 & 64) != 0) {
                        i18 = i15 & (-4128769);
                        vVarX = x(sVar, 0);
                    } else {
                        i18 = i17;
                    }
                    w0Var2 = w0VarA;
                    z12 = true;
                    vVar2 = vVarX;
                    t0Var2 = t0Var3;
                    u0Var2 = u0Var1111110;
                }
                sVar.q();
                c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
                rVar4 = rVar3;
                z13 = z12;
                u0Var3 = u0Var2;
                vVar3 = vVar2;
            }
            w0Var3 = w0Var2;
            t0Var5 = t0Var2;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
            }
        }
        vVarX = vVar;
        i15 = i217 | i25 | 12582912;
        if ((38347923 & i15) == 38347922) {
            sVar.Y();
            i16 = -458753;
            if ((i11 & 1) != 0) {
                if (i19 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i12 & 8) != 0) {
                    w0VarA = y7.a(k1.v.f37773c, sVar);
                    i15 &= -7169;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 16) != 0) {
                    s1Var = (s1) sVar.j(v1.f31180a);
                    t0Var4 = s1Var.O;
                    if (t0Var4 == null) {
                        k1.c cVar111118 = k1.v.f37771a;
                        t0Var3 = new t0(v1.c(s1Var, cVar111118), v1.a(s1Var, v1.c(s1Var, cVar111118)), v1.c(s1Var, cVar111118), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar111118)), 0.38f));
                        s1Var.O = t0Var3;
                    } else {
                        t0Var3 = t0Var4;
                    }
                    i15 &= -57345;
                } else {
                    i16 = -458753;
                    t0Var3 = t0Var2;
                }
                float f1111117 = k1.v.f37772b;
                u0 u0Var1111111 = new u0(f1111117, f1111117, f1111117, f1111117, k1.v.f37775e, k1.v.f37774d);
                i17 = i15 & i16;
                if ((i12 & 64) != 0) {
                    i18 = i15 & (-4128769);
                    vVarX = x(sVar, 0);
                } else {
                    i18 = i17;
                }
                w0Var2 = w0VarA;
                z12 = true;
                vVar2 = vVarX;
                t0Var2 = t0Var3;
                u0Var2 = u0Var1111111;
            } else {
                if (i19 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i12 & 8) != 0) {
                    w0VarA = y7.a(k1.v.f37773c, sVar);
                    i15 &= -7169;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 16) != 0) {
                    s1Var = (s1) sVar.j(v1.f31180a);
                    t0Var4 = s1Var.O;
                    if (t0Var4 == null) {
                        k1.c cVar111119 = k1.v.f37771a;
                        t0Var3 = new t0(v1.c(s1Var, cVar111119), v1.a(s1Var, v1.c(s1Var, cVar111119)), v1.c(s1Var, cVar111119), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar111119)), 0.38f));
                        s1Var.O = t0Var3;
                    } else {
                        t0Var3 = t0Var4;
                    }
                    i15 &= -57345;
                } else {
                    i16 = -458753;
                    t0Var3 = t0Var2;
                }
                float f1111118 = k1.v.f37772b;
                u0 u0Var1111112 = new u0(f1111118, f1111118, f1111118, f1111118, k1.v.f37775e, k1.v.f37774d);
                i17 = i15 & i16;
                if ((i12 & 64) != 0) {
                    i18 = i15 & (-4128769);
                    vVarX = x(sVar, 0);
                } else {
                    i18 = i17;
                }
                w0Var2 = w0VarA;
                z12 = true;
                vVar2 = vVarX;
                t0Var2 = t0Var3;
                u0Var2 = u0Var1111112;
            }
            sVar.q();
            c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
            rVar4 = rVar3;
            z13 = z12;
            u0Var3 = u0Var2;
            vVar3 = vVar2;
        } else {
            sVar.Y();
            i16 = -458753;
            if ((i11 & 1) != 0) {
                if (i19 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i12 & 8) != 0) {
                    w0VarA = y7.a(k1.v.f37773c, sVar);
                    i15 &= -7169;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 16) != 0) {
                    s1Var = (s1) sVar.j(v1.f31180a);
                    t0Var4 = s1Var.O;
                    if (t0Var4 == null) {
                        k1.c cVar1111110 = k1.v.f37771a;
                        t0Var3 = new t0(v1.c(s1Var, cVar1111110), v1.a(s1Var, v1.c(s1Var, cVar1111110)), v1.c(s1Var, cVar1111110), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar1111110)), 0.38f));
                        s1Var.O = t0Var3;
                    } else {
                        t0Var3 = t0Var4;
                    }
                    i15 &= -57345;
                } else {
                    i16 = -458753;
                    t0Var3 = t0Var2;
                }
                float f1111119 = k1.v.f37772b;
                u0 u0Var1111113 = new u0(f1111119, f1111119, f1111119, f1111119, k1.v.f37775e, k1.v.f37774d);
                i17 = i15 & i16;
                if ((i12 & 64) != 0) {
                    i18 = i15 & (-4128769);
                    vVarX = x(sVar, 0);
                } else {
                    i18 = i17;
                }
                w0Var2 = w0VarA;
                z12 = true;
                vVar2 = vVarX;
                t0Var2 = t0Var3;
                u0Var2 = u0Var1111113;
            } else {
                if (i19 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i12 & 8) != 0) {
                    w0VarA = y7.a(k1.v.f37773c, sVar);
                    i15 &= -7169;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 16) != 0) {
                    s1Var = (s1) sVar.j(v1.f31180a);
                    t0Var4 = s1Var.O;
                    if (t0Var4 == null) {
                        k1.c cVar1111111 = k1.v.f37771a;
                        t0Var3 = new t0(v1.c(s1Var, cVar1111111), v1.a(s1Var, v1.c(s1Var, cVar1111111)), v1.c(s1Var, cVar1111111), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar1111111)), 0.38f));
                        s1Var.O = t0Var3;
                    } else {
                        t0Var3 = t0Var4;
                    }
                    i15 &= -57345;
                } else {
                    i16 = -458753;
                    t0Var3 = t0Var2;
                }
                float f11111110 = k1.v.f37772b;
                u0 u0Var1111114 = new u0(f11111110, f11111110, f11111110, f11111110, k1.v.f37775e, k1.v.f37774d);
                i17 = i15 & i16;
                if ((i12 & 64) != 0) {
                    i18 = i15 & (-4128769);
                    vVarX = x(sVar, 0);
                } else {
                    i18 = i17;
                }
                w0Var2 = w0VarA;
                z12 = true;
                vVar2 = vVarX;
                t0Var2 = t0Var3;
                u0Var2 = u0Var1111114;
            }
            sVar.q();
            c(aVar, rVar3, z12, w0Var2, t0Var2, u0Var2, vVar2, dVar, sVar, i18 & 268435454, 0);
            rVar4 = rVar3;
            z13 = z12;
            u0Var3 = u0Var2;
            vVar3 = vVar2;
        }
        w0Var3 = w0Var2;
        t0Var5 = t0Var2;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w0(aVar, rVar4, z13, w0Var3, t0Var5, u0Var3, vVar3, dVar, i11, i12, 1);
        }
    }

    public static final void k(z1.r rVar, g2.w0 w0Var, t0 t0Var, u0 u0Var, d0.v vVar, t1.d dVar, l1.n nVar, int i11, int i12) {
        z1.r rVar2;
        int i13;
        g2.w0 w0Var2;
        t0 t0Var2;
        u0 u0Var2;
        d0.v vVar2;
        z1.r rVar3;
        g2.w0 w0VarA;
        t0 t0Var3;
        u0 u0Var3;
        d0.v vVarX;
        t0 t0Var4;
        u0 u0Var4;
        g2.w0 w0Var3;
        t0 t0Var5;
        u0 u0Var5;
        d0.v vVar3;
        int i14;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(740336179);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            rVar2 = rVar;
        } else if ((i11 & 6) == 0) {
            rVar2 = rVar;
            i13 = (sVar.f(rVar2) ? 4 : 2) | i11;
        } else {
            rVar2 = rVar;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                w0Var2 = w0Var;
                int i16 = sVar.f(w0Var2) ? 32 : 16;
                i13 |= i16;
            } else {
                w0Var2 = w0Var;
            }
            i13 |= i16;
        } else {
            w0Var2 = w0Var;
        }
        if ((i11 & 384) == 0) {
            if ((i12 & 4) == 0) {
                t0Var2 = t0Var;
                int i17 = sVar.f(t0Var2) ? 256 : 128;
                i13 |= i17;
            } else {
                t0Var2 = t0Var;
            }
            i13 |= i17;
        } else {
            t0Var2 = t0Var;
        }
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                u0Var2 = u0Var;
                int i18 = sVar.f(u0Var2) ? 2048 : 1024;
                i13 |= i18;
            } else {
                u0Var2 = u0Var;
            }
            i13 |= i18;
        } else {
            u0Var2 = u0Var;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                vVar2 = vVar;
                if (sVar.f(vVar2)) {
                    i14 = 16384;
                }
                i13 |= i14;
            } else {
                vVar2 = vVar;
            }
            i14 = OSSConstants.DEFAULT_BUFFER_SIZE;
            i13 |= i14;
        } else {
            vVar2 = vVar;
        }
        if ((196608 & i11) == 0) {
            i13 |= sVar.h(dVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((74899 & i13) == 74898 && sVar.F()) {
            sVar.W();
            w0Var3 = w0Var2;
            t0Var5 = t0Var2;
            u0Var5 = u0Var2;
            vVar3 = vVar2;
        } else {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                rVar3 = i15 != 0 ? z1.o.f58481a : rVar2;
                if ((i12 & 2) != 0) {
                    w0VarA = y7.a(k1.v.f37773c, sVar);
                    i13 &= -113;
                } else {
                    w0VarA = w0Var2;
                }
                if ((i12 & 4) != 0) {
                    s1 s1Var = (s1) sVar.j(v1.f31180a);
                    t0 t0Var6 = s1Var.O;
                    if (t0Var6 == null) {
                        k1.c cVar = k1.v.f37771a;
                        t0Var3 = new t0(v1.c(s1Var, cVar), v1.a(s1Var, v1.c(s1Var, cVar)), v1.c(s1Var, cVar), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar)), 0.38f));
                        s1Var.O = t0Var3;
                    } else {
                        t0Var3 = t0Var6;
                    }
                    i13 &= -897;
                } else {
                    t0Var3 = t0Var2;
                }
                if ((i12 & 8) != 0) {
                    float f5 = k1.v.f37772b;
                    u0Var3 = new u0(f5, f5, f5, f5, k1.v.f37775e, k1.v.f37774d);
                    i13 &= -7169;
                } else {
                    u0Var3 = u0Var2;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    vVarX = x(sVar, 1);
                } else {
                    vVarX = vVar2;
                }
                t0Var4 = t0Var3;
                u0Var4 = u0Var3;
            } else {
                sVar.W();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                }
                rVar3 = rVar2;
                w0VarA = w0Var2;
                t0Var4 = t0Var2;
                u0Var4 = u0Var2;
                vVarX = vVar2;
            }
            sVar.q();
            d(rVar3, w0VarA, t0Var4, u0Var4, vVarX, dVar, sVar, i13 & 524286, 0);
            rVar2 = rVar3;
            w0Var3 = w0VarA;
            t0Var5 = t0Var4;
            u0Var5 = u0Var4;
            vVar3 = vVarX;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v0(rVar2, w0Var3, t0Var5, u0Var5, vVar3, dVar, i11, i12, 1);
        }
    }

    public static final void l(x8 x8Var, z1.r rVar, fz.f fVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(464178177);
        int i12 = (sVar.f(rVar) ? 32 : 16) | i11 | 384;
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            fVar = e2.f30192a;
            u8 u8Var = (u8) x8Var.f31316b.getValue();
            z2.e eVar = (z2.e) sVar.j(z2.g1.f58540a);
            boolean zF = sVar.f(u8Var) | sVar.h(eVar);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new gu.b(8, u8Var, eVar, (vy.d) null);
                sVar.o0(objQ);
            }
            l1.t.f((fz.e) objQ, u8Var, sVar);
            f((u8) x8Var.f31316b.getValue(), rVar, sVar, i12 & 1008);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y4(x8Var, rVar, fVar, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x013a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0163  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    public static final void m(fz.a aVar, z1.r rVar, boolean z11, g2.w0 w0Var, i0 i0Var, j0.t1 t1Var, fz.f fVar, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        int i14;
        boolean z12;
        int i15;
        g2.w0 w0VarA;
        i0 i0VarE;
        int i16;
        int i17;
        j0.t1 t1Var2;
        int i18;
        int i19;
        z1.r rVar3;
        boolean z13;
        j0.t1 t1Var3;
        boolean z14;
        g2.w0 w0Var2;
        i0 i0Var2;
        int i21;
        z1.r rVar4;
        l1.s sVar;
        z1.r rVar5;
        boolean z15;
        g2.w0 w0Var3;
        i0 i0Var3;
        j0.t1 t1Var4;
        l1.x1 x1VarT;
        int i22;
        int i23;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-2106428362);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.h(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i24 = i12 & 2;
        if (i24 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar2.f(rVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 384) == 0) {
                    z12 = z11;
                    if (sVar2.g(z12)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i11 & 3072) == 0) {
                    if ((i12 & 8) == 0) {
                        w0VarA = w0Var;
                        int i25 = sVar2.f(w0VarA) ? 2048 : 1024;
                        i13 |= i25;
                    } else {
                        w0VarA = w0Var;
                    }
                    i13 |= i25;
                } else {
                    w0VarA = w0Var;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        i0VarE = i0Var;
                        if (sVar2.f(i0VarE)) {
                            i23 = 16384;
                        }
                        i13 |= i23;
                    } else {
                        i0VarE = i0Var;
                    }
                    i23 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    i13 |= i23;
                } else {
                    i0VarE = i0Var;
                }
                i16 = 1769472 | i13;
                i17 = i12 & 128;
                if (i17 != 0) {
                    if ((12582912 & i11) == 0) {
                        t1Var2 = t1Var;
                        if (sVar2.f(t1Var2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i16 |= i18;
                    }
                    i19 = i16 | 100663296;
                    if ((805306368 & i11) != 0) {
                        if (sVar2.h(fVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i19 |= i22;
                    }
                    if ((306783379 & i19) == 306783378 || !sVar2.F()) {
                        sVar2.Y();
                        if ((i11 & 1) != 0 || sVar2.C()) {
                            if (i24 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if ((i12 & 8) != 0) {
                                j0.v1 v1Var = j0.f30447a;
                                i19 &= -7169;
                                w0VarA = y7.a(k1.i0.f37565a, sVar2);
                            }
                            if ((i12 & 16) != 0) {
                                j0.v1 v1Var2 = j0.f30447a;
                                i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                                i19 &= -57345;
                            }
                            if (i17 != 0) {
                                t1Var2 = j0.f30448b;
                            }
                            t1Var3 = t1Var2;
                            z14 = z13;
                            w0Var2 = w0VarA;
                            i0Var2 = i0VarE;
                            i21 = i19;
                            rVar4 = rVar3;
                        } else {
                            sVar2.W();
                            if ((i12 & 8) != 0) {
                                i19 &= -7169;
                            }
                            if ((i12 & 16) != 0) {
                                i19 &= -57345;
                            }
                            t1Var3 = t1Var2;
                            z14 = z12;
                            w0Var2 = w0VarA;
                            i0Var2 = i0VarE;
                            i21 = i19;
                            rVar4 = rVar2;
                        }
                        sVar2.q();
                        sVar = sVar2;
                        b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
                        rVar5 = rVar4;
                        z15 = z14;
                        w0Var3 = w0Var2;
                        i0Var3 = i0Var2;
                        t1Var4 = t1Var3;
                    } else {
                        sVar2.W();
                        sVar = sVar2;
                        rVar5 = rVar2;
                        z15 = z12;
                        w0Var3 = w0VarA;
                        i0Var3 = i0VarE;
                        t1Var4 = t1Var2;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new a0.g0(aVar, rVar5, z15, w0Var3, i0Var3, t1Var4, fVar, i11, i12);
                    }
                }
                i16 = 14352384 | i13;
                t1Var2 = t1Var;
                i19 = i16 | 100663296;
                if ((805306368 & i11) != 0) {
                    if (sVar2.h(fVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i19 |= i22;
                }
                if ((306783379 & i19) == 306783378) {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var3 = j0.f30447a;
                            i19 &= -7169;
                            w0VarA = y7.a(k1.i0.f37565a, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var4 = j0.f30447a;
                            i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                            i19 &= -57345;
                        }
                        if (i17 != 0) {
                            t1Var2 = j0.f30448b;
                        }
                        t1Var3 = t1Var2;
                        z14 = z13;
                        w0Var2 = w0VarA;
                        i0Var2 = i0VarE;
                        i21 = i19;
                        rVar4 = rVar3;
                    } else {
                        if (i24 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var5 = j0.f30447a;
                            i19 &= -7169;
                            w0VarA = y7.a(k1.i0.f37565a, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var6 = j0.f30447a;
                            i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                            i19 &= -57345;
                        }
                        if (i17 != 0) {
                            t1Var2 = j0.f30448b;
                        }
                        t1Var3 = t1Var2;
                        z14 = z13;
                        w0Var2 = w0VarA;
                        i0Var2 = i0VarE;
                        i21 = i19;
                        rVar4 = rVar3;
                    }
                    sVar2.q();
                    sVar = sVar2;
                    b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
                    rVar5 = rVar4;
                    z15 = z14;
                    w0Var3 = w0Var2;
                    i0Var3 = i0Var2;
                    t1Var4 = t1Var3;
                } else {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var7 = j0.f30447a;
                            i19 &= -7169;
                            w0VarA = y7.a(k1.i0.f37565a, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var8 = j0.f30447a;
                            i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                            i19 &= -57345;
                        }
                        if (i17 != 0) {
                            t1Var2 = j0.f30448b;
                        }
                        t1Var3 = t1Var2;
                        z14 = z13;
                        w0Var2 = w0VarA;
                        i0Var2 = i0VarE;
                        i21 = i19;
                        rVar4 = rVar3;
                    } else {
                        if (i24 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var9 = j0.f30447a;
                            i19 &= -7169;
                            w0VarA = y7.a(k1.i0.f37565a, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var10 = j0.f30447a;
                            i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                            i19 &= -57345;
                        }
                        if (i17 != 0) {
                            t1Var2 = j0.f30448b;
                        }
                        t1Var3 = t1Var2;
                        z14 = z13;
                        w0Var2 = w0VarA;
                        i0Var2 = i0VarE;
                        i21 = i19;
                        rVar4 = rVar3;
                    }
                    sVar2.q();
                    sVar = sVar2;
                    b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
                    rVar5 = rVar4;
                    z15 = z14;
                    w0Var3 = w0Var2;
                    i0Var3 = i0Var2;
                    t1Var4 = t1Var3;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new a0.g0(aVar, rVar5, z15, w0Var3, i0Var3, t1Var4, fVar, i11, i12);
                }
            }
            i13 |= 384;
            z12 = z11;
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    w0VarA = w0Var;
                    if (sVar2.f(w0VarA)) {
                    }
                    i13 |= i25;
                } else {
                    w0VarA = w0Var;
                }
                i13 |= i25;
            } else {
                w0VarA = w0Var;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    i0VarE = i0Var;
                    if (sVar2.f(i0VarE)) {
                        i23 = 16384;
                    }
                    i13 |= i23;
                } else {
                    i0VarE = i0Var;
                }
                i23 = OSSConstants.DEFAULT_BUFFER_SIZE;
                i13 |= i23;
            } else {
                i0VarE = i0Var;
            }
            i16 = 1769472 | i13;
            i17 = i12 & 128;
            if (i17 != 0) {
                if ((12582912 & i11) == 0) {
                    t1Var2 = t1Var;
                    if (sVar2.f(t1Var2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i16 |= i18;
                }
                i19 = i16 | 100663296;
                if ((805306368 & i11) != 0) {
                    if (sVar2.h(fVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i19 |= i22;
                }
                if ((306783379 & i19) == 306783378) {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var11 = j0.f30447a;
                            i19 &= -7169;
                            w0VarA = y7.a(k1.i0.f37565a, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var12 = j0.f30447a;
                            i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                            i19 &= -57345;
                        }
                        if (i17 != 0) {
                            t1Var2 = j0.f30448b;
                        }
                        t1Var3 = t1Var2;
                        z14 = z13;
                        w0Var2 = w0VarA;
                        i0Var2 = i0VarE;
                        i21 = i19;
                        rVar4 = rVar3;
                    } else {
                        if (i24 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var13 = j0.f30447a;
                            i19 &= -7169;
                            w0VarA = y7.a(k1.i0.f37565a, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var14 = j0.f30447a;
                            i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                            i19 &= -57345;
                        }
                        if (i17 != 0) {
                            t1Var2 = j0.f30448b;
                        }
                        t1Var3 = t1Var2;
                        z14 = z13;
                        w0Var2 = w0VarA;
                        i0Var2 = i0VarE;
                        i21 = i19;
                        rVar4 = rVar3;
                    }
                    sVar2.q();
                    sVar = sVar2;
                    b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
                    rVar5 = rVar4;
                    z15 = z14;
                    w0Var3 = w0Var2;
                    i0Var3 = i0Var2;
                    t1Var4 = t1Var3;
                } else {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var15 = j0.f30447a;
                            i19 &= -7169;
                            w0VarA = y7.a(k1.i0.f37565a, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var16 = j0.f30447a;
                            i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                            i19 &= -57345;
                        }
                        if (i17 != 0) {
                            t1Var2 = j0.f30448b;
                        }
                        t1Var3 = t1Var2;
                        z14 = z13;
                        w0Var2 = w0VarA;
                        i0Var2 = i0VarE;
                        i21 = i19;
                        rVar4 = rVar3;
                    } else {
                        if (i24 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var17 = j0.f30447a;
                            i19 &= -7169;
                            w0VarA = y7.a(k1.i0.f37565a, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var18 = j0.f30447a;
                            i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                            i19 &= -57345;
                        }
                        if (i17 != 0) {
                            t1Var2 = j0.f30448b;
                        }
                        t1Var3 = t1Var2;
                        z14 = z13;
                        w0Var2 = w0VarA;
                        i0Var2 = i0VarE;
                        i21 = i19;
                        rVar4 = rVar3;
                    }
                    sVar2.q();
                    sVar = sVar2;
                    b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
                    rVar5 = rVar4;
                    z15 = z14;
                    w0Var3 = w0Var2;
                    i0Var3 = i0Var2;
                    t1Var4 = t1Var3;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new a0.g0(aVar, rVar5, z15, w0Var3, i0Var3, t1Var4, fVar, i11, i12);
                }
            }
            i16 = 14352384 | i13;
            t1Var2 = t1Var;
            i19 = i16 | 100663296;
            if ((805306368 & i11) != 0) {
                if (sVar2.h(fVar)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i19 |= i22;
            }
            if ((306783379 & i19) == 306783378) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var19 = j0.f30447a;
                        i19 &= -7169;
                        w0VarA = y7.a(k1.i0.f37565a, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var110 = j0.f30447a;
                        i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                        i19 &= -57345;
                    }
                    if (i17 != 0) {
                        t1Var2 = j0.f30448b;
                    }
                    t1Var3 = t1Var2;
                    z14 = z13;
                    w0Var2 = w0VarA;
                    i0Var2 = i0VarE;
                    i21 = i19;
                    rVar4 = rVar3;
                } else {
                    if (i24 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var111 = j0.f30447a;
                        i19 &= -7169;
                        w0VarA = y7.a(k1.i0.f37565a, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var112 = j0.f30447a;
                        i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                        i19 &= -57345;
                    }
                    if (i17 != 0) {
                        t1Var2 = j0.f30448b;
                    }
                    t1Var3 = t1Var2;
                    z14 = z13;
                    w0Var2 = w0VarA;
                    i0Var2 = i0VarE;
                    i21 = i19;
                    rVar4 = rVar3;
                }
                sVar2.q();
                sVar = sVar2;
                b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
                rVar5 = rVar4;
                z15 = z14;
                w0Var3 = w0Var2;
                i0Var3 = i0Var2;
                t1Var4 = t1Var3;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var113 = j0.f30447a;
                        i19 &= -7169;
                        w0VarA = y7.a(k1.i0.f37565a, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var114 = j0.f30447a;
                        i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                        i19 &= -57345;
                    }
                    if (i17 != 0) {
                        t1Var2 = j0.f30448b;
                    }
                    t1Var3 = t1Var2;
                    z14 = z13;
                    w0Var2 = w0VarA;
                    i0Var2 = i0VarE;
                    i21 = i19;
                    rVar4 = rVar3;
                } else {
                    if (i24 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var115 = j0.f30447a;
                        i19 &= -7169;
                        w0VarA = y7.a(k1.i0.f37565a, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var116 = j0.f30447a;
                        i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                        i19 &= -57345;
                    }
                    if (i17 != 0) {
                        t1Var2 = j0.f30448b;
                    }
                    t1Var3 = t1Var2;
                    z14 = z13;
                    w0Var2 = w0VarA;
                    i0Var2 = i0VarE;
                    i21 = i19;
                    rVar4 = rVar3;
                }
                sVar2.q();
                sVar = sVar2;
                b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
                rVar5 = rVar4;
                z15 = z14;
                w0Var3 = w0Var2;
                i0Var3 = i0Var2;
                t1Var4 = t1Var3;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new a0.g0(aVar, rVar5, z15, w0Var3, i0Var3, t1Var4, fVar, i11, i12);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 384) == 0) {
                z12 = z11;
                if (sVar2.g(z12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    w0VarA = w0Var;
                    if (sVar2.f(w0VarA)) {
                    }
                    i13 |= i25;
                } else {
                    w0VarA = w0Var;
                }
                i13 |= i25;
            } else {
                w0VarA = w0Var;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    i0VarE = i0Var;
                    if (sVar2.f(i0VarE)) {
                        i23 = 16384;
                    }
                    i13 |= i23;
                } else {
                    i0VarE = i0Var;
                }
                i23 = OSSConstants.DEFAULT_BUFFER_SIZE;
                i13 |= i23;
            } else {
                i0VarE = i0Var;
            }
            i16 = 1769472 | i13;
            i17 = i12 & 128;
            if (i17 != 0) {
                if ((12582912 & i11) == 0) {
                    t1Var2 = t1Var;
                    if (sVar2.f(t1Var2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i16 |= i18;
                }
                i19 = i16 | 100663296;
                if ((805306368 & i11) != 0) {
                    if (sVar2.h(fVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i19 |= i22;
                }
                if ((306783379 & i19) == 306783378) {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var117 = j0.f30447a;
                            i19 &= -7169;
                            w0VarA = y7.a(k1.i0.f37565a, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var118 = j0.f30447a;
                            i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                            i19 &= -57345;
                        }
                        if (i17 != 0) {
                            t1Var2 = j0.f30448b;
                        }
                        t1Var3 = t1Var2;
                        z14 = z13;
                        w0Var2 = w0VarA;
                        i0Var2 = i0VarE;
                        i21 = i19;
                        rVar4 = rVar3;
                    } else {
                        if (i24 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var119 = j0.f30447a;
                            i19 &= -7169;
                            w0VarA = y7.a(k1.i0.f37565a, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var1110 = j0.f30447a;
                            i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                            i19 &= -57345;
                        }
                        if (i17 != 0) {
                            t1Var2 = j0.f30448b;
                        }
                        t1Var3 = t1Var2;
                        z14 = z13;
                        w0Var2 = w0VarA;
                        i0Var2 = i0VarE;
                        i21 = i19;
                        rVar4 = rVar3;
                    }
                    sVar2.q();
                    sVar = sVar2;
                    b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
                    rVar5 = rVar4;
                    z15 = z14;
                    w0Var3 = w0Var2;
                    i0Var3 = i0Var2;
                    t1Var4 = t1Var3;
                } else {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var1111 = j0.f30447a;
                            i19 &= -7169;
                            w0VarA = y7.a(k1.i0.f37565a, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var1112 = j0.f30447a;
                            i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                            i19 &= -57345;
                        }
                        if (i17 != 0) {
                            t1Var2 = j0.f30448b;
                        }
                        t1Var3 = t1Var2;
                        z14 = z13;
                        w0Var2 = w0VarA;
                        i0Var2 = i0VarE;
                        i21 = i19;
                        rVar4 = rVar3;
                    } else {
                        if (i24 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            j0.v1 v1Var1113 = j0.f30447a;
                            i19 &= -7169;
                            w0VarA = y7.a(k1.i0.f37565a, sVar2);
                        }
                        if ((i12 & 16) != 0) {
                            j0.v1 v1Var1114 = j0.f30447a;
                            i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                            i19 &= -57345;
                        }
                        if (i17 != 0) {
                            t1Var2 = j0.f30448b;
                        }
                        t1Var3 = t1Var2;
                        z14 = z13;
                        w0Var2 = w0VarA;
                        i0Var2 = i0VarE;
                        i21 = i19;
                        rVar4 = rVar3;
                    }
                    sVar2.q();
                    sVar = sVar2;
                    b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
                    rVar5 = rVar4;
                    z15 = z14;
                    w0Var3 = w0Var2;
                    i0Var3 = i0Var2;
                    t1Var4 = t1Var3;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new a0.g0(aVar, rVar5, z15, w0Var3, i0Var3, t1Var4, fVar, i11, i12);
                }
            }
            i16 = 14352384 | i13;
            t1Var2 = t1Var;
            i19 = i16 | 100663296;
            if ((805306368 & i11) != 0) {
                if (sVar2.h(fVar)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i19 |= i22;
            }
            if ((306783379 & i19) == 306783378) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var1115 = j0.f30447a;
                        i19 &= -7169;
                        w0VarA = y7.a(k1.i0.f37565a, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var1116 = j0.f30447a;
                        i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                        i19 &= -57345;
                    }
                    if (i17 != 0) {
                        t1Var2 = j0.f30448b;
                    }
                    t1Var3 = t1Var2;
                    z14 = z13;
                    w0Var2 = w0VarA;
                    i0Var2 = i0VarE;
                    i21 = i19;
                    rVar4 = rVar3;
                } else {
                    if (i24 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var1117 = j0.f30447a;
                        i19 &= -7169;
                        w0VarA = y7.a(k1.i0.f37565a, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var1118 = j0.f30447a;
                        i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                        i19 &= -57345;
                    }
                    if (i17 != 0) {
                        t1Var2 = j0.f30448b;
                    }
                    t1Var3 = t1Var2;
                    z14 = z13;
                    w0Var2 = w0VarA;
                    i0Var2 = i0VarE;
                    i21 = i19;
                    rVar4 = rVar3;
                }
                sVar2.q();
                sVar = sVar2;
                b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
                rVar5 = rVar4;
                z15 = z14;
                w0Var3 = w0Var2;
                i0Var3 = i0Var2;
                t1Var4 = t1Var3;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var1119 = j0.f30447a;
                        i19 &= -7169;
                        w0VarA = y7.a(k1.i0.f37565a, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var11110 = j0.f30447a;
                        i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                        i19 &= -57345;
                    }
                    if (i17 != 0) {
                        t1Var2 = j0.f30448b;
                    }
                    t1Var3 = t1Var2;
                    z14 = z13;
                    w0Var2 = w0VarA;
                    i0Var2 = i0VarE;
                    i21 = i19;
                    rVar4 = rVar3;
                } else {
                    if (i24 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var11111 = j0.f30447a;
                        i19 &= -7169;
                        w0VarA = y7.a(k1.i0.f37565a, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var11112 = j0.f30447a;
                        i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                        i19 &= -57345;
                    }
                    if (i17 != 0) {
                        t1Var2 = j0.f30448b;
                    }
                    t1Var3 = t1Var2;
                    z14 = z13;
                    w0Var2 = w0VarA;
                    i0Var2 = i0VarE;
                    i21 = i19;
                    rVar4 = rVar3;
                }
                sVar2.q();
                sVar = sVar2;
                b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
                rVar5 = rVar4;
                z15 = z14;
                w0Var3 = w0Var2;
                i0Var3 = i0Var2;
                t1Var4 = t1Var3;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new a0.g0(aVar, rVar5, z15, w0Var3, i0Var3, t1Var4, fVar, i11, i12);
            }
        }
        i13 |= 384;
        z12 = z11;
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                w0VarA = w0Var;
                if (sVar2.f(w0VarA)) {
                }
                i13 |= i25;
            } else {
                w0VarA = w0Var;
            }
            i13 |= i25;
        } else {
            w0VarA = w0Var;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                i0VarE = i0Var;
                if (sVar2.f(i0VarE)) {
                    i23 = 16384;
                }
                i13 |= i23;
            } else {
                i0VarE = i0Var;
            }
            i23 = OSSConstants.DEFAULT_BUFFER_SIZE;
            i13 |= i23;
        } else {
            i0VarE = i0Var;
        }
        i16 = 1769472 | i13;
        i17 = i12 & 128;
        if (i17 != 0) {
            if ((12582912 & i11) == 0) {
                t1Var2 = t1Var;
                if (sVar2.f(t1Var2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i16 |= i18;
            }
            i19 = i16 | 100663296;
            if ((805306368 & i11) != 0) {
                if (sVar2.h(fVar)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i19 |= i22;
            }
            if ((306783379 & i19) == 306783378) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var11113 = j0.f30447a;
                        i19 &= -7169;
                        w0VarA = y7.a(k1.i0.f37565a, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var11114 = j0.f30447a;
                        i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                        i19 &= -57345;
                    }
                    if (i17 != 0) {
                        t1Var2 = j0.f30448b;
                    }
                    t1Var3 = t1Var2;
                    z14 = z13;
                    w0Var2 = w0VarA;
                    i0Var2 = i0VarE;
                    i21 = i19;
                    rVar4 = rVar3;
                } else {
                    if (i24 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var11115 = j0.f30447a;
                        i19 &= -7169;
                        w0VarA = y7.a(k1.i0.f37565a, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var11116 = j0.f30447a;
                        i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                        i19 &= -57345;
                    }
                    if (i17 != 0) {
                        t1Var2 = j0.f30448b;
                    }
                    t1Var3 = t1Var2;
                    z14 = z13;
                    w0Var2 = w0VarA;
                    i0Var2 = i0VarE;
                    i21 = i19;
                    rVar4 = rVar3;
                }
                sVar2.q();
                sVar = sVar2;
                b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
                rVar5 = rVar4;
                z15 = z14;
                w0Var3 = w0Var2;
                i0Var3 = i0Var2;
                t1Var4 = t1Var3;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var11117 = j0.f30447a;
                        i19 &= -7169;
                        w0VarA = y7.a(k1.i0.f37565a, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var11118 = j0.f30447a;
                        i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                        i19 &= -57345;
                    }
                    if (i17 != 0) {
                        t1Var2 = j0.f30448b;
                    }
                    t1Var3 = t1Var2;
                    z14 = z13;
                    w0Var2 = w0VarA;
                    i0Var2 = i0VarE;
                    i21 = i19;
                    rVar4 = rVar3;
                } else {
                    if (i24 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        j0.v1 v1Var11119 = j0.f30447a;
                        i19 &= -7169;
                        w0VarA = y7.a(k1.i0.f37565a, sVar2);
                    }
                    if ((i12 & 16) != 0) {
                        j0.v1 v1Var111110 = j0.f30447a;
                        i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                        i19 &= -57345;
                    }
                    if (i17 != 0) {
                        t1Var2 = j0.f30448b;
                    }
                    t1Var3 = t1Var2;
                    z14 = z13;
                    w0Var2 = w0VarA;
                    i0Var2 = i0VarE;
                    i21 = i19;
                    rVar4 = rVar3;
                }
                sVar2.q();
                sVar = sVar2;
                b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
                rVar5 = rVar4;
                z15 = z14;
                w0Var3 = w0Var2;
                i0Var3 = i0Var2;
                t1Var4 = t1Var3;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new a0.g0(aVar, rVar5, z15, w0Var3, i0Var3, t1Var4, fVar, i11, i12);
            }
        }
        i16 = 14352384 | i13;
        t1Var2 = t1Var;
        i19 = i16 | 100663296;
        if ((805306368 & i11) != 0) {
            if (sVar2.h(fVar)) {
                i22 = 536870912;
            } else {
                i22 = 268435456;
            }
            i19 |= i22;
        }
        if ((306783379 & i19) == 306783378) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i24 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    j0.v1 v1Var111111 = j0.f30447a;
                    i19 &= -7169;
                    w0VarA = y7.a(k1.i0.f37565a, sVar2);
                }
                if ((i12 & 16) != 0) {
                    j0.v1 v1Var111112 = j0.f30447a;
                    i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                    i19 &= -57345;
                }
                if (i17 != 0) {
                    t1Var2 = j0.f30448b;
                }
                t1Var3 = t1Var2;
                z14 = z13;
                w0Var2 = w0VarA;
                i0Var2 = i0VarE;
                i21 = i19;
                rVar4 = rVar3;
            } else {
                if (i24 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    j0.v1 v1Var111113 = j0.f30447a;
                    i19 &= -7169;
                    w0VarA = y7.a(k1.i0.f37565a, sVar2);
                }
                if ((i12 & 16) != 0) {
                    j0.v1 v1Var111114 = j0.f30447a;
                    i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                    i19 &= -57345;
                }
                if (i17 != 0) {
                    t1Var2 = j0.f30448b;
                }
                t1Var3 = t1Var2;
                z14 = z13;
                w0Var2 = w0VarA;
                i0Var2 = i0VarE;
                i21 = i19;
                rVar4 = rVar3;
            }
            sVar2.q();
            sVar = sVar2;
            b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
            rVar5 = rVar4;
            z15 = z14;
            w0Var3 = w0Var2;
            i0Var3 = i0Var2;
            t1Var4 = t1Var3;
        } else {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i24 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    j0.v1 v1Var111115 = j0.f30447a;
                    i19 &= -7169;
                    w0VarA = y7.a(k1.i0.f37565a, sVar2);
                }
                if ((i12 & 16) != 0) {
                    j0.v1 v1Var111116 = j0.f30447a;
                    i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                    i19 &= -57345;
                }
                if (i17 != 0) {
                    t1Var2 = j0.f30448b;
                }
                t1Var3 = t1Var2;
                z14 = z13;
                w0Var2 = w0VarA;
                i0Var2 = i0VarE;
                i21 = i19;
                rVar4 = rVar3;
            } else {
                if (i24 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    j0.v1 v1Var111117 = j0.f30447a;
                    i19 &= -7169;
                    w0VarA = y7.a(k1.i0.f37565a, sVar2);
                }
                if ((i12 & 16) != 0) {
                    j0.v1 v1Var111118 = j0.f30447a;
                    i0VarE = j0.e((s1) sVar2.j(v1.f31180a));
                    i19 &= -57345;
                }
                if (i17 != 0) {
                    t1Var2 = j0.f30448b;
                }
                t1Var3 = t1Var2;
                z14 = z13;
                w0Var2 = w0VarA;
                i0Var2 = i0VarE;
                i21 = i19;
                rVar4 = rVar3;
            }
            sVar2.q();
            sVar = sVar2;
            b(aVar, rVar4, z14, w0Var2, i0Var2, null, null, t1Var3, fVar, sVar, i21 & 2147483646, 0);
            rVar5 = rVar4;
            z15 = z14;
            w0Var3 = w0Var2;
            i0Var3 = i0Var2;
            t1Var4 = t1Var3;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a0.g0(aVar, rVar5, z15, w0Var3, i0Var3, t1Var4, fVar, i11, i12);
        }
    }

    public static final void n(z1.r rVar, float f5, long j11, l1.n nVar, int i11, int i12) {
        float f11;
        int i13;
        float f12;
        z1.r rVar2;
        float f13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1534852205);
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 = i11 | 48;
            f11 = f5;
        } else if ((i11 & 48) == 0) {
            f11 = f5;
            i13 = i11 | (sVar.c(f11) ? 32 : 16);
        } else {
            f11 = f5;
            i13 = i11;
        }
        long jD = j11;
        int i15 = i13 | (((i12 & 4) == 0 && sVar.e(jD)) ? 256 : 128);
        if ((i15 & 147) == 146 && sVar.F()) {
            sVar.W();
            rVar2 = rVar;
            f13 = f11;
        } else {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                f12 = i14 != 0 ? y3.f31340a : f11;
                if ((i12 & 4) != 0) {
                    float f14 = y3.f31340a;
                    jD = v1.d(k1.f.f37509a, sVar);
                    i15 &= -897;
                }
            } else {
                sVar.W();
                if ((i12 & 4) != 0) {
                    i15 &= -897;
                }
                f12 = f11;
            }
            sVar.q();
            rVar2 = rVar;
            z1.r rVarS = j0.e2.s(j0.e2.c(rVar2, 1.0f), f12);
            int i16 = 1;
            boolean z11 = ((i15 & 112) == 32) | ((((i15 & 896) ^ 384) > 256 && sVar.e(jD)) || (i15 & 384) == 256);
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new a4(f12, i16, jD);
                sVar.o0(objQ);
            }
            d0.n.b(0, (fz.c) objQ, sVar, rVarS);
            f13 = f12;
        }
        long j12 = jD;
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z3(rVar2, f13, j12, i11, i12, 2);
        }
    }

    public static t0 o(l1.n nVar) {
        return u((s1) ((l1.s) nVar).j(v1.f31180a));
    }

    public static t0 p(long j11, l1.n nVar, int i11) {
        long jB = v1.b(j11, nVar);
        return u((s1) ((l1.s) nVar).j(v1.f31180a)).a(j11, jB, g2.x.f28622i, g2.x.c(jB, 0.38f));
    }

    public static u0 q(int i11, float f5) {
        if ((i11 & 1) != 0) {
            f5 = k1.m.f37614b;
        }
        return new u0(f5, k1.m.f37622j, k1.m.f37620h, k1.m.f37621i, k1.m.f37619g, k1.m.f37617e);
    }

    public static final Locale r(l1.n nVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.d0(-1190822718);
        Locale locale = ((Configuration) sVar.j(AndroidCompositionLocals_androidKt.f1199a)).getLocales().get(0);
        sVar.p(false);
        return locale;
    }

    public static u0 s(float f5) {
        return new u0(f5, k1.g.f37526e, k1.g.f37524c, k1.g.f37525d, k1.g.f37523b, k1.g.f37522a);
    }

    public static s1 t(l1.n nVar) {
        return (s1) ((l1.s) nVar).j(v1.f31180a);
    }

    public static t0 u(s1 s1Var) {
        t0 t0Var = s1Var.N;
        if (t0Var != null) {
            return t0Var;
        }
        k1.c cVar = k1.m.f37613a;
        t0 t0Var2 = new t0(v1.c(s1Var, cVar), v1.a(s1Var, v1.c(s1Var, cVar)), g2.f0.l(g2.x.c(v1.c(s1Var, k1.m.f37616d), k1.m.f37618f), v1.c(s1Var, cVar)), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar)), 0.38f));
        s1Var.N = t0Var2;
        return t0Var2;
    }

    public static z0 v(s1 s1Var) {
        z0 z0Var = s1Var.S;
        if (z0Var != null) {
            return z0Var;
        }
        long jC = v1.c(s1Var, k1.a.f37428c);
        long j11 = g2.x.f28621h;
        k1.c cVar = k1.a.f37426a;
        long jC2 = v1.c(s1Var, cVar);
        k1.c cVar2 = k1.a.f37427b;
        z0 z0Var2 = new z0(jC, j11, jC2, j11, g2.x.c(v1.c(s1Var, cVar2), 0.38f), j11, g2.x.c(v1.c(s1Var, cVar2), 0.38f), v1.c(s1Var, cVar), v1.c(s1Var, k1.a.f37431f), g2.x.c(v1.c(s1Var, cVar2), 0.38f), g2.x.c(v1.c(s1Var, k1.a.f37430e), 0.38f), g2.x.c(v1.c(s1Var, cVar2), 0.38f));
        s1Var.S = z0Var2;
        return z0Var2;
    }

    public static dc w(l1.n nVar) {
        return (dc) ((l1.s) nVar).j(fc.f30256a);
    }

    public static d0.v x(l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.d0(-134409770);
        long jD = v1.d(k1.v.f37776f, sVar);
        sVar.p(false);
        l1.s sVar2 = (l1.s) nVar;
        boolean zE = sVar2.e(jD);
        Object objQ = sVar2.Q();
        if (zE || objQ == l1.m.f39353a) {
            objQ = d0.n.a(jD, k1.v.f37777g);
            sVar2.o0(objQ);
        }
        return (d0.v) objQ;
    }

    public static t0 y(long j11, long j12, l1.n nVar, int i11) {
        t0 t0Var;
        long jB = (i11 & 2) != 0 ? v1.b(j11, nVar) : j12;
        long j13 = g2.x.f28622i;
        long jC = g2.x.c(v1.b(j11, nVar), 0.38f);
        s1 s1Var = (s1) ((l1.s) nVar).j(v1.f31180a);
        t0 t0Var2 = s1Var.O;
        if (t0Var2 == null) {
            k1.c cVar = k1.v.f37771a;
            t0 t0Var3 = new t0(v1.c(s1Var, cVar), v1.a(s1Var, v1.c(s1Var, cVar)), v1.c(s1Var, cVar), g2.x.c(v1.a(s1Var, v1.c(s1Var, cVar)), 0.38f));
            s1Var.O = t0Var3;
            t0Var = t0Var3;
        } else {
            t0Var = t0Var2;
        }
        return t0Var.a(j11, jB, j13, jC);
    }
}
