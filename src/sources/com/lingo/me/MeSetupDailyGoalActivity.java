package com.lingo.me;

import android.os.Bundle;
import ch.z;
import fr.o0;
import fz.a;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import xg.d;
import xu.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MeSetupDailyGoalActivity extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f22222t = 0;

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-282932636);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            int i13 = ((o0) l()).f27733a.dailyGoal;
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new cr.n(this, 0);
                sVar.o0(objQ);
            }
            a aVar = (a) objQ;
            boolean zH2 = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new com.google.firebase.datastorage.a(this, 8);
                sVar.o0(objQ2);
            }
            c.k(i13, aVar, (fz.c) objQ2, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(this, i11, 14, bundle);
        }
    }
}
