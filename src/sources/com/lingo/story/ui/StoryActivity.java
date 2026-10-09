package com.lingo.story.ui;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import bj.a;
import bp.b1;
import cf.x;
import com.bumptech.glide.e;
import dt.h2;
import fu.j0;
import fz.c;
import j9.c0;
import j9.h;
import j9.v;
import jr.b;
import kr.h0;
import kr.l0;
import kr.m0;
import kr.n0;
import kr.p0;
import kr.r1;
import l1.b3;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import nv.p;
import qy.j;
import qy.q;
import rt.cb;
import rt.db;
import rt.eb;
import rt.fb;
import vy.i;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class StoryActivity extends d {
    public static final /* synthetic */ int N = 0;
    public final Object L;
    public final Object M;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f22231t = com.bumptech.glide.d.v(new b(this, 0));
    public final q H = com.bumptech.glide.d.v(new b(this, 4));
    public final q K = com.bumptech.glide.d.v(new b(this, 7));

    public StoryActivity() {
        b bVar = new b(this, 8);
        j jVar = j.NONE;
        this.L = com.bumptech.glide.d.u(jVar, new b1(17, this, bVar));
        this.M = com.bumptech.glide.d.u(jVar, new a(this, 21));
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, qy.h] */
    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1173766601);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(((r1) this.L.getValue()).f38574d, (LifecycleOwner) null, (Lifecycle.State) null, (i) null, sVar, 0, 7);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.d0(-1942615977);
                b3 b3VarCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(((p0) this.M.getValue()).f38557c, (LifecycleOwner) null, (Lifecycle.State) null, (i) null, sVar, 0, 7);
                n0 n0Var = (n0) b3VarCollectAsStateWithLifecycle2.getValue();
                if (kotlin.jvm.internal.m.a(n0Var, l0.f38522a)) {
                    sVar.d0(-1586680851);
                    sVar.p(false);
                } else {
                    if (!(n0Var instanceof m0)) {
                        throw p.x(sVar, -1586682440, false);
                    }
                    sVar.d0(-1586678455);
                    n0 n0Var2 = (n0) b3VarCollectAsStateWithLifecycle2.getValue();
                    kotlin.jvm.internal.m.d(n0Var2, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySettingsUiState.Success");
                    int i13 = ((m0) n0Var2).f38530a;
                    n0 n0Var3 = (n0) b3VarCollectAsStateWithLifecycle2.getValue();
                    kotlin.jvm.internal.m.d(n0Var3, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySettingsUiState.Success");
                    h0 h0Var = ((m0) n0Var3).f38531b;
                    Object objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new h2(18, b1Var);
                        sVar.o0(objQ2);
                    }
                    fz.a aVar = (fz.a) objQ2;
                    boolean zH = sVar.h(this);
                    Object objQ3 = sVar.Q();
                    if (zH || objQ3 == gVar) {
                        objQ3 = new h(2, this, b1Var);
                        sVar.o0(objQ3);
                    }
                    jr.a.a(i13, h0Var, aVar, (c) objQ3, sVar, 384);
                    sVar.p(false);
                }
            } else {
                sVar.d0(-1946000743);
            }
            sVar.p(false);
            fb fbVar = (fb) b3VarCollectAsStateWithLifecycle.getValue();
            if (fbVar instanceof db) {
                sVar.d0(-1941697168);
                fb fbVar2 = (fb) b3VarCollectAsStateWithLifecycle.getValue();
                kotlin.jvm.internal.m.d(fbVar2, "null cannot be cast to non-null type com.lingodeer.course.viewmodels.CourseTestDownloadUiState.Downloading");
                tv.a.g(((db) fbVar2).f49634a, null, sVar, 0, 6);
                sVar.p(false);
            } else if (kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                sVar.d0(-1586649171);
                sVar.p(false);
            } else {
                if (!kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                    throw p.x(sVar, -1586653493, false);
                }
                sVar.d0(-1941281985);
                v vVarH = x.H(new c0[0], sVar);
                String str = (String) this.K.getValue();
                boolean zH2 = sVar.h(this) | sVar.h(vVarH);
                Object objQ4 = sVar.Q();
                if (zH2 || objQ4 == gVar) {
                    objQ4 = new j0(this, vVarH, b1Var, 11);
                    sVar.o0(objQ4);
                }
                e.c(vVarH, str, null, null, null, null, null, null, (c) objQ4, sVar, 0);
                sVar = sVar;
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(this, i11, 24, bundle);
        }
    }

    public final int p() {
        return ((Number) this.f22231t.getValue()).intValue();
    }
}
