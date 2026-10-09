package com.lingo.lingoskill.billing;

import android.os.Bundle;
import bj.a;
import fz.e;
import gp.l1;
import k9.p;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;
import qy.j;
import qy.q;
import xg.d;
import yg.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Subscription2Activity extends d {
    public static final /* synthetic */ int K = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f21741t = com.bumptech.glide.d.u(j.NONE, new a(this, 26));
    public final q H = com.bumptech.glide.d.v(new li.a(this, 0));

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, qy.h] */
    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1492422561);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new gp.a(this, null, 26);
                sVar.o0(objQ);
            }
            t.f((e) objQ, b0.f48488a, sVar);
            String str = (String) this.H.getValue();
            l1 l1Var = (l1) this.f21741t.getValue();
            boolean zH2 = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new li.a(this, 1);
                sVar.o0(objQ2);
            }
            fz.a aVar = (fz.a) objQ2;
            boolean zH3 = sVar.h(this);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                objQ3 = new li.a(this, 2);
                sVar.o0(objQ3);
            }
            fz.a aVar2 = (fz.a) objQ3;
            boolean zH4 = sVar.h(this);
            Object objQ4 = sVar.Q();
            if (zH4 || objQ4 == gVar) {
                objQ4 = new li.a(this, 3);
                sVar.o0(objQ4);
            }
            fz.a aVar3 = (fz.a) objQ4;
            boolean zH5 = sVar.h(this);
            Object objQ5 = sVar.Q();
            if (zH5 || objQ5 == gVar) {
                objQ5 = new li.a(this, 4);
                sVar.o0(objQ5);
            }
            fz.a aVar4 = (fz.a) objQ5;
            boolean zH6 = sVar.h(this);
            Object objQ6 = sVar.Q();
            if (zH6 || objQ6 == gVar) {
                objQ6 = new li.a(this, 5);
                sVar.o0(objQ6);
            }
            fz.a aVar5 = (fz.a) objQ6;
            boolean zH7 = sVar.h(this);
            Object objQ7 = sVar.Q();
            if (zH7 || objQ7 == gVar) {
                objQ7 = new li.a(this, 6);
                sVar.o0(objQ7);
            }
            o.g(this, str, l1Var, null, false, aVar, aVar2, aVar3, aVar4, aVar5, (fz.a) objQ7, sVar, (i12 >> 3) & 14, 24);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p(this, i11, 7, bundle);
        }
    }
}
