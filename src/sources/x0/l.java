package x0;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yalantis.ucrop.view.CropImageView;
import j0.e2;
import l1.d0;
import l1.t;
import l1.x1;
import pr.y;
import qy.b0;
import s0.u;
import z3.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f55607a = new z(false, 14);

    public static final void a(v0.g gVar, v0.c cVar, l1.n nVar, int i11) {
        Context context;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1904307118);
        int i12 = (sVar.f(gVar) ? 4 : 2) | i11 | (sVar.h(cVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                sVar.d0(-1009462744);
                context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
                sVar.p(false);
            } else {
                sVar.d0(-1009413640);
                sVar.p(false);
                context = null;
            }
            boolean zH = sVar.h(cVar) | ((i12 & 14) == 4) | sVar.h(context);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new j(cVar, context, gVar, 0);
                sVar.o0(objQ);
            }
            e0.g.b(null, null, (fz.c) objQ, sVar, 0, 3);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(gVar, i11, 17, cVar);
        }
    }

    public static final void b(final int i11, final long j11, l1.n nVar, final int i12) {
        final int i13;
        int i14;
        x1 x1VarT;
        fz.e eVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1240244237);
        if ((i12 & 6) == 0) {
            i13 = i11;
            i14 = i12 | (sVar.d(i13) ? 4 : 2);
        } else {
            i13 = i11;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar.e(j11) ? 32 : 16;
        }
        if (sVar.T(i14 & 1, (i14 & 19) != 18)) {
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            boolean zF = ((i14 & 14) == 4) | sVar.f(context);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = Integer.valueOf(context.obtainStyledAttributes(new int[]{i13}).getResourceId(0, -1));
                sVar.o0(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            if (iIntValue == -1) {
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i15 = 0;
                eVar = new fz.e() { // from class: x0.k
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i16 = i15;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).intValue();
                        switch (i16) {
                            case 0:
                                l.b(i13, j11, nVar2, t.M(i12 | 1));
                                break;
                            default:
                                l.b(i13, j11, nVar2, t.M(i12 | 1));
                                break;
                        }
                        return b0.f48488a;
                    }
                };
            } else {
                k2.b bVarY = se.k.y(iIntValue, sVar, 0);
                boolean z11 = (i14 & 112) == 32;
                Object objQ2 = sVar.Q();
                if (z11 || objQ2 == gVar) {
                    objQ2 = j11 == 16 ? null : new g2.p(j11, 5);
                    sVar.o0(objQ2);
                }
                j0.o.a(d2.h.g(e2.n(z1.o.f58481a, e0.f.f24655j), bVarY, null, w2.i.f54515b, CropImageView.DEFAULT_ASPECT_RATIO, (g2.p) objQ2, 22), sVar, 0);
            }
            x1VarT.f39502d = eVar;
        }
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i16 = 1;
            eVar = new fz.e() { // from class: x0.k
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = i16;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).intValue();
                    switch (i17) {
                        case 0:
                            l.b(i11, j11, nVar2, t.M(i12 | 1));
                            break;
                        default:
                            l.b(i11, j11, nVar2, t.M(i12 | 1));
                            break;
                    }
                    return b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

    public static final void c(v0.g gVar, z0.d dVar, fz.a aVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2040393164);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(gVar) : sVar.h(gVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(dVar) : sVar.h(dVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(aVar) ? 256 : 128;
        }
        boolean z11 = false;
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            boolean z12 = (i12 & 112) == 32 || ((i12 & 64) != 0 && sVar.f(dVar));
            Object objQ = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (z12 || objQ == gVar2) {
                objQ = new n(new hd.b(new pv.c(20, dVar, aVar), 9));
                sVar.o0(objQ);
            }
            n nVar2 = (n) objQ;
            if ((i12 & 14) == 4 || ((i12 & 8) != 0 && sVar.h(gVar))) {
                z11 = true;
            }
            Object objQ2 = sVar.Q();
            if (z11 || objQ2 == gVar2) {
                objQ2 = new u(gVar, 27);
                sVar.o0(objQ2);
            }
            z3.k.a(nVar2, (fz.a) objQ2, f55607a, t1.e.d(1315155414, new es.c(8, dVar, gVar), sVar), sVar, 3456, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new qg.d(gVar, dVar, aVar, i11, 5);
        }
    }

    public static final void d(z1.r rVar, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1392105195);
        int i13 = 2;
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            d0 d0Var = z0.f.f58418a;
            t1.d dVar2 = i.f55597a;
            ue.f.e(rVar, d0Var, dVar, sVar, ((i12 << 6) & 7168) | (i12 & 14) | 432);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g(rVar, dVar, i11, i13);
        }
    }
}
