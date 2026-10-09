package com.lingo.main.ui;

import android.os.Bundle;
import androidx.fragment.app.e1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.compose.FlowExtKt;
import ar.a;
import at.h;
import av.f0;
import bq.u;
import br.a0;
import br.f;
import br.r;
import br.x;
import br.y;
import br.z;
import com.lingo.main.ui.MainComposeActivity;
import com.lingodeer.data.model.uistate.CompleteOneLessonUiState;
import fz.e;
import gp.l1;
import gp.w;
import i.b;
import i.c;
import j0.o2;
import j9.c0;
import j9.v;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.b3;
import l1.g;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;
import qy.j;
import qy.q;
import rz.e0;
import uz.q0;
import vy.i;
import xg.d;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MainComposeActivity extends d {
    public static final /* synthetic */ int U = 0;
    public final Object H;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final q P;
    public final c Q;
    public final c R;
    public final c S;
    public final q T;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f22213t;

    public MainComposeActivity() {
        j jVar = j.NONE;
        this.f22213t = com.bumptech.glide.d.u(jVar, new a0(this, 2));
        this.H = com.bumptech.glide.d.u(jVar, new a0(this, 3));
        this.K = com.bumptech.glide.d.u(jVar, new a0(this, 4));
        this.L = com.bumptech.glide.d.u(jVar, new a0(this, 5));
        this.M = com.bumptech.glide.d.u(jVar, new a0(this, 6));
        j jVar2 = j.SYNCHRONIZED;
        this.N = com.bumptech.glide.d.u(jVar2, new a0(this, 0));
        this.O = com.bumptech.glide.d.u(jVar2, new a0(this, 1));
        int i11 = 4;
        this.P = com.bumptech.glide.d.v(new f(this, i11));
        final int i12 = 0;
        this.Q = registerForActivityResult(new e1(i11), new b(this) { // from class: br.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainComposeActivity f5102b;

            {
                this.f5102b = this;
            }

            @Override // i.b
            public final void f(Object obj) {
                int i13 = i12;
                int i14 = 2;
                vy.d dVar = null;
                int i15 = 3;
                MainComposeActivity mainComposeActivity = this.f5102b;
                i.a it = (i.a) obj;
                switch (i13) {
                    case 0:
                        int i16 = MainComposeActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        mainComposeActivity.s().a();
                        break;
                    case 1:
                        int i17 = MainComposeActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new z(mainComposeActivity, dVar, i15), 3);
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new z(mainComposeActivity, dVar, i14), 3);
                        break;
                    default:
                        int i18 = MainComposeActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new z(mainComposeActivity, dVar, i14), 3);
                        break;
                }
            }
        });
        final int i13 = 1;
        this.R = registerForActivityResult(new e1(4), new b(this) { // from class: br.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainComposeActivity f5102b;

            {
                this.f5102b = this;
            }

            @Override // i.b
            public final void f(Object obj) {
                int i14 = i13;
                int i15 = 2;
                vy.d dVar = null;
                int i16 = 3;
                MainComposeActivity mainComposeActivity = this.f5102b;
                i.a it = (i.a) obj;
                switch (i14) {
                    case 0:
                        int i17 = MainComposeActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        mainComposeActivity.s().a();
                        break;
                    case 1:
                        int i18 = MainComposeActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new z(mainComposeActivity, dVar, i16), 3);
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new z(mainComposeActivity, dVar, i15), 3);
                        break;
                    default:
                        int i19 = MainComposeActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new z(mainComposeActivity, dVar, i15), 3);
                        break;
                }
            }
        });
        final int i14 = 2;
        this.S = registerForActivityResult(new e1(4), new b(this) { // from class: br.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainComposeActivity f5102b;

            {
                this.f5102b = this;
            }

            @Override // i.b
            public final void f(Object obj) {
                int i15 = i14;
                int i16 = 2;
                vy.d dVar = null;
                int i17 = 3;
                MainComposeActivity mainComposeActivity = this.f5102b;
                i.a it = (i.a) obj;
                switch (i15) {
                    case 0:
                        int i18 = MainComposeActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        mainComposeActivity.s().a();
                        break;
                    case 1:
                        int i19 = MainComposeActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new z(mainComposeActivity, dVar, i17), 3);
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new z(mainComposeActivity, dVar, i16), 3);
                        break;
                    default:
                        int i110 = MainComposeActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(mainComposeActivity), null, null, new z(mainComposeActivity, dVar, i16), 3);
                        break;
                }
            }
        });
        this.T = com.bumptech.glide.d.v(new f(this, 5));
    }

    public static final void p(v vVar, MainComposeActivity mainComposeActivity, b1 b1Var, b1 b1Var2, String str) {
        if (m.a((String) b1Var.getValue(), str)) {
            return;
        }
        b1Var2.setValue(Boolean.valueOf(!m.a(str, "premium")));
        b1Var.setValue(str);
        vVar.a(str, new a00.c(vVar, 12));
        mainComposeActivity.m().c("jxz_bottomtab_click", new a(str, 5));
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, qy.h] */
    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        boolean z11;
        b1 b1Var;
        MainComposeActivity mainComposeActivity = this;
        s sVar = (s) nVar;
        sVar.f0(283580951);
        int i12 = (sVar.h(mainComposeActivity) ? 32 : 16) | i11;
        int i13 = 0;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(mainComposeActivity.r().X, (LifecycleOwner) null, (Lifecycle.State) null, (i) null, sVar, 0, 7);
            CompleteOneLessonUiState completeOneLessonUiState = (CompleteOneLessonUiState) b3VarCollectAsStateWithLifecycle.getValue();
            boolean zF = sVar.f(b3VarCollectAsStateWithLifecycle) | sVar.h(mainComposeActivity);
            Object objQ = sVar.Q();
            g gVar = l1.m.f39353a;
            vy.d dVar = null;
            if (zF || objQ == gVar) {
                objQ = new x(b3VarCollectAsStateWithLifecycle, mainComposeActivity, null);
                sVar.o0(objQ);
            }
            t.f((e) objQ, completeOneLessonUiState, sVar);
            boolean zH = sVar.h(mainComposeActivity);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new f0(mainComposeActivity, dVar, 6);
                sVar.o0(objQ2);
            }
            b0 b0Var = b0.f48488a;
            t.f((e) objQ2, b0Var, sVar);
            boolean zH2 = sVar.h(mainComposeActivity);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == gVar) {
                objQ3 = new z(mainComposeActivity, dVar, i13);
                sVar.o0(objQ3);
            }
            t.f((e) objQ3, b0Var, sVar);
            b1 b1VarO = t.o(mainComposeActivity.s().K, sVar);
            b1 b1VarO2 = t.o(mainComposeActivity.r().T, sVar);
            eh.e eVar = (eh.e) FlowExtKt.collectAsStateWithLifecycle(((eh.f) mainComposeActivity.L.getValue()).H, (LifecycleOwner) null, (Lifecycle.State) null, (i) null, sVar, 0, 7).getValue();
            eh.d dVar2 = eVar instanceof eh.d ? (eh.d) eVar : null;
            if (dVar2 != null) {
                z11 = dVar2.f25545d >= 50;
            } else {
                z11 = false;
            }
            Object[] objArr = new Object[0];
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = new u(3);
                sVar.o0(objQ4);
            }
            b1 b1Var2 = (b1) w1.j.c(objArr, (fz.a) objQ4, sVar, 48);
            v vVarH = cf.x.H(new c0[0], sVar);
            j9.e eVar2 = (j9.e) t.n(new q0(vVarH.f36257b.f41094z), null, null, sVar, 48, 2).getValue();
            j9.q qVar = eVar2 != null ? eVar2.f36188b : null;
            boolean zH3 = sVar.h(qVar) | sVar.f(b1Var2);
            Object objQ5 = sVar.Q();
            if (zH3 || objQ5 == gVar) {
                objQ5 = new f0(7, qVar, b1Var2, dVar);
                sVar.o0(objQ5);
            }
            t.f((e) objQ5, qVar, sVar);
            Object objQ6 = sVar.Q();
            if (objQ6 == gVar) {
                objQ6 = t.B(Boolean.TRUE);
                sVar.o0(objQ6);
            }
            b1 b1Var3 = (b1) objQ6;
            boolean z12 = !m.a((String) b1Var2.getValue(), "learn");
            boolean zF2 = sVar.f(b1Var2) | sVar.h(vVarH) | sVar.h(mainComposeActivity);
            Object objQ7 = sVar.Q();
            if (zF2 || objQ7 == gVar) {
                b1Var = b1Var2;
                br.v vVar = new br.v(vVarH, mainComposeActivity, b1Var, b1Var3, 1);
                sVar.o0(vVar);
                objQ7 = vVar;
            } else {
                b1Var = b1Var2;
            }
            se.i.a(z12, (fz.a) objQ7, sVar, 0, 0);
            v3.c cVar = (v3.c) sVar.j(g1.f58547h);
            WeakHashMap weakHashMap = o2.f35353v;
            mainComposeActivity = this;
            t.a(ju.b.f37362a.a(new v3.f(62 + cVar.Q(j0.b.e(sVar).f35358e.e().f48796d) + (((Boolean) b1Var3.getValue()).booleanValue() ? (float) 0.5d : 0))), t1.e.d(1511624407, new r(z11, b1Var, vVarH, this, b1Var3, b1VarO2, b1VarO, 1), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(mainComposeActivity, i11, 13, bundle);
        }
    }

    @Override // l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        oi.c cVar = ((ar.e) this.P.getValue()).f2843b;
        if (cVar != null) {
            ((mi.c) cVar.f44926b).a();
        }
        e0.B(rz.b1.f50869a, null, null, new z(this, null, 1), 3);
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public final void onResume() {
        super.onResume();
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new y(this, null, 1), 3);
    }

    public final ar.g q() {
        return (ar.g) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final w r() {
        return (w) this.f22213t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final l1 s() {
        return (l1) this.K.getValue();
    }
}
