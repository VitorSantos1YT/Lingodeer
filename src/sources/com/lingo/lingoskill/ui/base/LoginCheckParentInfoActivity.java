package com.lingo.lingoskill.ui.base;

import android.os.Bundle;
import androidx.fragment.app.e1;
import app.rive.runtime.kotlin.core.a;
import at.h;
import av.p;
import bp.g1;
import bp.k2;
import fz.e;
import i.c;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;
import qy.q;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LoginCheckParentInfoActivity extends d {
    public static final /* synthetic */ int L = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f22044t = com.bumptech.glide.d.v(new k2(this, 0));
    public final q H = com.bumptech.glide.d.v(new k2(this, 1));
    public final c K = registerForActivityResult(new e1(4), new a(this, 5));

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1926539111);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new p(this, null, 6);
                sVar.o0(objQ);
            }
            t.f((e) objQ, b0.f48488a, sVar);
            boolean zH2 = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new k2(this, 2);
                sVar.o0(objQ2);
            }
            fz.a aVar = (fz.a) objQ2;
            boolean zH3 = sVar.h(this);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                objQ3 = new androidx.lifecycle.viewmodel.compose.a(this, 4);
                sVar.o0(objQ3);
            }
            g1.m(aVar, (e) objQ3, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(this, i11, 9, bundle);
        }
    }
}
