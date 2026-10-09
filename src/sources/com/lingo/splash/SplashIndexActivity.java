package com.lingo.splash;

import android.os.Bundle;
import androidx.fragment.app.e1;
import androidx.lifecycle.Lifecycle;
import cf.x;
import com.bumptech.glide.e;
import com.lingo.lingoskill.LingoSkillApplication;
import dv.u0;
import fu.j0;
import gr.v;
import hr.a;
import hr.b;
import j9.c0;
import kotlin.jvm.internal.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import nv.p;
import oi.c;
import qy.j;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SplashIndexActivity extends d {
    public static final /* synthetic */ int M = 0;
    public c H;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f22230t = com.bumptech.glide.d.u(j.NONE, new v(this, 1));
    public final Object K = com.bumptech.glide.d.u(j.SYNCHRONIZED, new v(this, 0));
    public final i.c L = registerForActivityResult(new e1(4), new com.google.firebase.database.android.d(this, 28));

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, qy.h] */
    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-687278825);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            p((hr.c) t.o(((hr.d) this.f22230t.getValue()).f33695d, sVar).getValue(), sVar, i12 & 112);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(this, i11, 3, bundle);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, qy.h] */
    @Override // androidx.fragment.app.p0, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            c cVar = this.H;
            try {
                if (cVar != null) {
                    ((mi.c) cVar.f44926b).g();
                    return;
                }
                Lifecycle lifecycle = getLifecycle();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                this.H = new c(lifecycle, this, x.h(), n(), (u0) this.K.getValue());
                return;
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Exception e10) {
            e = e10;
        }
        e.printStackTrace();
    }

    public final void p(hr.c uiState, n nVar, int i11) {
        m.f(uiState, "uiState");
        s sVar = (s) nVar;
        sVar.f0(-1734729562);
        int i12 = (sVar.f(uiState) ? 4 : 2) | i11 | (sVar.h(this) ? 32 : 16);
        if (!sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.W();
        } else if (uiState.equals(a.f33690a)) {
            sVar.d0(-627793867);
            tv.a.d(0, 1, sVar, null);
            sVar.p(false);
        } else {
            if (!(uiState instanceof b)) {
                throw p.x(sVar, -627792676, false);
            }
            sVar.d0(2013378536);
            j9.v vVarH = x.H(new c0[0], sVar);
            boolean zH = sVar.h(vVarH) | ((i12 & 14) == 4) | sVar.h(this);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new j0(uiState, vVarH, this, 3);
                sVar.o0(objQ);
            }
            e.c(vVarH, "start", null, null, null, null, null, null, (fz.c) objQ, sVar, 48);
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(this, i11, 4, uiState);
        }
    }
}
