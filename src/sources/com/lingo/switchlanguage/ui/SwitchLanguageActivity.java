package com.lingo.switchlanguage.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import bp.b1;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.ui.base.ConfirmLevelActivity;
import com.lingo.main.ui.MainComposeActivity;
import com.lingodeer.R;
import fz.a;
import iv.h0;
import k9.p;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import l1.z1;
import lr.b;
import nr.c;
import nr.e;
import qy.j;
import qy.q;
import se.i;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SwitchLanguageActivity extends d {
    public static final /* synthetic */ int M = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f22232t = com.bumptech.glide.d.v(new b(this, 0));
    public final q H = com.bumptech.glide.d.v(new b(this, 1));
    public final q K = com.bumptech.glide.d.v(new b(this, 2));
    public final Object L = com.bumptech.glide.d.u(j.NONE, new b1(19, this, new b(this, 3)));

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, qy.h] */
    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1165629474);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new ju.d(11);
                sVar.o0(objQ2);
            }
            i.a(false, (a) objQ2, sVar, 48, 1);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.d0(457290791);
                boolean zH = sVar.h(this);
                Object objQ3 = sVar.Q();
                if (zH || objQ3 == gVar) {
                    objQ3 = new z1(1, this, b1Var);
                    sVar.o0(objQ3);
                }
                lr.a.a((a) objQ3, sVar, 0);
            } else {
                sVar.d0(455085792);
            }
            sVar.p(false);
            e eVar = (e) t.o(((nr.i) this.L.getValue()).M, sVar).getValue();
            if (eVar instanceof nr.a) {
                b1Var.setValue(Boolean.TRUE);
            } else {
                boolean z11 = eVar instanceof c;
                q qVar = this.K;
                if (z11) {
                    Intent intent = new Intent(this, (Class<?>) ConfirmLevelActivity.class);
                    if (((String) qVar.getValue()).length() > 0) {
                        intent.putExtra("source", (String) qVar.getValue());
                    }
                    intent.setFlags(268468224);
                    startActivity(intent);
                } else if (eVar instanceof nr.d) {
                    if (((String) qVar.getValue()).length() > 0) {
                        m().c("jxz_select_lan", new b(this, 4));
                    }
                    Intent intent2 = new Intent(this, (Class<?>) MainComposeActivity.class);
                    intent2.putExtra("source", "language_switch");
                    intent2.setFlags(268468224);
                    startActivity(intent2);
                    overridePendingTransition(R.anim.anim_activity_scale_in, R.anim.anim_activity_scale_out);
                }
            }
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = t.B(getResources());
                sVar.o0(objQ4);
            }
            l1.b1 b1Var2 = (l1.b1) objQ4;
            LanguageItem languageItem = (LanguageItem) this.f22232t.getValue();
            vy.d dVar = null;
            Integer numValueOf = languageItem != null ? Integer.valueOf(languageItem.getLocate()) : null;
            boolean zH2 = sVar.h(this);
            Object objQ5 = sVar.Q();
            if (zH2 || objQ5 == gVar) {
                objQ5 = new h0(16, this, b1Var2, dVar);
                sVar.o0(objQ5);
            }
            t.f((fz.e) objQ5, numValueOf, sVar);
            Resources resources = (Resources) b1Var2.getValue();
            kotlin.jvm.internal.m.e(resources, "InitComposeUI$lambda$13(...)");
            lr.a.b(resources, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p(this, i11, 8, bundle);
        }
    }
}
