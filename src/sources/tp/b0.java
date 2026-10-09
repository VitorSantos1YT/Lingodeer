package tp;

import android.os.Bundle;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.INTENTS;
import java.io.Serializable;
import java.util.HashMap;
import l1.b1;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends xg.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qy.q f52443e;

    public b0() {
        final int i11 = 0;
        com.bumptech.glide.d.v(new fz.a(this) { // from class: tp.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f52507b;

            {
                this.f52507b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        Serializable serializable = this.f52507b.requireArguments().getSerializable(gkbGsXmgaxRjJ.nCvXwmKJNPB);
                        kotlin.jvm.internal.m.d(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Int>");
                        return (HashMap) serializable;
                    default:
                        return Integer.valueOf(this.f52507b.requireArguments().getInt(INTENTS.EXTRA_INT));
                }
            }
        });
        final int i12 = 1;
        this.f52443e = com.bumptech.glide.d.v(new fz.a(this) { // from class: tp.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f52507b;

            {
                this.f52507b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        Serializable serializable = this.f52507b.requireArguments().getSerializable(gkbGsXmgaxRjJ.nCvXwmKJNPB);
                        kotlin.jvm.internal.m.d(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Int>");
                        return (HashMap) serializable;
                    default:
                        return Integer.valueOf(this.f52507b.requireArguments().getInt(INTENTS.EXTRA_INT));
                }
            }
        });
    }

    @Override // xg.i
    public final void q(final Bundle bundle, l1.n nVar, final int i11) {
        x1 x1VarT;
        fz.e eVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(920468000);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            b1 b1VarN = l1.t.n(s().f55339f, Boolean.FALSE, null, sVar, 48, 2);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = ep.a.r(0, sVar);
            }
            b1 b1Var = (b1) objQ;
            boolean zH = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new rt.h(18, this, b1Var, null);
                sVar.o0(objQ2);
            }
            l1.t.f((fz.e) objQ2, qy.b0.f48488a, sVar);
            if (((Number) b1Var.getValue()).intValue() == 0) {
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i13 = 0;
                eVar = new fz.e(this, bundle, i11, i13) { // from class: tp.a0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f52439a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b0 f52440b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Bundle f52441c;

                    {
                        this.f52439a = i13;
                        this.f52440b = this;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = this.f52439a;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).getClass();
                        switch (i14) {
                            case 0:
                                this.f52440b.q(this.f52441c, nVar2, l1.t.M(1));
                                break;
                            default:
                                this.f52440b.q(this.f52441c, nVar2, l1.t.M(1));
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
                    objQ3 = new s0.a(this, 10);
                    sVar.o0(objQ3);
                }
                fz.c cVar = (fz.c) objQ3;
                boolean zH3 = sVar.h(this) | sVar.f(b1VarN);
                Object objQ4 = sVar.Q();
                if (zH3 || objQ4 == gVar) {
                    objQ4 = new pv.c(16, this, b1VarN);
                    sVar.o0(objQ4);
                }
                ys.a.a(coursePracticeType, null, null, cVar, (fz.a) objQ4, false, null, null, t1.e.d(1724235207, new u(1, this, b1Var), sVar), sVar, 100663302, 230);
                sVar = sVar;
            }
            x1VarT.f39502d = eVar;
        }
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i14 = 1;
            eVar = new fz.e(this, bundle, i11, i14) { // from class: tp.a0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f52439a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b0 f52440b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Bundle f52441c;

                {
                    this.f52439a = i14;
                    this.f52440b = this;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f52439a;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).getClass();
                    switch (i15) {
                        case 0:
                            this.f52440b.q(this.f52441c, nVar2, l1.t.M(1));
                            break;
                        default:
                            this.f52440b.q(this.f52441c, nVar2, l1.t.M(1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }
}
