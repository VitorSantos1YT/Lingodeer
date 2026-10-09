package com.lingo.me;

import android.os.Bundle;
import ch.z;
import cr.f;
import fz.a;
import fz.c;
import java.util.ArrayList;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import pr.f0;
import qy.q;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MeAchievementAllLanguageActivity extends d {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f22215t = com.bumptech.glide.d.v(new f(this, 0));

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-696501052);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            ArrayList arrayList = (ArrayList) this.f22215t.getValue();
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new f(this, 1);
                sVar.o0(objQ);
            }
            a aVar = (a) objQ;
            boolean zH2 = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new com.google.firebase.datastorage.a(this, 2);
                sVar.o0(objQ2);
            }
            f0.b(arrayList, aVar, (c) objQ2, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(this, i11, 7, bundle);
        }
    }
}
