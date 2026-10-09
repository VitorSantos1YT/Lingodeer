package y3;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import e2.c0;
import l1.q1;
import l1.t;
import l1.x1;
import y2.h2;
import y2.i0;
import y2.v;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f57068a = new g();

    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:56:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x015f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0166  */
    /* JADX WARN: Code duplicated, block: B:64:0x016a  */
    /* JADX WARN: Code duplicated, block: B:66:0x01af  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01be  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void a(fz.c cVar, z1.r rVar, fz.c cVar2, fz.c cVar3, l1.n nVar, int i11, int i12) {
        int i13;
        fz.c cVar4;
        boolean z11;
        fz.c cVar5;
        x1 x1VarT;
        fz.c cVar6;
        int iHashCode;
        z1.r rVarC;
        v3.c cVar7;
        v3.m mVar;
        q1 q1VarL;
        LifecycleOwner lifecycleOwner;
        da.g gVar;
        int iHashCode2;
        Context context;
        l1.q qVarG;
        w1.e eVar;
        View view;
        boolean zH;
        Object objQ;
        fz.a aVar;
        b bVar = b.f57055e;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-180024211);
        l1.a aVar2 = sVar.f39434a;
        if ((i11 & 6) == 0) {
            i13 = (sVar.h(cVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.f(rVar) ? 32 : 16;
        }
        int i14 = i13 | 384;
        if ((i11 & 3072) == 0) {
            i14 |= sVar.h(cVar2) ? 2048 : 1024;
        }
        int i15 = i12 & 16;
        if (i15 == 0) {
            if ((i11 & 24576) == 0) {
                cVar4 = cVar3;
                i14 |= sVar.h(cVar4) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            if ((i14 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i14 & 1, z11)) {
                if (i15 != 0) {
                    cVar6 = bVar;
                } else {
                    cVar6 = cVar4;
                }
                iHashCode = Long.hashCode(sVar.T);
                rVarC = z1.a.c(sVar, rVar.i(m.f57083a).i(c0.f24708a).i(r.f57087a).i(p.f57086a));
                cVar7 = (v3.c) sVar.j(g1.f58547h);
                mVar = (v3.m) sVar.j(g1.f58552n);
                q1VarL = sVar.l();
                lifecycleOwner = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                gVar = (da.g) sVar.j(ea.a.f25454a);
                sVar.d0(1314774735);
                int i16 = i14 & 14;
                iHashCode2 = Long.hashCode(sVar.T);
                context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
                qVarG = t.G(sVar);
                eVar = (w1.e) sVar.j(w1.g.f54465a);
                view = (View) sVar.j(AndroidCompositionLocals_androidKt.f1204f);
                zH = sVar.h(context) | ((((i16 & 14) ^ 6) <= 4 && sVar.f(cVar)) || (i16 & 6) == 4) | sVar.h(qVarG) | sVar.h(eVar) | sVar.d(iHashCode2) | sVar.h(view);
                objQ = sVar.Q();
                if (zH || objQ == l1.m.f39353a) {
                    j jVar = new j(context, cVar, qVarG, eVar, iHashCode2, view);
                    sVar.o0(jVar);
                    objQ = jVar;
                }
                aVar = (fz.a) objQ;
                if (aVar2 instanceof h2) {
                    t.z();
                    throw null;
                }
                sVar.b0();
                if (sVar.S) {
                    sVar.k(aVar);
                } else {
                    sVar.r0();
                }
                y2.k.J.getClass();
                t.J(y2.j.f56916e, q1VarL, sVar);
                t.J(i.f57071d, rVarC, sVar);
                t.J(i.f57072e, cVar7, sVar);
                t.J(i.f57073f, lifecycleOwner, sVar);
                t.J(i.f57074t, gVar, sVar);
                t.J(i.H, mVar, sVar);
                t.y(sVar, Integer.valueOf(iHashCode), y2.j.f56918g);
                t.J(i.f57069b, cVar6, sVar);
                cVar5 = cVar2;
                t.J(i.f57070c, cVar5, sVar);
                sVar.p(true);
                sVar.p(false);
                cVar4 = cVar6;
            } else {
                cVar5 = cVar2;
                sVar.W();
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new h1.j(cVar, rVar, cVar5, cVar4, i11, i12, 1);
            }
        }
        i14 |= 24576;
        cVar4 = cVar3;
        if ((i14 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar.T(i14 & 1, z11)) {
            if (i15 != 0) {
                cVar6 = bVar;
            } else {
                cVar6 = cVar4;
            }
            iHashCode = Long.hashCode(sVar.T);
            rVarC = z1.a.c(sVar, rVar.i(m.f57083a).i(c0.f24708a).i(r.f57087a).i(p.f57086a));
            cVar7 = (v3.c) sVar.j(g1.f58547h);
            mVar = (v3.m) sVar.j(g1.f58552n);
            q1VarL = sVar.l();
            lifecycleOwner = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            gVar = (da.g) sVar.j(ea.a.f25454a);
            sVar.d0(1314774735);
            int i17 = i14 & 14;
            iHashCode2 = Long.hashCode(sVar.T);
            context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            qVarG = t.G(sVar);
            eVar = (w1.e) sVar.j(w1.g.f54465a);
            view = (View) sVar.j(AndroidCompositionLocals_androidKt.f1204f);
            zH = sVar.h(context) | ((((i17 & 14) ^ 6) <= 4 && sVar.f(cVar)) || (i17 & 6) == 4) | sVar.h(qVarG) | sVar.h(eVar) | sVar.d(iHashCode2) | sVar.h(view);
            objQ = sVar.Q();
            if (zH) {
                j jVar2 = new j(context, cVar, qVarG, eVar, iHashCode2, view);
                sVar.o0(jVar2);
                objQ = jVar2;
            } else {
                j jVar3 = new j(context, cVar, qVarG, eVar, iHashCode2, view);
                sVar.o0(jVar3);
                objQ = jVar3;
            }
            aVar = (fz.a) objQ;
            if (aVar2 instanceof h2) {
                t.z();
                throw null;
            }
            sVar.b0();
            if (sVar.S) {
                sVar.k(aVar);
            } else {
                sVar.r0();
            }
            y2.k.J.getClass();
            t.J(y2.j.f56916e, q1VarL, sVar);
            t.J(i.f57071d, rVarC, sVar);
            t.J(i.f57072e, cVar7, sVar);
            t.J(i.f57073f, lifecycleOwner, sVar);
            t.J(i.f57074t, gVar, sVar);
            t.J(i.H, mVar, sVar);
            t.y(sVar, Integer.valueOf(iHashCode), y2.j.f56918g);
            t.J(i.f57069b, cVar6, sVar);
            cVar5 = cVar2;
            t.J(i.f57070c, cVar5, sVar);
            sVar.p(true);
            sVar.p(false);
            cVar4 = cVar6;
        } else {
            cVar5 = cVar2;
            sVar.W();
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h1.j(cVar, rVar, cVar5, cVar4, i11, i12, 1);
        }
    }

    public static final void b(fz.c cVar, z1.r rVar, fz.c cVar2, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        fz.c cVar3;
        b bVar = b.f57055e;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1783766393);
        if ((i11 & 6) == 0) {
            i13 = (sVar.h(cVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.f(rVar) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= sVar.h(cVar2) ? 256 : 128;
        }
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            if (i14 != 0) {
                rVar = z1.o.f58481a;
            }
            z1.r rVar3 = rVar;
            fz.c cVar4 = i15 != 0 ? bVar : cVar2;
            a(cVar, rVar3, bVar, cVar4, sVar, (i13 & 14) | 3072 | (i13 & 112) | (57344 & (i13 << 6)), 4);
            rVar2 = rVar3;
            cVar3 = cVar4;
        } else {
            sVar.W();
            rVar2 = rVar;
            cVar3 = cVar2;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c6.n(cVar, rVar2, cVar3, i11, i12, 1);
        }
    }

    public static final View c(z1.q qVar) {
        ViewFactoryHolder viewFactoryHolder = y2.f.x(qVar.f58482a).R;
        View interopView = viewFactoryHolder != null ? viewFactoryHolder.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void d(ViewFactoryHolder viewFactoryHolder, i0 i0Var) {
        long jP = ((v) i0Var.f56892i0.f50086d).P(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jP >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jP & 4294967295L)));
        viewFactoryHolder.layout(iRound, iRound2, viewFactoryHolder.getMeasuredWidth() + iRound, viewFactoryHolder.getMeasuredHeight() + iRound2);
    }

    public static final ViewFactoryHolder e(i0 i0Var) {
        ViewFactoryHolder viewFactoryHolder = i0Var.R;
        if (viewFactoryHolder != null) {
            return viewFactoryHolder;
        }
        throw defpackage.e.t("Required value was null.");
    }
}
