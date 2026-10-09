package b0;

import com.alibaba.sdk.android.oss.common.OSSConstants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final au.a f3545a = new au.a(27);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f3546b = com.bumptech.glide.d.u(qy.j.NONE, new androidx.lifecycle.j(7));

    public static final void a(c2 c2Var, y1 y1Var, Object obj, Object obj2, c0 c0Var, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(867041821);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(c2Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(y1Var) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar.f(obj) : sVar.h(obj) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= (i11 & 4096) == 0 ? sVar.f(obj2) : sVar.h(obj2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= (32768 & i11) == 0 ? sVar.f(c0Var) : sVar.h(c0Var) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (!sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            sVar.W();
        } else if (c2Var.g()) {
            y1Var.h(obj, obj2, c0Var);
        } else {
            y1Var.j(obj2, c0Var);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e2(c2Var, y1Var, obj, obj2, c0Var, i11, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [fz.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r5v7, types: [fz.c, kotlin.jvm.internal.n] */
    public static final v1 b(c2 c2Var, j2 j2Var, String str, l1.n nVar, int i11, int i12) {
        u1 u1Var;
        if ((i12 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = ((l1.s) nVar).f(c2Var);
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (zF || objQ == gVar) {
            objQ = new v1(c2Var, j2Var, str);
            sVar.o0(objQ);
        }
        v1 v1Var = (v1) objQ;
        boolean zF2 = sVar.f(c2Var) | sVar.h(v1Var);
        Object objQ2 = sVar.Q();
        if (zF2 || objQ2 == gVar) {
            objQ2 = new au.d1(9, c2Var, v1Var);
            sVar.o0(objQ2);
        }
        l1.t.c(v1Var, (fz.c) objQ2, sVar);
        if (c2Var.g() && (u1Var = (u1) v1Var.f3713b.getValue()) != null) {
            c2 c2Var2 = v1Var.f3714c;
            u1Var.f3700a.h(u1Var.f3702c.invoke(c2Var2.f().a()), u1Var.f3702c.invoke(c2Var2.f().c()), (c0) u1Var.f3701b.invoke(c2Var2.f()));
        }
        return v1Var;
    }

    public static final y1 c(c2 c2Var, Object obj, Object obj2, c0 c0Var, j2 j2Var, l1.n nVar, int i11) {
        boolean zF = ((l1.s) nVar).f(c2Var);
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (zF || objQ == gVar) {
            x1.f fVarN = re.q.n();
            fz.c cVarE = fVarN != null ? fVarN.e() : null;
            x1.f fVarR = re.q.r(fVarN);
            try {
                s sVar2 = (s) j2Var.f3575a.invoke(obj2);
                sVar2.d();
                y1 y1Var = new y1(c2Var, obj, sVar2, j2Var);
                re.q.t(fVarN, fVarR, cVarE);
                sVar.o0(y1Var);
                objQ = y1Var;
            } catch (Throwable th2) {
                re.q.t(fVarN, fVarR, cVarE);
                throw th2;
            }
        }
        y1 y1Var2 = (y1) objQ;
        a(c2Var, y1Var2, obj, obj2, c0Var, sVar, 0);
        boolean zF2 = sVar.f(c2Var) | sVar.f(y1Var2);
        Object objQ2 = sVar.Q();
        if (zF2 || objQ2 == gVar) {
            objQ2 = new au.d1(10, c2Var, y1Var2);
            sVar.o0(objQ2);
        }
        l1.t.c(y1Var2, (fz.c) objQ2, sVar);
        return y1Var2;
    }

    public static final c2 d(h2 h2Var, String str, l1.n nVar, int i11) {
        int i12 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i12 > 4 && ((l1.s) nVar).f(h2Var)) || (i11 & 6) == 4;
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        Object obj = l1.m.f39353a;
        vy.d dVar = null;
        if (z12 || objQ == obj) {
            x1.f fVarN = re.q.n();
            fz.c cVarE = fVarN != null ? fVarN.e() : null;
            x1.f fVarR = re.q.r(fVarN);
            try {
                Object c2Var = new c2(h2Var, null, str);
                re.q.t(fVarN, fVarR, cVarE);
                sVar.o0(c2Var);
                objQ = c2Var;
            } catch (Throwable th2) {
                re.q.t(fVarN, fVarR, cVarE);
                throw th2;
            }
        }
        c2 c2Var2 = (c2) objQ;
        if (h2Var instanceof f1) {
            sVar.d0(-1357588631);
            f1 f1Var = (f1) h2Var;
            Object value = f1Var.f3528d.getValue();
            Object value2 = f1Var.f3527c.getValue();
            if ((i12 <= 4 || !sVar.f(h2Var)) && (i11 & 6) != 4) {
                z11 = false;
            }
            Object objQ2 = sVar.Q();
            if (z11 || objQ2 == obj) {
                objQ2 = new a0.e0(h2Var, dVar, 2);
                sVar.o0(objQ2);
            }
            l1.t.g(value, value2, (fz.e) objQ2, sVar);
            sVar.p(false);
        } else {
            sVar.d0(-1357127072);
            c2Var2.a(h2Var.a0(), sVar, 0);
            sVar.p(false);
        }
        boolean zF = sVar.f(c2Var2);
        Object objQ3 = sVar.Q();
        if (zF || objQ3 == obj) {
            objQ3 = new d2(c2Var2, 1);
            sVar.o0(objQ3);
        }
        l1.t.c(c2Var2, (fz.c) objQ3, sVar);
        return c2Var2;
    }

    public static final c2 e(Object obj, String str, l1.n nVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            objQ = new c2(new p0(obj), null, str);
            sVar.o0(objQ);
        }
        c2 c2Var = (c2) objQ;
        c2Var.a(obj, sVar, (i11 & 8) | 48 | (i11 & 14));
        Object objQ2 = sVar.Q();
        if (objQ2 == gVar) {
            objQ2 = new d2(c2Var, 0);
            sVar.o0(objQ2);
        }
        l1.t.c(c2Var, (fz.c) objQ2, sVar);
        return c2Var;
    }
}
