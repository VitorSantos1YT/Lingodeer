package com.lingo.lingoskill.ar.ui.syllable;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.k0;
import bi.a;
import ci.r;
import ci.v;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import gi.h;
import ji.b;
import jp.h1;
import kotlin.jvm.internal.m;
import ob.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ARSyllableTestActivity extends b {
    public a P;

    public ARSyllableTestActivity() {
        super(BuildConfig.VERSION_NAME, r.f7150a);
    }

    @Override // ji.b, l.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        k0 k0VarK;
        m.f(event, "event");
        if (i11 != 4) {
            return super.onKeyDown(i11, event);
        }
        if (k() == null || !(k() instanceof v) || (k0VarK = k()) == null || !k0VarK.isAdded()) {
            return super.onKeyDown(i11, event);
        }
        v vVar = (v) k();
        m.c(vVar);
        if (i11 == 4 && vVar.getActivity() != null) {
            h1 h1Var = new h1();
            h1Var.u(vVar.getChildFragmentManager(), "LessonQuitBottomSheetDialogFragment");
            h1Var.U = new c(3, vVar, h1Var);
        }
        return true;
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        this.P = (a) getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
        k0 k0VarC = getSupportFragmentManager().C(R.id.fl_container);
        if (k0VarC != null && (k0VarC instanceof v)) {
            k0 k0VarC2 = getSupportFragmentManager().C(R.id.fl_container);
            m.c(k0VarC2);
            a aVar = this.P;
            m.c(aVar);
            new h((v) k0VarC2, this, aVar);
            return;
        }
        a aVar2 = this.P;
        m.c(aVar2);
        int i11 = aVar2.f4450a;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(INTENTS.EXTRA_INT, i11);
        v vVar = new v();
        vVar.setArguments(bundle2);
        ff.h.A(this, vVar);
        a aVar3 = this.P;
        m.c(aVar3);
        new h(vVar, this, aVar3);
    }
}
