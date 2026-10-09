package com.lingo.fluent.ui.base;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import bt.g5;
import com.lingo.fluent.ui.base.PdFinishActivity;
import com.lingodeer.data.model.CoursePracticeType;
import cr.n;
import ep.a;
import fp.f;
import fr.c;
import fz.e;
import l1.b1;
import l1.g;
import l1.m;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;
import qy.q;
import rz.e0;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdFinishActivity extends d {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f21622t = com.bumptech.glide.d.v(new n(this, 29));

    @Override // xg.d
    public final void j(final Bundle bundle, l1.n nVar, final int i11) {
        x1 x1VarT;
        e eVar;
        s sVar = (s) nVar;
        sVar.f0(-696970365);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            b1 b1VarN = t.n(n().f55339f, Boolean.FALSE, null, sVar, 48, 2);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = a.r(0, sVar);
            }
            b1 b1Var = (b1) objQ;
            boolean zH = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                c cVar = new c((Object) this, (Object) b1Var, false, (vy.d) null, 14);
                sVar.o0(cVar);
                objQ2 = cVar;
            }
            t.f((e) objQ2, b0.f48488a, sVar);
            if (((Number) b1Var.getValue()).intValue() == 0) {
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i13 = 0;
                eVar = new e(this, bundle, i11, i13) { // from class: hh.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f32230a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PdFinishActivity f32231b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Bundle f32232c;

                    {
                        this.f32230a = i13;
                        this.f32231b = this;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = this.f32230a;
                        qy.b0 b0Var = qy.b0.f48488a;
                        Bundle bundle2 = this.f32232c;
                        PdFinishActivity pdFinishActivity = this.f32231b;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).getClass();
                        int i15 = PdFinishActivity.H;
                        switch (i14) {
                            case 0:
                                pdFinishActivity.j(bundle2, nVar2, l1.t.M(1));
                                break;
                            default:
                                pdFinishActivity.j(bundle2, nVar2, l1.t.M(1));
                                break;
                        }
                        return b0Var;
                    }
                };
            } else {
                CoursePracticeType coursePracticeType = CoursePracticeType.SYLLABLE;
                boolean zH2 = sVar.h(this);
                Object objQ3 = sVar.Q();
                if (zH2 || objQ3 == gVar) {
                    objQ3 = new gr.s(this, 1);
                    sVar.o0(objQ3);
                }
                fz.c cVar2 = (fz.c) objQ3;
                boolean zH3 = sVar.h(this) | sVar.f(b1VarN);
                Object objQ4 = sVar.Q();
                if (zH3 || objQ4 == gVar) {
                    objQ4 = new f(5, this, b1VarN);
                    sVar.o0(objQ4);
                }
                ys.a.a(coursePracticeType, null, null, cVar2, (fz.a) objQ4, false, null, null, t1.e.d(-2085922326, new g5(2, b1Var), sVar), sVar, 100663302, 230);
                sVar = sVar;
            }
            x1VarT.f39502d = eVar;
        }
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i14 = 1;
            eVar = new e(this, bundle, i11, i14) { // from class: hh.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f32230a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PdFinishActivity f32231b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Bundle f32232c;

                {
                    this.f32230a = i14;
                    this.f32231b = this;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f32230a;
                    qy.b0 b0Var = qy.b0.f48488a;
                    Bundle bundle2 = this.f32232c;
                    PdFinishActivity pdFinishActivity = this.f32231b;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).getClass();
                    int i16 = PdFinishActivity.H;
                    switch (i15) {
                        case 0:
                            pdFinishActivity.j(bundle2, nVar2, l1.t.M(1));
                            break;
                        default:
                            pdFinishActivity.j(bundle2, nVar2, l1.t.M(1));
                            break;
                    }
                    return b0Var;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

    @Override // l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new gp.a(this, null, 6), 3);
    }
}
