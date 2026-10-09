package wb;

import android.content.Context;
import android.os.Trace;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.e2;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import h1.x5;
import l1.q1;
import l1.v1;
import l1.x1;
import qy.b0;
import z2.t1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f54916a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f54917b = new r();

    /* JADX WARN: Code duplicated, block: B:121:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:122:0x0202  */
    public static final void a(final l lVar, final String str, final z1.r rVar, final fz.c cVar, final fz.c cVar2, final z1.e eVar, final w2.j jVar, l1.n nVar, final int i11, final int i12) {
        int i13;
        fz.c cVar3;
        int i14;
        int i15;
        hc.h hVar;
        gc.i iVar;
        hc.h hVar2;
        z1.r rVarI;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-421592773);
        if ((i11 & 14) == 0) {
            i13 = (sVar.f(lVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            i13 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i13 |= sVar.f(rVar) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            cVar3 = cVar;
            i13 |= sVar.h(cVar3) ? 2048 : 1024;
        } else {
            cVar3 = cVar;
        }
        if ((i11 & 57344) == 0) {
            i13 |= sVar.h(cVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((i11 & 458752) == 0) {
            i13 |= sVar.f(eVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i11 & 3670016) == 0) {
            i13 |= sVar.f(jVar) ? 1048576 : 524288;
        }
        if ((i11 & 29360128) == 0) {
            i13 |= sVar.c(1.0f) ? 8388608 : 4194304;
        }
        if ((234881024 & i11) == 0) {
            i13 |= sVar.f(null) ? 67108864 : 33554432;
        }
        if ((1879048192 & i11) == 0) {
            i13 |= sVar.d(1) ? 536870912 : 268435456;
        }
        if ((i12 & 14) == 0) {
            i14 = i12 | (sVar.g(true) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((1533916891 & i13) == 306783378 && (i14 & 11) == 2 && sVar.F()) {
            sVar.W();
        } else {
            Object obj = lVar.f54918a;
            hc.e eVar2 = t.f54932b;
            sVar.e0(1677680258);
            boolean z11 = obj instanceof gc.i;
            if (z11) {
                iVar = (gc.i) obj;
                i15 = 458752;
                if (iVar.f29041y.f28993a != null) {
                    sVar.p(false);
                }
                gc.i iVar2 = iVar;
                int i16 = i13 >> 3;
                int i17 = i13 >> 6;
                int i18 = i17 & 57344;
                i iVarF = f(iVar2, lVar.f54920c, cVar3, cVar2, jVar, lVar.f54919b, sVar, ((i13 >> 12) & i15) | (i16 & 7168) | (i16 & 896) | 72 | i18, 0);
                hVar2 = iVar2.f29038v;
                if (hVar2 instanceof n) {
                    rVarI = rVar.i((z1.r) hVar2);
                } else {
                    rVarI = rVar;
                }
                sVar = sVar;
                d(rVarI, iVarF, str, eVar, jVar, sVar, ((i13 << 3) & 896) | (i17 & 7168) | i18 | (i17 & i15) | (i17 & 3670016) | ((i14 << 21) & 29360128));
            } else {
                i15 = 458752;
            }
            sVar.e0(408306591);
            boolean zA = kotlin.jvm.internal.m.a(jVar, w2.i.f54519f);
            l1.g gVar = l1.m.f39353a;
            if (zA) {
                hVar = t.f54932b;
            } else {
                sVar.e0(408309406);
                Object objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = new n();
                    sVar.o0(objQ);
                }
                hVar = (n) objQ;
                sVar.p(false);
            }
            sVar.p(false);
            if (z11) {
                sVar.e0(-227230258);
                gc.i iVar3 = (gc.i) obj;
                sVar.e0(408312509);
                boolean zF = sVar.f(iVar3) | sVar.f(hVar);
                Object objQ2 = sVar.Q();
                if (zF || objQ2 == gVar) {
                    gc.h hVarA = gc.i.a(iVar3);
                    hVarA.m = hVar;
                    hVarA.f29015o = null;
                    hVarA.f29016p = null;
                    hVarA.f29017q = null;
                    objQ2 = hVarA.a();
                    sVar.o0(objQ2);
                }
                iVar = (gc.i) objQ2;
            } else {
                sVar.e0(-227066702);
                Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
                sVar.e0(408319118);
                boolean zF2 = sVar.f(context) | sVar.f(obj) | sVar.f(hVar);
                Object objQ3 = sVar.Q();
                if (zF2 || objQ3 == gVar) {
                    gc.h hVar3 = new gc.h(context);
                    hVar3.f29004c = obj;
                    hVar3.m = hVar;
                    hVar3.f29015o = null;
                    hVar3.f29016p = null;
                    hVar3.f29017q = null;
                    objQ3 = hVar3.a();
                    sVar.o0(objQ3);
                }
                iVar = (gc.i) objQ3;
            }
            com.google.android.material.datepicker.d.B(sVar, false, false, false);
            gc.i iVar4 = iVar;
            int i19 = i13 >> 3;
            int i110 = i13 >> 6;
            int i111 = i110 & 57344;
            i iVarF2 = f(iVar4, lVar.f54920c, cVar3, cVar2, jVar, lVar.f54919b, sVar, ((i13 >> 12) & i15) | (i19 & 7168) | (i19 & 896) | 72 | i111, 0);
            hVar2 = iVar4.f29038v;
            if (hVar2 instanceof n) {
                rVarI = rVar.i((z1.r) hVar2);
            } else {
                rVarI = rVar;
            }
            sVar = sVar;
            d(rVarI, iVarF2, str, eVar, jVar, sVar, ((i13 << 3) & 896) | (i110 & 7168) | i111 | (i110 & i15) | (i110 & 3670016) | ((i14 << 21) & 29360128));
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: wb.a
                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    k.a(lVar, str, rVar, cVar, cVar2, eVar, jVar, (l1.n) obj2, l1.t.M(i11 | 1), l1.t.M(i12));
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void b(Object obj, String str, z1.r rVar, k2.b bVar, fz.c cVar, w2.j jVar, l1.n nVar, int i11, int i12) {
        l1.s sVar = (l1.s) nVar;
        sVar.e0(1693837359);
        if ((i12 & 8) != 0) {
            bVar = null;
        }
        if ((i12 & 128) != 0) {
            cVar = null;
        }
        z1.j jVar2 = z1.c.f58467e;
        vb.f fVarE = e(s.f54930a, sVar);
        int i13 = i11 << 3;
        int i14 = (i11 & 112) | 2392584 | (i13 & 7168) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192);
        int i15 = ((i11 >> 27) & 14) | 48;
        sVar.e0(-1481548872);
        l lVar = new l(obj, f54917b, fVarE);
        hc.e eVar = t.f54932b;
        a(lVar, str, rVar, bVar == null ? i.W : new s0.a(bVar, 23), cVar != null ? new uu.b(cVar, 6) : null, jVar2, jVar, sVar, (i14 & 112) | ((i14 >> 3) & 896) | ((i15 << 15) & 458752) | 1572864, 0);
        sVar.p(false);
        sVar.p(false);
    }

    public static final void c(Object obj, z1.r rVar, w2.j jVar, l1.n nVar, int i11, int i12) {
        l1.s sVar = (l1.s) nVar;
        sVar.e0(1451072229);
        z1.j jVar2 = z1.c.f58467e;
        if ((i12 & 64) != 0) {
            jVar = w2.i.f54515b;
        }
        w2.j jVar3 = jVar;
        vb.f fVarE = e(s.f54930a, sVar);
        int i13 = i11 << 3;
        sVar.e0(2032051394);
        l lVar = new l(obj, f54917b, fVarE);
        int i14 = ((i13 & 29360128) | ((i13 & 7168) | 568)) >> 3;
        a(lVar, null, rVar, i.W, null, jVar2, jVar3, sVar, (i14 & 896) | 48 | (i14 & 3670016), 0);
        sVar.p(false);
        sVar.p(false);
    }

    public static final void d(z1.r rVar, i iVar, String str, z1.e eVar, w2.j jVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(777774312);
        int i13 = 4;
        if ((i11 & 14) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= sVar.f(iVar) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= sVar.f(str) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= sVar.f(eVar) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= sVar.f(jVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((458752 & i11) == 0) {
            i12 |= sVar.c(1.0f) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= sVar.f(null) ? 1048576 : 524288;
        }
        if ((29360128 & i11) == 0) {
            i12 |= sVar.g(true) ? 8388608 : 4194304;
        }
        if ((i12 & 23967451) == 4793490 && sVar.F()) {
            sVar.W();
        } else {
            hc.e eVar2 = t.f54932b;
            z1.r rVarI = d2.h.c(str != null ? g3.r.b(rVar, false, new gh.g(str, i13)) : rVar).i(new o(iVar, eVar, jVar));
            sVar.e0(544976794);
            int iHashCode = Long.hashCode(sVar.T);
            z1.r rVarC = z1.a.c(sVar, rVarI);
            q1 q1VarL = sVar.l();
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.e0(1405779621);
            sVar.h0();
            if (sVar.S) {
                sVar.k(new x5(5, iVar2));
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, b.f54904a, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            com.google.android.material.datepicker.d.B(sVar, true, false, false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e2(rVar, iVar, str, eVar, jVar, i11, 13);
        }
    }

    public static final vb.f e(v1 v1Var, l1.n nVar) {
        l1.s sVar = (l1.s) nVar;
        vb.f fVar = (vb.f) sVar.j(v1Var);
        if (fVar != null) {
            return fVar;
        }
        Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
        vb.i iVar = vb.a.f53808b;
        if (iVar != null) {
            return iVar;
        }
        synchronized (vb.a.f53807a) {
            vb.i iVar2 = vb.a.f53808b;
            if (iVar2 != null) {
                return iVar2;
            }
            context.getApplicationContext();
            vb.i iVarN = se.p.N(context);
            vb.a.f53808b = iVarN;
            return iVarN;
        }
    }

    public static final i f(gc.i iVar, vb.f fVar, fz.c cVar, fz.c cVar2, w2.j jVar, r rVar, l1.n nVar, int i11, int i12) {
        l1.s sVar = (l1.s) nVar;
        sVar.e0(1645646697);
        if ((i12 & 64) != 0) {
            rVar = f54917b;
        }
        i iVarG = g(new l(iVar, rVar, fVar), cVar, cVar2, jVar, sVar);
        sVar.p(false);
        return iVarG;
    }

    public static final i g(l lVar, fz.c cVar, fz.c cVar2, w2.j jVar, l1.n nVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.e0(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            Object obj = lVar.f54918a;
            vb.f fVar = lVar.f54920c;
            gc.i iVarA = t.a(obj, sVar);
            i(iVarA);
            sVar.e0(1094691773);
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new i(iVarA, fVar);
                sVar.o0(objQ);
            }
            i iVar = (i) objQ;
            sVar.p(false);
            iVar.O = cVar;
            iVar.P = cVar2;
            iVar.Q = jVar;
            iVar.R = 1;
            iVar.S = ((Boolean) sVar.j(t1.f58672a)).booleanValue();
            iVar.V.setValue(fVar);
            iVar.U.setValue(iVarA);
            iVar.f();
            sVar.p(false);
            return iVar;
        } finally {
            Trace.endSection();
        }
    }

    public static void h(String str) {
        throw new IllegalArgumentException(defpackage.e.n("Unsupported type: ", str, ". ", ep.a.g("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void i(gc.i iVar) {
        Object obj = iVar.f29019b;
        if (obj instanceof gc.h) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof g2.h) {
            h("ImageBitmap");
            throw null;
        }
        if (obj instanceof l2.e) {
            h("ImageVector");
            throw null;
        }
        if (obj instanceof k2.b) {
            h("Painter");
            throw null;
        }
        if (iVar.f29020c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
