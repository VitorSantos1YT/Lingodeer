package sm;

import android.os.Bundle;
import at.p;
import com.bumptech.glide.d;
import com.lingodeer.data.model.CoursePracticeType;
import fz.e;
import l1.b1;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;
import qy.q;
import rt.h;
import s0.u;
import xg.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f51726e = d.v(new u(this, 3));

    @Override // xg.i
    public final void q(final Bundle bundle, n nVar, final int i11) {
        x1 x1VarT;
        e eVar;
        s sVar = (s) nVar;
        sVar.f0(1368613554);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            b1 b1VarN = t.n(s().f55339f, Boolean.FALSE, null, sVar, 48, 2);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = ep.a.r(0, sVar);
            }
            b1 b1Var = (b1) objQ;
            boolean zH = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new h(14, this, b1Var, null);
                sVar.o0(objQ2);
            }
            t.f((e) objQ2, b0.f48488a, sVar);
            if (((Number) b1Var.getValue()).intValue() == 0) {
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i13 = 0;
                eVar = new e(this, bundle, i11, i13) { // from class: sm.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f51721a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ c f51722b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Bundle f51723c;

                    {
                        this.f51721a = i13;
                        this.f51722b = this;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = this.f51721a;
                        n nVar2 = (n) obj;
                        ((Integer) obj2).getClass();
                        switch (i14) {
                            case 0:
                                this.f51722b.q(this.f51723c, nVar2, t.M(1));
                                break;
                            default:
                                this.f51722b.q(this.f51723c, nVar2, t.M(1));
                                break;
                        }
                        return b0.f48488a;
                    }
                };
            } else {
                CoursePracticeType coursePracticeType = CoursePracticeType.SYLLABLE;
                boolean zH2 = sVar.h(this);
                Object objQ3 = sVar.Q();
                if (zH2 || objQ3 == gVar) {
                    objQ3 = new s0.a(this, 2);
                    sVar.o0(objQ3);
                }
                fz.c cVar = (fz.c) objQ3;
                boolean zH3 = sVar.h(this) | sVar.f(b1VarN);
                Object objQ4 = sVar.Q();
                if (zH3 || objQ4 == gVar) {
                    objQ4 = new pv.c(14, this, b1VarN);
                    sVar.o0(objQ4);
                }
                ys.a.a(coursePracticeType, null, null, cVar, (fz.a) objQ4, false, null, null, t1.e.d(-85685031, new p(29, this, b1Var), sVar), sVar, 100663302, 230);
                sVar = sVar;
            }
            x1VarT.f39502d = eVar;
        }
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i14 = 1;
            eVar = new e(this, bundle, i11, i14) { // from class: sm.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f51721a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f51722b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Bundle f51723c;

                {
                    this.f51721a = i14;
                    this.f51722b = this;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f51721a;
                    n nVar2 = (n) obj;
                    ((Integer) obj2).getClass();
                    switch (i15) {
                        case 0:
                            this.f51722b.q(this.f51723c, nVar2, t.M(1));
                            break;
                        default:
                            this.f51722b.q(this.f51723c, nVar2, t.M(1));
                            break;
                    }
                    return b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

    public final int t() {
        return ((Number) this.f51726e.getValue()).intValue();
    }
}
