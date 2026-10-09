package tg;

import bt.j5;
import bt.l3;
import bt.v1;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import dt.u3;
import j0.e2;
import java.util.List;
import l1.x1;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rz.w f52384a = new rz.w(4);

    public static final void a(z1.r rVar, j0 j0Var, fz.f children, l1.n nVar, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.m.f(children, "children");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1819794447);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.f(j0Var) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar.h(children) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            if (i14 != 0) {
                rVar = z1.o.f58481a;
            }
            if (i15 != 0) {
                j0Var = null;
            }
            u.c(t1.e.d(234074522, new a(j0Var, rVar, children), sVar), sVar, 6);
        }
        z1.r rVar2 = rVar;
        j0 j0Var2 = j0Var;
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.d(rVar2, j0Var2, children, i11, i12, 9);
        }
    }

    public static final void b(i0 i0Var, boolean z11, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(407108909);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(i0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            z1.o oVar = z1.o.f58481a;
            if (z11) {
                sVar.d0(-1583170062);
                dVar.f(i0Var, oVar, sVar, Integer.valueOf((i12 & 896) | (i12 & 14) | 48));
                sVar.p(false);
            } else {
                sVar.d0(-1583274904);
                dVar.f(i0Var, d0.n.v(oVar, d0.n.u(sVar), true, false), sVar, Integer.valueOf(i12 & 910));
                sVar.p(false);
            }
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l3(i0Var, z11, dVar, i11, 5);
        }
    }

    public static final void c(i0 i0Var, int i11, t1.d dVar, l1.n nVar, int i12) {
        int i13;
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2012414922);
        if ((i12 & 6) == 0) {
            i13 = (sVar.f(i0Var) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.d(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.h(dVar) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException("Level must be at least 0");
            }
            sVar.d0(-1881134634);
            j3.y0 y0VarD = h0.d(i0Var, sVar);
            sVar.d0(-1881133554);
            long jB = y0VarD.b();
            if (jB == 16) {
                jB = h0.c(i0Var, sVar);
            }
            sVar.p(false);
            j3.y0 y0VarA = j3.y0.a(y0VarD, jB, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
            sVar.p(false);
            j3.y0 y0VarJ = j3.t.j(y0VarA, (v3.m) sVar.j(g1.f58552n));
            fz.e eVar = k0.c(k0.b(i0Var, sVar)).f52300b;
            kotlin.jvm.internal.m.c(eVar);
            n0.a(i0Var, sVar).f(y0VarJ.d((j3.y0) eVar.invoke(Integer.valueOf(i11), y0VarJ)), t1.e.d(-969692624, new g(dVar, i0Var, 1), sVar), sVar, 48);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gs.o(i0Var, i11, dVar, i12, 5);
        }
    }

    public static final void d(i0 i0Var, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1642175075);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(i0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && sVar.F()) {
            sVar.W();
        } else {
            long jC = g2.x.c(h0.c(i0Var, sVar), 0.2f);
            sVar.d0(-208584325);
            v3.c cVar = (v3.c) sVar.j(g1.f58547h);
            v3.o oVar = k0.c(k0.b(i0Var, sVar)).f52299a;
            kotlin.jvm.internal.m.c(oVar);
            float fW = cVar.w(oVar.f53502a);
            sVar.p(false);
            j0.o.a(d0.n.h(e2.g(e2.e(j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, fW, CropImageView.DEFAULT_ASPECT_RATIO, fW, 5), 1.0f), 1), jC, g2.f0.f28556b), sVar, 0);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j5(i0Var, i11, 4);
        }
    }

    public static final void e(fz.e eVar, fz.g gVar, fz.e eVar2, fz.g gVar2, t1.d dVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2090131479);
        if ((((sVar.h(eVar) ? 4 : 2) | i11 | (sVar.h(eVar2) ? 256 : 128)) & 9363) == 9362 && sVar.F()) {
            sVar.W();
        } else {
            l1.t.a(n0.f52325a.a(new m0(eVar == null ? m0.f52319e.f52320a : eVar, gVar == null ? m0.f52319e.f52321b : gVar, eVar2 == null ? m0.f52319e.f52322c : eVar2, gVar2 == null ? m0.f52319e.f52323d : gVar2)), t1.e.d(-1030900567, new j0.l0(dVar, 3), sVar), sVar, 56);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v1(eVar, gVar, eVar2, gVar2, dVar, i11);
        }
    }

    public static final void f(int i11, List rows, fz.c drawDecorations, float f5, z1.r modifier, l1.n nVar, int i12) {
        int i13;
        kotlin.jvm.internal.m.f(rows, "rows");
        kotlin.jvm.internal.m.f(drawDecorations, "drawDecorations");
        kotlin.jvm.internal.m.f(modifier, "modifier");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1130591255);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.h(rows) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.h(drawDecorations) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.c(f5) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.f(modifier) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((i13 & 9363) == 9362 && sVar.F()) {
            sVar.W();
        } else {
            sVar.d0(802039891);
            boolean zH = ((i13 & 14) == 4) | sVar.h(rows) | ((i13 & 7168) == 2048) | ((i13 & 896) == 256);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new p0(i11, rows, f5, drawDecorations);
                sVar.o0(objQ);
            }
            sVar.p(false);
            w2.a0.b(modifier, (fz.e) objQ, sVar, (i13 >> 12) & 14, 0);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u3(i11, rows, drawDecorations, f5, modifier, i12);
        }
    }
}
