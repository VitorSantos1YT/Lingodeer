package com.lingo.me;

import android.os.Bundle;
import ch.z;
import cr.k;
import fz.a;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import qy.q;
import xg.d;
import xu.a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MeFollowingFollowerActivity extends d {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f22220t = com.bumptech.glide.d.v(new k(this, 0));

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1704909712);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            int iIntValue = ((Number) this.f22220t.getValue()).intValue();
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            if (zH || objQ == m.f39353a) {
                objQ = new k(this, 1);
                sVar.o0(objQ);
            }
            a0.c(iIntValue, (a) objQ, null, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(this, i11, 12, bundle);
        }
    }
}
