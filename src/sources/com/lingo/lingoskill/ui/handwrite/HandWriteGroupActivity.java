package com.lingo.lingoskill.ui.handwrite;

import android.os.Build;
import android.os.Bundle;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.lingodeer.data.model.INTENTS;
import fz.a;
import fz.c;
import hh.o;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import qy.b0;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class HandWriteGroupActivity extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f22048t = 0;

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        b0 b0Var;
        s sVar = (s) nVar;
        sVar.f0(-403619418);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            CourseCharacterGroup courseCharacterGroup = Build.VERSION.SDK_INT >= 33 ? (CourseCharacterGroup) getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT, CourseCharacterGroup.class) : (CourseCharacterGroup) getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
            if (courseCharacterGroup == null) {
                sVar.d0(1682778373);
                sVar.p(false);
                b0Var = null;
            } else {
                sVar.d0(1682778374);
                boolean zH = sVar.h(this);
                Object objQ = sVar.Q();
                g gVar = m.f39353a;
                if (zH || objQ == gVar) {
                    objQ = new gr.s(this, 6);
                    sVar.o0(objQ);
                }
                c cVar = (c) objQ;
                boolean zH2 = sVar.h(this);
                Object objQ2 = sVar.Q();
                if (zH2 || objQ2 == gVar) {
                    objQ2 = new o(this, 7);
                    sVar.o0(objQ2);
                }
                vr.g.c(courseCharacterGroup, cVar, (a) objQ2, null, sVar, 0);
                sVar.p(false);
                b0Var = b0.f48488a;
            }
            if (b0Var == null) {
                finish();
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(this, i11, 5, bundle);
        }
    }
}
