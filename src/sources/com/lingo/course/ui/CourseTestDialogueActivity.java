package com.lingo.course.ui;

import a00.c;
import android.os.Bundle;
import ch.y;
import ch.z;
import com.lingodeer.data.model.CoursePracticeType;
import fz.a;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import qy.q;
import xg.d;
import ys.m0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CourseTestDialogueActivity extends d {
    public static final /* synthetic */ int L = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f21617t = com.bumptech.glide.d.v(new y(this, 0));
    public final q H = com.bumptech.glide.d.v(new y(this, 1));
    public final q K = com.bumptech.glide.d.v(new y(this, 2));

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-44620161);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            long jLongValue = ((Number) this.f21617t.getValue()).longValue();
            long jLongValue2 = ((Number) this.H.getValue()).longValue();
            CoursePracticeType coursePracticeTypeValueOf = CoursePracticeType.valueOf((String) this.K.getValue());
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new y(this, 3);
                sVar.o0(objQ);
            }
            a aVar = (a) objQ;
            boolean zH2 = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new c(this, 20);
                sVar.o0(objQ2);
            }
            m0.a(jLongValue, jLongValue2, coursePracticeTypeValueOf, null, aVar, (fz.c) objQ2, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(this, i11, 0, bundle);
        }
    }
}
