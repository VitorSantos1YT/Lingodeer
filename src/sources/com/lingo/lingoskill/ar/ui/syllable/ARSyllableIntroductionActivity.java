package com.lingo.lingoskill.ar.ui.syllable;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import bq.u;
import ci.c;
import ci.h;
import ci.i;
import ci.k;
import ci.n;
import ci.q;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import ep.a;
import gi.e;
import hh.p0;
import hj.e3;
import ji.b;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import rt.m9;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ARSyllableIntroductionActivity extends b {
    public static final /* synthetic */ int Q = 0;
    public final ViewModelLazy P;

    public ARSyllableIntroductionActivity() {
        super("AlphabetIntro", h.f7133a);
        this.P = new ViewModelLazy(z.a(e.class), new k(this, 0), new u(18), new k(this, 1));
    }

    public final void u(boolean z11) {
        e3 e3Var = ((hj.h) j()).f32638b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (!z11) {
            linearLayout.setVisibility(8);
            return;
        }
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        a.x(355243232, true, a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        m().c(scqhIrGXy.BgESkXazH, new m9(26));
        String string = getString(R.string.introduction);
        m.e(string, "getString(...)");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(string);
        setSupportActionBar(toolbar);
        l.a supportActionBar = getSupportActionBar();
        int i11 = 1;
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
        ((hj.h) j()).f32639c.setAdapter(new i(new ji.e[]{new n(), new q()}, getSupportFragmentManager(), 0));
        ((hj.h) j()).f32639c.w(new vm.a(((hj.h) j()).f32639c, ff.h.l(6.0f)));
        u(true);
        ViewModelLazy viewModelLazy = this.P;
        ((e) viewModelLazy.getValue()).f29266d.observe(this, new c(this, i11));
        ((e) viewModelLazy.getValue()).a();
    }
}
