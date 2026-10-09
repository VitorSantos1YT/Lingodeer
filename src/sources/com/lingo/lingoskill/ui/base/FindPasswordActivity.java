package com.lingo.lingoskill.ui.base;

import a00.c;
import android.os.Bundle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import at.h;
import bj.a;
import bp.g1;
import l1.g;
import l1.k1;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import qy.j;
import rz.e0;
import rz.o0;
import wz.m;
import xg.d;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FindPasswordActivity extends d {
    public static final /* synthetic */ int K = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f22041t = com.bumptech.glide.d.u(j.SYNCHRONIZED, new a(this, 1));
    public final k1 H = t.B(Boolean.FALSE);

    public static final void p(FindPasswordActivity findPasswordActivity, String str) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(findPasswordActivity);
        f fVar = o0.f50940a;
        e0.B(lifecycleScope, m.f55536a, null, new aq.a(str, null, 2), 2);
    }

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1390400377);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            boolean zBooleanValue = ((Boolean) this.H.getValue()).booleanValue();
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new av.d(this, 6);
                sVar.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            boolean zH2 = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new c(this, 7);
                sVar.o0(objQ2);
            }
            g1.f(zBooleanValue, aVar, (fz.c) objQ2, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(this, i11, 5, bundle);
        }
    }
}
