package com.lingo.fluent.ui.compose;

import android.os.Bundle;
import fz.c;
import hh.o;
import k9.p;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import nh.a;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdFeedStarredActivity extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f21657t = 0;

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-258472136);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new gr.s(this, 23);
                sVar.o0(objQ);
            }
            c cVar = (c) objQ;
            boolean zH2 = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new o(this, 21);
                sVar.o0(objQ2);
            }
            a.d(cVar, (fz.a) objQ2, null, null, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p(this, i11, 2, bundle);
        }
    }
}
