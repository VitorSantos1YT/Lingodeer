package com.lingo.fluent.ui.base;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.fragment.app.k0;
import com.lingo.lingoskill.object.PdLesson;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import hh.d0;
import hh.j0;
import ji.b;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdLearnDictationActivity extends b {
    public PdLearnDictationActivity() {
        super(BuildConfig.VERSION_NAME, d0.f32219a);
    }

    @Override // ji.b, l.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        k0 k0VarK;
        m.f(event, "event");
        if (i11 != 4) {
            return super.onKeyDown(i11, event);
        }
        if (k() == null || !(k() instanceof j0) || (k0VarK = k()) == null || !k0VarK.isAdded()) {
            return super.onKeyDown(i11, event);
        }
        j0 j0Var = (j0) k();
        if (j0Var != null && i11 == 4 && j0Var.getActivity() != null) {
            j0Var.B();
        }
        return true;
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        Parcelable parcelableExtra = getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
        m.c(parcelableExtra);
        j0 j0Var = new j0();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(INTENTS.EXTRA_OBJECT, (PdLesson) parcelableExtra);
        j0Var.setArguments(bundle2);
        h.A(this, j0Var);
    }
}
