package com.lingo.lingoskill.japanskill.ui.syllable;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.k0;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import ji.b;
import jp.h1;
import km.f;
import km.t1;
import km.x1;
import kotlin.jvm.internal.m;
import ob.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SyllableTest extends b {
    public static final /* synthetic */ int Q = 0;
    public int P;

    public SyllableTest() {
        super(BuildConfig.VERSION_NAME, t1.f38281a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        this.P = getIntent().getIntExtra(INTENTS.EXTRA_INT, 0);
        k0 k0VarC = getSupportFragmentManager().C(R.id.fl_container);
        if (k0VarC != null && (k0VarC instanceof x1)) {
            k0 k0VarC2 = getSupportFragmentManager().C(R.id.fl_container);
            m.d(k0VarC2, "null cannot be cast to non-null type com.lingo.lingoskill.japanskill.ui.syllable.SyllableTestFragment");
            new nm.b((x1) k0VarC2, this, this.P);
        } else if (k0VarC == null || !(k0VarC instanceof f)) {
            int i11 = this.P;
            Bundle bundle2 = new Bundle();
            bundle2.putInt(INTENTS.EXTRA_INT, i11);
            x1 x1Var = new x1();
            x1Var.setArguments(bundle2);
            h.A(this, x1Var);
            new nm.b(x1Var, this, this.P);
        }
    }

    @Override // ji.b, l.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        k0 k0VarK;
        m.f(event, "event");
        if (i11 != 4) {
            return super.onKeyDown(i11, event);
        }
        if (k() == null || !(k() instanceof x1) || (k0VarK = k()) == null || !k0VarK.isAdded()) {
            return super.onKeyDown(i11, event);
        }
        x1 x1Var = (x1) k();
        m.c(x1Var);
        if (i11 == 4 && x1Var.getActivity() != null) {
            h1 h1Var = new h1();
            h1Var.u(x1Var.getChildFragmentManager(), ypOOxsaJG.nFyJTzqlEV);
            h1Var.U = new l(17, x1Var, h1Var);
        }
        return true;
    }
}
