package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.data.model.AchievementLevelType;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z1.r f30279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f30280c = 240;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f30281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f30282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0.v f30283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0.v f30284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b0.v f30285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b0.v f30286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b0.v f30287j;

    static {
        float f5 = 10;
        f30278a = f5;
        f30279b = j0.c.C(g3.r.b(w2.a0.k(z1.o.f58481a, y1.f31335t), true, o0.R), CropImageView.DEFAULT_ASPECT_RATIO, f5, 1);
        float f11 = k1.z.f37838e;
        f30281d = f11;
        f30282e = k1.z.f37839f - (f11 * 2);
        f30283f = new b0.v(0.2f, CropImageView.DEFAULT_ASPECT_RATIO, 0.8f, 1.0f);
        f30284g = new b0.v(0.4f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f);
        f30285h = new b0.v(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0.65f, 1.0f);
        f30286i = new b0.v(0.1f, CropImageView.DEFAULT_ASPECT_RATIO, 0.45f, 1.0f);
        f30287j = new b0.v(0.4f, CropImageView.DEFAULT_ASPECT_RATIO, 0.2f, 1.0f);
    }

    public static final void a(fz.a aVar, z1.r rVar, long j11, float f5, long j12, int i11, float f11, l1.n nVar, int i12, int i13) {
        int i14;
        long jD;
        int i15;
        float f12;
        int i16;
        float f13;
        float f14;
        long j13;
        int i17;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1798883595);
        if ((i12 & 6) == 0) {
            i14 = (sVar.h(aVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= sVar.e(j11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= sVar.c(f5) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            jD = j12;
            i14 |= ((i13 & 16) == 0 && sVar.e(jD)) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        } else {
            jD = j12;
        }
        int i18 = i13 & 32;
        if (i18 != 0) {
            i14 |= 196608;
            i15 = i11;
        } else {
            i15 = i11;
            if ((i12 & 196608) == 0) {
                i14 |= sVar.d(i15) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
            }
        }
        int i19 = i13 & 64;
        if (i19 != 0) {
            i14 |= 1572864;
            f12 = f11;
        } else {
            f12 = f11;
            if ((i12 & 1572864) == 0) {
                i14 |= sVar.c(f12) ? 1048576 : 524288;
            }
        }
        if ((i14 & 599187) == 599186 && sVar.F()) {
            sVar.W();
            i17 = i15;
            j13 = jD;
        } else {
            sVar.Y();
            if ((i12 & 1) == 0 || sVar.C()) {
                if ((i13 & 16) != 0) {
                    float f15 = w6.f31234a;
                    jD = v1.d(k1.z.f37837d, sVar);
                    i14 &= -57345;
                }
                int i21 = i18 != 0 ? w6.f31236c : i15;
                if (i19 != 0) {
                    f13 = w6.f31240g;
                    i16 = i21;
                } else {
                    i16 = i21;
                    f13 = f12;
                }
            } else {
                sVar.W();
                if ((i13 & 16) != 0) {
                    i14 &= -57345;
                }
                f13 = f12;
                i16 = i15;
            }
            long j14 = jD;
            sVar.q();
            boolean z11 = (i14 & 14) == 4;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new x5(2, aVar);
                sVar.o0(objQ);
            }
            fz.a aVar2 = (fz.a) objQ;
            i2.h hVar = new i2.h(((v3.c) sVar.j(z2.g1.f58547h)).e0(f5), CropImageView.DEFAULT_ASPECT_RATIO, i16, 0, null, 26);
            boolean zF = sVar.f(aVar2);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = new p5(2, aVar2);
                sVar.o0(objQ2);
            }
            z1.r rVarN = j0.e2.n(g3.r.b(rVar, true, (fz.c) objQ2), f30282e);
            boolean zF2 = ((i14 & 458752) == 131072) | sVar.f(aVar2) | ((3670016 & i14) == 1048576) | ((i14 & 7168) == 2048) | ((((57344 & i14) ^ 24576) > 16384 && sVar.e(j14)) || (i14 & 24576) == 16384) | sVar.h(hVar) | ((((i14 & 896) ^ 384) > 256 && sVar.e(j11)) || (i14 & 384) == 256);
            Object objQ3 = sVar.Q();
            if (zF2 || objQ3 == gVar) {
                f14 = f13;
                x6 x6Var = new x6(aVar2, i16, f14, f5, j14, hVar, j11);
                sVar.o0(x6Var);
                objQ3 = x6Var;
            } else {
                f14 = f13;
            }
            d0.n.b(0, (fz.c) objQ3, sVar, rVarN);
            f12 = f14;
            j13 = j14;
            i17 = i16;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y6(aVar, rVar, j11, f5, j13, i17, f12, i12, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:66:0x0204  */
    /* JADX WARN: Code duplicated, block: B:72:0x0212  */
    /* JADX WARN: Code duplicated, block: B:76:0x021e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0249  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void b(float f5, int i11, int i12, int i13, long j11, long j12, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        int i14;
        long jD;
        float f11;
        int i15;
        z1.r rVar3;
        z1.r rVar4;
        int i16;
        float f12;
        int i17;
        long j13;
        long j14;
        i2.h hVar;
        long j15;
        int i18;
        b0.h0 h0VarJ;
        b0.h0 h0VarG;
        b0.h0 h0VarG2;
        b0.h0 h0VarG3;
        boolean z11;
        boolean z12;
        Object objQ;
        float f13;
        long j16;
        long j17;
        z1.r rVar5;
        long j18;
        float f14;
        long j19;
        int i19;
        l1.x1 x1VarT;
        Float fValueOf = Float.valueOf(290.0f);
        Float fValueOf2 = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-115871647);
        int i21 = i13 & 1;
        if (i21 != 0) {
            i14 = i12 | 6;
            rVar2 = rVar;
        } else if ((i12 & 6) == 0) {
            rVar2 = rVar;
            i14 = (sVar.f(rVar2) ? 4 : 2) | i12;
        } else {
            rVar2 = rVar;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            jD = j11;
            i14 |= ((i13 & 2) == 0 && sVar.e(jD)) ? 32 : 16;
        } else {
            jD = j11;
        }
        int i22 = i13 & 4;
        if (i22 == 0) {
            if ((i12 & 384) == 0) {
                f11 = f5;
                i14 |= sVar.c(f11) ? 256 : 128;
            }
            i15 = i14 | 25600;
            if ((i15 & 9363) == 9362 || !sVar.F()) {
                sVar.Y();
                if ((i12 & 1) != 0 || sVar.C()) {
                    if (i21 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i13 & 2) != 0) {
                        float f15 = w6.f31234a;
                        jD = v1.d(k1.z.f37834a, sVar);
                        i15 &= -113;
                    }
                    if (i22 != 0) {
                        f11 = w6.f31234a;
                    }
                    float f16 = w6.f31234a;
                    long j21 = g2.x.f28621h;
                    rVar4 = rVar3;
                    i16 = w6.f31237d;
                    f12 = f11;
                    i17 = i15 & (-7169);
                    j13 = jD;
                    j14 = j21;
                } else {
                    sVar.W();
                    if ((i13 & 2) != 0) {
                        i15 &= -113;
                    }
                    int i23 = i15 & (-7169);
                    float f17 = f11;
                    i17 = i23;
                    f12 = f17;
                    i16 = i11;
                    rVar4 = rVar2;
                    j13 = jD;
                    j14 = j12;
                }
                sVar.q();
                hVar = new i2.h(((v3.c) sVar.j(z2.g1.f58547h)).e0(f12), CropImageView.DEFAULT_ASPECT_RATIO, i16, 0, null, 26);
                int i24 = i16;
                j15 = j14;
                b0.j0 j0VarP = b0.e.p(null, sVar, 1);
                i18 = i17;
                b0.j2 j2Var = b0.e.f3497k;
                a10.b bVar = b0.b0.f3441d;
                h0VarJ = b0.e.j(j0VarP, 0, 5, j2Var, b0.e.o(b0.e.r(6660, 0, bVar, 2), null, 6), null, sVar, 33208, 16);
                sVar = sVar;
                h0VarG = b0.e.g(j0VarP, CropImageView.DEFAULT_ASPECT_RATIO, 286.0f, b0.e.o(b0.e.r(1332, 0, bVar, 2), null, 6), null, sVar, 4536, 8);
                b0.n0 n0Var = new b0.n0();
                n0Var.f3619a = 1332;
                b0.m0 m0VarA = n0Var.a(fValueOf2, 0);
                b0.v vVar = f30287j;
                m0VarA.f3607b = vVar;
                n0Var.a(fValueOf, 666);
                h0VarG2 = b0.e.g(j0VarP, CropImageView.DEFAULT_ASPECT_RATIO, 290.0f, b0.e.o(new b0.o0(n0Var), null, 6), null, sVar, 4536, 8);
                b0.n0 n0Var2 = new b0.n0();
                n0Var2.f3619a = 1332;
                n0Var2.a(fValueOf2, 666).f3607b = vVar;
                n0Var2.a(fValueOf, n0Var2.f3619a);
                h0VarG3 = b0.e.g(j0VarP, CropImageView.DEFAULT_ASPECT_RATIO, 290.0f, b0.e.o(new b0.o0(n0Var2), null, 6), null, sVar, 4536, 8);
                z1.r rVarN = j0.e2.n(g3.r.b(rVar4, true, new d0.y1(0)), f30282e);
                boolean zE = sVar.e(j15) | sVar.h(hVar) | sVar.f(h0VarJ) | sVar.f(h0VarG2) | sVar.f(h0VarG3) | sVar.f(h0VarG);
                if ((i18 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | zE | ((((i18 & 112) ^ 48) <= 32 && sVar.e(j13)) || (i18 & 48) == 32);
                objQ = sVar.Q();
                if (!z12 || objQ == l1.m.f39353a) {
                    f13 = f12;
                    j16 = j13;
                    j17 = j15;
                    objQ = new z6(j17, hVar, h0VarJ, h0VarG2, h0VarG3, h0VarG, f13, j16);
                    sVar.o0(objQ);
                } else {
                    f13 = f12;
                    j16 = j13;
                    j17 = j15;
                }
                d0.n.b(0, (fz.c) objQ, sVar, rVarN);
                rVar5 = rVar4;
                j18 = j17;
                f14 = f13;
                j19 = j16;
                i19 = i24;
            } else {
                sVar.W();
                i19 = i11;
                j18 = j12;
                rVar5 = rVar2;
                j19 = jD;
                f14 = f11;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new a7(rVar5, j19, f14, j18, i19, i12, i13);
            }
        }
        i14 |= 384;
        f11 = f5;
        i15 = i14 | 25600;
        if ((i15 & 9363) == 9362) {
            sVar.Y();
            if ((i12 & 1) != 0) {
                if (i21 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i13 & 2) != 0) {
                    float f18 = w6.f31234a;
                    jD = v1.d(k1.z.f37834a, sVar);
                    i15 &= -113;
                }
                if (i22 != 0) {
                    f11 = w6.f31234a;
                }
                float f19 = w6.f31234a;
                long j22 = g2.x.f28621h;
                rVar4 = rVar3;
                i16 = w6.f31237d;
                f12 = f11;
                i17 = i15 & (-7169);
                j13 = jD;
                j14 = j22;
            } else {
                if (i21 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i13 & 2) != 0) {
                    float f110 = w6.f31234a;
                    jD = v1.d(k1.z.f37834a, sVar);
                    i15 &= -113;
                }
                if (i22 != 0) {
                    f11 = w6.f31234a;
                }
                float f111 = w6.f31234a;
                long j23 = g2.x.f28621h;
                rVar4 = rVar3;
                i16 = w6.f31237d;
                f12 = f11;
                i17 = i15 & (-7169);
                j13 = jD;
                j14 = j23;
            }
            sVar.q();
            hVar = new i2.h(((v3.c) sVar.j(z2.g1.f58547h)).e0(f12), CropImageView.DEFAULT_ASPECT_RATIO, i16, 0, null, 26);
            int i25 = i16;
            j15 = j14;
            b0.j0 j0VarP2 = b0.e.p(null, sVar, 1);
            i18 = i17;
            b0.j2 j2Var2 = b0.e.f3497k;
            a10.b bVar2 = b0.b0.f3441d;
            h0VarJ = b0.e.j(j0VarP2, 0, 5, j2Var2, b0.e.o(b0.e.r(6660, 0, bVar2, 2), null, 6), null, sVar, 33208, 16);
            sVar = sVar;
            h0VarG = b0.e.g(j0VarP2, CropImageView.DEFAULT_ASPECT_RATIO, 286.0f, b0.e.o(b0.e.r(1332, 0, bVar2, 2), null, 6), null, sVar, 4536, 8);
            b0.n0 n0Var3 = new b0.n0();
            n0Var3.f3619a = 1332;
            b0.m0 m0VarA2 = n0Var3.a(fValueOf2, 0);
            b0.v vVar2 = f30287j;
            m0VarA2.f3607b = vVar2;
            n0Var3.a(fValueOf, 666);
            h0VarG2 = b0.e.g(j0VarP2, CropImageView.DEFAULT_ASPECT_RATIO, 290.0f, b0.e.o(new b0.o0(n0Var3), null, 6), null, sVar, 4536, 8);
            b0.n0 n0Var4 = new b0.n0();
            n0Var4.f3619a = 1332;
            n0Var4.a(fValueOf2, 666).f3607b = vVar2;
            n0Var4.a(fValueOf, n0Var4.f3619a);
            h0VarG3 = b0.e.g(j0VarP2, CropImageView.DEFAULT_ASPECT_RATIO, 290.0f, b0.e.o(new b0.o0(n0Var4), null, 6), null, sVar, 4536, 8);
            z1.r rVarN2 = j0.e2.n(g3.r.b(rVar4, true, new d0.y1(0)), f30282e);
            boolean zE2 = sVar.e(j15) | sVar.h(hVar) | sVar.f(h0VarJ) | sVar.f(h0VarG2) | sVar.f(h0VarG3) | sVar.f(h0VarG);
            if ((i18 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | zE2 | ((((i18 & 112) ^ 48) <= 32 && sVar.e(j13)) || (i18 & 48) == 32);
            objQ = sVar.Q();
            if (z12) {
                f13 = f12;
                j16 = j13;
                j17 = j15;
                objQ = new z6(j17, hVar, h0VarJ, h0VarG2, h0VarG3, h0VarG, f13, j16);
                sVar.o0(objQ);
            } else {
                f13 = f12;
                j16 = j13;
                j17 = j15;
                objQ = new z6(j17, hVar, h0VarJ, h0VarG2, h0VarG3, h0VarG, f13, j16);
                sVar.o0(objQ);
            }
            d0.n.b(0, (fz.c) objQ, sVar, rVarN2);
            rVar5 = rVar4;
            j18 = j17;
            f14 = f13;
            j19 = j16;
            i19 = i25;
        } else {
            sVar.Y();
            if ((i12 & 1) != 0) {
                if (i21 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i13 & 2) != 0) {
                    float f112 = w6.f31234a;
                    jD = v1.d(k1.z.f37834a, sVar);
                    i15 &= -113;
                }
                if (i22 != 0) {
                    f11 = w6.f31234a;
                }
                float f113 = w6.f31234a;
                long j24 = g2.x.f28621h;
                rVar4 = rVar3;
                i16 = w6.f31237d;
                f12 = f11;
                i17 = i15 & (-7169);
                j13 = jD;
                j14 = j24;
            } else {
                if (i21 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i13 & 2) != 0) {
                    float f114 = w6.f31234a;
                    jD = v1.d(k1.z.f37834a, sVar);
                    i15 &= -113;
                }
                if (i22 != 0) {
                    f11 = w6.f31234a;
                }
                float f115 = w6.f31234a;
                long j25 = g2.x.f28621h;
                rVar4 = rVar3;
                i16 = w6.f31237d;
                f12 = f11;
                i17 = i15 & (-7169);
                j13 = jD;
                j14 = j25;
            }
            sVar.q();
            hVar = new i2.h(((v3.c) sVar.j(z2.g1.f58547h)).e0(f12), CropImageView.DEFAULT_ASPECT_RATIO, i16, 0, null, 26);
            int i26 = i16;
            j15 = j14;
            b0.j0 j0VarP3 = b0.e.p(null, sVar, 1);
            i18 = i17;
            b0.j2 j2Var3 = b0.e.f3497k;
            a10.b bVar3 = b0.b0.f3441d;
            h0VarJ = b0.e.j(j0VarP3, 0, 5, j2Var3, b0.e.o(b0.e.r(6660, 0, bVar3, 2), null, 6), null, sVar, 33208, 16);
            sVar = sVar;
            h0VarG = b0.e.g(j0VarP3, CropImageView.DEFAULT_ASPECT_RATIO, 286.0f, b0.e.o(b0.e.r(1332, 0, bVar3, 2), null, 6), null, sVar, 4536, 8);
            b0.n0 n0Var5 = new b0.n0();
            n0Var5.f3619a = 1332;
            b0.m0 m0VarA3 = n0Var5.a(fValueOf2, 0);
            b0.v vVar3 = f30287j;
            m0VarA3.f3607b = vVar3;
            n0Var5.a(fValueOf, 666);
            h0VarG2 = b0.e.g(j0VarP3, CropImageView.DEFAULT_ASPECT_RATIO, 290.0f, b0.e.o(new b0.o0(n0Var5), null, 6), null, sVar, 4536, 8);
            b0.n0 n0Var6 = new b0.n0();
            n0Var6.f3619a = 1332;
            n0Var6.a(fValueOf2, 666).f3607b = vVar3;
            n0Var6.a(fValueOf, n0Var6.f3619a);
            h0VarG3 = b0.e.g(j0VarP3, CropImageView.DEFAULT_ASPECT_RATIO, 290.0f, b0.e.o(new b0.o0(n0Var6), null, 6), null, sVar, 4536, 8);
            z1.r rVarN3 = j0.e2.n(g3.r.b(rVar4, true, new d0.y1(0)), f30282e);
            boolean zE3 = sVar.e(j15) | sVar.h(hVar) | sVar.f(h0VarJ) | sVar.f(h0VarG2) | sVar.f(h0VarG3) | sVar.f(h0VarG);
            if ((i18 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | zE3 | ((((i18 & 112) ^ 48) <= 32 && sVar.e(j13)) || (i18 & 48) == 32);
            objQ = sVar.Q();
            if (z12) {
                f13 = f12;
                j16 = j13;
                j17 = j15;
                objQ = new z6(j17, hVar, h0VarJ, h0VarG2, h0VarG3, h0VarG, f13, j16);
                sVar.o0(objQ);
            } else {
                f13 = f12;
                j16 = j13;
                j17 = j15;
                objQ = new z6(j17, hVar, h0VarJ, h0VarG2, h0VarG3, h0VarG, f13, j16);
                sVar.o0(objQ);
            }
            d0.n.b(0, (fz.c) objQ, sVar, rVarN3);
            rVar5 = rVar4;
            j18 = j17;
            f14 = f13;
            j19 = j16;
            i19 = i26;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a7(rVar5, j19, f14, j18, i19, i12, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0134  */
    /* JADX WARN: Code duplicated, block: B:101:0x0137  */
    /* JADX WARN: Code duplicated, block: B:104:0x013c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x0159  */
    /* JADX WARN: Code duplicated, block: B:118:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:122:0x0175  */
    /* JADX WARN: Code duplicated, block: B:125:0x0180  */
    /* JADX WARN: Code duplicated, block: B:126:0x0182  */
    /* JADX WARN: Code duplicated, block: B:129:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x018c  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:161:0x020d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0213  */
    /* JADX WARN: Code duplicated, block: B:169:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x022e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0257  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    /* JADX WARN: Code duplicated, block: B:88:0x010d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x011d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Code duplicated, block: B:97:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0131  */
    public static final void c(fz.a aVar, z1.r rVar, long j11, long j12, int i11, float f5, fz.c cVar, l1.n nVar, int i12, int i13) {
        int i14;
        z1.r rVar2;
        int i15;
        int i16;
        long jD;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        float f11;
        int i23;
        fz.c cVar2;
        int i24;
        z1.r rVar3;
        long jD2;
        int i25;
        float f12;
        fz.c cVar3;
        int i26;
        float f13;
        boolean z11;
        boolean z12;
        Object objQ;
        boolean z13;
        Object objQ2;
        int i27;
        fz.a aVar2;
        boolean zF;
        Object objQ3;
        boolean z14;
        boolean z15;
        boolean zF2;
        Object objQ4;
        long j13;
        fz.c cVar4;
        long j14;
        z1.r rVar4;
        int i28;
        float f14;
        long j15;
        long j16;
        fz.c cVar5;
        l1.x1 x1VarT;
        int i29;
        int i30;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-339970038);
        if ((i12 & 6) == 0) {
            i14 = (sVar.h(aVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i31 = i13 & 2;
        if (i31 == 0) {
            if ((i12 & 48) == 0) {
                rVar2 = rVar;
                i14 |= sVar.f(rVar2) ? 32 : 16;
            }
            if ((i13 & 4) == 0 || !sVar.e(j11)) {
                i15 = 128;
            } else {
                i15 = 256;
            }
            i16 = i14 | i15;
            if ((i12 & 3072) == 0) {
                jD = j12;
                if ((i13 & 8) == 0 || !sVar.e(jD)) {
                    i30 = 1024;
                } else {
                    i30 = 2048;
                }
                i16 |= i30;
            } else {
                jD = j12;
            }
            i17 = i13 & 16;
            if (i17 != 0) {
                i21 = i16 | 24576;
                i18 = i11;
            } else {
                i18 = i11;
                if (sVar.d(i18)) {
                    i19 = 16384;
                } else {
                    i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i21 = i16 | i19;
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                i21 |= 196608;
                f11 = f5;
            } else {
                f11 = f5;
                if ((i12 & 196608) == 0) {
                    if (sVar.c(f11)) {
                        i23 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i23 = 65536;
                    }
                    i21 |= i23;
                }
            }
            if ((i12 & 1572864) == 0) {
                cVar2 = cVar;
                if ((i13 & 64) == 0 || !sVar.h(cVar2)) {
                    i29 = 524288;
                } else {
                    i29 = 1048576;
                }
                i21 |= i29;
            } else {
                cVar2 = cVar;
            }
            if ((i21 & 599187) == 599186 || !sVar.F()) {
                sVar.Y();
                i24 = i12 & 1;
                l1.g gVar = l1.m.f39353a;
                if (i24 != 0 || sVar.C()) {
                    if (i31 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i13 & 4) != 0) {
                        float f15 = w6.f31234a;
                        jD2 = v1.d(k1.z.f37834a, sVar);
                        i21 &= -897;
                    } else {
                        jD2 = j11;
                    }
                    if ((i13 & 8) != 0) {
                        float f16 = w6.f31234a;
                        jD = v1.d(k1.z.f37837d, sVar);
                        i21 &= -7169;
                    }
                    if (i17 != 0) {
                        i25 = w6.f31235b;
                    } else {
                        i25 = i18;
                    }
                    if (i22 != 0) {
                        f12 = w6.f31239f;
                    } else {
                        f12 = f11;
                    }
                    if ((i13 & 64) != 0) {
                        boolean z16 = (((i21 & 896) ^ 384) <= 256 && sVar.e(jD2)) || (i21 & 384) == 256;
                        if ((i21 & 57344) == 16384) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z16 | z11;
                        objQ = sVar.Q();
                        if (z12 || objQ == gVar) {
                            objQ = new c7(jD2, i25);
                            sVar.o0(objQ);
                        }
                        cVar3 = (fz.c) objQ;
                        i21 &= -3670017;
                    } else {
                        cVar3 = cVar;
                    }
                    i26 = i25;
                    f13 = f12;
                } else {
                    sVar.W();
                    if ((i13 & 4) != 0) {
                        i21 &= -897;
                    }
                    if ((i13 & 8) != 0) {
                        i21 &= -7169;
                    }
                    if ((i13 & 64) != 0) {
                        i21 &= -3670017;
                    }
                    rVar3 = rVar2;
                    jD2 = j11;
                    f13 = f11;
                    i26 = i18;
                    cVar3 = cVar;
                }
                sVar.q();
                if ((i21 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objQ2 = sVar.Q();
                i27 = 3;
                if (z13 || objQ2 == gVar) {
                    objQ2 = new x5(i27, aVar);
                    sVar.o0(objQ2);
                }
                aVar2 = (fz.a) objQ2;
                z1.r rVarI = rVar3.i(f30279b);
                zF = sVar.f(aVar2);
                objQ3 = sVar.Q();
                if (zF || objQ3 == gVar) {
                    objQ3 = new p5(3, aVar2);
                    sVar.o0(objQ3);
                }
                z1.r rVarP = j0.e2.p(g3.r.b(rVarI, true, (fz.c) objQ3), f30280c, f30281d);
                if ((i21 & 57344) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((458752 & i21) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zF2 = z14 | z15 | sVar.f(aVar2) | ((((i21 & 7168) ^ 3072) <= 2048 && sVar.e(jD)) || (i21 & 3072) == 2048) | ((((i21 & 896) ^ 384) <= 256 && sVar.e(jD2)) || (i21 & 384) == 256) | ((((3670016 & i21) ^ 1572864) <= 1048576 && sVar.f(cVar3)) || (i21 & 1572864) == 1048576);
                objQ4 = sVar.Q();
                if (!zF2 || objQ4 == gVar) {
                    j13 = jD2;
                    cVar4 = cVar3;
                    j14 = jD;
                    objQ4 = new d7(i26, f13, aVar2, j14, j13, cVar4);
                    sVar.o0(objQ4);
                } else {
                    j13 = jD2;
                    cVar4 = cVar3;
                    j14 = jD;
                }
                d0.n.b(0, (fz.c) objQ4, sVar, rVarP);
                rVar4 = rVar3;
                i28 = i26;
                f14 = f13;
                j15 = j14;
                j16 = j13;
                cVar5 = cVar4;
            } else {
                sVar.W();
                cVar5 = cVar2;
                j16 = j11;
                rVar4 = rVar2;
                f14 = f11;
                j15 = jD;
                i28 = i18;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new e7(aVar, rVar4, j16, j15, i28, f14, cVar5, i12, i13);
            }
        }
        i14 |= 48;
        rVar2 = rVar;
        if ((i13 & 4) == 0) {
            i15 = 128;
        } else {
            i15 = 128;
        }
        i16 = i14 | i15;
        if ((i12 & 3072) == 0) {
            jD = j12;
            if ((i13 & 8) == 0) {
                i30 = 1024;
            } else {
                i30 = 1024;
            }
            i16 |= i30;
        } else {
            jD = j12;
        }
        i17 = i13 & 16;
        if (i17 != 0) {
            i21 = i16 | 24576;
            i18 = i11;
        } else {
            i18 = i11;
            if (sVar.d(i18)) {
                i19 = 16384;
            } else {
                i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            i21 = i16 | i19;
        }
        i22 = i13 & 32;
        if (i22 != 0) {
            i21 |= 196608;
            f11 = f5;
        } else {
            f11 = f5;
            if ((i12 & 196608) == 0) {
                if (sVar.c(f11)) {
                    i23 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i23 = 65536;
                }
                i21 |= i23;
            }
        }
        if ((i12 & 1572864) == 0) {
            cVar2 = cVar;
            if ((i13 & 64) == 0) {
                i29 = 524288;
            } else {
                i29 = 524288;
            }
            i21 |= i29;
        } else {
            cVar2 = cVar;
        }
        if ((i21 & 599187) == 599186) {
            sVar.Y();
            i24 = i12 & 1;
            l1.g gVar2 = l1.m.f39353a;
            if (i24 != 0) {
                if (i31 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i13 & 4) != 0) {
                    float f17 = w6.f31234a;
                    jD2 = v1.d(k1.z.f37834a, sVar);
                    i21 &= -897;
                } else {
                    jD2 = j11;
                }
                if ((i13 & 8) != 0) {
                    float f18 = w6.f31234a;
                    jD = v1.d(k1.z.f37837d, sVar);
                    i21 &= -7169;
                }
                if (i17 != 0) {
                    i25 = w6.f31235b;
                } else {
                    i25 = i18;
                }
                if (i22 != 0) {
                    f12 = w6.f31239f;
                } else {
                    f12 = f11;
                }
                if ((i13 & 64) != 0) {
                    if (((i21 & 896) ^ 384) <= 256) {
                    }
                    if ((i21 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z16 | z11;
                    objQ = sVar.Q();
                    if (z12) {
                        objQ = new c7(jD2, i25);
                        sVar.o0(objQ);
                    } else {
                        objQ = new c7(jD2, i25);
                        sVar.o0(objQ);
                    }
                    cVar3 = (fz.c) objQ;
                    i21 &= -3670017;
                } else {
                    cVar3 = cVar;
                }
                i26 = i25;
                f13 = f12;
            } else {
                if (i31 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i13 & 4) != 0) {
                    float f19 = w6.f31234a;
                    jD2 = v1.d(k1.z.f37834a, sVar);
                    i21 &= -897;
                } else {
                    jD2 = j11;
                }
                if ((i13 & 8) != 0) {
                    float f110 = w6.f31234a;
                    jD = v1.d(k1.z.f37837d, sVar);
                    i21 &= -7169;
                }
                if (i17 != 0) {
                    i25 = w6.f31235b;
                } else {
                    i25 = i18;
                }
                if (i22 != 0) {
                    f12 = w6.f31239f;
                } else {
                    f12 = f11;
                }
                if ((i13 & 64) != 0) {
                    if (((i21 & 896) ^ 384) <= 256) {
                    }
                    if ((i21 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z16 | z11;
                    objQ = sVar.Q();
                    if (z12) {
                        objQ = new c7(jD2, i25);
                        sVar.o0(objQ);
                    } else {
                        objQ = new c7(jD2, i25);
                        sVar.o0(objQ);
                    }
                    cVar3 = (fz.c) objQ;
                    i21 &= -3670017;
                } else {
                    cVar3 = cVar;
                }
                i26 = i25;
                f13 = f12;
            }
            sVar.q();
            if ((i21 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            objQ2 = sVar.Q();
            i27 = 3;
            if (z13) {
                objQ2 = new x5(i27, aVar);
                sVar.o0(objQ2);
            } else {
                objQ2 = new x5(i27, aVar);
                sVar.o0(objQ2);
            }
            aVar2 = (fz.a) objQ2;
            z1.r rVarI2 = rVar3.i(f30279b);
            zF = sVar.f(aVar2);
            objQ3 = sVar.Q();
            if (zF) {
                objQ3 = new p5(3, aVar2);
                sVar.o0(objQ3);
            } else {
                objQ3 = new p5(3, aVar2);
                sVar.o0(objQ3);
            }
            z1.r rVarP2 = j0.e2.p(g3.r.b(rVarI2, true, (fz.c) objQ3), f30280c, f30281d);
            if ((i21 & 57344) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((458752 & i21) == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            zF2 = z14 | z15 | sVar.f(aVar2) | ((((i21 & 7168) ^ 3072) <= 2048 && sVar.e(jD)) || (i21 & 3072) == 2048) | ((((i21 & 896) ^ 384) <= 256 && sVar.e(jD2)) || (i21 & 384) == 256) | ((((3670016 & i21) ^ 1572864) <= 1048576 && sVar.f(cVar3)) || (i21 & 1572864) == 1048576);
            objQ4 = sVar.Q();
            if (zF2) {
                j13 = jD2;
                cVar4 = cVar3;
                j14 = jD;
                objQ4 = new d7(i26, f13, aVar2, j14, j13, cVar4);
                sVar.o0(objQ4);
            } else {
                j13 = jD2;
                cVar4 = cVar3;
                j14 = jD;
                objQ4 = new d7(i26, f13, aVar2, j14, j13, cVar4);
                sVar.o0(objQ4);
            }
            d0.n.b(0, (fz.c) objQ4, sVar, rVarP2);
            rVar4 = rVar3;
            i28 = i26;
            f14 = f13;
            j15 = j14;
            j16 = j13;
            cVar5 = cVar4;
        } else {
            sVar.Y();
            i24 = i12 & 1;
            l1.g gVar3 = l1.m.f39353a;
            if (i24 != 0) {
                if (i31 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i13 & 4) != 0) {
                    float f111 = w6.f31234a;
                    jD2 = v1.d(k1.z.f37834a, sVar);
                    i21 &= -897;
                } else {
                    jD2 = j11;
                }
                if ((i13 & 8) != 0) {
                    float f112 = w6.f31234a;
                    jD = v1.d(k1.z.f37837d, sVar);
                    i21 &= -7169;
                }
                if (i17 != 0) {
                    i25 = w6.f31235b;
                } else {
                    i25 = i18;
                }
                if (i22 != 0) {
                    f12 = w6.f31239f;
                } else {
                    f12 = f11;
                }
                if ((i13 & 64) != 0) {
                    if (((i21 & 896) ^ 384) <= 256) {
                    }
                    if ((i21 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z16 | z11;
                    objQ = sVar.Q();
                    if (z12) {
                        objQ = new c7(jD2, i25);
                        sVar.o0(objQ);
                    } else {
                        objQ = new c7(jD2, i25);
                        sVar.o0(objQ);
                    }
                    cVar3 = (fz.c) objQ;
                    i21 &= -3670017;
                } else {
                    cVar3 = cVar;
                }
                i26 = i25;
                f13 = f12;
            } else {
                if (i31 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i13 & 4) != 0) {
                    float f113 = w6.f31234a;
                    jD2 = v1.d(k1.z.f37834a, sVar);
                    i21 &= -897;
                } else {
                    jD2 = j11;
                }
                if ((i13 & 8) != 0) {
                    float f114 = w6.f31234a;
                    jD = v1.d(k1.z.f37837d, sVar);
                    i21 &= -7169;
                }
                if (i17 != 0) {
                    i25 = w6.f31235b;
                } else {
                    i25 = i18;
                }
                if (i22 != 0) {
                    f12 = w6.f31239f;
                } else {
                    f12 = f11;
                }
                if ((i13 & 64) != 0) {
                    if (((i21 & 896) ^ 384) <= 256) {
                    }
                    if ((i21 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z16 | z11;
                    objQ = sVar.Q();
                    if (z12) {
                        objQ = new c7(jD2, i25);
                        sVar.o0(objQ);
                    } else {
                        objQ = new c7(jD2, i25);
                        sVar.o0(objQ);
                    }
                    cVar3 = (fz.c) objQ;
                    i21 &= -3670017;
                } else {
                    cVar3 = cVar;
                }
                i26 = i25;
                f13 = f12;
            }
            sVar.q();
            if ((i21 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            objQ2 = sVar.Q();
            i27 = 3;
            if (z13) {
                objQ2 = new x5(i27, aVar);
                sVar.o0(objQ2);
            } else {
                objQ2 = new x5(i27, aVar);
                sVar.o0(objQ2);
            }
            aVar2 = (fz.a) objQ2;
            z1.r rVarI3 = rVar3.i(f30279b);
            zF = sVar.f(aVar2);
            objQ3 = sVar.Q();
            if (zF) {
                objQ3 = new p5(3, aVar2);
                sVar.o0(objQ3);
            } else {
                objQ3 = new p5(3, aVar2);
                sVar.o0(objQ3);
            }
            z1.r rVarP3 = j0.e2.p(g3.r.b(rVarI3, true, (fz.c) objQ3), f30280c, f30281d);
            if ((i21 & 57344) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((458752 & i21) == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            zF2 = z14 | z15 | sVar.f(aVar2) | ((((i21 & 7168) ^ 3072) <= 2048 && sVar.e(jD)) || (i21 & 3072) == 2048) | ((((i21 & 896) ^ 384) <= 256 && sVar.e(jD2)) || (i21 & 384) == 256) | ((((3670016 & i21) ^ 1572864) <= 1048576 && sVar.f(cVar3)) || (i21 & 1572864) == 1048576);
            objQ4 = sVar.Q();
            if (zF2) {
                j13 = jD2;
                cVar4 = cVar3;
                j14 = jD;
                objQ4 = new d7(i26, f13, aVar2, j14, j13, cVar4);
                sVar.o0(objQ4);
            } else {
                j13 = jD2;
                cVar4 = cVar3;
                j14 = jD;
                objQ4 = new d7(i26, f13, aVar2, j14, j13, cVar4);
                sVar.o0(objQ4);
            }
            d0.n.b(0, (fz.c) objQ4, sVar, rVarP3);
            rVar4 = rVar3;
            i28 = i26;
            f14 = f13;
            j15 = j14;
            j16 = j13;
            cVar5 = cVar4;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e7(aVar, rVar4, j16, j15, i28, f14, cVar5, i12, i13);
        }
    }

    public static final void d(float f5, int i11, int i12, int i13, long j11, long j12, l1.n nVar, z1.r rVar) {
        int i14;
        int i15;
        int i16;
        int i17;
        float f11;
        l1.s sVar;
        float f12;
        Object f7Var;
        int i18;
        int i19;
        int i21;
        float f13;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(567589233);
        if ((i12 & 6) == 0) {
            i14 = (sVar2.f(rVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i22 = i14 | (sVar2.e(j11) ? 32 : 16);
        if ((i12 & 384) == 0) {
            i22 |= sVar2.e(j12) ? 256 : 128;
        }
        int i23 = i13 & 8;
        if (i23 != 0) {
            i16 = i22 | 3072;
            i15 = i11;
        } else {
            i15 = i11;
            i16 = i22 | (sVar2.d(i15) ? 2048 : 1024);
        }
        int i24 = i16 | 24576;
        if ((i24 & 9363) == 9362 && sVar2.F()) {
            sVar2.W();
            f13 = f5;
            sVar = sVar2;
            i21 = i15;
        } else {
            sVar2.Y();
            if ((i12 & 1) == 0 || sVar2.C()) {
                i17 = i23 != 0 ? w6.f31235b : i15;
                f11 = w6.f31239f;
            } else {
                sVar2.W();
                f11 = f5;
                i17 = i15;
            }
            sVar2.q();
            b0.j0 j0VarP = b0.e.p(null, sVar2, 1);
            b0.n0 n0Var = new b0.n0();
            n0Var.f3619a = 1800;
            n0Var.a(fValueOf2, 0).f3607b = f30283f;
            n0Var.a(fValueOf, AchievementLevelType.KNOWLEDGE_POINT_LV_7);
            b0.h0 h0VarG = b0.e.g(j0VarP, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, b0.e.o(new b0.o0(n0Var), null, 6), null, sVar2, 4536, 8);
            b0.n0 n0Var2 = new b0.n0();
            n0Var2.f3619a = 1800;
            int i25 = i17;
            n0Var2.a(fValueOf2, 333).f3607b = f30284g;
            n0Var2.a(fValueOf, 1183);
            b0.h0 h0VarG2 = b0.e.g(j0VarP, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, b0.e.o(new b0.o0(n0Var2), null, 6), null, sVar2, 4536, 8);
            b0.n0 n0Var3 = new b0.n0();
            n0Var3.f3619a = 1800;
            n0Var3.a(fValueOf2, 1000).f3607b = f30285h;
            n0Var3.a(fValueOf, 1567);
            b0.h0 h0VarG3 = b0.e.g(j0VarP, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, b0.e.o(new b0.o0(n0Var3), null, 6), null, sVar2, 4536, 8);
            b0.n0 n0Var4 = new b0.n0();
            n0Var4.f3619a = 1800;
            n0Var4.a(fValueOf2, 1267).f3607b = f30286i;
            n0Var4.a(fValueOf, 1800);
            b0.h0 h0VarG4 = b0.e.g(j0VarP, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, b0.e.o(new b0.o0(n0Var4), null, 6), null, sVar2, 4536, 8);
            sVar = sVar2;
            z1.r rVarP = j0.e2.p(g3.r.b(rVar.i(f30279b), true, new d0.y1(0)), f30280c, f30281d);
            boolean zF = sVar.f(h0VarG) | ((i24 & 7168) == 2048) | ((((i24 & 896) ^ 384) > 256 && sVar.e(j12)) || (i24 & 384) == 256) | sVar.f(h0VarG2) | ((((i24 & 112) ^ 48) > 32 && sVar.e(j11)) || (i24 & 48) == 32) | sVar.f(h0VarG3) | sVar.f(h0VarG4);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                f12 = f11;
                i18 = i25;
                i19 = 0;
                f7Var = new f7(i18, f12, h0VarG, j12, h0VarG2, j11, h0VarG3, h0VarG4);
                sVar.o0(f7Var);
            } else {
                f12 = f11;
                f7Var = objQ;
                i18 = i25;
                i19 = 0;
            }
            d0.n.b(i19, (fz.c) f7Var, sVar, rVarP);
            i21 = i18;
            f13 = f12;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a7(rVar, j11, j12, i21, f13, i12, i13);
        }
    }

    public static final void e(i2.d dVar, float f5, float f11, long j11, float f12, int i11) {
        float fD = f2.e.d(dVar.d());
        float fB = f2.e.b(dVar.d());
        float f13 = 2;
        float f14 = fB / f13;
        boolean z11 = dVar.getLayoutDirection() == v3.m.Ltr;
        float f15 = (z11 ? f5 : 1.0f - f11) * fD;
        float f16 = (z11 ? f11 : 1.0f - f5) * fD;
        if (i11 == 0 || fB > fD) {
            dVar.f0(j11, com.bumptech.glide.d.c(f15, f14), com.bumptech.glide.d.c(f16, f14), (480 & 8) != 0 ? 0.0f : f12, (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : null, 3);
            return;
        }
        float f17 = f12 / f13;
        lz.d dVar2 = new lz.d(f17, fD - f17);
        float fFloatValue = ((Number) hz.b.o(Float.valueOf(f15), dVar2)).floatValue();
        float fFloatValue2 = ((Number) hz.b.o(Float.valueOf(f16), dVar2)).floatValue();
        if (Math.abs(f11 - f5) > CropImageView.DEFAULT_ASPECT_RATIO) {
            dVar.f0(j11, com.bumptech.glide.d.c(fFloatValue, f14), com.bumptech.glide.d.c(fFloatValue2, f14), (480 & 8) != 0 ? 0.0f : f12, (480 & 16) != 0 ? 0 : i11, (480 & 32) != 0 ? null : null, 3);
        }
    }

    public static final void f(i2.d dVar, float f5, float f11, long j11, i2.h hVar) {
        float f12 = 2;
        float f13 = hVar.f34127a / f12;
        float fD = f2.e.d(dVar.d()) - (f12 * f13);
        dVar.D0(j11, f5, f11, com.bumptech.glide.d.c(f13, f13), com.bumptech.glide.g.b(fD, fD), (832 & 64) != 0 ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO, hVar);
    }
}
