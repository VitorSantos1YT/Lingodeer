package km;

import android.os.Bundle;
import com.lingodeer.data.model.CoursePracticeType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends xg.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qy.q f38282e = com.bumptech.glide.d.v(new s(this, 0));

    public static final int t(u uVar) {
        return ((Number) uVar.f38282e.getValue()).intValue();
    }

    @Override // xg.i
    public final void q(final Bundle bundle, l1.n nVar, final int i11) {
        l1.x1 x1VarT;
        fz.e eVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2084547771);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            l1.b1 b1VarN = l1.t.n(s().f55339f, Boolean.FALSE, null, sVar, 48, 2);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = ep.a.r(0, sVar);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zH = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                fr.c cVar = new fr.c((Object) this, (Object) b1Var, false, (vy.d) null, 27);
                sVar.o0(cVar);
                objQ2 = cVar;
            }
            l1.t.f((fz.e) objQ2, qy.b0.f48488a, sVar);
            if (((Number) b1Var.getValue()).intValue() == 0) {
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i13 = 0;
                eVar = new fz.e(this, bundle, i11, i13) { // from class: km.t

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f38275a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ u f38276b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Bundle f38277c;

                    {
                        this.f38275a = i13;
                        this.f38276b = this;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = this.f38275a;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).getClass();
                        switch (i14) {
                            case 0:
                                this.f38276b.q(this.f38277c, nVar2, l1.t.M(1));
                                break;
                            default:
                                this.f38276b.q(this.f38277c, nVar2, l1.t.M(1));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
            } else {
                CoursePracticeType coursePracticeType = CoursePracticeType.SYLLABLE;
                boolean zH2 = sVar.h(this);
                Object objQ3 = sVar.Q();
                if (zH2 || objQ3 == gVar) {
                    objQ3 = new gr.s(this, 24);
                    sVar.o0(objQ3);
                }
                fz.c cVar2 = (fz.c) objQ3;
                boolean zH3 = sVar.h(this) | sVar.f(b1VarN);
                Object objQ4 = sVar.Q();
                if (zH3 || objQ4 == gVar) {
                    objQ4 = new fp.f(26, this, b1VarN);
                    sVar.o0(objQ4);
                }
                ys.a.a(coursePracticeType, null, null, cVar2, (fz.a) objQ4, false, null, null, t1.e.d(-1210438988, new at.p(18, this, b1Var), sVar), sVar, 100663302, 230);
                sVar = sVar;
            }
            x1VarT.f39502d = eVar;
        }
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i14 = 1;
            eVar = new fz.e(this, bundle, i11, i14) { // from class: km.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f38275a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u f38276b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Bundle f38277c;

                {
                    this.f38275a = i14;
                    this.f38276b = this;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f38275a;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).getClass();
                    switch (i15) {
                        case 0:
                            this.f38276b.q(this.f38277c, nVar2, l1.t.M(1));
                            break;
                        default:
                            this.f38276b.q(this.f38277c, nVar2, l1.t.M(1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }
}
