package com.lingo.fluent.ui.base;

import android.os.Bundle;
import androidx.fragment.app.e1;
import bj.a;
import com.lingo.fluent.ui.base.PdLearnIndexActivity;
import com.lingo.lingoskill.object.PdLesson;
import fz.e;
import hh.k0;
import i.c;
import l1.b1;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import nh.i;
import qy.b0;
import qy.j;
import qy.q;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdLearnIndexActivity extends d {
    public static final /* synthetic */ int L = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f21623t = com.bumptech.glide.d.u(j.NONE, new a(this, 13));
    public final q H = com.bumptech.glide.d.v(new k0(this, 0));
    public final c K = registerForActivityResult(new e1(4), new hh.c(this, 1));

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, qy.h] */
    @Override // xg.d
    public final void j(final Bundle bundle, n nVar, final int i11) {
        x1 x1VarT;
        e eVar;
        PdLearnIndexActivity pdLearnIndexActivity;
        s sVar = (s) nVar;
        sVar.f0(673821795);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            b1 b1VarN = t.n(n().f55339f, Boolean.FALSE, null, sVar, 48, 2);
            Object objQ = sVar.Q();
            vy.d dVar = null;
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(null);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            boolean zH = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                fr.c cVar = new fr.c((Object) this, (Object) b1Var, false, dVar, 15);
                pdLearnIndexActivity = this;
                sVar.o0(cVar);
                objQ2 = cVar;
            } else {
                pdLearnIndexActivity = this;
            }
            t.f((e) objQ2, b0.f48488a, sVar);
            if (((PdLesson) b1Var.getValue()) == null) {
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i13 = 0;
                eVar = new e(this, bundle, i11, i13) { // from class: hh.l0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f32259a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PdLearnIndexActivity f32260b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Bundle f32261c;

                    {
                        this.f32259a = i13;
                        this.f32260b = this;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = this.f32259a;
                        qy.b0 b0Var = qy.b0.f48488a;
                        Bundle bundle2 = this.f32261c;
                        PdLearnIndexActivity pdLearnIndexActivity2 = this.f32260b;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).getClass();
                        int i15 = PdLearnIndexActivity.L;
                        switch (i14) {
                            case 0:
                                pdLearnIndexActivity2.j(bundle2, nVar2, l1.t.M(1));
                                break;
                            default:
                                pdLearnIndexActivity2.j(bundle2, nVar2, l1.t.M(1));
                                break;
                        }
                        return b0Var;
                    }
                };
            } else {
                PdLesson pdLesson = (PdLesson) b1Var.getValue();
                kotlin.jvm.internal.m.c(pdLesson);
                boolean zH2 = sVar.h(this);
                Object objQ3 = sVar.Q();
                if (zH2 || objQ3 == gVar) {
                    objQ3 = new k0(this, 1);
                    sVar.o0(objQ3);
                }
                fz.a aVar = (fz.a) objQ3;
                boolean zH3 = sVar.h(this);
                Object objQ4 = sVar.Q();
                if (zH3 || objQ4 == gVar) {
                    objQ4 = new com.google.accompanist.permissions.a(22, this, b1Var);
                    sVar.o0(objQ4);
                }
                fz.c cVar2 = (fz.c) objQ4;
                boolean zH4 = sVar.h(this);
                Object objQ5 = sVar.Q();
                if (zH4 || objQ5 == gVar) {
                    objQ5 = new gr.s(this, 4);
                    sVar.o0(objQ5);
                }
                i.b(pdLesson, aVar, cVar2, (fz.c) objQ5, ((Boolean) b1VarN.getValue()).booleanValue(), (ph.s) pdLearnIndexActivity.f21623t.getValue(), sVar, 0, 0);
                sVar = sVar;
            }
            x1VarT.f39502d = eVar;
        }
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i14 = 1;
            eVar = new e(this, bundle, i11, i14) { // from class: hh.l0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f32259a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PdLearnIndexActivity f32260b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Bundle f32261c;

                {
                    this.f32259a = i14;
                    this.f32260b = this;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f32259a;
                    qy.b0 b0Var = qy.b0.f48488a;
                    Bundle bundle2 = this.f32261c;
                    PdLearnIndexActivity pdLearnIndexActivity2 = this.f32260b;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).getClass();
                    int i16 = PdLearnIndexActivity.L;
                    switch (i15) {
                        case 0:
                            pdLearnIndexActivity2.j(bundle2, nVar2, l1.t.M(1));
                            break;
                        default:
                            pdLearnIndexActivity2.j(bundle2, nVar2, l1.t.M(1));
                            break;
                    }
                    return b0Var;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }
}
