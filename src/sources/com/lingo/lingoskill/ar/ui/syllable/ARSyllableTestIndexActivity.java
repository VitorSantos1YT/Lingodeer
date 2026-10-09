package com.lingo.lingoskill.ar.ui.syllable;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewModelLazy;
import au.d1;
import bi.a;
import bq.u;
import ci.b0;
import ci.c;
import ci.d0;
import ci.f0;
import ci.i0;
import ci.k0;
import ci.n0;
import ci.w;
import ci.y;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import ff.h;
import gi.e;
import hh.p0;
import hj.e3;
import hj.i;
import ji.b;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ARSyllableTestIndexActivity extends b {
    public static final /* synthetic */ int Q = 0;
    public final ViewModelLazy P;

    public ARSyllableTestIndexActivity() {
        super(BuildConfig.VERSION_NAME, w.f7157a);
        this.P = new ViewModelLazy(z.a(e.class), new y(this, 0), new u(19), new y(this, 1));
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        a aVar = (a) getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
        if (aVar != null) {
            String str = aVar.f4451b;
            m.e(str, "getLessonName(...)");
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle(str);
            setSupportActionBar(toolbar);
            l.a supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
            }
            toolbar.setNavigationOnClickListener(new bq.a(this, 0));
            switch (aVar.f4450a) {
                case 1:
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable(INTENTS.EXTRA_OBJECT, aVar);
                    b0 b0Var = new b0();
                    b0Var.setArguments(bundle2);
                    h.A(this, b0Var);
                    break;
                case 2:
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable(INTENTS.EXTRA_OBJECT, aVar);
                    d0 d0Var = new d0();
                    d0Var.setArguments(bundle3);
                    h.A(this, d0Var);
                    break;
                case 3:
                    Bundle bundle4 = new Bundle();
                    bundle4.putParcelable(INTENTS.EXTRA_OBJECT, aVar);
                    f0 f0Var = new f0();
                    f0Var.setArguments(bundle4);
                    h.A(this, f0Var);
                    break;
                case 4:
                    Bundle bundle5 = new Bundle();
                    bundle5.putParcelable(INTENTS.EXTRA_OBJECT, aVar);
                    i0 i0Var = new i0();
                    i0Var.setArguments(bundle5);
                    h.A(this, i0Var);
                    break;
                case 5:
                    Bundle bundle6 = new Bundle();
                    bundle6.putParcelable(INTENTS.EXTRA_OBJECT, aVar);
                    k0 k0Var = new k0();
                    k0Var.setArguments(bundle6);
                    h.A(this, k0Var);
                    break;
                case 6:
                    Bundle bundle7 = new Bundle();
                    bundle7.putParcelable(INTENTS.EXTRA_OBJECT, aVar);
                    n0 n0Var = new n0();
                    n0Var.setArguments(bundle7);
                    h.A(this, n0Var);
                    break;
                case 7:
                    Bundle bundle8 = new Bundle();
                    bundle8.putParcelable(INTENTS.EXTRA_OBJECT, aVar);
                    ci.p0 p0Var = new ci.p0();
                    p0Var.setArguments(bundle8);
                    h.A(this, p0Var);
                    break;
            }
            u(true);
            ViewModelLazy viewModelLazy = this.P;
            ((e) viewModelLazy.getValue()).f29266d.observe(this, new c(this, 2));
            ((e) viewModelLazy.getValue()).a();
            bq.z.b(((i) j()).f32674b, new d1(27, this, aVar));
        }
    }

    public final void u(boolean z11) {
        e3 e3Var = ((i) j()).f32675c;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (!z11) {
            linearLayout.setVisibility(8);
            return;
        }
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
    }
}
