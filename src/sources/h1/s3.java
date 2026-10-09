package h1;

import android.os.Build;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0.v1 f31051a = j0.c.f(24, 20, CropImageView.DEFAULT_ASPECT_RATIO, 8, 4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f31052b;

    static {
        float f5 = 64;
        float f11 = 12;
        j0.c.f(f5, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 10);
        j0.c.f(f5, CropImageView.DEFAULT_ASPECT_RATIO, f11, f11, 2);
        f31052b = 60;
    }

    public static final void a(t3 t3Var, z1.r rVar, p2 p2Var, fz.e eVar, t1.d dVar, boolean z11, m2 m2Var, l1.n nVar, int i11) {
        p2 p2Var2;
        int i12;
        p2 p2Var3;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(650830774);
        int i13 = i11 | (sVar.f(t3Var) ? 4 : 2) | (sVar.f(rVar) ? 32 : 16) | 128 | (sVar.f(m2Var) ? 1048576 : 524288);
        if ((599187 & i13) == 599186 && sVar.F()) {
            sVar.W();
            p2Var3 = p2Var;
        } else {
            sVar.Y();
            int i14 = i11 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i14 == 0 || sVar.C()) {
                Object objQ = sVar.Q();
                if (objQ == gVar) {
                    lz.g gVar2 = o2.f30776a;
                    objQ = new p2();
                    sVar.o0(objQ);
                }
                p2Var2 = (p2) objQ;
                i12 = i13 & (-897);
            } else {
                sVar.W();
                i12 = i13 & (-897);
                p2Var2 = p2Var;
            }
            int i15 = i12;
            sVar.q();
            Locale localeR = k7.r(sVar);
            boolean zF = sVar.f(localeR);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = Build.VERSION.SDK_INT >= 26 ? new i1.y(localeR) : new i1.j0(localeR);
                sVar.o0(objQ2);
            }
            i1.x xVar = (i1.x) objQ2;
            sVar.d0(-1454747621);
            t1.d dVarD = z11 ? t1.e.d(-1490010652, new g3(t3Var, 0), sVar) : null;
            sVar.p(false);
            p2 p2Var4 = p2Var2;
            y2.a(rVar, eVar, dVar, dVarD, m2Var, fc.a(k1.d.f37481s, sVar), k1.d.f37480r - f31052b, t1.e.d(-57534331, new a0.t0(t3Var, xVar, p2Var4, m2Var, 2), sVar), sVar, ((i15 >> 3) & 14) | 14156208 | ((i15 >> 6) & 57344));
            p2Var3 = p2Var4;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h3(t3Var, rVar, p2Var3, eVar, dVar, z11, m2Var, i11);
        }
    }

    public static final void b(l0.w wVar, Long l9, Long l11, fz.e eVar, fz.c cVar, i1.x xVar, lz.g gVar, p2 p2Var, t7 t7Var, m2 m2Var, l1.n nVar, int i11) {
        int i12;
        Long l12;
        Long l13;
        fz.e eVar2;
        t7 t7Var2;
        Object fVar;
        l0.w wVar2 = wVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1257365001);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(wVar2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            l12 = l9;
            i12 |= sVar.f(l12) ? 32 : 16;
        } else {
            l12 = l9;
        }
        if ((i11 & 384) == 0) {
            l13 = l11;
            i12 |= sVar.f(l13) ? 256 : 128;
        } else {
            l13 = l11;
        }
        if ((i11 & 3072) == 0) {
            eVar2 = eVar;
            i12 |= sVar.h(eVar2) ? 2048 : 1024;
        } else {
            eVar2 = eVar;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(cVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(xVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(gVar) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= (16777216 & i11) == 0 ? sVar.f(p2Var) : sVar.h(p2Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            t7Var2 = t7Var;
            i12 |= sVar.f(t7Var2) ? 67108864 : 33554432;
        } else {
            t7Var2 = t7Var;
        }
        if ((805306368 & i11) == 0) {
            i12 |= sVar.f(m2Var) ? 536870912 : 268435456;
        }
        int i13 = i12;
        if ((i13 & 306783379) == 306783378 && sVar.F()) {
            sVar.W();
        } else {
            i1.w wVarH = xVar.h();
            boolean zF = sVar.f(gVar);
            Object objQ = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (zF || objQ == gVar2) {
                objQ = xVar.e(gVar.f40532a, 1);
                sVar.o0(objQ);
            }
            ua.a(fc.a(k1.d.f37467d, sVar), t1.e.d(1090773432, new n3(l12, l13, eVar2, wVar2, gVar, xVar, (i1.z) objQ, p2Var, m2Var, wVarH, t7Var2), sVar), sVar, 48);
            boolean zH = ((i13 & 14) == 4) | ((i13 & 57344) == 16384) | sVar.h(xVar) | sVar.h(gVar);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar2) {
                wVar2 = wVar;
                fVar = new b0.f(wVar2, cVar, xVar, gVar, (vy.d) null, 27);
                sVar.o0(fVar);
            } else {
                fVar = objQ2;
                wVar2 = wVar;
            }
            l1.t.f((fz.e) fVar, wVar2, sVar);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new o3(wVar2, l9, l11, eVar, cVar, xVar, gVar, p2Var, t7Var, m2Var, i11);
        }
    }

    public static final void c(Long l9, Long l11, long j11, fz.e eVar, fz.c cVar, i1.x xVar, lz.g gVar, p2 p2Var, t7 t7Var, m2 m2Var, l1.n nVar, int i11) {
        int i12;
        fz.e eVar2;
        fz.c cVar2;
        t7 t7Var2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-787063721);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(l9) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(l11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.e(j11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            eVar2 = eVar;
            i12 |= sVar.h(eVar2) ? 2048 : 1024;
        } else {
            eVar2 = eVar;
        }
        if ((i11 & 24576) == 0) {
            cVar2 = cVar;
            i12 |= sVar.h(cVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        } else {
            cVar2 = cVar;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(xVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(gVar) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= (16777216 & i11) == 0 ? sVar.f(p2Var) : sVar.h(p2Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            t7Var2 = t7Var;
            i12 |= sVar.f(t7Var2) ? 67108864 : 33554432;
        } else {
            t7Var2 = t7Var;
        }
        if ((805306368 & i11) == 0) {
            i12 |= sVar.f(m2Var) ? 536870912 : 268435456;
        }
        if ((306783379 & i12) == 306783378 && sVar.F()) {
            sVar.W();
        } else {
            i1.z zVarF = xVar.f(j11);
            int i13 = (((zVarF.f34106a - gVar.f40532a) * 12) + zVarF.f34107b) - 1;
            if (i13 < 0) {
                i13 = 0;
            }
            l0.w wVarA = l0.y.a(i13, sVar, 2);
            Integer numValueOf = Integer.valueOf(i13);
            boolean zF = sVar.f(wVarA) | sVar.d(i13);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new et.b0(wVarA, i13, (vy.d) null, 4);
                sVar.o0(objQ);
            }
            l1.t.f((fz.e) objQ, numValueOf, sVar);
            z1.r rVarC = j0.c.C(z1.o.f58481a, y2.f31338b, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarC);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            y2.f(m2Var, xVar, sVar, ((i12 >> 27) & 14) | ((i12 >> 12) & 112));
            b(wVarA, l9, l11, eVar2, cVar2, xVar, gVar, p2Var, t7Var2, m2Var, sVar, ((i12 << 3) & 1008) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192));
            sVar.p(true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i3(l9, l11, j11, eVar, cVar, xVar, gVar, p2Var, t7Var, m2Var, i11);
        }
    }

    public static final void d(Long l9, Long l11, long j11, int i11, fz.e eVar, fz.c cVar, i1.x xVar, lz.g gVar, p2 p2Var, t7 t7Var, m2 m2Var, l1.n nVar, int i12, int i13) {
        int i14;
        fz.c cVar2;
        i1.x xVar2;
        lz.g gVar2;
        t7 t7Var2;
        int i15;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-532789335);
        if ((i12 & 6) == 0) {
            i14 = (sVar2.f(l9) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar2.f(l11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= sVar2.e(j11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= sVar2.d(i11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= sVar2.h(eVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i12) == 0) {
            cVar2 = cVar;
            i14 |= sVar2.h(cVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        } else {
            cVar2 = cVar;
        }
        if ((1572864 & i12) == 0) {
            xVar2 = xVar;
            i14 |= sVar2.h(xVar2) ? 1048576 : 524288;
        } else {
            xVar2 = xVar;
        }
        if ((12582912 & i12) == 0) {
            gVar2 = gVar;
            i14 |= sVar2.h(gVar2) ? 8388608 : 4194304;
        } else {
            gVar2 = gVar;
        }
        if ((100663296 & i12) == 0) {
            i14 |= (134217728 & i12) == 0 ? sVar2.f(p2Var) : sVar2.h(p2Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i12) == 0) {
            t7Var2 = t7Var;
            i14 |= sVar2.f(t7Var2) ? 536870912 : 268435456;
        } else {
            t7Var2 = t7Var;
        }
        if ((i13 & 6) == 0) {
            i15 = i13 | (sVar2.f(m2Var) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i14 & 306783379) == 306783378 && (i15 & 3) == 2 && sVar2.F()) {
            sVar2.W();
            sVar = sVar2;
        } else {
            b0.i1 i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);
            sVar = sVar2;
            a0.j0.g(new x3(i11), g3.r.b(z1.o.f58481a, false, o0.H), i1VarQ, null, t1.e.d(-1026642619, new j3(l9, l11, j11, eVar, cVar2, xVar2, gVar2, p2Var, t7Var2, m2Var), sVar2), sVar, ((i14 >> 9) & 14) | 24960, 8);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k3(l9, l11, j11, i11, eVar, cVar, xVar, gVar, p2Var, t7Var, m2Var, i12, i13);
        }
    }
}
