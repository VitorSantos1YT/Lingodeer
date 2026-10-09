package com.lingo.fluent.ui.base;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.k0;
import androidx.lifecycle.LifecycleOwnerKt;
import bj.a;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.lingo.lingoskill.object.PdLesson;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import hh.c0;
import hh.j0;
import hh.u;
import hj.e3;
import hj.i4;
import ji.b;
import kotlin.jvm.internal.m;
import qy.j;
import rz.e0;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdLearnActivity extends b {
    public PdLesson P;
    public long Q;
    public final Object R;

    public PdLearnActivity() {
        super(BuildConfig.VERSION_NAME, u.f32299a);
        this.R = d.u(j.NONE, new a(this, 11));
    }

    @Override // ji.b, l.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        k0 k0VarK;
        k0 k0VarK2;
        m.f(event, "event");
        if (i11 != 4) {
            return super.onKeyDown(i11, event);
        }
        if (k() != null && (k() instanceof c0) && (k0VarK2 = k()) != null && k0VarK2.isAdded()) {
            c0 c0Var = (c0) k();
            m.c(c0Var);
            if (i11 == 4 && c0Var.getActivity() != null) {
                ta.a aVar = c0Var.f36400f;
                m.c(aVar);
                if (((i4) aVar).f32707e.getVisibility() != 0) {
                    c0Var.requireActivity().finish();
                    return true;
                }
                ta.a aVar2 = c0Var.f36400f;
                m.c(aVar2);
                ((i4) aVar2).f32707e.setVisibility(8);
                ta.a aVar3 = c0Var.f36400f;
                m.c(aVar3);
                e.m(((i4) aVar3).f32706d);
                return true;
            }
        } else {
            if (k() == null || !(k() instanceof j0) || (k0VarK = k()) == null || !k0VarK.isAdded()) {
                return super.onKeyDown(i11, event);
            }
            j0 j0Var = (j0) k();
            m.c(j0Var);
            if (i11 == 4 && j0Var.getActivity() != null) {
                j0Var.B();
            }
        }
        return true;
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        Parcelable parcelableExtra = getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
        m.c(parcelableExtra);
        this.P = (PdLesson) parcelableExtra;
        this.Q = getIntent().getLongExtra(INTENTS.EXTRA_LONG, 0L);
        e3 e3Var = ((hj.k0) j()).f32804b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new gp.a(this, null, 7), 3);
    }
}
