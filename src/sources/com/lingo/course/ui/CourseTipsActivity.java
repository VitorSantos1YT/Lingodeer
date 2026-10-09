package com.lingo.course.ui;

import android.os.Bundle;
import br.b;
import ch.b0;
import ch.t0;
import ch.z;
import fz.c;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import qy.q;
import t1.e;
import xg.d;
import ys.o3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CourseTipsActivity extends d {
    public static final /* synthetic */ int K = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f21621t = com.bumptech.glide.d.v(new t0(this, 0));
    public final q H = com.bumptech.glide.d.v(new t0(this, 1));

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1211285341);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            Object objQ = sVar.Q();
            if (objQ == m.f39353a) {
                objQ = new b(24);
                sVar.o0(objQ);
            }
            o3.a((c) objQ, null, e.d(-307882433, new b0(this, 1), sVar), sVar, 390);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(this, i11, 3, bundle);
        }
    }
}
