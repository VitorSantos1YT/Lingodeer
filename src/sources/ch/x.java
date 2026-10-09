package ch;

import android.os.Bundle;
import com.lingodeer.data.model.CoursePracticeType;
import l1.a1;
import l1.b1;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends xg.i {
    @Override // xg.i
    public final void q(final Bundle bundle, l1.n nVar, final int i11) {
        x1 x1VarT;
        fz.e eVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(826199607);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            b1 b1VarN = l1.t.n(s().f55339f, Boolean.FALSE, null, sVar, 48, 2);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = defpackage.e.v(0, sVar);
            }
            a1 a1Var = (a1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.TRUE);
                sVar.o0(objQ2);
            }
            b1 b1Var = (b1) objQ2;
            boolean zH = sVar.h(this);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == gVar) {
                b0.f fVar = new b0.f((Object) this, (Object) a1Var, b1Var, (vy.d) null, 9);
                sVar.o0(fVar);
                objQ3 = fVar;
            }
            l1.t.f((fz.e) objQ3, qy.b0.f48488a, sVar);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i13 = 0;
                eVar = new fz.e(this, bundle, i11, i13) { // from class: ch.v

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f7111a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ x f7112b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Bundle f7113c;

                    {
                        this.f7111a = i13;
                        this.f7112b = this;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = this.f7111a;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).getClass();
                        switch (i14) {
                            case 0:
                                this.f7112b.q(this.f7113c, nVar2, l1.t.M(1));
                                break;
                            default:
                                this.f7112b.q(this.f7113c, nVar2, l1.t.M(1));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
            } else {
                CoursePracticeType coursePracticeType = CoursePracticeType.COURSE_DIALOG_PRACTICE;
                boolean zH2 = sVar.h(this);
                Object objQ4 = sVar.Q();
                if (zH2 || objQ4 == gVar) {
                    objQ4 = new a00.c(this, 19);
                    sVar.o0(objQ4);
                }
                fz.c cVar = (fz.c) objQ4;
                boolean zH3 = sVar.h(this) | sVar.f(b1VarN);
                Object objQ5 = sVar.Q();
                if (zH3 || objQ5 == gVar) {
                    objQ5 = new at.f(20, this, b1VarN);
                    sVar.o0(objQ5);
                }
                ys.a.a(coursePracticeType, null, null, cVar, (fz.a) objQ5, false, null, null, t1.e.d(-654687248, new w(a1Var, 0), sVar), sVar, 100663302, 230);
                sVar = sVar;
            }
            x1VarT.f39502d = eVar;
        }
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i14 = 1;
            eVar = new fz.e(this, bundle, i11, i14) { // from class: ch.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f7111a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x f7112b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Bundle f7113c;

                {
                    this.f7111a = i14;
                    this.f7112b = this;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f7111a;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).getClass();
                    switch (i15) {
                        case 0:
                            this.f7112b.q(this.f7113c, nVar2, l1.t.M(1));
                            break;
                        default:
                            this.f7112b.q(this.f7113c, nVar2, l1.t.M(1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }
}
