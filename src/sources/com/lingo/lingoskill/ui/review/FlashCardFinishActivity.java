package com.lingo.lingoskill.ui.review;

import android.os.Bundle;
import com.lingo.lingoskill.ui.review.FlashCardFinishActivity;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fz.a;
import fz.c;
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
import tp.u;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FlashCardFinishActivity extends d {
    public static final /* synthetic */ int K = 0;
    public final q H;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f22065t;

    public FlashCardFinishActivity() {
        final int i11 = 0;
        this.f22065t = com.bumptech.glide.d.v(new a(this) { // from class: tp.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlashCardFinishActivity f52495b;

            {
                this.f52495b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int i12 = i11;
                FlashCardFinishActivity flashCardFinishActivity = this.f52495b;
                switch (i12) {
                    case 0:
                        int i13 = FlashCardFinishActivity.K;
                        String stringExtra = flashCardFinishActivity.getIntent().getStringExtra(INTENTS.EXTRA_STRING);
                        return stringExtra == null ? BuildConfig.VERSION_NAME : stringExtra;
                    default:
                        int i14 = FlashCardFinishActivity.K;
                        return Boolean.valueOf(flashCardFinishActivity.getIntent().getBooleanExtra(INTENTS.EXTRA_BOOLEAN, false));
                }
            }
        });
        final int i12 = 1;
        this.H = com.bumptech.glide.d.v(new a(this) { // from class: tp.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlashCardFinishActivity f52495b;

            {
                this.f52495b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int i13 = i12;
                FlashCardFinishActivity flashCardFinishActivity = this.f52495b;
                switch (i13) {
                    case 0:
                        int i14 = FlashCardFinishActivity.K;
                        String stringExtra = flashCardFinishActivity.getIntent().getStringExtra(INTENTS.EXTRA_STRING);
                        return stringExtra == null ? BuildConfig.VERSION_NAME : stringExtra;
                    default:
                        int i15 = FlashCardFinishActivity.K;
                        return Boolean.valueOf(flashCardFinishActivity.getIntent().getBooleanExtra(INTENTS.EXTRA_BOOLEAN, false));
                }
            }
        });
    }

    @Override // xg.d
    public final void j(final Bundle bundle, n nVar, final int i11) {
        x1 x1VarT;
        e eVar;
        s sVar = (s) nVar;
        sVar.f0(618900316);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            b1 b1VarN = t.n(n().f55339f, Boolean.FALSE, null, sVar, 48, 2);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = ep.a.r(0, sVar);
            }
            b1 b1Var = (b1) objQ;
            boolean zH = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new h(17, this, b1Var, null);
                sVar.o0(objQ2);
            }
            t.f((e) objQ2, b0.f48488a, sVar);
            if (((Number) b1Var.getValue()).intValue() == 0) {
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i13 = 0;
                eVar = new e(this, bundle, i11, i13) { // from class: tp.t

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f52496a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ FlashCardFinishActivity f52497b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Bundle f52498c;

                    {
                        this.f52496a = i13;
                        this.f52497b = this;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = this.f52496a;
                        qy.b0 b0Var = qy.b0.f48488a;
                        Bundle bundle2 = this.f52498c;
                        FlashCardFinishActivity flashCardFinishActivity = this.f52497b;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).getClass();
                        int i15 = FlashCardFinishActivity.K;
                        switch (i14) {
                            case 0:
                                flashCardFinishActivity.j(bundle2, nVar2, l1.t.M(1));
                                break;
                            default:
                                flashCardFinishActivity.j(bundle2, nVar2, l1.t.M(1));
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
                    objQ3 = new s0.a(this, 8);
                    sVar.o0(objQ3);
                }
                c cVar = (c) objQ3;
                boolean zH3 = sVar.h(this) | sVar.f(b1VarN);
                Object objQ4 = sVar.Q();
                if (zH3 || objQ4 == gVar) {
                    objQ4 = new pv.c(15, this, b1VarN);
                    sVar.o0(objQ4);
                }
                ys.a.a(coursePracticeType, null, null, cVar, (a) objQ4, false, null, null, t1.e.d(-3819453, new u(0, this, b1Var), sVar), sVar, 100663302, 230);
                sVar = sVar;
            }
            x1VarT.f39502d = eVar;
        }
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i14 = 1;
            eVar = new e(this, bundle, i11, i14) { // from class: tp.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f52496a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FlashCardFinishActivity f52497b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Bundle f52498c;

                {
                    this.f52496a = i14;
                    this.f52497b = this;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f52496a;
                    qy.b0 b0Var = qy.b0.f48488a;
                    Bundle bundle2 = this.f52498c;
                    FlashCardFinishActivity flashCardFinishActivity = this.f52497b;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).getClass();
                    int i16 = FlashCardFinishActivity.K;
                    switch (i15) {
                        case 0:
                            flashCardFinishActivity.j(bundle2, nVar2, l1.t.M(1));
                            break;
                        default:
                            flashCardFinishActivity.j(bundle2, nVar2, l1.t.M(1));
                            break;
                    }
                    return b0Var;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }
}
