package com.lingo.lingoskill.koreanskill.ui.syllable.ui;

import android.os.Bundle;
import bj.a;
import ch.z;
import gn.e;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import qy.j;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class KOYinTuActivity extends d {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f21913t = com.bumptech.glide.d.u(j.NONE, new a(this, 10));

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, qy.h] */
    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-937971443);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            e eVar = (e) this.f21913t.getValue();
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            if (zH || objQ == m.f39353a) {
                objQ = new cr.n(this, 18);
                sVar.o0(objQ);
            }
            en.e.a((fz.a) objQ, null, eVar, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(this, i11, 25, bundle);
        }
    }
}
