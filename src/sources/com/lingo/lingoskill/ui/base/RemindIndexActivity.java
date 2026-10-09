package com.lingo.lingoskill.ui.base;

import android.os.Bundle;
import at.h;
import fp.a;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RemindIndexActivity extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f22045t = 0;

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1658709855);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            if (zH || objQ == m.f39353a) {
                objQ = new av.d(this, 9);
                sVar.o0(objQ);
            }
            a.a((fz.a) objQ, null, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(this, i11, 10, bundle);
        }
    }
}
